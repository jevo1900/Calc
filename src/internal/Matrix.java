/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internal;

/**
 *
 * @author Usuario
 */
public class Matrix {

    private final Numeral[][] matrix;

    public Matrix(int row, int col) {
        this.matrix = new Numeral[row][col];
    }
            

    public void set(int row, int col, long value) {
        matrix[row - 1][col - 1] = new Numeral(value);
    }

    public void set(int row, int col, Numeral value) {
        matrix[row - 1][col - 1] = value;
    }

    public Numeral get(int row, int col) {
        return matrix[row-1][col-1];
    }
    
    public Matrix multiply(Matrix matrix) {
        multiplyMatrixMatrix(this.matrix, matrix.getMatrix());
        return this;
    }
    
    public Matrix multiply(long value) {
        multiplyMatrixNumber(matrix, value);
        return this;
    }

    private int[][] sumarDosMatrices(int[][] a, int[][] b) {

        // En este metodo se supone que las 2 matrices tienen el mismo tamaño
        int matrizResultante[][];
        int i, j, filasA, columnasA;
        filasA = a.length;
        columnasA = a[0].length;

        matrizResultante = new int[filasA][columnasA];

        for (i = 0; i < filasA; i++) {
            for (j = 0; j < columnasA; j++) {
                matrizResultante[i][j] = a[i][j] + b[i][j];
            }
        }
        return matrizResultante;
    }

    private int[][] restarDosMatrices(int[][] a, int[][] b) {

        // En este metodo se supone que las 2 matrices tienen el mismo tamaño
        int matrizResultante[][];
        int i, j, filasA, columnasA;

        filasA = a.length;
        columnasA = a[0].length;

        matrizResultante = new int[filasA][columnasA];

        for (i = 0; i < filasA; i++) {
            for (j = 0; j < columnasA; j++) {
                matrizResultante[i][j] = a[i][j] - b[i][j];
            }
        }
        return matrizResultante;
    }

    private Numeral[][] multiplyMatrixMatrix(Numeral[][] a, Numeral[][] b) {

        Numeral sum = new Numeral(0);
        Matrix m=new Matrix(a.length, b[0].length);
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                sum.set(0);
                for (int k = 0; k < a[0].length; k++) {
                    sum.set(a[i][k].multiply(b[k][j]));
                }
                m.set(i+1, j+1, sum);
            }
        }
        return m.getMatrix();

    }
    
    private Numeral[][] multiplyMatrixNumber(Numeral[][] a, long b) {
        Numeral[][] matrizResultado = new Numeral[a.length][a[0].length];
        for (int i = 0; i != a.length; i++) {
            for (int j = 0; j != a[i].length; j++) {
                matrizResultado[i][j] = a[i][j].multiply(b); //simplemente se multiplica cada valor de la matriz por el valor escalar.
            }
        }
        return matrizResultado;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        int countSize = countSize();
        StringBuilder bars = new StringBuilder();
        for (int i = 0; i < countSize; i++) {
            bars.append("-");
        }
        b.append("┌");
        for (int i = 1; i < matrix[0].length; i++) {
            b.append(bars).append("┬");
        }
        b.append(bars).append("┐\n");
        for (Numeral[] numerals : matrix) {
            b.append("│");
            b.append(String.format("%-"+countSize+"s",numerals[0]));
            for (int i = 1; i < numerals.length; i++) {
                b.append(String.format("│%-"+countSize+"s",numerals[i]));
            }
            b.append("│\n");
        }
        b.append("└");
        for (int i = 1; i < matrix[0].length; i++) {
            b.append(bars).append("┴");
        }
        b.append(bars).append("┘");
        return b.toString();
    }
    private int countSize() {
        int n=0;
        for (Numeral[] numerals : matrix) {
            for (Numeral numeral : numerals) {
                int length = numeral.toString().length();
                if(n<length) n=length;
            }
        }
        return n;
    }
    
    

    private Numeral[][] getMatrix() {
        return matrix;
    }
    
    


}
