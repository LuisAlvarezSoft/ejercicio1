package op;

public class Division {
    public int number1;
    public int number2;
    public int division(){return number1/number2;}
    public String divide(){
    if (number2!=0){
    return ("Your division result is: "+ division());
    }else {
        return "The division by zero is impossible to admit";
    }
    }
}
