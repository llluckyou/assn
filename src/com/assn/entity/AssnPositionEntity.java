package com.assn.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/4/6.
 */
@Entity
@Table(name = "assn_position", schema = "assn", catalog = "")
public class AssnPositionEntity {
    private long positionId;
    private String positionName;
    private String positionDesc;

    @Id
    @Column(name = "position_id", nullable = false)
    public long getPositionId() {
        return positionId;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }

    @Basic
    @Column(name = "position_name", nullable = false, length = 10)
    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    @Basic
    @Column(name = "position_desc", nullable = false, length = 50)
    public String getPositionDesc() {
        return positionDesc;
    }

    public void setPositionDesc(String positionDesc) {
        this.positionDesc = positionDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssnPositionEntity that = (AssnPositionEntity) o;

        if (positionId != that.positionId) return false;
        if (positionName != null ? !positionName.equals(that.positionName) : that.positionName != null) return false;
        if (positionDesc != null ? !positionDesc.equals(that.positionDesc) : that.positionDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (positionId ^ (positionId >>> 32));
        result = 31 * result + (positionName != null ? positionName.hashCode() : 0);
        result = 31 * result + (positionDesc != null ? positionDesc.hashCode() : 0);
        return result;
    }
}
