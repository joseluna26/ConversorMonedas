package conversormonedas;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class ValidaNumeros {

    void solonumeros(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.' &&  c != KeyEvent.VK_BACK_SPACE)
                {
                    JOptionPane.showMessageDialog(null, "Sólo se permiten números", "¡Error de Captura!", JOptionPane.ERROR_MESSAGE);
                    e.consume();
                }
                if (c == '.' && a.getText().contains("."))
                {
                    e.consume();
                }
            }
        });
    }
}
