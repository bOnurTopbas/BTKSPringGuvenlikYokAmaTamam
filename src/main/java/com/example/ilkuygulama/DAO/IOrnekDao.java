package com.example.ilkuygulama.DAO;

import com.example.ilkuygulama.Entities.Ornek;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IOrnekDao {
    List<Ornek> getAll();

    void add(Ornek ornek);

    Ornek geyById(int id);

    void update(Ornek ornek);

    void delete(Ornek ornek);

}
