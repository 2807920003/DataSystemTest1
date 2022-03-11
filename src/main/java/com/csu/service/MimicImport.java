package com.csu.service;

import com.csu.dao.*;
import com.csu.entity.*;
import com.csvreader.CsvReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;

public class MimicImport {
    public void basicInforImport(String filePath) throws IOException {
        CsvReader csvReader=new CsvReader(filePath,',', Charset.forName("UTF-8"));
        String[] headers=csvReader.getHeaders();
        while (csvReader.readRecord()){
            BasicInfor basicInfor=new BasicInfor();
            basicInfor.setMrNo(csvReader.get(""));//引号里放mimic字段，此处对应basicinfor的mrNo字段。
            basicInfor.setPName(csvReader.get(""));//引号里放mimic字段，此处对应basicinfor的pName字段。
            basicInfor.setIdCardNo(csvReader.get(""));//引号里放mimic字段，此处对应basicinfor的idCardNo字段。
            basicInfor.setSex(csvReader.get(""));//引号里放mimic字段，此处对应basicinfor的sex字段。
            basicInfor.setAge(csvReader.get(""));//引号里放mimic字段，此处对应basicinfor的age字段。
            basicInfor.setPhNo(csvReader.get(""));//引号里放mimic字段，此处对应basicinfor的phNo字段。
            basicInfor.setNation(csvReader.get(""));//引号里放mimic字段，此处对应basicinfor的nation字段。
            basicInfor.setAddress(csvReader.get(""));//引号里放mimic字段，此处对应basicinfor的address字段。
            basicInfor.setMarriage(csvReader.get(""));//引号里放mimic字段，此处对应basicinfor的marriage字段。
            new BasicInforDao().insertBasicInfor(basicInfor);
        }

    }
    public void checkBloodImport(String filePath) throws IOException {
        CsvReader csvReader=new CsvReader(filePath,',', Charset.forName("UTF-8"));
        String[] headers=csvReader.getHeaders();
        while (csvReader.readRecord()){
            CheckBlood checkBlood=new CheckBlood();
            checkBlood.setMrNo(csvReader.get(""));//引号里放mimic字段，此处对应checkblood的mrNo字段。
            checkBlood.setPName(csvReader.get(""));//引号里放mimic字段，此处对应checkblood的pName字段。
            checkBlood.setWhiteBloodCellCount(csvReader.get(""));//引号里放mimic字段，此处对应checkblood的whiteBloodCellCount字段。
            checkBlood.setLymphocyteCount(csvReader.get(""));//引号里放mimic字段，此处对应checkblood的lymphocyteCount字段。
            checkBlood.setHemoglobinCount(csvReader.get(""));//引号里放mimic字段，此处对应checkblood的hemoglobinCount字段。
            checkBlood.setBloodPlateletCount(csvReader.get(""));//引号里放mimic字段，此处对应checkblood的bloodPlateletCount字段。
            new CheckBloodDao().insertCheckBlood(checkBlood);
        }

    }
    public void checkEyeImport(String filePath) throws IOException {
        CsvReader csvReader=new CsvReader(filePath,',', Charset.forName("UTF-8"));
        String[] headers=csvReader.getHeaders();
        while (csvReader.readRecord()){
            CheckEye checkEye=new CheckEye();
            checkEye.setMrNo(csvReader.get(""));//引号里放mimic字段，此处对应CheckEye的mrNo字段。
            checkEye.setPName(csvReader.get(""));//引号里放mimic字段，此处对应CheckEye的pName字段。
            checkEye.setLeftVision(csvReader.get(""));//引号里放mimic字段，此处对应CheckEye的leftVision字段。
            checkEye.setRightVision(csvReader.get(""));//引号里放mimic字段，此处对应CheckEye的rightVision字段。
            checkEye.setLeftCorVision(csvReader.get(""));//引号里放mimic字段，此处对应CheckEye的leftCorVision字段。
            checkEye.setRightCorVision(csvReader.get(""));//引号里放mimic字段，此处对应CheckEye的rightCorVision字段。
            checkEye.setIop(csvReader.get(""));//引号里放mimic字段，此处对应CheckEye的iop字段。
            new CheckEyeDao().insertCheckEye(checkEye);
        }
    }
    public void checkPressureImport(String filePath) throws IOException {
        CsvReader csvReader=new CsvReader(filePath,',', Charset.forName("UTF-8"));
        String[] headers=csvReader.getHeaders();
        while (csvReader.readRecord()){
            CheckPressure checkPressure=new CheckPressure();
            checkPressure.setMrNo(csvReader.get(""));//引号里放mimic字段，此处对应CheckPressure的mrNo字段。
            checkPressure.setPName(csvReader.get(""));//引号里放mimic字段，此处对应CheckPressure的pName字段。
            checkPressure.setHighPressure(csvReader.get(""));//引号里放mimic字段，此处对应CheckPressure的highPressure字段。
            checkPressure.setLowPressure(csvReader.get(""));//引号里放mimic字段，此处对应CheckPressure的lowPressure字段。
            checkPressure.setPulse(csvReader.get(""));//引号里放mimic字段，此处对应CheckPressure的pulse字段。
            new CheckPressureDao().insertCheckPressure(checkPressure);

        }

    }
    public void checkProjInfor(String filePath) throws IOException {
        CsvReader csvReader=new CsvReader(filePath,',', Charset.forName("UTF-8"));
        String[] headers=csvReader.getHeaders();
        while (csvReader.readRecord()){
            CheckProjInfor checkProjInfor=new CheckProjInfor();
            checkProjInfor.setMrNo(csvReader.get(""));//引号里放mimic字段，此处对应CheckProjInfor的mrNo字段。
            checkProjInfor.setPName(csvReader.get(""));//引号里放mimic字段，此处对应CheckProjInfor的pName字段。
            checkProjInfor.setProjNo(csvReader.get(""));//引号里放mimic字段，此处对应CheckProjInfor的projNo字段。
            checkProjInfor.setDocNo(csvReader.get(""));//引号里放mimic字段，此处对应CheckProjInfor的docNo字段。
            checkProjInfor.setDocName(csvReader.get(""));//引号里放mimic字段，此处对应CheckProjInfor的docName字段。
            checkProjInfor.setProjName(csvReader.get(""));//引号里放mimic字段，此处对应CheckProjInfor的projName字段。
            checkProjInfor.setCheckTime(csvReader.get(""));//引号里放mimic字段，此处对应CheckProjInfor的checkTime字段。
            checkProjInfor.setCheckCost(csvReader.get(""));//引号里放mimic字段，此处对应CheckProjInfor的checkCost字段。
            new CheckProjInforDao().insertCheckProjInfor(checkProjInfor);

        }

    }
    public void hospitalInformImport(String filePath) throws IOException {
        CsvReader csvReader=new CsvReader(filePath,',', Charset.forName("UTF-8"));
        String[] headers=csvReader.getHeaders();
        while (csvReader.readRecord()){
            HospitalInform hospitalInform=new HospitalInform();
            hospitalInform.setMrNo(csvReader.get(""));//引号里放mimic字段，此处对应HospitalInform的mrNo字段。
            hospitalInform.setPName(csvReader.get(""));//引号里放mimic字段，此处对应HospitalInform的pName字段。
            hospitalInform.setInHospTime(csvReader.get(""));//引号里放mimic字段，此处对应HospitalInform的inHospTime字段。
            hospitalInform.setDepartmentName(csvReader.get(""));//引号里放mimic字段，此处对应HospitalInform的departmentName字段。
            hospitalInform.setDocNo(csvReader.get(""));//引号里放mimic字段，此处对应HospitalInform的docNo字段。
            hospitalInform.setDocName(csvReader.get(""));//引号里放mimic字段，此处对应HospitalInform的docName字段。
            hospitalInform.setBedNo(csvReader.get(""));//引号里放mimic字段，此处对应HospitalInform的bedNo字段。
            hospitalInform.setTreatmentRecor(csvReader.get(""));//引号里放mimic字段，此处对应HospitalInform的treatmentRecor字段。
            hospitalInform.setOutHospTime(csvReader.get(""));//引号里放mimic字段，此处对应HospitalInform的outHospTime字段。
            new HospitalInformDao().insertHospitalInform(hospitalInform);



        }

    }

}
