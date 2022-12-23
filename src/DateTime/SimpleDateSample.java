package DateTime;

import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateSample {

@Test
    public void testSimpleDateFormat() throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date date = new Date();
        System.out.println(date);
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        String str = "2022-10-11";
     //   Date date1 = simpleDateFormat.parse(str);
       // System.out.println(date1);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        String format1 = simpleDateFormat1.format(date);
        System.out.println(format1);
        Date date1 = simpleDateFormat1.parse(str);
        System.out.println(date1);
    }

    public  void testExer() throws ParseException {
        String birthday = "2020-11-19";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(birthday);
        java.sql.Date birthDate = new java.sql.Date(date.getTime());
        System.out.println(birthDate);


    }
}

