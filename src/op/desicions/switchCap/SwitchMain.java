package op.desicions.switchCap;

import java.util.Scanner;

public class SwitchMain {
    public static void main(String[] args) {
        Switch1 switch1 = new Switch1();
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese una opcion: ");
        switch1.option=lector.nextInt();
        System.out.println(switch1.showOption());
    }
}
