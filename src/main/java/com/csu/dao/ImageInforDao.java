package com.csu.dao;

import com.csu.entity.ImageInfor;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ImageInforDao {
    SqlSession session=SessionUtil.getsession();
    //查找表中所有的数据
    public List<ImageInfor> selectAllImageInfor(){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectAllImageInfor();

    }
    //根据给定的MR_No查找表中的数据
    public List<ImageInfor> selectImageInforById(String mrNo){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectImageInforById(mrNo);
    }
    //根据给定的MR_No更改数据
    public void updateImageInforById(ImageInfor imageInfor){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.updateImageInforById(imageInfor);
        session.commit();
    }
    //向表中添加数据
    public void insertImageInfor(ImageInfor imageInfor){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.insertImageInfor(imageInfor);
        session.commit();
    }
}
