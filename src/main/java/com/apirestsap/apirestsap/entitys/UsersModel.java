package com.apirestsap.apirestsap.entitys;

public class UsersModel {
    private int USERID;
    private String USER_CODE;
    private String U_NAME;

    public int getUSERID() {
        return USERID;
    }
    public void setUSERID(int uSERID) {
        USERID = uSERID;
    }
    public String getUSER_CODE() {
        return USER_CODE;
    }
    public void setUSER_CODE(String uSER_CODE) {
        USER_CODE = uSER_CODE;
    }
    public String getU_NAME() {
        return U_NAME;
    }
    public void setU_NAME(String u_NAME) {
        U_NAME = u_NAME;
    }

    @Override
    public String toString() {
        return "Users [USERID=" + USERID + ", USER_CODE=" + USER_CODE + ", U_NAME=" + U_NAME + "]";
    }    
}
