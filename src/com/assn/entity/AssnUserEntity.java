package com.assn.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/4/6.
 */
@Entity
@Table(name = "assn_user", schema = "assn", catalog = "")
public class AssnUserEntity {
    private long userId;
    private String userName;
    private String userImgPath;
    private String userPassword;
    private String userRealName;
    private String userMailbox;
    private String userCellphone;
    private String userStuId;
    private String userClass;
    private String schoolName;
    private long schoolId;
    private String userStatus;
    private Timestamp userLastLogTime;
    private String userLastLogIp;
    private Timestamp userCreateTime;
    private int userIntegration;
    private int userGrade;
    private long userCurrentPx;
    private long userTotalPx;

    @Id
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name", nullable = false, length = 20)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_img_path", length = 50)
    public String getUserImgPath() {
        return userImgPath;
    }

    public void setUserImgPath(String userImgPath) {
        this.userImgPath = userImgPath;
    }

    @Basic
    @Column(name = "user_password", nullable = false, length = 20)
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "user_real_name", nullable = false, length = 20)
    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    @Basic
    @Column(name = "user_mailbox", nullable = false, length = 30)
    public String getUserMailbox() {
        return userMailbox;
    }

    public void setUserMailbox(String userMailbox) {
        this.userMailbox = userMailbox;
    }

    @Basic
    @Column(name = "user_cellphone", nullable = false, length = 15)
    public String getUserCellphone() {
        return userCellphone;
    }

    public void setUserCellphone(String userCellphone) {
        this.userCellphone = userCellphone;
    }

    @Basic
    @Column(name = "user_stu_id", nullable = false, length = 20)
    public String getUserStuId() {
        return userStuId;
    }

    public void setUserStuId(String userStuId) {
        this.userStuId = userStuId;
    }

    @Basic
    @Column(name = "user_class", nullable = false, length = 12)
    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }

    @Basic
    @Column(name = "school_name", nullable = false, length = 12)
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Basic
    @Column(name = "school_id", nullable = false)
    public long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(long schoolId) {
        this.schoolId = schoolId;
    }

    @Basic
    @Column(name = "user_status", nullable = false, length = 1)
    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    @Basic
    @Column(name = "user_last_log_time", nullable = false)
    public Timestamp getUserLastLogTime() {
        return userLastLogTime;
    }

    public void setUserLastLogTime(Timestamp userLastLogTime) {
        this.userLastLogTime = userLastLogTime;
    }

    @Basic
    @Column(name = "user_last_log_ip", nullable = false, length = 15)
    public String getUserLastLogIp() {
        return userLastLogIp;
    }

    public void setUserLastLogIp(String userLastLogIp) {
        this.userLastLogIp = userLastLogIp;
    }

    @Basic
    @Column(name = "user_create_time", nullable = false)
    public Timestamp getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(Timestamp userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    @Basic
    @Column(name = "user_integration", nullable = false)
    public int getUserIntegration() {
        return userIntegration;
    }

    public void setUserIntegration(int userIntegration) {
        this.userIntegration = userIntegration;
    }

    @Basic
    @Column(name = "user_grade", nullable = false)
    public int getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(int userGrade) {
        this.userGrade = userGrade;
    }

    @Basic
    @Column(name = "user_current_px", nullable = false)
    public long getUserCurrentPx() {
        return userCurrentPx;
    }

    public void setUserCurrentPx(long userCurrentPx) {
        this.userCurrentPx = userCurrentPx;
    }

    @Basic
    @Column(name = "user_total_px", nullable = false)
    public long getUserTotalPx() {
        return userTotalPx;
    }

    public void setUserTotalPx(long userTotalPx) {
        this.userTotalPx = userTotalPx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AssnUserEntity that = (AssnUserEntity) o;

        if (userId != that.userId) return false;
        if (schoolId != that.schoolId) return false;
        if (userIntegration != that.userIntegration) return false;
        if (userGrade != that.userGrade) return false;
        if (userCurrentPx != that.userCurrentPx) return false;
        if (userTotalPx != that.userTotalPx) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userImgPath != null ? !userImgPath.equals(that.userImgPath) : that.userImgPath != null) return false;
        if (userPassword != null ? !userPassword.equals(that.userPassword) : that.userPassword != null) return false;
        if (userRealName != null ? !userRealName.equals(that.userRealName) : that.userRealName != null) return false;
        if (userMailbox != null ? !userMailbox.equals(that.userMailbox) : that.userMailbox != null) return false;
        if (userCellphone != null ? !userCellphone.equals(that.userCellphone) : that.userCellphone != null)
            return false;
        if (userStuId != null ? !userStuId.equals(that.userStuId) : that.userStuId != null) return false;
        if (userClass != null ? !userClass.equals(that.userClass) : that.userClass != null) return false;
        if (schoolName != null ? !schoolName.equals(that.schoolName) : that.schoolName != null) return false;
        if (userStatus != null ? !userStatus.equals(that.userStatus) : that.userStatus != null) return false;
        if (userLastLogTime != null ? !userLastLogTime.equals(that.userLastLogTime) : that.userLastLogTime != null)
            return false;
        if (userLastLogIp != null ? !userLastLogIp.equals(that.userLastLogIp) : that.userLastLogIp != null)
            return false;
        if (userCreateTime != null ? !userCreateTime.equals(that.userCreateTime) : that.userCreateTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userImgPath != null ? userImgPath.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        result = 31 * result + (userRealName != null ? userRealName.hashCode() : 0);
        result = 31 * result + (userMailbox != null ? userMailbox.hashCode() : 0);
        result = 31 * result + (userCellphone != null ? userCellphone.hashCode() : 0);
        result = 31 * result + (userStuId != null ? userStuId.hashCode() : 0);
        result = 31 * result + (userClass != null ? userClass.hashCode() : 0);
        result = 31 * result + (schoolName != null ? schoolName.hashCode() : 0);
        result = 31 * result + (int) (schoolId ^ (schoolId >>> 32));
        result = 31 * result + (userStatus != null ? userStatus.hashCode() : 0);
        result = 31 * result + (userLastLogTime != null ? userLastLogTime.hashCode() : 0);
        result = 31 * result + (userLastLogIp != null ? userLastLogIp.hashCode() : 0);
        result = 31 * result + (userCreateTime != null ? userCreateTime.hashCode() : 0);
        result = 31 * result + userIntegration;
        result = 31 * result + userGrade;
        result = 31 * result + (int) (userCurrentPx ^ (userCurrentPx >>> 32));
        result = 31 * result + (int) (userTotalPx ^ (userTotalPx >>> 32));
        return result;
    }
}
