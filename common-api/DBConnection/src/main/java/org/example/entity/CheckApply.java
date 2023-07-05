package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("checkapply")
public class CheckApply {
    private int ID;
    private int MedicalID;
    private int RegistID;
    private int ItemID;
    private String Name;
    private String Objective;
    private String Position;
    private int IsUrgent;
    private Integer Num;
    private Date CreationTime;
    private Integer DoctorID;
    private int CheckOperID;
    private int ResultOperID;
    private Date CheckTime;
    private String Result;
    private Date ResultTime;
    private Integer State;
    private int RecordType;
}