package com.assn.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/4/6.
 */
@Entity
@Table(name = "assn_party", schema = "assn")
public class AssnPartyEntity {
    private long partyId;
    private String partyName;
    private String partyContact;
    private String partyResume;
    private AssnSchoolEntity partySchoolId;
//    private long partySchoolId;
    private int partyNumber;
    private String partyProperty;
    private AssnCategoryEntity partyCategoryId;
//    private String partyCategoryId;
    private Timestamp partyCreateDate;

    @Override
    public String toString() {
        return "AssnPartyEntity{" +
                "partyId=" + partyId +
                ", partyName='" + partyName + '\'' +
                ", partyContact='" + partyContact + '\'' +
                ", partyResume='" + partyResume + '\'' +
                ", partySchoolId=" + partySchoolId +
                ", partyNumber=" + partyNumber +
                ", partyProperty='" + partyProperty + '\'' +
                ", partyCategoryId=" + partyCategoryId +
                ", partyCreateDate=" + partyCreateDate +
                '}';
    }

    @Id
    @Column(name = "party_id", nullable = false)
    public long getPartyId() {
        return partyId;
    }

    public void setPartyId(long partyId) {
        this.partyId = partyId;
    }

    @Basic
    @Column(name = "party_name", nullable = false, length = 20)
    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    @Basic
    @Column(name = "party_contact", nullable = false, length = 50)
    public String getPartyContact() {
        return partyContact;
    }

    public void setPartyContact(String partyContact) {
        this.partyContact = partyContact;
    }

    @Basic
    @Column(name = "party_resume", nullable = false, length = 100)
    public String getPartyResume() {
        return partyResume;
    }

    public void setPartyResume(String partyResume) {
        this.partyResume = partyResume;
    }

    @ManyToOne
    @JoinColumn(name = "party_school_id",referencedColumnName = "id", nullable = false)
    public AssnSchoolEntity getPartySchoolId() {
        return partySchoolId;
    }

    public void setPartySchoolId(AssnSchoolEntity partySchoolId) {
        this.partySchoolId = partySchoolId;
    }

    @Basic
    @Column(name = "party_number", nullable = false)
    public int getPartyNumber() {
        return partyNumber;
    }

    public void setPartyNumber(int partyNumber) {
        this.partyNumber = partyNumber;
    }

    @Basic
    @Column(name = "party_property", nullable = false, length = 1)
    public String getPartyProperty() {
        return partyProperty;
    }

    public void setPartyProperty(String partyProperty) {
        this.partyProperty = partyProperty;
    }

    @ManyToOne
    @JoinColumn(name = "party_category_id",referencedColumnName = "category_id", nullable = false)
    public AssnCategoryEntity getPartyCategoryId() {
        return partyCategoryId;
    }

    public void setPartyCategoryId(AssnCategoryEntity partyCategoryId) {
        this.partyCategoryId = partyCategoryId;
    }

    @Basic
    @Column(name = "party_create_date", nullable = false)
    public Timestamp getPartyCreateDate() {
        return partyCreateDate;
    }

    public void setPartyCreateDate(Timestamp partyCreateDate) {
        this.partyCreateDate = partyCreateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssnPartyEntity that = (AssnPartyEntity) o;

        if (partyId != that.partyId) return false;
        if (partySchoolId != that.partySchoolId) return false;
        if (partyNumber != that.partyNumber) return false;
        if (partyName != null ? !partyName.equals(that.partyName) : that.partyName != null) return false;
        if (partyContact != null ? !partyContact.equals(that.partyContact) : that.partyContact != null) return false;
        if (partyResume != null ? !partyResume.equals(that.partyResume) : that.partyResume != null) return false;
        if (partyProperty != null ? !partyProperty.equals(that.partyProperty) : that.partyProperty != null)
            return false;
        if (partyCategoryId != null ? !partyCategoryId.equals(that.partyCategoryId) : that.partyCategoryId != null)
            return false;
        if (partyCreateDate != null ? !partyCreateDate.equals(that.partyCreateDate) : that.partyCreateDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (partyId ^ (partyId >>> 32));
        result = 31 * result + (partyName != null ? partyName.hashCode() : 0);
        result = 31 * result + (partyContact != null ? partyContact.hashCode() : 0);
        result = 31 * result + (partyResume != null ? partyResume.hashCode() : 0);
        result = 31 * result + (partySchoolId != null ? partySchoolId.hashCode() : 0);
        result = 31 * result + partyNumber;
        result = 31 * result + (partyProperty != null ? partyProperty.hashCode() : 0);
        result = 31 * result + (partyCategoryId != null ? partyCategoryId.hashCode() : 0);
        result = 31 * result + (partyCreateDate != null ? partyCreateDate.hashCode() : 0);
        return result;
    }
}
