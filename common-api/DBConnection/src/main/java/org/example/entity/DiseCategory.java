package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("diseCategory")
public class DiseCategory {
    private int ID;
    private String DicaCode;
    private String DicaName;
    private Integer SequenceNo;
    private int DicaType;
    private int DelMark;
}