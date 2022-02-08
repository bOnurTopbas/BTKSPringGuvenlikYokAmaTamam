package com.example.ilkuygulama.hibernateAndJpa.restApi;

import com.example.ilkuygulama.DAO.IOrnekDao;
import com.example.ilkuygulama.Entities.Ornek;
import com.example.ilkuygulama.Service.IOrnekService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrnekController  {
    private IOrnekService ornekService;

    @Autowired
    public OrnekController(IOrnekService ornekService) {
        this.ornekService = ornekService;
    }



    @GetMapping("/ornekler")
    public List<Ornek> get(){
        return ornekService.getAll();
    }

    @PostMapping("/update")
    public void update(@RequestBody Ornek ornek){
        ornekService.update(ornek);
    }
    @PostMapping("/add")
    public void add(@RequestBody Ornek ornek){
        ornekService.add(ornek);
    }
    @PostMapping("/delete")
    public void delete(@RequestBody Ornek ornek){
        ornekService.delete(ornek);
    }

    @GetMapping("/byid/{id}")
    public Ornek getById(@PathVariable int id){
        return ornekService.getById(id);
    }


}
