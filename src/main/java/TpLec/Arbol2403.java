package TpLec;

import java.util.Scanner;

public class Arbol2403 {
    public static void main(String[] args) {
        float hipotenusa;
        float cateto;
        float arbol;
        
        System.out.println("ingrese hipotenusa del arbol");
        Scanner sc=new Scanner(System.in);
        hipotenusa = sc.nextFloat();
        
        System.out.println("ingrese cateto del arbol");
        cateto = sc.nextFloat();
        
        arbol = (hipotenusa * hipotenusa)+(cateto * cateto);
        
        System.out.println(arbol);
    }
}
