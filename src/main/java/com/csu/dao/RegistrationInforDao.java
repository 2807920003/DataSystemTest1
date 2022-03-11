package com.csu.dao;

import com.csu.entity.RegistrationInfor;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class RegistrationInforDao {
    SqlSession session=SessionUtil.getsession();
    //查找表中所有的数据
    public List<RegistrationInfor> selectAllRegistrationInfor(){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectAllRegistrationInfor();

    }
    //根据给定的MR_No查找表中的数据
    public List<RegistrationInfor> selectRegistrationInforById(String mrNo){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectRegistrationInforById(mrNo);
    }
    //根据给定的MR_No更改数据
    public void updateRegistrationInforById(RegistrationInfor registrationInfor){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.updateRegistrationInforById(registrationInfor);
        session.commit();
    }
    //向表中添加数据
    public void insertRegistrationInfor(RegistrationInfor registrationInfor){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.insertRegistrationInfor(registrationInfor);
        session.commit();
    }
}
