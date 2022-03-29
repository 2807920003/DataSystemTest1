package com.csu.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transfers {
    private int subjectId;
    private int hadmId;
    private int transferId;
    private String eventtype;
    private String careunit;
    private Date intime;
    private Date outtime;
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

    public int getTransferId() {
        return transferId;
    }

    public void setTransferId(int transferId) {
        this.transferId = transferId;
    }

    public void setTransferId(String transferId) {
        try{
            this.transferId=Integer.parseInt(transferId);

        }catch (NumberFormatException e){
            System.out.println("transferId转换失败");
            e.printStackTrace();

        }
//        this.transferId = transferId;
    }

    public String getEventtype() {
        return eventtype;
    }

    public void setEventtype(String eventtype) {
        this.eventtype = eventtype;
    }

    public String getCareunit() {
        return careunit;
    }

    public void setCareunit(String careunit) {
        this.careunit = careunit;
    }

    public String getIntime() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(intime!=null)
            return simpleDateFormat.format(intime);
        else
            return null;
//        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public void setIntime(String intime) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.intime = simpleDateFormat.parse(intime);
        } catch (ParseException e) {
            System.out.println("intime转换失败");
            e.printStackTrace();
        }
//        this.intime = intime;
    }

    public String getOuttime() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(outtime!=null)
            return simpleDateFormat.format(outtime);
        else
            return null;
//        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    public void setOuttime(String outtime) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.outtime = simpleDateFormat.parse(outtime);
        } catch (ParseException e) {
            System.out.println("outtime转换失败");
            e.printStackTrace();
        }
//        this.outtime = outtime;
    }

}
