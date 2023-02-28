package conversormonedas;

//import javax.swing.JTextField;
import javax.swing.JFormattedTextField;

class MuestraResultado {

    void muestra(JFormattedTextField cajatxt, double tot) {

        cajatxt.setText(String.valueOf(String.format("%.4f", tot)));
    }
}
