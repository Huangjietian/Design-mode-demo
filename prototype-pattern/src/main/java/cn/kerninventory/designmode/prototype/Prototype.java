package cn.kerninventory.designmode.prototype;

import java.io.Serializable;

/**
 * @author Kern
 * @date 2020/6/9 10:23
 * @description
 */
public class Prototype implements Cloneable, Serializable {

    private String str;

    private Integer digit;

    private Double number;

    private Quote quote;

    public Prototype(String str, Integer digit, Double number, Quote quote) {
        this.str = str;
        this.digit = digit;
        this.number = number;
        this.quote = quote;
    }

    public String getStr() {
        return str;
    }

    public Prototype setStr(String str) {
        this.str = str;
        return this;
    }

    public Integer getDigit() {
        return digit;
    }

    public Prototype setDigit(Integer digit) {
        this.digit = digit;
        return this;
    }

    public Double getNumber() {
        return number;
    }

    public Prototype setNumber(Double number) {
        this.number = number;
        return this;
    }

    public Quote getQuote() {
        return quote;
    }

    public Prototype setQuote(Quote quote) {
        this.quote = quote;
        return this;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "str='" + str + '\'' +
                ", digit=" + digit +
                ", number=" + number +
                ", quote=" + quote.hashCode() +
                ", quote.no=" + quote.getNo() +
                '}';
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        Quote quote = prototype.getQuote().clone();
        prototype.setQuote(quote);
        return prototype;
    }
}
