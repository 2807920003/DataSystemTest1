package com.csu.service;

import com.csu.dao.UniversalDao;

//获取所有表，删除表格
public class DatabseData {
    public static Object[][] getAllTableName(){
        String [] strings= new UniversalDao().selectTableNames();


        Object [][] objects=new Object[strings.length-1][1];
        int j=0;
        for(int i=0;i<strings.length;i++){

            if(!strings[i].equals("sysdiagrams")){
                objects[j][0]=strings[i];
                j++;
            }
        }
        return objects;
    }
    public static void dropTable(String [] tableNames){
        for(int i=0;i<tableNames.length;i++){
            new UniversalDao().dropTable(tableNames[i]);
        }

    }

}
