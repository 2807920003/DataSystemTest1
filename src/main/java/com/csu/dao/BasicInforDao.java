package com.csu.dao;

import com.csu.entity.BasicInfor;
import com.csu.entity.CheckBlood;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BasicInforDao {
    SqlSession session=SessionUtil.getsession();
    //查找表中所有的数据
    public List<BasicInfor> selectAllBasicInfor(){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectAllBasicInfor();
    }
    //根据给定的MR_No查找表中的数据
    public List<BasicInfor> selectBasicInforById(String mrNo){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectBasicInforById(mrNo);
    }
    //根据给定的MR_NO更改数据
    public void updateBasicInforById(BasicInfor basicInfor){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.updateBasicInforById(basicInfor);
        session.commit();
    }
    //向表中添加数据
    public void insertBasicInfor(BasicInfor basicInfor){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.insertBasicInfor(basicInfor);
        session.commit();
    }

}
