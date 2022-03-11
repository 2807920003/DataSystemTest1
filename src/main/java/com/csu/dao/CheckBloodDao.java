package com.csu.dao;

import com.csu.entity.CheckBlood;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CheckBloodDao {
    SqlSession session=SessionUtil.getsession();
    //查找表中所有的数据
    public List<CheckBlood> selectAllCheckBlood(){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectAllCheckBlood();

    }
    //根据给定的MR_No查找表中的数据
    public List<CheckBlood> selectCheckBloodById(String mrNo){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectCheckBloodById(mrNo);
    }
    //根据给定的MR_NO更改数据
    public void updateCheckBloodById(CheckBlood checkBlood){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.updateCheckBloodById(checkBlood);
        session.commit();
    }
    //向表中添加数据
    public void insertCheckBlood(CheckBlood checkBlood){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.insertCheckBlood(checkBlood);
        session.commit();
    }

}
