package com.csu.dao;

import com.csu.entity.ImageScreeningInfor;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ImageScreeningInforDao {
    SqlSession session=SessionUtil.getsession();
    //查找表中所有的数据
    public List<ImageScreeningInfor> selectAllImageScreeningInfor(){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectAllImageScreeningInfor();
    }
    //根据给定的MR_No查找表中的数据
    public List<ImageScreeningInfor> selectImageScreeningInforById(String mrNo){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectImageScreeningInforById(mrNo);
    }
    //根据给定的MR_No更改数据
    public void updateImageScreeningInforById(ImageScreeningInfor imageScreeningInfor){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.updateImageScreeningInforById(imageScreeningInfor);
        session.commit();
    }
    //向表中添加数据
    public void insertImageScreeningInfor(ImageScreeningInfor imageScreeningInfor){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.insertImageScreeningInfor(imageScreeningInfor);
        session.commit();
    }
}
