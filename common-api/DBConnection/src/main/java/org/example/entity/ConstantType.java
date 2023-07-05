package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("constanttype")
public class ConstantType {
    @TableId("ID")
    private int ID;
    @TableField("ConstantTypeCode")
    private String ConstantTypeCode;
    @TableField("ConstantTypeName")
    private String ConstantTypeName;
    @TableField("DelMark")
    private int DelMark;//删除标记 1-正常 0-已删除
}
