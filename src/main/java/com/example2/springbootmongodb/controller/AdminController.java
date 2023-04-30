package com.example2.springbootmongodb.controller;
import com.example2.springbootmongodb.model.Admin;
import com.example2.springbootmongodb.model.Product;
import com.example2.springbootmongodb.resource.AdminRequest;
import org.springframework.web.bind.annotation.*;
import com.example2.springbootmongodb.repository.AdminRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import org.springframework.security.crypto.password.PasswordEncoder;


import java.util.List;

@RestController
public class AdminController {
//    @Autowired
//    private AdminRepository repository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
    private final AdminRepository AdminRepository;
    public AdminController(AdminRepository AdminRepository) {

        this.AdminRepository  = AdminRepository;
    }
    @PostMapping("/admin/create")
    public ResponseEntity<Admin> createAdmin(@RequestBody AdminRequest adminRequest) {

        Admin admin = new Admin();
        admin.setUsername(adminRequest.getUsername());
        admin.setPassword(adminRequest.getPassword());


        return ResponseEntity.status(201).body(this.AdminRepository.save(admin));
    }
//    @PostMapping("/admin/login")
//    public ResponseEntity<Admin> loginAdmin(@RequestBody AdminRequest adminRequest) {
//
//        Admin admin = new Admin();
////        admin.setUsername(adminRequest.getUsername());
////        admin.setPassword(adminRequest.getPassword());
//
//        Optional<Admin> adminlist = this.AdminRepository.findById(adminRequest.getUsername());
//       return ResponseEntity.status(201).body(this.AdminRepository.);
//       // return ResponseEntity.ok(adminlist);
//    }
//    @PostMapping("/create")
//    public void createUser(@RequestBody Admin admin){
//        String hashedPassword = passwordEncoder.encode(admin.getPassword());
//        admin.setPassword(hashedPassword);
//        repository.save(admin);
//    }
//    @GetMapping("/admin/{id}")
//    public ResponseEntity getProductById(@PathVariable String id) {
//
//        Optional<Product> product = this.productRepository.findById(id);
//
//        if(product.isPresent()) {
//            return ResponseEntity.ok(product.get());
//        } else {
//            return ResponseEntity.ok("The product with id: " + id + " was not found.");
//        }
//    }
    @GetMapping("/api/Admin")
    public ResponseEntity<List<Admin>> getAllAdmin() {

        return ResponseEntity.ok(this.AdminRepository.findAll());
    }
}
