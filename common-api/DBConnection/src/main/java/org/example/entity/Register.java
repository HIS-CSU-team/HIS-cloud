package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("register")
public class Register {
    private int ID;
    private String CaseNumber;
    private String RealName;
    private int Gender;
    private String IDnumber;
    private Date BirthDate;
    private Integer Age;
    private Character AgeType;
    private String HomeAddress;
    private Date VisitDate;
    private String Noon;
    private int DeptID;
    private int UserID;
    private int RegistLeID;
    private int SettleID;
    private Character IsBook;
    private Date RegistTime;
    private int RegisterID;
    private Integer VisitState;
}