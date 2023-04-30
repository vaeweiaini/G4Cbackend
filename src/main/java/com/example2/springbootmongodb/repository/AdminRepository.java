package com.example2.springbootmongodb.repository;

import com.example2.springbootmongodb.model.Admin;
import com.example2.springbootmongodb.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin, String> {

//    Admin findByUsernameAndUidNot(String username, Long uid);
//
//    Admin findByMobileAndUidNot(String mobile, Long uid);
}
