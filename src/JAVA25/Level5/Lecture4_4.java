package JAVA25.Level5;


import java.util.Date;

public class Lecture4_4 {
    static void main(String[] args) {
        Date currentDate = new Date();
        java.sql.Date sqlDate = new java.sql.Date(currentDate.getTime());
        System.out.println(currentDate);
        System.out.println(sqlDate);
    }
}
