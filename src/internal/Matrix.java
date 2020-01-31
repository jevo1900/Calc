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

    private final Decimal[][] matrix;

    public Matrix(int row, int col) {
        this.matrix = new Decimal[row][col];
    }

    public void set(int row, int col, long value) {
        matrix[row - 1][col - 1] = new Decimal(value);
    }

    public void set(int row, int col, Decimal value) {
        matrix[row - 1][col - 1] = value;
    }

    public Decimal get(int row, int col) {
        return matrix[row - 1][col - 1];
    }
    
    public Matrix summation(Matrix matrix) {
        MatrixSummation(this.matrix, matrix.getMatrix());
        return this;
    }
    
    public Matrix substraction(Matrix matrix) {
        MatrixSubstraction(this.matrix, matrix.getMatrix());
        return this;
    }

    public Matrix multiply(Matrix matrix) {
        multiplyMatrixMatrix(this.matrix, matrix.getMatrix());
        return this;
    }

    public Matrix multiply(long value) {
        multiplyMatrixNumber(matrix, value);
        return this;
    }
    
    public Matrix divide(long value) {
        divideMatrixNumber(matrix, value);
        return this;
    }

    private Decimal[][] MatrixSummation(Decimal[][] a, Decimal[][] b) {
        //we supose matrix are both the same size
        Decimal sum = new Decimal(0);
        int i, j, rowA = a.length, colA = a[0].length;
        Matrix m = new Matrix(rowA, colA);

        for (i = 0; i < rowA; i++) {
            for (j = 0; j < colA; j++) {
                m.set(rowA, colA, a[i][j].add(b[i][j]));
            }
        }
        return m.getMatrix();
    }

    private Decimal[][] MatrixSubstraction(Decimal[][] a, Decimal[][] b) {
        //we supose matrix are both the same size
        Decimal sum = new Decimal(0);
        int i, j, rowA = a.length, colA = a[0].length;
        Matrix m = new Matrix(rowA, colA);

        for (i = 0; i < rowA; i++) {
            for (j = 0; j < colA; j++) {
                m.set(rowA, colA, a[i][j].subtract(b[i][j]));
            }
        }
        return m.getMatrix();
    }

    private Decimal[][] multiplyMatrixMatrix(Decimal[][] a, Decimal[][] b) {

        Decimal sum = new Decimal(0);
        Matrix m = new Matrix(a.length, b[0].length);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                sum.set(0);
                for (int k = 0; k < a[0].length; k++) {
                    sum.set(a[i][k].multiply(b[k][j]));//matrix value - matrix value
                }
                m.set(i + 1, j + 1, sum);
            }
        }
        return m.getMatrix();

    }

    private Decimal[][] multiplyMatrixNumber(Decimal[][] a, long b) {
        Decimal[][] matrizResultado = new Decimal[a.length][a[0].length];
        for (int i = 0; i != a.length; i++) {
            for (int j = 0; j != a[i].length; j++) {
                matrizResultado[i][j] = a[i][j].multiply(b); //matrix - number.
            }
        }
        return matrizResultado;
    }
    
    private Decimal[][] divideMatrixNumber(Decimal[][] a, long b) {
        Decimal[][] matrizResultado = new Decimal[a.length][a[0].length];
        for (int i = 0; i != a.length; i++) {
            for (int j = 0; j != a[i].length; j++) {
                matrizResultado[i][j] = a[i][j].divide(b); //matrix - number.
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
        for (Decimal[] numerals : matrix) {
            b.append("│");
            b.append(String.format("%-" + countSize + "s", numerals[0]));
            for (int i = 1; i < numerals.length; i++) {
                b.append(String.format("│%-" + countSize + "s", numerals[i]));
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
        int n = 0;
        for (Decimal[] numerals : matrix) {
            for (Decimal numeral : numerals) {
                int length = numeral.toString().length();
                if (n < length) {
                    n = length;
                }
            }
        }
        return n;
    }

    private Decimal[][] getMatrix() {
        return matrix;
    }

}
