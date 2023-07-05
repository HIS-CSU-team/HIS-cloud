package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("checktemplate")
public class CheckTemplate {
    private int ID;
    private String Name;
    private int UserID;
    private Date CreationTime;
    private String Scope;
    private int RecordType;
    private int DelMark;
}