package op;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition(); // instancia creación objeto
        addition.number1 = 3;
        addition.number2 = 4;
        System.out.println("the sum of the numbers is: " + addition.add());
        //resta
        Substraction substraction = new Substraction();
        substraction.number1=123123;
        substraction.number2=231123;
        System.out.println("the result of the subtraction is: "+ substraction.sub());
        //multiplicacion
        Multiplication multiplication = new Multiplication();
        multiplication.number1=2;
        multiplication.number2=182;
        System.out.println("the result of the multiplication is: "+ multiplication.mult());
        //division
        Division division = new Division();
        division.number1=9;
        division.number2=3;
        System.out.println(division.divide());
        //recoleccion de data
        Person_data person = new Person_data();
        person.name= "popo";
        person.favorite_number=9293;
        person.age=69;
        System.out.println(person.prank());
    }

    }