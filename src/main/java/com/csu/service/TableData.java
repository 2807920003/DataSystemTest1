package com.csu.service;

import com.csu.dao.*;
import com.csu.entity.*;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

//针对表格数据增删改查
public class TableData {
    //获取指定表中的所有数据
    public static Object[][] getAllData(String name) throws  ClassNotFoundException {
        String classname;
        List list;
        Class c;
        switch (name) {
            case "Basic_Infor":
                 classname="com.csu.entity.BasicInfor";
                 list= new BasicInforDao().selectAllBasicInfor();
                 break;
            case "Check_Blood":
                classname="com.csu.entity.CheckBlood";
                list=new CheckBloodDao().selectAllCheckBlood();
                break;
            case "Check_Eye":
                classname="com.csu.entity.CheckEye";
                list=new CheckEyeDao().selectAllCheckEye();
                break;
            case "Check_Pressure":
                classname="com.csu.entity.CheckPressure";
                list=new CheckPressureDao().selectAllCheckPressure();
                break;
            case "CheckProj_Infor":
                classname="com.csu.entity.CheckProjInfor";
                list=new CheckProjInforDao().selectAllCheckProjInfor();
                break;
            case "Hospital_Inform":
                classname="com.csu.entity.HospitalInform";
                list=new HospitalInformDao().selectAllHospitalInform();
                break;
            case "Image_Infor":
                classname="com.csu.entity.ImageInfor";
                list=new ImageInforDao().selectAllImageInfor();
                break;
            case "ImageScreening_Infor":
                classname="com.csu.entity.ImageScreeningInfor";
                list=new ImageScreeningInforDao().selectAllImageScreeningInfor();
                break;
            case "Registration_Infor":
                classname="com.csu.entity.RegistrationInfor";
                list=new RegistrationInforDao().selectAllRegistrationInfor();
                break;
//                mimic
            case "admissions":
                classname="com.csu.entity.Admissions";
                list=new AdmissionsDao().selectAllAdmissions();
                break;
            case "patients":
                classname="com.csu.entity.Patients";
                list=new PatientsDao().selectAllPatients();
                break;
            case "procedureevents":
                classname="com.csu.entity.Procedureevents";
                list=new ProcedureeventsDao().selectAllProcedureevents();
                break;
            case "transfers":
                classname="com.csu.entity.Transfers";
                list=new TransfersDao().selectAllTransfers();
                break;
            default:
                return null;
        }
        c=Class.forName(classname);
        return getObjects(list,c);

    }
    //获取指定表中的所有列名
    public static Object[] getColumns(String tablename) throws ClassNotFoundException {
       return new UniversalDao().selectColumnNames("'"+tablename+"'");

    }
    //添加数据   待修改：增加返回值
    public static List addData(Object[][] objects,String tablename) {
        Object entityClass = null;
        Object daoClass = null;
        List error=new ArrayList();
        switch (tablename) {
            case "Basic_Infor":
                entityClass=new BasicInfor();
                daoClass=new BasicInforDao();
                break;
            case "Check_Blood":
                entityClass=new CheckBlood();
                daoClass=new CheckBloodDao();
                break;
            case "Check_Eye":
                entityClass=new CheckEye();
                daoClass=new CheckEyeDao();
                break;
            case "Check_Pressure":
                entityClass=new CheckPressure();
                daoClass=new CheckPressureDao();
                break;
            case "CheckProj_Infor":
                entityClass=new CheckProjInfor();
                daoClass=new CheckProjInforDao();
                break;
            case "Hospital_Inform":
               entityClass=new HospitalInform();
               daoClass=new HospitalInformDao();
                break;
            case "Image_Infor":
                entityClass=new ImageInfor();
                daoClass=new ImageInforDao();
                break;
            case "ImageScreening_Infor":
                entityClass=new ImageScreeningInfor();
                daoClass=new ImageScreeningInforDao();
                break;
            case "Registration_Infor":
                entityClass=new RegistrationInfor();
                daoClass=new RegistrationInforDao();
                break;
//                mimic
            case "admissions":
                entityClass=new Admissions();
                daoClass=new AdmissionsDao();
                break;
            case "patients":
                entityClass=new Patients();
                daoClass=new PatientsDao();
                break;
            case "procedureevents":
                entityClass=new Procedureevents();
                daoClass=new ProcedureeventsDao();
                break;
            case "transfers":
                entityClass=new Transfers();
                daoClass=new TransfersDao();
                break;
            default:
        }
        Class c=entityClass.getClass();
        Field[] fields = c.getDeclaredFields();
        //Method[] methods=c.getMethods();
        BasicInfor b=new BasicInfor();
       // System.out.println(objects.length);
        for(int i=0;i<objects.length;i++){
            for(int j=0;j<fields.length;j++){
                if(objects[i][j]==null){
                }
                else{
                    try {
                        c.getMethod("set"+fields[j].getName().substring(0,1).toUpperCase()+fields[j].getName().substring(1),String.class).invoke(entityClass,objects[i][j].toString());
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                        error.add(i);
                        break;
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                daoClass.getClass().getMethod("insert"+c.getSimpleName(),c).invoke(daoClass,entityClass);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (org.apache.ibatis.exceptions.PersistenceException e){
                e.printStackTrace();
                error.add(i);
                System.out.println("asd");
            } catch (InvocationTargetException e) {
                error.add(i);
                e.printStackTrace();
            }


        }
       // System.out.println(error.size());
        return error;


    }

    //删除数据 待修改，增加返回值
    public static void deleteData(String [] pks,String tablename,String columnName){
        for(int i=0;i<pks.length;i++){
            new UniversalDao().deleteTableRow(tablename,columnName,pks[i]);
        }
    }

    //修改数据 待修改，增加返回值
    public static List updateData(Object[][] objects,String tablename) {
        Object entityClass = null;
        Object daoClass = null;
        //int error=0;
        List error=new ArrayList();
        switch (tablename) {
            case "Basic_Infor":
                entityClass=new BasicInfor();
                daoClass=new BasicInforDao();
                break;
            case "Check_Blood":
                entityClass=new CheckBlood();
                daoClass=new CheckBloodDao();
                break;
            case "Check_Eye":
                entityClass=new CheckEye();
                daoClass=new CheckEyeDao();
                break;
            case "Check_Pressure":
                entityClass=new CheckPressure();
                daoClass=new CheckPressureDao();
                break;
            case "CheckProj_Infor":
                entityClass=new CheckProjInfor();
                daoClass=new CheckProjInforDao();
                break;
            case "Hospital_Inform":
                entityClass=new HospitalInform();
                daoClass=new HospitalInformDao();
                break;
            case "Image_Infor":
                entityClass=new ImageInfor();
                daoClass=new ImageInforDao();
                break;
            case "ImageScreening_Infor":
                entityClass=new ImageScreeningInfor();
                daoClass=new ImageScreeningInforDao();
                break;
            case "Registration_Infor":
                entityClass=new RegistrationInfor();
                daoClass=new RegistrationInforDao();
                break;
            default:
        }
        Class c=entityClass.getClass();
        Field [] fields=c.getDeclaredFields();
        //Method[] methods=c.getDeclaredMethods();
        for(int i=0;i<objects.length;i++){
            for(int j=0;j<fields.length;j++){
               // System.out.println(objects[i]);
                //int k=getMethod(methods,"set"+fields[i].getName().substring(0,1).toUpperCase()+fields[i].getName().substring(1));
                //methods[k].invoke(entityClass,objects[i]);
                if(objects[i][j]==null){

                }
                else{
                    try {
                        c.getMethod("set"+fields[j].getName().substring(0,1).toUpperCase()+fields[j].getName().substring(1),String.class).invoke(entityClass,objects[i][j].toString());
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        error.add(i);
                        break;
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                daoClass.getClass().getMethod("update"+c.getSimpleName()+"ById",c).invoke(daoClass,entityClass);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                error.add(i);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        return error;

    }

    //根据mrNo查询数据
    public static Object[][] getDataById(String mrNo,String tablename){
        String classname;
        List list;
        Class c = null;
        switch (tablename) {
            case "Basic_Infor":
                classname="com.csu.entity.BasicInfor";
                list= new BasicInforDao().selectBasicInforById(mrNo);
                break;
            case "Check_Blood":
                classname="com.csu.entity.CheckBlood";
                list=new CheckBloodDao().selectCheckBloodById(mrNo);
                break;
            case "Check_Eye":
                classname="com.csu.entity.CheckEye";
                list=new CheckEyeDao().selectCheckEyeById(mrNo);
                break;
            case "Check_Pressure":
                classname="com.csu.entity.CheckPressure";
                list=new CheckPressureDao().selectCheckPressureById(mrNo);
                break;
            case "CheckProj_Infor":
                classname="com.csu.entity.CheckProjInfor";
                list=new CheckProjInforDao().selectCheckProjInforById(mrNo);
                break;
            case "Hospital_Inform":
                classname="com.csu.entity.HospitalInform";
                list=new HospitalInformDao().selectHospitalInformById(mrNo);
                break;
            case "Image_Infor":
                classname="com.csu.entity.ImageInfor";
                list=new ImageInforDao().selectImageInforById(mrNo);
                break;
            case "ImageScreening_Infor":
                classname="com.csu.entity.ImageScreeningInfor";
                list=new ImageScreeningInforDao().selectImageScreeningInforById(mrNo);
                break;
            case "Registration_Infor":
                classname="com.csu.entity.RegistrationInfor";
                list=new RegistrationInforDao().selectRegistrationInforById(mrNo);
                break;
//                mimic:
            case "admissions":
                classname="com.csu.entity.Admissions";
                list=new AdmissionsDao().selectAdmissionsById(Integer.parseInt(mrNo));
                break;
            case "patients":
                classname="com.csu.entity.Patients";
                list=new PatientsDao().selectPatientsById(Integer.parseInt(mrNo));
                break;
            case "procedureevents":
                classname="com.csu.entity.Procedureevents";
                list=new ProcedureeventsDao().selectProcedureeventsById(Integer.parseInt(mrNo));
                break;
            case "transfers":
                classname="com.csu.entity.Transfers";
                list=new TransfersDao().selectTransfersById(Integer.parseInt(mrNo));
                break;

            default:
                return null;
        }
        try {
            c=Class.forName(classname);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return getObjects(list,c);


    }


    public static Object[][] getObjects(List list,Class c){
        Field[] fields = c.getDeclaredFields();
        Object[][] objects = new Object[list.size()][fields.length];
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < fields.length; j++) {
                try {
                    objects[i][j] = c.getMethod("get" + fields[j].getName().substring(0,1).toUpperCase()+fields[j].getName().substring(1), null).invoke(list.get(i), null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
            }

        }
        return objects;
    }
    public static int getMethod(Method[] methods,String methodName){
        for(int i=0;i<methods.length;i++){
            if(methods[i].getName().equals(methodName))
                return i;
        }
        return -1;
    }


}
