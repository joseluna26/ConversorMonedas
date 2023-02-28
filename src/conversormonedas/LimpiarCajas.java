
package conversormonedas;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
class LimpiarCajas {
    void limpiar(JPanel pan){
        JTextField caja;
        JFormattedTextField fcaja;
        for (int i = 0; i < pan.getComponentCount(); i++)
        {
            if(pan.getComponent(i).getClass().getName().equals("javax.swing.JTextField")){
                caja = (JTextField)pan.getComponent(i);
                caja.setText("");
            }
            
            
            if(pan.getComponent(i).getClass().getName().equals("javax.swing.JFormattedTextField")){
                fcaja = (JFormattedTextField)pan.getComponent(i);
                fcaja.setText("");
            }
            
            
        }
    }
}
