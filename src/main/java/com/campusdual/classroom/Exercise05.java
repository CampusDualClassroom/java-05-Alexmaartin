package com.campusdual.classroom;

public class Exercise05 {
    public static void main(String[] args) {
        checkLessOrGreaterEqual(30,10);
        checkMultiply(1,1);
        checkPositiveNegative(-1);
    }

    //TODO
    // Si el valor es menor, tiene que devolver el siguiente mensaje: X es menor que Y
    // Si el valor es mayor o igual, tiene que devolver el siguiente mensaje: X es mayor o igual que Y
    public static void checkLessOrGreaterEqual(int n1, int n2) {
        if (n1 >= n2){
            System.out.println(n1 + " es mayor o igual que " + n2);
        } else{
            System.out.println(n1 + " es menor que " + n2);
        }
    }

    //TODO ↓
    // Si es múltiplo, tiene que devolver el siguiente mensaje: X es múltiplo de Y
    // Si no es múltiplo, tiene que devolver el siguiente mensaje: X no es múltiplo de Y
    public static void checkMultiply(int n1, int n2) {
        if (n1 != 0 && n1 % n2 == 0){
            System.out.println(n1 + " es múltiplo de " + n2);
        }else{
            System.out.println(n2 + " no es múltiplo de " + n2);
        }
    }

    //TODO ↓
    // Si es negativo, tiene que devolver el siguiente mensaje: X es negativo.
    // Si es positivo o cero, tiene que devolver el siguiente mensaje: X es positivo.
    public static void checkPositiveNegative(int num) {
        if (num >= 0){
            System.out.println(num + " es positivo.");
        }else{
            System.out.println(num + " es negativo.");
        }
    }
}
