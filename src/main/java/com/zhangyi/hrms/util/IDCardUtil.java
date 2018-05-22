package com.zhangyi.hrms.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IDCardUtil {

    private static final int[] checkCode = new int[]{7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
    private static final char[] lastCode = new char[]{'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};


    private Date birthday;
    private String genderId;

    public static boolean validate(String idcardNum) {
        int sum = 0;
        System.out.println(idcardNum.substring(0, 17));
        if (idcardNum.length() != 18) {
            throw new IDCardException("身份证位数不正确！");
        } else {
            if ((idcardNum.charAt(17) == 'X' && idcardNum.substring(0, 17).matches("[0-9]{17}")) || idcardNum.matches("[0-9]{18}")) {
                String id = idcardNum.substring(0, 17);
                for (int i = 0; i < id.length(); i++) {
                    sum += (id.charAt(i) - '0') * checkCode[i];
                }
                int last = sum % 11;
                if (lastCode[last] != idcardNum.charAt(17)) {
                    throw new IDCardException("身份证输入错误");
                }
            } else {
                throw new IDCardException("身份证包含非法字符");
            }
        }
        return true;

    }

    public static Date getBirthday(String idcardNum) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
        Date date = sf.parse(idcardNum.substring(6, 14));
        return date;
    }

    public static int getGender(String idcardNum) {
        int gender = idcardNum.charAt(16) - '0';
        if (gender % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }
}


