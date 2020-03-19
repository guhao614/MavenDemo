package service.impl;

import dao.MavenDao;
import dao.impl.MavenDaoImpl;
import entity.Maven;
import service.MavenService;

import java.util.ArrayList;
import java.util.List;

public class MavenServiceImpl implements MavenService {

    @Override
    public int select( String name,int pwd) {
        MavenDao md=new MavenDaoImpl();
        int count=md.select(name,pwd);
        return count;
    }
}
