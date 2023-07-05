package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

@Data
@TableName("herbalprescription")
public class HerbalPrescription {
    private int ID;
    private int MedicalID;
    private int RegistID;
    private int UserID;
    private String PrescriptionName;
    private Date CreationTime;
    private String PrescriptioType;
    private Integer PayNumber;
    private String Frequency;
    private String DrugsUsage;
    private String Therapy;
    private String Detailed;
    private String Advice;
    private Integer State;
}