package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private String middleName;
    private Date date;
    public Person(String surname,long date){
        this.surname=surname;
        this.name="";
        this.middleName="";
        this.date=new Date(date);
    }
    public Person(String surname,String name,String middleName, long date){
        this.surname=surname;
        this.name=name;
        this.middleName=middleName;
        this.date=new Date(date);
    }
    public void printFullName() {
        if (name == "" || middleName == "") {
            System.out.println(surname);
        } else {
            System.out.println(surname + " " + name.charAt(0) + "." + middleName.charAt(0) + ".");
        }
    }
    public String toString(char format){
        String result="";
        SimpleDateFormat format1;
        SimpleDateFormat format2;
        SimpleDateFormat format3;
        format1=new SimpleDateFormat("dd/MM/yyyy");
        format2=new SimpleDateFormat("dd.MM.yyyy hh:mm");
        format3=new SimpleDateFormat("Da dd Mo MM ye yyyy Ti hh:mm");
        if (format=='s'){
            result=format1.format(date);
        }else if (format=='n'){
            result=format2.format(date);
        }else{
            result=format3.format(date);
        }
        return result;
        }
    }

