package com.csu.dao;

import com.csu.entity.Admissions;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AdmissionsDao {
    SqlSession session=SessionUtil.getsession();
    //查找表中所有的数据
    public List<Admissions> selectAllAdmissions(){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectAllAdmissions();
    }
    //根据给定的subject_id查找表中的数据
    public List<Admissions> selectAdmissionsById(int subjectId){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectAdmissionsById(subjectId);
    }
    //根据给定的subject_id更改数据
    public void updateAdmissionsById(Admissions admissions){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.updateAdmissionsById(admissions);
        session.commit();
    }
    //向表中添加数据
    public void insertAdmissions(Admissions admissions){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.insertAdmissions(admissions);
        session.commit();
    }
}
