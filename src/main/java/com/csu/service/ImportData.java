package com.csu.service;

import com.csu.dao.*;
import com.csu.entity.BasicInfor;
import com.csvreader.CsvReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

//导入数据
public class ImportData {
    public static List importToOneTable(String tableName,String filepath) throws IOException {
        String classname=null;
        List error = new ArrayList();
        switch (tableName){
            case "Basic_Infor":
                classname="com.csu.entity.BasicInfor";
                break;
            case "Check_Blood":
                classname="com.csu.entity.CheckBlood";
                break;
            case "Check_Eye":
                classname="com.csu.entity.CheckEye";
                break;
            case "Check_Pressure":
                classname="com.csu.entity.CheckPressure";
                break;
            case "CheckProj_Infor":
                classname="com.csu.entity.CheckProjInfor";
                break;
            case "Hospital_Inform":
                classname="com.csu.entity.HospitalInform";
                break;
            case "Image_Infor":
                classname="com.csu.entity.ImageInfor";
                break;
            case "ImageScreening_Infor":
                classname="com.csu.entity.ImageScreeningInfor";
                break;
            case "Registration_Infor":
                classname="com.csu.entity.RegistrationInfor";
                break;
            default:
        }
        Class c = null;
        try {
            c=Class.forName(classname);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //String filepath="C:\\Users\\lenovo\\Desktop\\Test.csv";  //测试文件路径
        CsvReader csvReader= null;
        try {
            csvReader = new CsvReader(filepath,',',Charset.forName("UTF-8"));
        } catch (FileNotFoundException e) {
            System.out.println("找不到文件");
            e.printStackTrace();
        }
        try {
            csvReader.readHeaders();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] headers = null;
        try {
            headers=csvReader.getHeaders();  //读取csv文件 头内容（第一行）
        } catch (IOException e) {
            e.printStackTrace();
        }
        String [] fields=new UniversalDao().selectColumnNames("'"+tableName+"'");
       // Field [] fields=c.getDeclaredFields();
        int [] seq=new int[fields.length];
        for(int i=0;i<seq.length;i++)
            seq[i]=-1;
        for(int i=0;i<headers.length;i++){
            for(int j=0;j<fields.length;j++){
                if(fields[j].equals(headers[i])){
                    seq[j]=i;
                }
            }
        }
        Object[][] objects=new Object[1][fields.length];
        int count=0;
        while (csvReader.readRecord()){
            for(int i=0;i<fields.length;i++){
                if(seq[i]==-1)
                    objects[0][i]=null;
                else
                    objects[0][i]=csvReader.get(seq[i]);
            }
            List list= TableData.addData(objects,tableName);
            System.out.println(objects[0][0]);
            if(list.size()!=0)
                error.add(count);
            count++;

        }
        return error;

    }

}
