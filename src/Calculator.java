import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton;

    public Calculator() {
        super("Calculator");
        setLayout(new FlowLayout());

        num1Field = new JTextField(10);
        add(num1Field);

        addButton = new JButton("+");
        add(addButton);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 + num2;
                resultField.setText(Double.toString(result));
            }
        });

        num2Field = new JTextField(10);
        add(num2Field);

        subtractButton = new JButton("-");
        add(subtractButton);
        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 - num2;
                resultField.setText(Double.toString(result));
            }
        });

        resultField = new JTextField(10);
        resultField.setEditable(false);
        add(resultField);

        multiplyButton = new JButton("*");
        add(multiplyButton);
        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 * num2;
                resultField.setText(Double.toString(result));
            }
        });

        divideButton = new JButton("Делено");
        add(divideButton);
        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                double result = num1 / num2;
                resultField.setText(Double.toString(result));
            }
        });
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setSize(250, 150);
        calculator.setVisible(true);
    }
}
