package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("herbaltemplate")
public class HerbalTemplate {
    private int ID;
    private String Name;
    private int DoctorID;
    private LocalDateTime CreationTime;
    private String PrescriptioType;
    private Integer PayNumber;
    private String DrugsUsage;
    private String Therapy;
    private String Detailed;
    private String Advice;
    private String Scope;
    private int DelMark;
}