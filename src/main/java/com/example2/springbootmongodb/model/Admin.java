package com.example2.springbootmongodb.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document("Admin")
public class Admin {
    @Id
    private String id;
    private Long uid; // 用户ID
    private String username; // 用户名
    private String password; // 密码
    private Long createTime; // 创建时间
    private Long updateTime; // 最后修改时间


    public Admin() {
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(String password) {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
