package com.csu.dao;

import com.csu.entity.HospitalInform;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class HospitalInformDao {
    SqlSession session=SessionUtil.getsession();
    //查找表中所有的数据
    public List<HospitalInform> selectAllHospitalInform(){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectAllHospitalInform();
    }
    //根据给定的MR_No查找表中的数据
    public List<HospitalInform> selectHospitalInformById(String mrNo){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectHospitalInformById(mrNo);
    }
    //根据给定的MR_No更改数据
    public void updateHospitalInformById(HospitalInform hospitalInform){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.updateHospitalInformById(hospitalInform);
        session.commit();
    }
    //向表中添加数据
    public void insertHospitalInform(HospitalInform hospitalInform){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.insertHospitalInform(hospitalInform);
        session.commit();
    }
}
