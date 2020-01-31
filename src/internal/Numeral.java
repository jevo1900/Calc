/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internal;

import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author usuario
 */
public class Numeral {

    private BigInteger number = null;

    public Numeral(byte[] val) {
        number = new BigInteger(val);
    }

    public Numeral(int signum, byte[] magnitude) {
        number = new BigInteger(signum, magnitude);
    }

    public Numeral(String val, int radix) {
        number = new BigInteger(val, radix);
    }

    public Numeral(String val) {
        number = new BigInteger(val);
    }

    public Numeral(int val) {
        number = new BigInteger(String.valueOf(val));
    }

    Numeral(BigInteger val) {
        number = val;
    }

    public Numeral(long val) {
        number = new BigInteger(String.valueOf(val));
    }

    public Numeral(int numBits, Random rnd) {
        number = new BigInteger(numBits, rnd);
    }

    public Numeral(int bitLength, int certainty, Random rnd) {
        number = new BigInteger(bitLength, certainty, rnd);
    }

    public static Numeral probablePrime(int bitLength, Random rnd) {
        return new Numeral(String.valueOf(BigInteger.probablePrime(bitLength, rnd)));
    }

    public Numeral nextProbablePrime() {
        return new Numeral(String.valueOf(number.nextProbablePrime()));
    }

    public static Numeral valueOf(long val) {
        return new Numeral(String.valueOf(val));
    }

    public Numeral set(Numeral val) {
        number = val.getNumber();
        return this;
    }

    public Numeral set(long val) {
        number = new BigInteger(String.valueOf(val));
        return this;
    }

    public Numeral add(Numeral val) {
        number = number.add(val.getNumber());
        return this;
    }

    public Numeral add(long val) {
        number = number.add(BigInteger.valueOf(val));
        return this;

    }

    public Numeral subtract(Numeral val) {
        number = number.subtract(val.getNumber());
        return this;

    }

    public Numeral subtract(long val) {
        number = number.subtract(BigInteger.valueOf(val));
        return this;

    }

    public Numeral multiply(Numeral val) {
        number = number.multiply(val.getNumber());
        return this;

    }

    public Numeral multiply(long val) {
        number = number.multiply(BigInteger.valueOf(val));
        return this;

    }

    public Numeral divide(Numeral val) {
        number = number.divide(val.getNumber());
        return this;

    }

    public Numeral divide(long val) {
        number = number.divide(BigInteger.valueOf(val));
        return this;
    }

    public Numeral[] divideAndRemainder(BigInteger val) {
        BigInteger[] divideAndRemainder = number.divideAndRemainder(val);
        Numeral[] n = new Numeral[divideAndRemainder.length];
        for (int i = 0; i < divideAndRemainder.length; i++) {
            n[i] = new Numeral(String.valueOf(divideAndRemainder[i]));
        }
        return n;
    }

    public Numeral remainder(Numeral val) {
        number = number.remainder(val.getNumber());
        return this;

    }

    public Numeral remainder(long val) {
        number = number.remainder(BigInteger.valueOf(val));
        return this;

    }

    public Numeral pow(int exponent) {
        number = number.pow(exponent);
        return this;

    }

    public Numeral gcd(Numeral val) {
        number = number.gcd(val.getNumber());
        return this;

    }

    public Numeral gcd(long val) {
        number = number.gcd(BigInteger.valueOf(val));
        return this;

    }

    public Numeral abs() {
        number = number.abs();
        return this;

    }

    public Numeral negate() {
        number = number.negate();
        return this;

    }

    public int signum() {
        return number.signum();
    }

    public Numeral mod(Numeral m) {
        number = number.mod(m.getNumber());
        return this;

    }

    public Numeral mod(long m) {
        number = number.mod(BigInteger.valueOf(m));
        return this;

    }

    public Numeral modPow(Numeral exponent, Numeral m) {
        number = number.modPow(exponent.getNumber(), m.getNumber());
        return this;

    }

    public Numeral modPow(long exponent, long m) {
        number = number.modPow(BigInteger.valueOf(exponent), BigInteger.valueOf(m));
        return this;

    }

    public Numeral modInverse(Numeral m) {
        number = number.modInverse(m.getNumber());
        return this;

    }

    public Numeral modInverse(long m) {
        number = number.modInverse(BigInteger.valueOf(m));
        return this;

    }

    public Numeral shiftLeft(int n) {
        number = number.shiftLeft(n);
        return this;

    }

    public Numeral shiftRight(int n) {
        number = number.shiftRight(n);
        return this;
    }

    public Numeral and(Numeral val) {
        number = number.and(val.getNumber());
        return this;
    }

    public Numeral and(long val) {
        number = number.and(BigInteger.valueOf(val));
        return this;
    }

    public Numeral or(Numeral val) {
        number = number.or(val.getNumber());
        return this;
    }

    public Numeral or(long val) {
        number = number.or(BigInteger.valueOf(val));
        return this;
    }

    public Numeral xor(Numeral val) {
        number = number.xor(val.getNumber());
        return this;
    }

    public Numeral xor(long val) {
        number = number.xor(BigInteger.valueOf(val));
        return this;
    }

    public Numeral not() {
        number = number.not();
        return this;
    }

    public Numeral andNot(Numeral val) {
        number = number.andNot(val.getNumber());
        return this;
    }

    public Numeral andNot(long val) {
        number = number.andNot(BigInteger.valueOf(val));
        return this;
    }

    public boolean testBit(int n) {
        return number.testBit(n);
    }

    public Numeral setBit(int n) {
        number = number.setBit(n);
        return this;
    }

    public Numeral clearBit(int n) {
        number = number.clearBit(n);
        return this;
    }

    public Numeral flipBit(int n) {
        number = number.flipBit(n);
        return this;
    }

    public int getLowestSetBit() {
        return number.getLowestSetBit();
    }

    public int bitLength() {
        return number.bitLength();
    }

    public int bitCount() {
        return number.bitCount();
    }

    public boolean isProbablePrime(int certainty) {
        return number.isProbablePrime(certainty);
    }

    public int compareTo(Numeral val) {
        return number.compareTo(val.getNumber());
    }

    public int compareTo(long val) {
        return number.compareTo(BigInteger.valueOf(val));
    }

    @Override
    public boolean equals(Object x) {
        return number.equals(x);
    }

    public Numeral min(Numeral val) {
        number = number.min(val.getNumber());
        return this;
    }

    public Numeral min(long val) {
        number = number.min(BigInteger.valueOf(val));
        return this;
    }

    public Numeral max(Numeral val) {
        number = number.max(val.getNumber());
        return this;
    }

    public Numeral max(long val) {
        number = number.max(BigInteger.valueOf(val));
        return this;
    }

    @Override
    public int hashCode() {
        return number.hashCode();
    }

    public byte[] toByteArray() {
        return number.toByteArray();
    }

    public int intValue() {
        return number.intValue();
    }

    public long longValue() {
        return number.longValue();
    }

    public float floatValue() {
        return number.floatValue();
    }

    public double doubleValue() {
        return number.doubleValue();
    }

    @Override
    public String toString() {
        return number.toString();
    }

    public String toString(int radix) {
        return number.toString(radix);
    }

    protected BigInteger getNumber() {
        return number;
    }

}
