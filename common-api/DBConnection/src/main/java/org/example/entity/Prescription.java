package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("prescription")
public class Prescription {
    private int ID;
    private int MedicalID;
    private int RegistID;
    private int UserID;
    private String PrescriptionName;
    private Date PrescriptionTime;
    private int PrescriptionState;
}