package com.csu.dao;

import com.csu.entity.CheckPressure;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CheckPressureDao {
    SqlSession session=SessionUtil.getsession();
    //查找表中所有的数据
    public List<CheckPressure> selectAllCheckPressure(){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectAllCheckPressure();

    }
    //根据给定的MR_No查找表中的数据
    public List<CheckPressure> selectCheckPressureById(String mrNo){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectCheckPressureById(mrNo);
    }
    //根据给定的MR_NO更改数据
    public void updateCheckPressureById(CheckPressure checkPressure){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.updateCheckPressureById(checkPressure);
        session.commit();
    }
    //向表中添加数据
    public void insertCheckPressure(CheckPressure checkPressure){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.insertCheckPressure(checkPressure);
        session.commit();
    }
}
