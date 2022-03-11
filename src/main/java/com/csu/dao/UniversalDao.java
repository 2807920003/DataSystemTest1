package com.csu.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

public class UniversalDao {
    SqlSession session=SessionUtil.getsession();
    //更改指定表的指定字段值
    public void updateTableColumn(@Param("table") String table, @Param("column") String column, @Param("value") String value,@Param("mrNo") String mrNO){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.updateTableColumn(table,column,value,mrNO);
        session.commit();

    }
    //删除指定表的指定数据行
    public void deleteTableRow(@Param("table") String table,@Param("column") String column,@Param("value") String value){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.deleteTableRow(table,column,value);
        session.commit();
    }
    //查找指定表的所有字段名
    public  String[] selectColumnNames(@Param("table") String table){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectColumnNames(table);

    }
    //查询数据库中的所有User表
    public String[] selectTableNames(){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        return mapper.selectTableNames();
    }
    //删除表格
    public void dropTable(@Param("table") String table){
        SqlMapper mapper=session.getMapper(SqlMapper.class);
        mapper.dropTable(table);
        session.commit();

    }

}
