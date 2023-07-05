package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("fmeditem")
public class Fmeditem {
    private int ID;
    private String ItemCode;
    private String ItemName;
    private String Format;
    private BigDecimal Price;
    private Integer ExpClassID;
    private Integer DeptID;
    private String MnemonicCode;
    private Date CreationDate;
    private Date LastUpdateDate;
    private Integer RecordType;
    private int DelMark;
}