package com.csu.entity;

public class CheckBlood {
    private String mrNo;
    private String pName;
    private float whiteBloodCellCount;
    private float lymphocyteCount;
    private float hemoglobinCount;
    private float bloodPlateletCount;

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

    public float getWhiteBloodCellCount() {
        return whiteBloodCellCount;
    }

    public void setWhiteBloodCellCount(String whiteBloodCellCount) {
        this.whiteBloodCellCount = Float.parseFloat(whiteBloodCellCount);
    }

    public void setWhiteBloodCellCount(float whiteBloodCellCount) {
        this.whiteBloodCellCount = whiteBloodCellCount;
    }

    public float getLymphocyteCount() {
        return lymphocyteCount;
    }

    public void setLymphocyteCount(String lymphocyteCount) {
        this.lymphocyteCount = Float.parseFloat(lymphocyteCount);
    }

    public void setLymphocyteCount(float lymphocyteCount) {
        this.lymphocyteCount = lymphocyteCount;
    }

    public float getHemoglobinCount() {
        return hemoglobinCount;
    }

    public void setHemoglobinCount(String hemoglobinCount) {
        this.hemoglobinCount = Float.parseFloat(hemoglobinCount);
    }

    public void setHemoglobinCount(float hemoglobinCount) {
        this.hemoglobinCount = hemoglobinCount;
    }

    public float getBloodPlateletCount() {
        return bloodPlateletCount;
    }

    public void setBloodPlateletCount(String bloodPlateletCount) {
        this.bloodPlateletCount = Float.parseFloat(bloodPlateletCount);
    }

    public void setBloodPlateletCount(float bloodPlateletCount) {
        this.bloodPlateletCount = bloodPlateletCount;
    }





}
