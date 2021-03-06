package org.csystem.organizationapp.dal;

import org.csystem.dao.IDao;
import org.csystem.organizationapp.dao.ParticipiantDao;
import org.csystem.organizationapp.entity.ParticipiantInfo;
import org.cystem.dal.DalException;

import java.util.ArrayList;
import java.util.List;

public enum  ParticipiantAppDAL {

    //buradaki Instance Dal nesnesi aslında new yapılmış static olarak erişim ve final.(enum başlangıç methodu)
    INSTANCE;
    public boolean insertParticipiant(ParticipiantInfo pi)
    {
        try {
            return ParticipiantDao.INSTANCE.insert(pi);
        }
        catch (Throwable ex) {
            throw new DalException("insertParticipiantta bir hata var", ex);
        }
    }



    public boolean insert(ParticipiantInfo participiantInfo)
    {
        throw new UnsupportedOperationException();
    }


    public List<ParticipiantInfo> getAllUser()
    {
        try {
            return ParticipiantDao.INSTANCE.getAll();
        }
        catch (Throwable ex) {
            throw new DalException("getAllUser", ex);
        }
    }

    public List<ParticipiantInfo> getWillAttended()
    {
        try {
            return ParticipiantDao.INSTANCE.getParticipiantsByAttendance(true);
        }
        catch (Throwable ex) {
            throw new DalException("getWillAttended", ex);
        }
    }

    //dışarısı algoritmayı bilmesin dal katmanı bilsin false mu true mu diye.
    public List<ParticipiantInfo> getWillNotAttended()
    {
        try {
            return ParticipiantDao.INSTANCE.getParticipiantsByAttendance(false);
        }
        catch (Throwable ex) {
            throw new DalException("getWillNotAttended", ex);
        }
    }


    public boolean update(ParticipiantInfo participiantInfo)
    {
        throw new UnsupportedOperationException();
    }


    public boolean delete(ParticipiantInfo participiantInfo)
    {
        throw new UnsupportedOperationException();
    }
}
