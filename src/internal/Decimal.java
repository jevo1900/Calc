/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 *
 * @author usuario
 */
public class Decimal {

    BigDecimal decimal = null;

    public Decimal(char[] in, int offset, int len) {
        decimal = new BigDecimal(in, offset, len);
    }

    public Decimal(BigDecimal val) {
        decimal = val;
    }

    public Decimal(char[] in, int offset, int len, MathContext mc) {
        decimal = new BigDecimal(in, offset, len, mc);
    }

    public Decimal(char[] in) {
        decimal = new BigDecimal(in);
    }

    public Decimal(char[] in, MathContext mc) {
        decimal = new BigDecimal(in, mc);
    }

    public Decimal(String val) {
        decimal = new BigDecimal(val);
    }

    public Decimal(String val, MathContext mc) {
        decimal = new BigDecimal(val, mc);
    }

    public Decimal(double val) {
        decimal = new BigDecimal(val);
    }

    public Decimal(double val, MathContext mc) {
        decimal = new BigDecimal(val, mc);
    }

    public Decimal(BigInteger val) {
        decimal = new BigDecimal(val);
    }

    public Decimal(BigInteger val, MathContext mc) {
        decimal = new BigDecimal(val, mc);
    }

    public Decimal(BigInteger unscaledVal, int scale) {
        decimal = new BigDecimal(unscaledVal, scale);
    }

    public Decimal(BigInteger unscaledVal, int scale, MathContext mc) {
        decimal = new BigDecimal(unscaledVal, scale, mc);
    }

    public Decimal(int val) {
        decimal = new BigDecimal(val);
    }

    public Decimal(int val, MathContext mc) {
        decimal = new BigDecimal(val, mc);
    }

    public Decimal(long val) {
        decimal = new BigDecimal(val);
    }

    public Decimal(long val, MathContext mc) {
        decimal = new BigDecimal(val, mc);
    }

    public Decimal set(Numeral val) {
        decimal = new BigDecimal(val.getNumber());
        return this;
    }

    public Decimal set(Decimal val) {
        decimal = val.getNumber();
        return this;
    }

    public Decimal set(long val) {
        decimal = new BigDecimal(String.valueOf(val));
        return this;
    }

    public Decimal set(double val) {
        decimal = new BigDecimal(String.valueOf(val));
        return this;
    }

    public Decimal abs() {
        this.decimal = decimal.abs();
        return this;
    }

    public Decimal abs(MathContext mc) {
        this.decimal = decimal.abs(mc);
        return this;
    }

    public Decimal add(Decimal augend) {
        this.decimal = decimal.add(augend.getNumber());
        return this;
    }

    public Decimal add(long augend) {
        this.decimal = decimal.add(BigDecimal.valueOf(augend));
        return this;
    }

    public Decimal add(double augend) {
        this.decimal = decimal.add(BigDecimal.valueOf(augend));
        return this;
    }

    public Decimal add(Decimal augend, MathContext mc) {
        this.decimal = decimal.add(augend.getNumber(), mc);
        return this;
    }

    public Decimal divide(Decimal divisor, int scale, int roundingMode) {
        this.decimal = decimal.divide(divisor.getNumber(), scale, roundingMode);
        return this;
    }

    public Decimal divide(Decimal divisor, int scale, RoundingMode roundingMode) {
        this.decimal = decimal.divide(divisor.getNumber(), scale, roundingMode);
        return this;
    }

    public Decimal divide(Decimal divisor, int roundingMode) {
        this.decimal = decimal.divide(divisor.getNumber(), roundingMode);
        return this;
    }

    public Decimal divide(Decimal divisor, RoundingMode roundingMode) {
        this.decimal = decimal.divide(divisor.getNumber(), roundingMode);
        return this;
    }

    public Decimal divide(Decimal divisor) {
        this.decimal = decimal.divide(divisor.getNumber());
        return this;
    }

    public Decimal divide(long divisor) {
        this.decimal = decimal.divide(BigDecimal.valueOf(divisor));
        return this;
    }

    public Decimal divide(double divisor) {
        this.decimal = decimal.divide(BigDecimal.valueOf(divisor));
        return this;
    }

    public Decimal divide(Decimal divisor, MathContext mc) {
        this.decimal = decimal.divide(divisor.getNumber(), mc);
        return this;
    }

    public Decimal divideToIntegralValue(Decimal divisor) {
        this.decimal = decimal.divideToIntegralValue(divisor.getNumber());
        return this;
    }

    public Decimal divideToIntegralValue(Decimal divisor, MathContext mc) {
        this.decimal = decimal.divideToIntegralValue(divisor.getNumber(), mc);
        return this;
    }

    public Decimal[] divideAndRemainder(Decimal divisor) {
        return translate(decimal.divideAndRemainder(divisor.getNumber()));
    }

    public Decimal[] divideAndRemainder(Decimal divisor, MathContext mc) {
        return translate(decimal.divideAndRemainder(divisor.getNumber(), mc));
    }

    public int compareTo(Decimal val) {
        return decimal.compareTo(val.getNumber());
    }

    public byte byteValueExact() {
        return decimal.byteValueExact();
    }

