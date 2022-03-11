package com.csu.entity;

//import sun.awt.windows.WPrinterJob;

public class CheckPressure {
    private String mrNo;
    private String pName;
    private int highPressure;
    private int lowPressure;
    private int pulse;

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

    public int getHighPressure() {
        return highPressure;
    }

    public void setHighPressure(String highPressure) {
        try {
            this.highPressure = Integer.parseInt(highPressure);
        }catch (NumberFormatException e){
            this.highPressure=-1;

        }


    }

    public void setHighPressure(int highPressure) {
        this.highPressure = highPressure;
    }

    public int getLowPressure() {
        return lowPressure;
    }

    public void setLowPressure(String lowPressure) {
        try{
            this.lowPressure = Integer.parseInt(lowPressure);
        }catch (NumberFormatException e){
            this.lowPressure=-1;

        }

    }

    public void setLowPressure(int lowPressure) {
        this.lowPressure = lowPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        try{
            this.pulse = Integer.parseInt(pulse);
        }catch (NumberFormatException e){
            this.pulse=-1;

        }

    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }


}
