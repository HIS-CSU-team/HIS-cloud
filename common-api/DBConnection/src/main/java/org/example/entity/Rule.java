package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("rule")
public class Rule {
    private int ID;
    private String RuleName;
    private int DeptID;
    private int UserID;
    private String Week;
    private int DelMark;
}