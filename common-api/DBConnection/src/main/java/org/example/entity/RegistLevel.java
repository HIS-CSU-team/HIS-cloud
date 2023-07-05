package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("regist_level")
public class RegistLevel {
    private int ID;
    private String RegistCode;
    private String RegistName;
    private int SequenceNo;
    private Double RegistFee;
    private int RegistQuota;
    private int DelMark;
}