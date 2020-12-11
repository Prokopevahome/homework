package fractioncalculator;

public class Сalculator {

    static Fraction add(Fraction f1, Fraction f2){
        Fraction summa = new Fraction();
        summa.denominator = f1.denominator * f2.denominator;
        summa.numerator = f1.numerator * f2.denominator + f2.numerator * f1.denominator;
        return  summa;
    }
}
