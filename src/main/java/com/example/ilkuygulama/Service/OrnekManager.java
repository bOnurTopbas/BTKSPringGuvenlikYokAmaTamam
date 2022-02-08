package com.example.ilkuygulama.Service;

import com.example.ilkuygulama.DAO.IOrnekDao;
import com.example.ilkuygulama.Entities.Ornek;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrnekManager implements IOrnekService{
    private IOrnekDao ornekDao;

    @Autowired
    public OrnekManager(IOrnekDao ornekDao) {
        this.ornekDao = ornekDao;
    }

    @Override
    @Transactional
    public List<Ornek> getAll() {
        return this.ornekDao.getAll();
    }

    @Override
    @Transactional
    public void add(Ornek ornek) {
        this.ornekDao.add(ornek);

    }

    @Override
    @Transactional
    public void update(Ornek ornek) {
        this.ornekDao.update(ornek);

    }

    @Override
    @Transactional
    public void delete(Ornek ornek) {
        this.ornekDao.delete(ornek);

    }

    @Override
    @Transactional
    public Ornek getById(int id) {
        return this.ornekDao.geyById(id);

    }
}
