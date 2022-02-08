package com.example.ilkuygulama.Service;

import com.example.ilkuygulama.Entities.Ornek;

import java.util.List;

public interface IOrnekService {
    List<Ornek> getAll();
    void add(Ornek ornek);
    void update(Ornek ornek);
    void delete(Ornek ornek);
    Ornek getById(int id);
}
