package com.csu;

import com.csu.dao.BasicInforDao;
import com.csu.dao.CheckEyeDao;
import com.csu.dao.UniversalDao;
import com.csu.entity.BasicInfor;
import com.csu.entity.CheckEye;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        List<BasicInfor> ba=new BasicInforDao().selectBasicInforById("21091800000");
//        for(int i=0;i<ba.size();i++){
//            System.out.println(ba.get(i).getPName());
//        }
//        BasicInfor basicInfor=new BasicInfor();
//        basicInfor.setMrNo("21091800000");
//        basicInfor.setAge("27");
//        new BasicInforDao().updateBasicInforById(basicInfor);
       // UniversalDao universalDao=new UniversalDao();
       // universalDao.updateTableColumn("Basic_Infor","age","27","21091800000");
//        BasicInfor b=new BasicInfor();
//        System.out.println(b.getClass().getSimpleName());
//        Method [] methods=b.getClass().getMethods();
//        for(int i=0;i<methods.length;i++)
//            System.out.println(methods[i].getName());
//        CheckEyeDao checkEyeDao=new CheckEyeDao();
//        CheckEye checkEye=new CheckEye();
//        checkEye.setMrNo("21091800000");
//        checkEye.setLeftVision(4.6);
//        checkEyeDao.updateCheckEyeById(checkEye);
//        BasicInfor basicInfor=new BasicInfor();
//       // basicInfor.setMrNo("1");
//        basicInfor.setPName("a");
//        //new BasicInforDao().insertBasicInfor(basicInfor);
//
//        try{
//            new BasicInforDao().insertBasicInfor(basicInfor);
//        }
//        catch (org.apache.ibatis.exceptions.PersistenceException e){
//            System.out.println("asd");
//        }
       // new UniversalDao().deleteTableRow("Basic_Infor","MR_No","8");
//        BasicInfor basicInfor=new BasicInfor();
//        basicInfor.setPName("a");
//        basicInfor.setMrNo("0");
//        new BasicInforDao().updateBasicInforById(basicInfor);
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));


    }
}
