package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    private int ID;
    private String UserName;
    private String Password;
    private String RealName;
    private int UseType;
    private int DocTitleID;
    private char[] IsScheduling;
    private int DeptID;
    private int RegistLeID;
    private int DelMark;
}