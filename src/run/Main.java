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


        Matrix m = new Matrix(3, 2);
        m.set(1, 1, 1);
        m.set(1, 2, 3);
        m.set(2, 1, 4);
        m.set(2, 2, 8);
        m.set(3, 1, 8);
        m.set(3, 2, 8);

        Matrix m2 = new Matrix(2, 2);
        m2.set(1, 1, 3);
        m2.set(1, 2, 6);
        m2.set(2, 1, 10);
        m2.set(2, 2, 4);

        System.out.println(m);
        System.out.println(m2);
//        System.out.println(m.multiply(3));

        System.out.println(m.multiply(m2));
    }
}
