package com.champion.atm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 2018/1/2.
 */

public class Tester{
    public static void main(String[] args){
        Date now = new Date();
        System.out.print(now);
        System.out.print(now.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.print(sdf.format(now));
        //反過來，有字串，得Date物件?
        String s = "1998-04-01";
        try{
            Date birthday = sdf.parse(s);
            System.out.print(birthday);
        }catch(ParseException e){
            e.printStackTrace();
        }
    }
}

