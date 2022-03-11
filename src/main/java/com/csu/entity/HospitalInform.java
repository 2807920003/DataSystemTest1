package com.csu.entity;

import javax.lang.model.element.NestingKind;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HospitalInform {
    private String mrNo;
    private String pName;
    private Date inHospTime;
    private String departmentName;
    private String docNo;
    private String docName;
    private String bedNo;
    private String treatmentRecor;
    private Date outHospTime;

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

    public String getInHospTime() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(inHospTime!=null)
            return simpleDateFormat.format(inHospTime);
        else
            return null;
    }

    public void setInHospTime(String inHospTime) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.inHospTime = simpleDateFormat.parse(inHospTime);
        } catch (ParseException e) {
            System.out.println("日期转换失败");
            e.printStackTrace();
        }
    }

    public void setInHospTime(Date inHospTime) {
        this.inHospTime = inHospTime;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    public String getTreatmentRecor() {
        return treatmentRecor;
    }

    public void setTreatmentRecor(String treatmentRecor) {
        this.treatmentRecor = treatmentRecor;
    }

    public String getOutHospTime() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(outHospTime!=null)
            return simpleDateFormat.format(outHospTime);
        else
            return null;
    }

    public void setOutHospTime(String outHospTime) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.outHospTime = simpleDateFormat.parse(outHospTime);
        } catch (ParseException e) {
            System.out.println("日期转换失败");
            e.printStackTrace();
        }
    }

    public void setOutHospTime(Date outHospTime) {
        this.outHospTime = outHospTime;
    }
}
