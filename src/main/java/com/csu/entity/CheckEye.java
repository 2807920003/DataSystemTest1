package com.csu.entity;

public class CheckEye {
    private String mrNo;
    private String pName;
    private double leftVision;
    private double rightVision;
    private double leftCorVision;
    private double rightCorVision;
    private double iop;

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

    public double getLeftVision() {
        return leftVision;
    }

    public void setLeftVision(String leftVision) {
        try{
            this.leftVision = Double.parseDouble(leftVision);

        }catch (NumberFormatException e){
            this.leftVision=-1;
        }

    }

    public void setLeftVision(double leftVision) {
        this.leftVision = leftVision;
    }

    public double getRightVision() {
        return rightVision;
    }

    public void setRightVision(String rightVision) {
        try{
            this.rightVision = Double.parseDouble(rightVision);
        }catch (NumberFormatException e){
            this.rightVision =-1;
        }

    }

    public void setRightVision(double rightVision) {
        this.rightVision = rightVision;
    }

    public double getLeftCorVision() {
        return leftCorVision;
    }

    public void setLeftCorVision(String leftCorVision) {
        try{
            this.leftCorVision = Double.parseDouble(leftCorVision);

        }catch (NumberFormatException e){
            this.leftCorVision=-1;
        }

    }

    public void setLeftCorVision(double leftCorVision) {
        this.leftCorVision = leftCorVision;
    }

    public double getRightCorVision() {
        return rightCorVision;
    }

    public void setRightCorVision(String rightCorVision) {
        try{
            this.rightCorVision = Double.parseDouble(rightCorVision);
        }catch (NumberFormatException e){
            this.rightCorVision=-1;
        }

    }

    public void setRightCorVision(double rightCorVision) {
        try{
            this.rightCorVision = rightCorVision;
        }catch (NumberFormatException e){
            this.rightCorVision=-1;
        }

    }

    public double getIop() {
        return iop;
    }

    public void setIop(String iop) {
        try{
            this.iop = Double.parseDouble(iop);
        }catch (NumberFormatException e){
            this.iop = -1;
        }

    }

    public void setIop(double iop) {
        this.iop = iop;


    }




}
