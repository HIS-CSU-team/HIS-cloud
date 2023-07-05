package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("herbaltempdetailed")
public class HerbalTempDetailed {
    private int ID;
    private int HerbalTempID;
    private int HerbalID;
    private String Dosage;
    private String Unit;
    private String Footnote;
}