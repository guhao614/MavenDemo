package dao.impl;

import dao.BaseDao;
import dao.MavenDao;

import java.sql.ResultSet;

public class MavenDaoImpl extends BaseDao implements MavenDao {

    @Override
    public int select(String name,int pwd ) {
        String sql="select count(*)from user where name=? and pwd=?";
        Object[] param={name,pwd};
        ResultSet rs=super.excuteQuery(sql,param);
        int count=0;
        try{
            while (rs.next()){
                count=rs.getInt(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }
}
