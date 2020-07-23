package com.springboot.onespringboot.bean;

import java.time.LocalDateTime;

public class User {
    private Long id;
    private String username;
    private String password;
    private String email;
    private LocalDateTime creatatime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatatime() {
        return creatatime;
    }

    public void setCreatatime(LocalDateTime creatatime) {
        this.creatatime = creatatime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", creatatime=" + creatatime +
                '}';
    }
}