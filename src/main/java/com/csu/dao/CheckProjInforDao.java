package com.csu.dao;

import com.csu.entity.CheckProjInfor;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CheckProjInforDao {
    SqlSession session=SessionUtil.getsession();
    //查找表中所有的数据
    public List<CheckProjInfor> selectAllCheckProjInfor(){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return  mapper.selectAllCheckProjInfor();

    }
    //根据给定的MR_No查找表中的数据
    public List<CheckProjInfor> selectCheckProjInforById(String mrNo){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return  mapper.selectCheckProjInforById(mrNo);
    }
    //根据给定的MR_No更改数据
    public void updateCheckProjInforById(CheckProjInfor checkProjInfor){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.updateCheckProjInforById(checkProjInfor);
        session.commit();
    }
    //向表中添加数据
    public void insertCheckProjInfor(CheckProjInfor checkProjInfor){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.insertCheckProjInfor(checkProjInfor);
        session.commit();
    }

}
