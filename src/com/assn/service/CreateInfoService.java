package com.assn.service;

import com.assn.entity.AssnCreateInfoEntity;
import com.assn.form.PartyForm;

/**
 * Created by Administrator on 2017/4/9.
 */
public interface CreateInfoService extends BaseService<AssnCreateInfoEntity, Long> {
    boolean add(PartyForm partyForm);
}
