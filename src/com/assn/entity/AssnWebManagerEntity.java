package com.assn.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/4/6.
 */
@Entity
@Table(name = "assn_web_manager", schema = "assn", catalog = "")
public class AssnWebManagerEntity {
    private long managerId;
    private String managerUsername;
    private String managerDp;
    private String managerPassword;
    private String managerName;
    private String managerCellphone;
    private String managerLastLogIp;
    private Timestamp managerLastLogTime;

    @Id
    @Column(name = "manager_id", nullable = false)
    public long getManagerId() {
        return managerId;
    }

    public void setManagerId(long managerId) {
        this.managerId = managerId;
    }

    @Basic
    @Column(name = "manager_username", nullable = false, length = 20)
    public String getManagerUsername() {
        return managerUsername;
    }

    public void setManagerUsername(String managerUsername) {
        this.managerUsername = managerUsername;
    }

    @Basic
    @Column(name = "manager_dp", nullable = false, length = 100)
    public String getManagerDp() {
        return managerDp;
    }

    public void setManagerDp(String managerDp) {
        this.managerDp = managerDp;
    }

    @Basic
    @Column(name = "manager_password", nullable = false, length = 20)
    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    @Basic
    @Column(name = "manager_name", nullable = false, length = 20)
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Basic
    @Column(name = "manager_cellphone", nullable = false, length = 15)
    public String getManagerCellphone() {
        return managerCellphone;
    }

    public void setManagerCellphone(String managerCellphone) {
        this.managerCellphone = managerCellphone;
    }

    @Basic
    @Column(name = "manager_last_log_ip", nullable = false, length = 15)
    public String getManagerLastLogIp() {
        return managerLastLogIp;
    }

    public void setManagerLastLogIp(String managerLastLogIp) {
        this.managerLastLogIp = managerLastLogIp;
    }

    @Basic
    @Column(name = "manager_last_log_time", nullable = false)
    public Timestamp getManagerLastLogTime() {
        return managerLastLogTime;
    }

    public void setManagerLastLogTime(Timestamp managerLastLogTime) {
        this.managerLastLogTime = managerLastLogTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssnWebManagerEntity that = (AssnWebManagerEntity) o;

        if (managerId != that.managerId) return false;
        if (managerUsername != null ? !managerUsername.equals(that.managerUsername) : that.managerUsername != null)
            return false;
        if (managerDp != null ? !managerDp.equals(that.managerDp) : that.managerDp != null) return false;
        if (managerPassword != null ? !managerPassword.equals(that.managerPassword) : that.managerPassword != null)
            return false;
        if (managerName != null ? !managerName.equals(that.managerName) : that.managerName != null) return false;
        if (managerCellphone != null ? !managerCellphone.equals(that.managerCellphone) : that.managerCellphone != null)
            return false;
        if (managerLastLogIp != null ? !managerLastLogIp.equals(that.managerLastLogIp) : that.managerLastLogIp != null)
            return false;
        if (managerLastLogTime != null ? !managerLastLogTime.equals(that.managerLastLogTime) : that.managerLastLogTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (managerId ^ (managerId >>> 32));
        result = 31 * result + (managerUsername != null ? managerUsername.hashCode() : 0);
        result = 31 * result + (managerDp != null ? managerDp.hashCode() : 0);
        result = 31 * result + (managerPassword != null ? managerPassword.hashCode() : 0);
        result = 31 * result + (managerName != null ? managerName.hashCode() : 0);
        result = 31 * result + (managerCellphone != null ? managerCellphone.hashCode() : 0);
        result = 31 * result + (managerLastLogIp != null ? managerLastLogIp.hashCode() : 0);
        result = 31 * result + (managerLastLogTime != null ? managerLastLogTime.hashCode() : 0);
        return result;
    }
}
