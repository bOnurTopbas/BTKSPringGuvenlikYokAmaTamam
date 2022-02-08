package com.example.ilkuygulama.Entities;


import org.springframework.stereotype.Repository;

import javax.persistence.*;


@Entity
@Table(name = "Ornek")
public class Ornek {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "isim")
    private String isim;

    @Column(name = "lastname")
    private String lastname;

    public Ornek() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Ornek(int id, String isim, String lastname) {
        this.id = id;
        this.isim = isim;
        this.lastname = lastname;
    }
}
