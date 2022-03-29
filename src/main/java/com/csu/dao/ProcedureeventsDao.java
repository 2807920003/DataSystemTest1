package com.csu.dao;

import com.csu.entity.Procedureevents;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ProcedureeventsDao {
    SqlSession session=SessionUtil.getsession();
    //查找表中所有的数据
    public List<Procedureevents> selectAllProcedureevents(){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectAllProcedureevents();
    }
    //根据给定的subject_id查找表中的数据
    public List<Procedureevents> selectProcedureeventsById(int subjectId){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectProcedureeventsById(subjectId);
    }
    //根据给定的subject_id更改数据
    public void updateProcedureeventsById(Procedureevents procedureevents){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.updateProcedureeventsById(procedureevents);
        session.commit();
    }
    //向表中添加数据
    public void insertProcedureevents(Procedureevents procedureevents){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.insertProcedureevents(procedureevents);
        session.commit();
    }
}
