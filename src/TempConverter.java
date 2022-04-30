import javax.swing.*; //graphical user interface swing use to build desktop app
import java.awt.event.*; // all window tools
import java.awt.*;

public class TempConverter {

    // Declare the GUI Elements
    public static JFrame frmMain;
    public static JLabel lblCelsius;
    public static JTextField txtCelsius;
    public static JLabel lblFahrenheit;
    public static JTextField txtFahrenheit;
    public static JButton btnCalculateCToF;
    public static JButton btncalFtoc;

    public static void main(String[] args) {

        //Build the frame
        frmMain = new JFrame("Temperature Converter @Shehan");
        frmMain.setSize(400,150);
        frmMain.setLayout(new FlowLayout());

        //use elements in the app
        lblCelsius = new JLabel("Celsius: ");
        txtCelsius = new JTextField(10);
        lblFahrenheit = new JLabel("Fahrenheit: ");
        txtFahrenheit = new JTextField(10);

        btnCalculateCToF = new JButton("Celsius to Fahrenheit");
        //addActionListener
        btnCalculateCToF.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        //convert Celsius to Fahrenheit
                        String celsiusString = txtCelsius.getText();
                        Double celsiusDouble = Double.parseDouble(celsiusString);
                        Double result = celsiusDouble*1.8 + 32;
                        txtFahrenheit.setText(String.valueOf(result));
                    }
                }
        );

        btncalFtoc = new JButton("Fahrenheit to Celsius");
        btncalFtoc.addActionListener(
                new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String fahrenheitString = txtFahrenheit.getText();
                        Double fahrenheitDouble = Double.parseDouble(fahrenheitString);
                        Double result = ( fahrenheitDouble -32 )*0.5556;
                        txtCelsius.setText(String.valueOf(result));
                    }
                }
        );

        frmMain.add(lblCelsius);
        frmMain.add(txtCelsius);
        frmMain.add(lblFahrenheit);
        frmMain.add(txtFahrenheit);
        frmMain.add(btnCalculateCToF);
        frmMain.add(btncalFtoc);

        //frame visible
        frmMain.setVisible(true);
    }

}
