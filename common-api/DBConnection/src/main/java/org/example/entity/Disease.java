package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("disease")
public class Disease {
    private int ID;
    private String DiseaseCode;
    private String DiseaseName;
    private String DiseaseICD;
    private int DiseCategoryID;
    private int DelMark;
}