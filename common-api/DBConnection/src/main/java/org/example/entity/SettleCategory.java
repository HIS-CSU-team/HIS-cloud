package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("settlecategory")
public class SettleCategory {
    @TableId("ID")
    int ID;
    @TableField("SettleCode")
    String SettleCode;
    @TableField("SettleName")
    String SettleName;
    @TableField("SequenceNo")
    int SequenceNo;
    @TableField("DelMark")
    int DelMark;
}
