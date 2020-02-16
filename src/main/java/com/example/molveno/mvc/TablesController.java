//package com.example.molveno.mvc;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/table")
//public class TablesController {
//
//    @Autowired
//    private TablesRepository tablesRepository;
//
//    @GetMapping
//    public List<Table> getTables(){
//        return tablesRepository.findAll();
//    }
//
//    @PostMapping
//    public void addTable(@RequestBody Table table){
//        tablesRepository.save(table);
//    }
//
//    @DeleteMapping("{id}")
//    public void deleteTable(@PathVariable Long id){
//        tablesRepository.deleteById(id);
//    }
//
//}
