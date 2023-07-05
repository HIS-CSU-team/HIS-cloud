package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("medicalrecord")
public class MedicalRecord {
    private int ID;
    private String CaseNumber;
    private int RegistID;
    private String Readme;
    private String Present;
    private String PresentTreat;
    private String History;
    private String Allergy;
    private String Physique;
    private String Proposal;
    private String Careful;
    private String CheckResult;
    private String Diagnosis;
    private String Handling;
    private Integer CaseState;
}






