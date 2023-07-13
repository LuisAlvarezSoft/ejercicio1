package op.sum;

public class AddMain {
    public static void main(String[] args) {
        Addition addition = new Addition(); // instancia creación objeto
        addition.number1 = 3;
        addition.number2 = 4;
        System.out.println("the sum of the numbers is: " + addition.add());
    }
}
