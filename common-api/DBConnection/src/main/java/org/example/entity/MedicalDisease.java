package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("medicaldisease")
public class MedicalDisease {
    private int ID;
    private int MedicalID;
    private int RegistID;
    private int DiseaseID;
    private Integer DiagnoseType;
    private LocalDateTime GetSiskDate;
    private Integer DiagnoseCate;
}