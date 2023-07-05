package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

@Data
@TableName("registwork")
public class RegistWork {
    private int ID;
    private int RegisterID;
    private DateTimeLiteralExpression.DateTime StartTime;
    private DateTimeLiteralExpression.DateTime EndTime;
}