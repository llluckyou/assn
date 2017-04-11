package com.assn.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by Administrator on 2017/4/10.
 */
public class LoginForm {
    @NotNull
    @Size(max = 20)
    private String userName;

    @NotNull
    @Size(max = 20)
    @Pattern(regexp = "[0-9a-zA-Z_！@#$%%^&*().]{20}")
    private String password;

    @NotNull
    @Size(min = 4, max = 4)
    private String authcode;

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
