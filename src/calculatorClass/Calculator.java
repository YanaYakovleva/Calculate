package calculatorClass;

import calculatorForm.Calculate;
import myExceptions.DivisionByZeroException;

/**
 * Класс калькулятор со свойствами <b>divisible</b> и <b>divisor</b>.
 * @autor Yana Yakovleva
 */
public class Calculator {
    /** Поле делимое */
    Double divisible=null;

    /** Поле делитель */
    Double divisor=null;

    /**
     * Функция получения значения поля {@link Calculator#divisible}
     * @return возвращает делимое
     */
    public Double getDivisible() {
        return divisible;
    }

    /**
     * Процедура определения производителя {@link Calculator#divisible}
     * @param divisible - производитель
     */
    public void setDivisible(Double divisible) {
        this.divisible = divisible;
    }

    /**
     * Функция получения значения поля {@link Calculator#divisor}
     * @return возвращает делитель
     */
    public Double getDivisor() {
        return divisor;
    }

    /**
     * Процедура определения производителя {@link Calculator#divisor}
     * @param divisor - производитель
     */
    public void setDivisor(Double divisor) {
        this.divisor = divisor;
    }

    /**
     * Функция вычисления значения частного от деления
     * @return возвращает частное от деления
     */
    public Double getQuotient() throws DivisionByZeroException {
        if(divisible==null)
            throw new NullPointerException("divisible is null");
        if(divisor==null)
            throw new NullPointerException("divisor is null");
        if(divisor==0)
            throw new DivisionByZeroException("divisor cannot be 0");
        return divisible/divisor;
    }

    /**
     * Главная функция программы. Создает 2 новых объекта calculator и calculate с параметром calculator.
     * Запускает работу формы calculate.
     * @param args
     */
    public static  void main(String[] args){
        Calculator calculator=new Calculator();
        Calculate calculate=new Calculate(calculator);
        calculate.setVisible(true);
    }
}
