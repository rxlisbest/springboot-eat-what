package net.ruixinglong.eatwhat.entity;

import lombok.Data;

@Data
public class User {

    private int id;
    private String name;
    private String username;
    private String password;
    private int create_time;
    private int update_time;
}
