package com.csu.entity;

public class Patients {
    private int subjectId;
    private String gender;
    private String anchorAge;
    private int anchorYear;
    private String anchorYearGroup;
    private String dod;


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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAnchorAge() {
        return anchorAge;
    }

    public void setAnchorAge(String anchorAge) {
        this.anchorAge = anchorAge;
    }

    public int getAnchorYear() {
        return anchorYear;
    }

    public void setAnchorYear(int anchorYear) {
        this.anchorYear = anchorYear;
    }

    public void setAnchorYear(String anchorYear) {
        try{
            this.anchorYear=Integer.parseInt(anchorYear);

        }catch (NumberFormatException e){
            System.out.println("anchorYear转换失败");
            e.printStackTrace();

        }
    }

    public String getAnchorYearGroup() {
        return anchorYearGroup;
    }

    public void setAnchorYearGroup(String anchorYearGroup) {
        this.anchorYearGroup = anchorYearGroup;
    }

    public String getDod() {
        return dod;
    }

    public void setDod(String dod) {
        this.dod = dod;
    }



}
