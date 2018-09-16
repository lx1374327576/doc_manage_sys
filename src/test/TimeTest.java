package test;

import java.util.Date;
import java.text.SimpleDateFormat;

public class TimeTest {
    public static void main(String[] args) { 
          SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
          String s=df.format(new Date());
          System.out.println(s);
    }
}