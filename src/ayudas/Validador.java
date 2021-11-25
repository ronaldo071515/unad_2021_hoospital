
package ayudas;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Validador {
    
    Character s;
    
    public void validarLetras( KeyEvent evt ) {
        s = evt.getKeyChar();
        if( !Character.isLetter(s) && s != KeyEvent.VK_SPACE ) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo permite letras", "", JOptionPane.OK_OPTION);
        }
    }
    
    public void validarNumeros( KeyEvent evt ) {
        s = evt.getKeyChar();
        if ( !Character.isDigit(s) ) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo permite números", "", JOptionPane.OK_OPTION);
        }
    }
    
}
