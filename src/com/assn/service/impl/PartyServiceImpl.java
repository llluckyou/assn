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
}
