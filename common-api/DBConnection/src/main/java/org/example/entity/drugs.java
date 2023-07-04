package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;

@Data
@TableName("item")
public class drugs {
    int ID;
    String DrugsCode;
    String DrugsName;
    String DrugsFormat;
    String DrugsUnit;
    String Manufacturer;
    int DrugsDosageID;
    int DrugsTypeID;
    BigDecimal DrugsPrice;
    String MnemonicCode;
    Date CreationDate;
    Date LastUpdateDate;
    int DelMark;

}
