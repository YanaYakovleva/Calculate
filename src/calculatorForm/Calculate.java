package calculatorForm;

import calculatorClass.Calculator;
import myExceptions.DivisionByZeroException;

import javax.swing.*;

/**
 * Класс формы калькулятора.
 * @autor Yana Yakovleva
 */
public class Calculate extends JFrame {
    /** Текстовое поле делимое */
    private JTextField divisibleTextField;

    /** Текстовое поле делитель */
    private JTextField divisorTextField;

    /** Текстовое поле частное */
    private JTextField quotientTextField;

    /** Кнопка равно */
    private JButton calculateButton;

    /** Главная панель */
    private JPanel mainPanel;

    Calculator calculator=null;

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param calculator - калькулятор
     * @see Calculate#Calculate(Calculator) ()
     */
    public Calculate(Calculator calculator){
        super();
        this.calculator=calculator;
        this.add(mainPanel);
        this.setSize(200,220);
        this.setLocation(200,200);

        /* Создание листенера для события "Нажатие кнопки" */
        calculateButton.addActionListener((e) -> {
            Double divisible=null;
            Double divisor=null;
            try{
                if(divisibleTextField.getText().compareTo("")==0)
                    throw new IllegalArgumentException("Divisible cannot be empty");
                divisible=Double.parseDouble(divisibleTextField.getText());

                if(divisorTextField.getText().compareTo("")==0)
                    throw new IllegalArgumentException("Divisor cannot be empty");
                divisor=Double.parseDouble(divisorTextField.getText());

                calculator.setDivisible(divisible);
                calculator.setDivisor(divisor);
                quotientTextField.setText(calculator.getQuotient().toString());
            }
            catch (NumberFormatException exception){
                showMessage("Invalid number format");
            }
            catch (IllegalArgumentException
                    | DivisionByZeroException
                    | NullPointerException
                    exception){
                showMessage(exception.getMessage());
            }
        });
    }

    /**
     * Процедура вывода сообщения
     * @param text - строка сообщения
     */
    private void showMessage(String text){
        JOptionPane.showMessageDialog(this, text);
    }
}
