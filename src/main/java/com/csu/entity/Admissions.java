package com.csu.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Admissions {
    private int subjectId;
    private int hadmId;
    private Date admittime;
    private Date dischtime;
    private String deathtime;
    private String admissionType;
    private String admissionLocation;
    private String dischargeLocation;
    private String insurance;
    private String language;
    private String maritalStatus;
    private String ethnicity;
    private String edregtime;
    private String edouttime;
    private String hospitalExpireFlag;

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public void setSubjectId(String subjectId) {
        try{
            this.subjectId=Integer.parseInt(subjectId);

        }catch (NumberFormatException e){
            System.out.println("subjectId转换失败");
            e.printStackTrace();

        }
    }

    public int getHadmId() {
        return hadmId;
    }

    public void setHadmId(int hadmId) {
        this.hadmId = hadmId;
    }

    public void setHadmId(String hadmId) {
        try{
            this.hadmId=Integer.parseInt(hadmId);

        }catch (NumberFormatException e){
            System.out.println("hadmId转换失败");
            e.printStackTrace();

        }
    }

    public String getAdmittime() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(admittime!=null)
            return simpleDateFormat.format(admittime);
        else
            return null;
//        return admittime;
    }

    public void setAdmittime(Date admittime) {
        this.admittime = admittime;
    }

    public void setAdmittime(String admittime) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.admittime = simpleDateFormat.parse(admittime);
        } catch (ParseException e) {
            System.out.println("admittime转换失败");
            e.printStackTrace();
        }
    }

    public String getDischtime() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(dischtime!=null)
            return simpleDateFormat.format(dischtime);
        else
            return null;
//        return dischtime;
    }

    public void setDischtime(Date dischtime) {
        this.dischtime = dischtime;
    }

    public void setDischtime(String dischtime) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.dischtime = simpleDateFormat.parse(dischtime);
        } catch (ParseException e) {
            System.out.println("dischtime转换失败");
            e.printStackTrace();
        }
    }

    public String getDeathtime() {
        return deathtime;
    }

    public void setDeathtime(String deathtime) {
        this.deathtime = deathtime;
    }

    public String getAdmissionType() {
        return admissionType;
    }

    public void setAdmissionType(String admissionType) {
        this.admissionType = admissionType;
    }

    public String getAdmissionLocation() {
        return admissionLocation;
    }

    public void setAdmissionLocation(String admissionLocation) {
        this.admissionLocation = admissionLocation;
    }

    public String getDischargeLocation() {
        return dischargeLocation;
    }

    public void setDischargeLocation(String dischargeLocation) {
        this.dischargeLocation = dischargeLocation;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getEdregtime() {
        return edregtime;
    }

    public void setEdregtime(String edregtime) {
        this.edregtime = edregtime;
    }

    public String getEdouttime() {
        return edouttime;
    }

    public void setEdouttime(String edouttime) {
        this.edouttime = edouttime;
    }

    public String getHospitalExpireFlag() {
        return hospitalExpireFlag;
    }

    public void setHospitalExpireFlag(String hospitalExpireFlag) {
        this.hospitalExpireFlag = hospitalExpireFlag;
    }






}
