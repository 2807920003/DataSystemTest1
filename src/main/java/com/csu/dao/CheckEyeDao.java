package com.csu.dao;

import com.csu.entity.CheckEye;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CheckEyeDao {
    SqlSession session=SessionUtil.getsession();
    //查找表中所有的数据
    public List<CheckEye> selectAllCheckEye(){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectAllCheckEye();
    }
    //根据给定的MR_No查找表中的数据
    public List<CheckEye> selectCheckEyeById(String mrNo){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectCheckEyeById(mrNo);
    }
    //根据给定的MR_NO更改数据
    public void updateCheckEyeById(CheckEye checkEye){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.updateCheckEyeById(checkEye);
        session.commit();
    }
    //向表中添加数据
    public void insertCheckEye(CheckEye checkEye){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.insertCheckEye(checkEye);
        session.commit();
    }
}
