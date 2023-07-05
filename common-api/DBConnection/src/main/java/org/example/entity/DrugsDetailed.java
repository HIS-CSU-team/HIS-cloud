package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("drugsdetailed")
public class DrugsDetailed {
    private int ID;
    private int DrugsTempID;
    private int DrugsID;
    private String DrugsUsage;
    private String Dosage;
    private String Frequency;
}