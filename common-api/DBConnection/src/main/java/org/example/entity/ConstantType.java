package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("constanttype")
public class ConstantType {
    private int ID;
    private String ConstantTypeCode;
    private String ConstantTypeName;
    private int DelMark;
}
