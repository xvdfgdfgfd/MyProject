package app4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        Date now = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        String str = sdf1.format(now);
        String string = str+" 18:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date s = sdf.parse(string);
        Date now1= new Date();
        long l1=s.getTime();
        long l2 = now1.getTime();
        System.out.println(l2-l1);
        float num = ((l2-l1)/1000/-60);
        System.out.println(num);






    }
}
