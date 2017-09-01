package myExceptions;

/**
 * Класс наследник от Exception.
 * @autor Yana Yakovleva
 */
public class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message){
        super(message);
    }

    /**
     * Функция переопределения метода toString
     * @return строку с сообщением
     */
    @Override
    public String toString() {
        return "DivisionByZeroException: "+getMessage();
    }
}
