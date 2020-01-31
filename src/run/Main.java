/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import internal.Matrix;
import internal.Numeral;
import java.util.Random;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numeral n = Numeral.probablePrime(12, new Random());
        System.out.println(n);
        n.add(1);
        System.out.println(n);

        Matrix m = new Matrix(2, 2);
        m.set(1, 1, 1);
        m.set(1, 2, 3);
        m.set(2, 1, 4);
        m.set(2, 2, 8);
        Matrix m2 = new Matrix(2, 2);
        m2.set(1, 1, 3);
        m2.set(1, 2, 6);
        m2.set(2, 1, 10);
        m2.set(2, 2, 4);

        System.out.println("Matrix 1: \n" + m);
        System.out.println("Matrix 2: \n" + m2);
        System.out.println("Matrix Sumattion: \n" + m.summation(m2));
        System.out.println("Matrix Substraction: \n" + m.substraction(m2));
        System.out.println("Matrix - Matrix Multiplication: \n" + m.multiply(m2));
        System.out.println("Matrix - Number Multiplication: \n" + m.multiply(3));
        System.out.println("Matrix - Number Division: \n" + m.divide(3));

    }
}
