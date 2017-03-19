package com.chuangjiangkeji.bcrm.databinding;

/**
 * Created by hecaiyang on 17/3/7.
 */

public class User {
    public String userName;
    public String passWord;


    public boolean isPassword(boolean b) {

        return b;
    }

    public boolean isUserName(boolean b) {

        return b;
    }


    public User(String passWord, String userName) {
        this.passWord = passWord;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
