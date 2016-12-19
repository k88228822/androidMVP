package com.example.wang.test.entity;

/**
 * Created by wangzhen on 2016/12/19.
 */

public class TblUser{
    private int id;
    private String cert_no="";
    private String cert_type="";
    private String name="";
    private String loginpassword="";
    private String transactionpassword="";
    private String phone="";
    private String email="";
    private String wechat="";
    private String card_no="";
    private String birthday="";
    private String balance="0";
    private String institution="";
    private String open_date="";
    private String other="";
    private String status="";
    private String accumulatedearnings="0";
    private String accumulatedinvestment="0";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCert_no() {
        return cert_no;
    }

    public void setCert_no(String cert_no) {
        this.cert_no = cert_no;
    }

    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginpassword() {
        return loginpassword;
    }

    public void setLoginpassword(String loginpassword) {
        this.loginpassword = loginpassword;
    }

    public String getTransactionpassword() {
        return transactionpassword;
    }

    public void setTransactionpassword(String transactionpassword) {
        this.transactionpassword = transactionpassword;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getOpen_date() {
        return open_date;
    }

    public void setOpen_date(String open_date) {
        this.open_date = open_date;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccumulatedearnings() {
        return accumulatedearnings;
    }

    public void setAccumulatedearnings(String accumulatedearnings) {
        this.accumulatedearnings = accumulatedearnings;
    }

    public String getAccumulatedinvestment() {
        return accumulatedinvestment;
    }

    public void setAccumulatedinvestment(String accumulatedinvestment) {
        this.accumulatedinvestment = accumulatedinvestment;
    }
}
