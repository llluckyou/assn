package com.assn.form;

/**
 * Created by Administrator on 2017/4/10.
 */
public class LoginForm {
    public String userName;
    public String password;
    public String authcode;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthcode() {
        return authcode;
    }

    public void setAuthcode(String authcode) {
        this.authcode = authcode;
    }

    @Override
    public String toString() {
        return "LoginForm{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", authcode='" + authcode + '\'' +
                '}';
    }
}
