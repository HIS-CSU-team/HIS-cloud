package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("herbaldetailed")
public class HerbalDetailed {
    private int ID;
    private int HerbalPresID;
    private int HerbalID;
    private String Dosage;
    private BigDecimal Price;
    private String Footnote;
}