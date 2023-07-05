package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("department")
public class Department {
    private int ID;
    private String DeptCode;
    private String DeptName;
    private int DeptCategoryID;
    private Integer DeptType;
    private int DelMark;
}