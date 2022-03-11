package com.csu.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistrationInfor {
    private String mrNo;
    private String pName;
    private String regNo;
    private String idCardNo;
    private String departmentName;
    private Date regTime=new Date();
    private String docNo;
    private String docName;
    private String painPart;
    private String regResult;
    private String drugInfor;
    private boolean inHosp;
    private boolean reCheck;

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

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        if(!regNo.equals("NULL"))
            this.regNo = regNo;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        if(!idCardNo.equals("NULL"))
            this.idCardNo = idCardNo;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        if(!departmentName.equals("NULL"))
            this.departmentName = departmentName;
    }

    public String getRegTime() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(regTime);
    }

    public void setRegTime(String regTime) throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.regTime = simpleDateFormat.parse(regTime);
        } catch (ParseException e) {
            //this.regTime=simpleDateFormat.parse("0000-00-00 00:00:00");
           // e.printStackTrace();
        }
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        if(!docNo.equals("NULL"))
            this.docNo = docNo;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        if(!docName.equals("NULL"))
            this.docName = docName;
    }

    public String getPainPart() {
        return painPart;
    }

    public void setPainPart(String painPart) {
        if(!painPart.equals("NULL"))
            this.painPart = painPart;
    }

    public String getRegResult() {
        return regResult;
    }

    public void setRegResult(String regResult) {
        if(!regResult.equals("NULL"))
            this.regResult = regResult;
        else
            this.regResult="None";
    }

    public String getDrugInfor() {
        return drugInfor;
    }

    public void setDrugInfor(String drugInfor) {
        this.drugInfor = drugInfor;
    }

    public boolean getInHosp() {
        return inHosp;
    }

    public void setInHosp(String inHosp) {
        this.inHosp = Boolean.parseBoolean(inHosp);
    }

    public void setInHosp(boolean inHosp) {
        this.inHosp = inHosp;
    }

    public boolean getReCheck() {
        return reCheck;
    }

    public void setReCheck(String reCheck) {
        this.reCheck = Boolean.parseBoolean(reCheck);
    }

    public void setReCheck(boolean reCheck) {
        this.reCheck = reCheck;
    }


}
