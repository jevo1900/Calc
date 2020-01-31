/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package internal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/**
 *
 * @author usuario
 */
public class Decimal{
    
    BigDecimal decimal=null;

    public Decimal(char[] in, int offset, int len) {
        decimal=new BigDecimal(in, offset, len);
    }

    public Decimal(char[] in, int offset, int len, MathContext mc) {
        decimal=new BigDecimal(in, offset, len, mc);
    }

    public Decimal(char[] in) {
        decimal=new BigDecimal(in);
    }

    public Decimal(char[] in, MathContext mc) {
        decimal=new BigDecimal(in, mc);
    }

    public Decimal(String val) {
        decimal=new BigDecimal(val);
    }

    public Decimal(String val, MathContext mc) {
        decimal=new BigDecimal(val, mc);
    }

    public Decimal(double val) {
        decimal=new BigDecimal(val);
    }

    public Decimal(double val, MathContext mc) {
        decimal=new BigDecimal(val, mc);
    }

    public Decimal(BigInteger val) {
        decimal=new BigDecimal(val);
    }

    public Decimal(BigInteger val, MathContext mc) {
        decimal=new BigDecimal(val, mc);
    }

    public Decimal(BigInteger unscaledVal, int scale) {
        decimal=new BigDecimal(unscaledVal, scale);
    }

    public Decimal(BigInteger unscaledVal, int scale, MathContext mc) {
        decimal=new BigDecimal(unscaledVal, scale, mc);
    }

    public Decimal(int val) {
        decimal=new BigDecimal(val);
    }

    public Decimal(int val, MathContext mc) {
        decimal=new BigDecimal(val, mc);
    }

    public Decimal(long val) {
        decimal=new BigDecimal(val);
    }

    public Decimal(long val, MathContext mc) {
        decimal=new BigDecimal(val, mc);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return String.valueOf(decimal);
    }
}
