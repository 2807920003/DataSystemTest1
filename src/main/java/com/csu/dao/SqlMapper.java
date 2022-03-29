package com.csu.dao;

import com.csu.entity.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SqlMapper {
    List<BasicInfor>  selectAllBasicInfor();
    List<CheckBlood>  selectAllCheckBlood();
    List<CheckEye>    selectAllCheckEye();
    List<CheckPressure> selectAllCheckPressure();
    List<CheckProjInfor> selectAllCheckProjInfor();
    List<HospitalInform> selectAllHospitalInform();
    List<ImageInfor> selectAllImageInfor();
    List<ImageScreeningInfor> selectAllImageScreeningInfor();
    List<RegistrationInfor> selectAllRegistrationInfor();
    List<BasicInfor> selectBasicInforById(String mrNo);
    List<CheckBlood> selectCheckBloodById(String mrNo);
    List<CheckEye> selectCheckEyeById(String mrNo);
    List<CheckPressure> selectCheckPressureById(String mrNo);
    List<CheckProjInfor> selectCheckProjInforById(String mrNo);
    List<HospitalInform> selectHospitalInformById(String mrNo);
    List<ImageInfor> selectImageInforById(String mrNo);
    List<ImageScreeningInfor> selectImageScreeningInforById(String mrNo);
    List<RegistrationInfor> selectRegistrationInforById(String mrNo);
    void updateBasicInforById(BasicInfor basicInfor);
    void updateCheckBloodById(CheckBlood checkBlood);
    void updateCheckEyeById(CheckEye checkEye);
    void updateCheckPressureById(CheckPressure checkPressure);
    void updateCheckProjInforById(CheckProjInfor checkProjInfor);
    void updateHospitalInformById(HospitalInform hospitalInform);
    void updateImageInforById(ImageInfor imageInfor);
    void updateImageScreeningInforById(ImageScreeningInfor imageScreeningInfor);
    void updateRegistrationInforById(RegistrationInfor registrationInfor);
    void insertBasicInfor(BasicInfor basicInfor);
    void insertCheckBlood(CheckBlood checkBlood);
    void insertCheckEye(CheckEye checkEye);
    void insertCheckPressure(CheckPressure checkPressure);
    void insertCheckProjInfor(CheckProjInfor checkProjInfor);
    void insertHospitalInform(HospitalInform hospitalInform);
    void insertImageInfor(ImageInfor imageInfor);
    void insertImageScreeningInfor(ImageScreeningInfor imageScreeningInfor);
    void insertRegistrationInfor(RegistrationInfor registrationInfor);




    void updateTableColumn(@Param("table") String table,@Param("column") String column,@Param("value") String value,@Param("mrNo") String mrNO);
    void deleteTableRow(@Param("table") String table,@Param("column") String column,@Param("value") String value);
    String[] selectColumnNames(@Param("table") String table);
    String[] selectTableNames();
    void dropTable(@Param("table")String table);

//    mimic操作内容
    List<Admissions> selectAllAdmissions();
    List<Patients> selectAllPatients();
    List<Procedureevents> selectAllProcedureevents();
    List<Transfers> selectAllTransfers();
    List<Admissions> selectAdmissionsById(int subjectId);
    List<Patients> selectPatientsById(int subjectId);
    List<Procedureevents> selectProcedureeventsById(int subjectId);
    List<Transfers> selectTransfersById(int subjectId);
    void updateAdmissionsById(Admissions admissions);
    void updatePatientsById(Patients patients);
    void updateProcedureeventsById(Procedureevents procedureevents);
    void updateTransfersById(Transfers transfers);
    void insertAdmissions(Admissions admissions);
    void insertPatients(Patients patients);
    void insertProcedureevents(Procedureevents procedureevents);
    void insertTransfers(Transfers transfers);











}
