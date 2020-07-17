package com.waterchen.basic.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateConverter implements Converter<String, Date> {
    private String pattern;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /*
         string----->date
         param :配置文件中的字符串
         return：实体类中的字段类型
         */
    @Override
    public Date convert(String source) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        Date date=null;
        try {
            date = format.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
