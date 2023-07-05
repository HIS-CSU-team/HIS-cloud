package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("expenseclass")
public class ExpenseClass {
    private int ID;
    private String ExpCode;
    private String ExpName;
    private int DelMark;
}