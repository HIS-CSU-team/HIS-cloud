package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("checkrelation")
public class CheckRelation {
    private int ID;
    private int CheckProjID;
    private int CheckTempID;
    private String Position;
}