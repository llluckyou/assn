package com.assn.service.impl;

import com.assn.entity.AssnCategoryEntity;
import com.assn.entity.AssnCreateInfoEntity;
import com.assn.entity.AssnSchoolEntity;
import com.assn.form.PartyForm;
import com.assn.service.CategoryService;
import com.assn.service.CreateInfoService;
import com.assn.service.SchoolService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/4/9.
 */
@Service
public class CreateInfoServiceImpl extends BaseSeriveImpl<AssnCreateInfoEntity, Long> implements CreateInfoService {
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

        AssnCreateInfoEntity createInfoEntity = new AssnCreateInfoEntity();

        createInfoEntity.setStatus(0); //状态
        createInfoEntity.setUserId(partyForm.getUserId()); //申请用户
        createInfoEntity.setAssnCategoryId(categoryEntity); //社团所属类别
        createInfoEntity.setSchoolId(schoolEntity); // 社团所属学校
        createInfoEntity.setAssnName(partyForm.getPartyName()); // 社团名称
        createInfoEntity.setUserCellphone(partyForm.getPartyContact()); //联系方式
        createInfoEntity.setAssnResume(partyForm.getPartyResume()); // 简介
        createInfoEntity.setCreateDate(partyForm.getPartyCreateDate()); //创建日期
        createInfoEntity.setAssnProperty(partyForm.getPartyProperty()); //性质
        createInfoEntity.setAssnImg(partyForm.getAssnImg()); //图片

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
        this.add(createInfoEntity);
        return true;
    }
}
