package com.assn.service.impl;

import com.assn.entity.AssnCategoryEntity;
import com.assn.entity.AssnPartyEntity;
import com.assn.entity.AssnSchoolEntity;
import com.assn.form.PartyForm;
import com.assn.service.CategoryService;
import com.assn.service.PartyService;
import com.assn.service.SchoolService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/4/9.
 */
@Service
public class PartyServiceImpl extends BaseSeriveImpl<AssnPartyEntity, Long> implements PartyService {

    @Resource(name = "schoolServiceImpl")
    SchoolService schoolService;
    @Resource(name = "categoryServiceImpl")
    CategoryService categoryService;

    @Override
    public boolean add(PartyForm partyForm) {
        AssnSchoolEntity schoolEntity = schoolService.get(partyForm.getPartySchoolId());
        AssnCategoryEntity categoryEntity = categoryService.get(partyForm.getPartyCategoryId());

        if (schoolEntity == null || categoryEntity == null) {
            return false;
        }

        AssnPartyEntity partyEntity = new AssnPartyEntity();

        partyEntity.setPartyCategoryId(categoryEntity);
        partyEntity.setPartySchoolId(schoolEntity);
        partyEntity.setPartyName(partyForm.getPartyName());
        partyEntity.setPartyContact(partyForm.getPartyContact());
        partyEntity.setPartyResume(partyForm.getPartyResume());
        partyEntity.setPartyCreateDate(partyForm.getPartyCreateDate());
        partyEntity.setPartyNumber(partyForm.getPartyNumber());
        partyEntity.setPartyProperty(partyForm.getPartyProperty());

//        for (Field field : partyForm.getClass().getDeclaredFields()) {
//            String fieldName = field.getName();
//            String upperFieldName = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
//            String setMethodName = "set" + upperFieldName;
//            String getMethodName = "get" + upperFieldName;
//
//            try {
//                if (field.getName().equals("partySchoolId")){
//                    partyEntity.getClass().getMethod("setPartySchoolId",AssnSchoolEntity.class).invoke(partyEntity,schoolEntity);
//                    continue;
//                }
//                if (field.getName().equals("partyCategoryId")){
//                    partyEntity.getClass().getMethod("setPartyCategoryId",AssnCategoryEntity.class).invoke(partyEntity,categoryEntity);
//                    continue;
//                }
//                partyEntity.getClass().getMethod(setMethodName, field.getType()).invoke(partyEntity, partyForm.getClass().getMethod(getMethodName).invoke(partyForm));
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }

        this.add(partyEntity);
        return true;
    }
}
