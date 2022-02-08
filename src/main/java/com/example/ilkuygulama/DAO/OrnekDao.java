package com.example.ilkuygulama.DAO;

import com.example.ilkuygulama.Entities.Ornek;
import org.aspectj.weaver.ast.Or;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;


@Repository
public class OrnekDao implements IOrnekDao {

    private EntityManager entityManager;

    @Autowired
    public OrnekDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    @Transactional
    public List<Ornek> getAll() {


        Session session = entityManager.unwrap(Session.class);
        List<Ornek> ornekler = session.createQuery("from Ornek ", Ornek.class).getResultList();
        return ornekler;
    }

    @Override
    @Transactional
    public void add(Ornek ornek) {
        if (ornek.getId()!=0){
            Session session = entityManager.unwrap(Session.class);
            session.saveOrUpdate(ornek);
        }

    }

    @Override
    @Transactional
    public Ornek geyById(int id) {
        Session session=entityManager.unwrap(Session.class);
        Ornek ornek1=session.get(Ornek.class,  id);
        return ornek1;

    }


    @Override
    @Transactional
    public void update(Ornek ornek) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(ornek);

    }

    @Override
    @Transactional
    public void delete(Ornek ornek) {
        Session session=entityManager.unwrap(Session.class);
        session.delete(ornek);

    }
}
