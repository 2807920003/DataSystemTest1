package com.csu.dao;

import com.csu.entity.Procedureevents;
import com.csu.entity.Transfers;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TransfersDao {
    SqlSession session=SessionUtil.getsession();
    //查找表中所有的数据
    public List<Transfers> selectAllTransfers(){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectAllTransfers();
    }
    //根据给定的subject_id查找表中的数据
    public List<Transfers> selectTransfersById(int subjectId){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectTransfersById(subjectId);
    }
    //根据给定的subject_id更改数据
    public void updateTransfersById(Transfers transfers){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.updateTransfersById(transfers);
        session.commit();
    }
    //向表中添加数据
    public void insertTransfers(Transfers transfers){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.insertTransfers(transfers);
        session.commit();
    }
}
