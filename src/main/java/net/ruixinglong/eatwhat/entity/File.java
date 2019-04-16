package net.ruixinglong.eatwhat.entity;

import lombok.Data;

@Data
public class File {

    private int id;
    private int user_id;
    private String domain;
    private String key;
    private String content_type;
    private int number;
    private String transcoding_code;
    private String source_key;
    private String source_content_type;
    private int create_time;
    private int update_time;
}
