package com.assn.form;

import com.assn.entity.AssnSchoolEntity;
import com.sun.istack.internal.Nullable;

import javax.validation.constraints.*;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;

/**
 * Created by Heal on 2017/4/10.
 */
public class PartyForm {

    @NotNull
    @Size(max = 20)
    private String partyName;

    @NotNull
    @Pattern(regexp = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$")
    private String partyContact;

    @Nullable
    @Size(max = 100)
    private String partyResume;

    @NotNull
    private long partySchoolId;

    @NotNull
    @Min(1)
    private int partyNumber;

    private String partyProperty;

    @NotNull
    private String partyCategoryId;
    private Timestamp partyCreateDate = new Timestamp(System.currentTimeMillis());

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        try {
            this.partyName = new String(partyName.getBytes("iso8859-1"),"utf-8");
        } catch (UnsupportedEncodingException e) {
        }
    }

    public String getPartyContact() {
        return partyContact;
    }

    public void setPartyContact(String partyContact) {
        this.partyContact = partyContact;
    }

    public String getPartyResume() {
        return partyResume;
    }

    public void setPartyResume(String partyResume) {
        this.partyResume = partyResume;
    }

    public long getPartySchoolId() {
        return partySchoolId;
    }

    public void setPartySchoolId(long partySchoolId) {
        this.partySchoolId = partySchoolId;
    }

    public int getPartyNumber() {
        return partyNumber;
    }

    public void setPartyNumber(int partyNumber) {
        this.partyNumber = partyNumber;
    }

    public String getPartyProperty() {
        return partyProperty;
    }

    public void setPartyProperty(String partyProperty) {
        this.partyProperty = partyProperty;
    }

    public String getPartyCategoryId() {
        return partyCategoryId;
    }

    public void setPartyCategoryId(String partyCategoryId) {
        this.partyCategoryId = partyCategoryId;
    }

    public Timestamp getPartyCreateDate() {
        return partyCreateDate;
    }

    public void setPartyCreateDate(Timestamp partyCreateDate) {
        this.partyCreateDate = partyCreateDate;
    }

    @Override
    public String toString() {
        return "PartyForm{" +
                "partyName='" + partyName + '\'' +
                ", partyContact='" + partyContact + '\'' +
                ", partyResume='" + partyResume + '\'' +
                ", partySchoolId=" + partySchoolId +
                ", partyNumber=" + partyNumber +
                ", partyProperty='" + partyProperty + '\'' +
                ", partyCategoryId='" + partyCategoryId + '\'' +
                ", partyCreateDate=" + partyCreateDate +
                '}';
    }
}
