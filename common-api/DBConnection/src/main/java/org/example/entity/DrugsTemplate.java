package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("drugstemplate")
public class DrugsTemplate {
    private int ID;
    private String Name;
    private int UserID;
    private Date CreationTime;
    private String Scope;
    private int DelMark;
}