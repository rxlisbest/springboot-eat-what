package net.ruixinglong.eatwhat.entity;

import lombok.Data;

@Data
public class Food {

    private int id;
    private int user_id;
    private String name;
    private int image_file_id;
    private String content;
    private int create_time;
    private int update_time;
}
