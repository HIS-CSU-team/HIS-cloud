package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("constantitem")
public class ConstantItem {
    private int ID;
    private int ConstantTypeID;
    private String ConstantCode;
    private String ConstantName;
    private int DelMark;
}
