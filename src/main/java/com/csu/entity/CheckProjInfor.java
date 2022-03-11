package com.csu.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckProjInfor {
    private String mrNo;
    private String pName;
    private String projNo;
    private String docNo;
    private String docName;
    private String projName;
    private Date checkTime;
    private int checkCost;

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

    public String getProjNo() {
        return projNo;
    }

    public void setProjNo(String projNo) {
        this.projNo = projNo;
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

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

//    public Date getCheckTime() {
//        return checkTime;
//    }
    public String getCheckTime(){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(checkTime!=null)
            return simpleDateFormat.format(checkTime);
        else
            return null;

    }

    public void setCheckTime(String checkTime) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.checkTime = simpleDateFormat.parse(checkTime);
        } catch (ParseException e) {
            System.out.println("日期转换失败");
            e.printStackTrace();
        }
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public int getCheckCost() {
        return checkCost;
    }

    public void setCheckCost(String checkCost) {
        try{
            this.checkCost = Integer.parseInt(checkCost);
        }catch (NumberFormatException e){
            this.checkCost=-1;
        }

    }

    public void setCheckCost(int checkCost) {
        this.checkCost = checkCost;
    }


}
