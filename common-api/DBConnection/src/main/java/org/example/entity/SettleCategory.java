package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("settle_category")
public class SettleCategory {
    private int ID;
    private String SettleCode;
    private String SettleName;
    private int SequenceNo;
    private int DelMark;
}