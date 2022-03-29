package com.csu.dao;

import com.csu.entity.Patients;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class PatientsDao {
    SqlSession session=SessionUtil.getsession();
    //查找表中所有的数据
    public List<Patients> selectAllPatients(){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectAllPatients();
    }
    //根据给定的subject_id查找表中的数据
    public List<Patients> selectPatientsById(int subjectId){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectPatientsById(subjectId);
    }
    //根据给定的subject_id更改数据
    public void updatePatientsById(Patients patients){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.updatePatientsById(patients);
        session.commit();
    }
    //向表中添加数据
    public void insertPatients(Patients patients){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.insertPatients(patients);
        session.commit();
    }
}
