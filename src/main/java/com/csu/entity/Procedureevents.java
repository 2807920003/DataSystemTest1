package com.csu.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Procedureevents {
    private int subjectId;
    private int hadmId;
    private int stayId;
    private Date starttime;
    private Date endtime;
    private Date storetime;
    private int itemid;
    private String value;
    private String valueuom;
    private String location;
    private String locationcategory;
    private int orderid;
    private int linkorderid;
    private String ordercategoryname;
    private String secondaryordercategoryname;
    private String ordercategorydescription;
    private float patientweight;
    private String totalamount;
    private String totalamountuom;
    private String isopenbag;
    private String continueinnextdept;
    private String cancelreason;
    private String statusdescription;
    private String commentsDate;
    private String originalamount;
    private String originalrate;

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
//        this.subjectId = subjectId;
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
//        this.hadmId = hadmId;
    }

    public int getStayId() {
        return stayId;
    }

    public void setStayId(int stayId) {
        this.stayId = stayId;
    }

    public void setStayId(String stayId) {
        try{
            this.stayId=Integer.parseInt(stayId);

        }catch (NumberFormatException e){
            System.out.println("stayId转换失败");
            e.printStackTrace();

        }
//        this.stayId = stayId;
    }

    public String getStarttime() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(starttime!=null)
            return simpleDateFormat.format(starttime);
        else
            return null;
//        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public void setStarttime(String starttime) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.starttime = simpleDateFormat.parse(starttime);
        } catch (ParseException e) {
            System.out.println("starttime转换失败");
            e.printStackTrace();
        }
//        this.starttime = starttime;
    }

    public String getEndtime() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(endtime!=null)
            return simpleDateFormat.format(endtime);
        else
            return null;
//        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public void setEndtime(String endtime) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.endtime = simpleDateFormat.parse(endtime);
        } catch (ParseException e) {
            System.out.println("endtime转换失败");
            e.printStackTrace();
        }
//        this.endtime = endtime;
    }

    public String getStoretime() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(storetime!=null)
            return simpleDateFormat.format(storetime);
        else
            return null;
//        return storetime;
    }

    public void setStoretime(Date storetime) {
        this.storetime = storetime;
    }

    public void setStoretime(String storetime) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.storetime = simpleDateFormat.parse(storetime);
        } catch (ParseException e) {
            System.out.println("storetime转换失败");
            e.printStackTrace();
        }
//        this.storetime = storetime;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public void setItemid(String itemid) {
        try{
            this.itemid=Integer.parseInt(itemid);

        }catch (NumberFormatException e){
            System.out.println("itemid转换失败");
            e.printStackTrace();

        }
//        this.itemid = itemid;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueuom() {
        return valueuom;
    }

    public void setValueuom(String valueuom) {
        this.valueuom = valueuom;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocationcategory() {
        return locationcategory;
    }

    public void setLocationcategory(String locationcategory) {
        this.locationcategory = locationcategory;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public void setOrderid(String orderid) {
        try{
            this.orderid=Integer.parseInt(orderid);

        }catch (NumberFormatException e){
            System.out.println("orderid转换失败");
            e.printStackTrace();

        }
//        this.orderid = orderid;
    }

    public int getLinkorderid() {
        return linkorderid;
    }

    public void setLinkorderid(int linkorderid) {
        this.linkorderid = linkorderid;
    }

    public void setLinkorderid(String linkorderid) {
        try{
            this.linkorderid=Integer.parseInt(linkorderid);

        }catch (NumberFormatException e){
            System.out.println("linkorderid转换失败");
            e.printStackTrace();

        }
//        this.linkorderid = linkorderid;
    }

    public String getOrdercategoryname() {
        return ordercategoryname;
    }

    public void setOrdercategoryname(String ordercategoryname) {
        this.ordercategoryname = ordercategoryname;
    }

    public String getSecondaryordercategoryname() {
        return secondaryordercategoryname;
    }

    public void setSecondaryordercategoryname(String secondaryordercategoryname) {
        this.secondaryordercategoryname = secondaryordercategoryname;
    }

    public String getOrdercategorydescription() {
        return ordercategorydescription;
    }

    public void setOrdercategorydescription(String ordercategorydescription) {
        this.ordercategorydescription = ordercategorydescription;
    }

    public float getPatientweight() {
        return patientweight;
    }

    public void setPatientweight(float patientweight) {
        this.patientweight = patientweight;
    }

    public void setPatientweight(String patientweight) {
        try{
            this.patientweight=Float.parseFloat(patientweight);

        }catch (NumberFormatException e){
            System.out.println("patientweight转换失败");
            e.printStackTrace();

        }

//        this.patientweight = patientweight;
    }

    public String getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(String totalamount) {
        this.totalamount = totalamount;
    }

    public String getTotalamountuom() {
        return totalamountuom;
    }

    public void setTotalamountuom(String totalamountuom) {
        this.totalamountuom = totalamountuom;
    }

    public String getIsopenbag() {
        return isopenbag;
    }

    public void setIsopenbag(String isopenbag) {
        this.isopenbag = isopenbag;
    }

    public String getContinueinnextdept() {
        return continueinnextdept;
    }

    public void setContinueinnextdept(String continueinnextdept) {
        this.continueinnextdept = continueinnextdept;
    }

    public String getCancelreason() {
        return cancelreason;
    }

    public void setCancelreason(String cancelreason) {
        this.cancelreason = cancelreason;
    }

    public String getStatusdescription() {
        return statusdescription;
    }

    public void setStatusdescription(String statusdescription) {
        this.statusdescription = statusdescription;
    }

    public String getCommentsDate() {
        return commentsDate;
    }

    public void setCommentsDate(String commentsDate) {
        this.commentsDate = commentsDate;
    }

    public String getOriginalamount() {
        return originalamount;
    }

    public void setOriginalamount(String originalamount) {
        this.originalamount = originalamount;
    }

    public String getOriginalrate() {
        return originalrate;
    }

    public void setOriginalrate(String originalrate) {
        this.originalrate = originalrate;
    }


}
