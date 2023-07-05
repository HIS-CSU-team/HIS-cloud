package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("scheduling")
public class Scheduling {
    private int ID;
    private Date SchedDate;
    private int DeptID;
    private int UserID;
    private char[] Noon;
    private int RuleID;
    private int DelMark;
}