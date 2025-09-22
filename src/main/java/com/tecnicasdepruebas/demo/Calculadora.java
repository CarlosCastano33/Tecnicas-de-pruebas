package com.tecnicasdepruebas.demo;

import java.util.Scanner;

public class Calculadora {
    int r = 0;

    public Calculadora(){
        r = 0;
    }

    public float operar(){
        System.out.println("Ingrese operacion.");
        System.out.println(" + para suma \n - para resta \n * para multiplicacion \n / para division");
        //No se validan las entradas
        Scanner lector = new Scanner(System.in);
        String o = lector.nextLine();
        if (o.equals("+")){
            System.out.print("Ingrese operando 1: ");
            int a = lector.nextInt();
            System.out.print("Ingrese operando 2: ");
            int b = lector.nextInt();
            return (a+b);
        } else if (o.equals("-")){
            System.out.print("Ingrese operando 1: ");
            int a = lector.nextInt();
            System.out.print("Ingrese operando 2: ");
            int b = lector.nextInt();
            return (a-b);
        } else if (o.equals("*")){
            System.out.print("Ingrese operando 1: ");
            int a = lector.nextInt();
            System.out.print("Ingrese operando 2: ");
            int b = lector.nextInt();
            return (a*b);
        } else if (o.equals("/")){
            System.out.print("Ingrese operando 1: ");
            int a = lector.nextInt();
            System.out.print("Ingrese operando 2: ");
            int b = lector.nextInt();
            if (b != 0) {
                return ((float)a/b);
            } else {
                throw new IllegalArgumentException("División por cero");
            }
        }
        return r;
    }
}
