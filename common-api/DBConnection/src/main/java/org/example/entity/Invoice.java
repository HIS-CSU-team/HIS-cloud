package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@TableName("invoice")
public class Invoice {
    private int ID;
    private String InvoiceNum;
    private BigDecimal Money;
    private int State;
    private LocalDateTime CreationTime;
    private int UserID;
    private Integer RegistID;
    private Integer FeeType;
    private String Back;
    private int DailyState;
}