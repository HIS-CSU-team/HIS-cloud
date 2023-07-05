package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@TableName("patientcosts")
public class PatientCosts {
    private int ID;
    private int RegistID;
    private int InvoiceID;
    private int ItemID;
    private int ItemType;
    private String Name;
    private BigDecimal Price;
    private BigDecimal Amount;
    private int DeptID;
    private Date Createtime;
    private int CreateOperID;
    private Date PayTime;
    private int RegisterID;
    private int FeeType;
    private Integer BackID;
}