    public Decimal multiply(Decimal multiplicand) {
        this.decimal = decimal.multiply(multiplicand.getNumber());
        return this;
    }

    public Decimal multiply(long multiplicand) {
        this.decimal = decimal.multiply(BigDecimal.valueOf(multiplicand));
        return this;
    }

    public Decimal multiply(double multiplicand) {
        this.decimal = decimal.multiply(BigDecimal.valueOf(multiplicand));
        return this;
    }

    public Decimal multiply(Decimal multiplicand, MathContext mc) {
        this.decimal = decimal.multiply(multiplicand.getNumber(), mc);
        return this;
    }

    public Decimal pow(int n) {
        this.decimal = decimal.pow(n);
        return this;
    }

    public Decimal pow(int n, MathContext mc) {
        this.decimal = decimal.pow(n, mc);
        return this;
    }

    public Decimal negate() {
        this.decimal = decimal.negate();
        return this;
    }

    public Decimal negate(MathContext mc) {
        this.decimal = decimal.negate(mc);
        return this;
    }

    public Decimal plus() {
        this.decimal = decimal.plus();
        return this;
    }

    public Decimal plus(MathContext mc) {
        this.decimal = decimal.plus(mc);
        return this;
    }

    public int precision() {
        return decimal.precision();
    }

    public Decimal movePointLeft(int n) {
        this.decimal = decimal.movePointLeft(n);
        return this;
    }

    public Decimal movePointRight(int n) {
        this.decimal = decimal.movePointRight(n);
        return this;
    }

    @Override
    public boolean equals(Object x) {
        return decimal.equals(x);
    }

    public Decimal min(Decimal val) {
        this.decimal = decimal.min(val.getNumber());
        return this;
    }

    public Decimal max(Decimal val) {
        this.decimal = decimal.max(val.getNumber());
        return this;
    }

    @Override
    public int hashCode() {
        return decimal.hashCode();
    }

    public long longValue() {
        return decimal.longValue();
    }

    public long longValueExact() {
        return decimal.longValueExact();
    }

    public int intValue() {
        return decimal.intValue();
    }

    public int intValueExact() {
        return decimal.intValueExact();
    }

    public float floatValue() {
        return decimal.floatValue();
    }

    public double doubleValue() {
        return decimal.doubleValue();
    }

    public Decimal remainder(Decimal divisor) {
        this.decimal = decimal.remainder(divisor.getNumber());
        return this;
    }

    public int scale() {
        return decimal.scale();
    }

    public Decimal round(MathContext mc) {
        this.decimal = decimal.round(mc);
        return this;
    }

    public Decimal setScale(int newScale, RoundingMode roundingMode) {
        this.decimal = decimal.setScale(newScale, roundingMode);
        return this;
    }

    public Decimal setScale(int newScale, int roundingMode) {
        this.decimal = decimal.setScale(newScale, roundingMode);
        return this;
    }

    public Decimal setScale(int newScale) {
        this.decimal = decimal.setScale(newScale);
        return this;
    }

    public Decimal scaleByPowerOfTen(int n) {
        this.decimal = decimal.scaleByPowerOfTen(n);
        return this;
    }

    public Decimal subtract(Decimal subtrahend) {
        this.decimal = decimal.subtract(subtrahend.getNumber());
        return this;
    }

    public Decimal subtract(long subtrahend) {
        this.decimal = decimal.subtract(BigDecimal.valueOf(subtrahend));
        return this;
    }

    public Decimal subtract(double subtrahend) {
        this.decimal = decimal.subtract(BigDecimal.valueOf(subtrahend));
        return this;
    }

    public Decimal subtract(Decimal subtrahend, MathContext mc) {
        this.decimal = decimal.subtract(subtrahend.getNumber(), mc);
        return this;
    }

    public int signum() {
        return decimal.signum();
    }

    public Decimal stripTrailingZeros() {
        this.decimal = decimal.stripTrailingZeros();
        return this;
    }

    public short shortValueExact() {
        return decimal.shortValueExact();
    }

    public String toEngineeringString() {
        return decimal.toEngineeringString();
    }

    public Numeral toNumeral() {
        return new Numeral(decimal.toBigInteger());
    }

    public Numeral toNumeralExact() {
        return new Numeral(decimal.toBigIntegerExact());
    }

    public String toPlainString() {
        return decimal.toPlainString();
    }

    public Decimal ulp() {
        this.decimal = decimal.ulp();
        return this;
    }

    public static Decimal valueOf(long unscaledVal, int scale) {
        return Decimal.valueOf(unscaledVal, scale);
    }

    public static Decimal valueOf(long val) {
        return Decimal.valueOf(val);
    }

    public Numeral unscaledValue() {
        return new Numeral(decimal.unscaledValue());
    }

    public static Decimal valueOf(double val) {
        return Decimal.valueOf(val);
    }

    @Override
    public String toString() {
        return String.valueOf(decimal);
    }

    private BigDecimal getNumber() {
        return decimal;
    }

    private Decimal[] translate(BigDecimal[] ar) {
        Decimal[] dar = new Decimal[ar.length];
        for (int i = 0; i < ar.length; i++) {
            dar[i] = new Decimal(ar[i]);
        }
        return dar;
    }
}
