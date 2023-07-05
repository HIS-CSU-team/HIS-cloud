package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("prescription_detailed")
public class PrescriptionDetailed {
    private int ID;
    private int PrescriptionID;
    private int DrugsID;
    private String DrugsUsage;
    private String Dosage;
    private String Frequency;
    private BigDecimal Amount;
    private int State;
}