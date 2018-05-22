package com.zhangyi.hrms.util;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

import java.text.SimpleDateFormat;

public class DateJsonValueProcessor implements JsonValueProcessor {

    private String format;

    public DateJsonValueProcessor(String format) {
        this.format = format;
    }

    @Override
    public Object processArrayValue(Object o, JsonConfig jsonConfig) {
        return null;
    }

    @Override
    public Object processObjectValue(String key, Object value, JsonConfig jsonConfig) {
        if (value == null) {
            return "";
        }
        if (value instanceof java.sql.Timestamp) {
            String str = new SimpleDateFormat(format).format((java.sql.Timestamp) value);
            return str;
        }
        if (value instanceof java.sql.Date) {
            String str = new SimpleDateFormat(format).format(value);
            return str;
        }
        if (value instanceof java.util.Date) {
            String str = new SimpleDateFormat(format).format((java.util.Date) value);
            return str;
        }

        return value.toString();
    }


}
