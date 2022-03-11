package com.csu.entity;

public class BasicInfor {
    private String mrNo;
    private String pName;
    private String idCardNo;
    private String sex;
    private int age;
    private String phNo;
    private String nation;
    private String address;
    private String marriage;

    public String getMrNo() {
        return mrNo;
    }

    public void setMrNo(String mrNo) {
        this.mrNo = mrNo;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(sex.equals("F")||sex.equals("M"))
            this.sex = sex;
        else
            this.sex=null;
    }

    public int getAge() {
        return age;
    }

    public void setAge(String age){
        try{
            this.age=Integer.parseInt(age);

        }catch (NumberFormatException e){
            this.age=255;

        }

    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        if(phNo.equals("NULL"))
            this.phNo=null;
        else
            this.phNo = phNo;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        if(nation.equals("NULL"))
            this.nation=null;
        else
            this.nation = nation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address.equals("NULL"))
            this.address=null;
        else
            this.address = address;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        if(marriage.equals("NULL"))
            this.marriage=null;
        else
            this.marriage = marriage;
    }








}
