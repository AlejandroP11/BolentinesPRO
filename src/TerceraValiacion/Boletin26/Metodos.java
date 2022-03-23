
package TerceraValiacion.Boletin26;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author dam1
 */
public class Metodos {
    //Declaramos los componentes que vamos a utilizar
    JFrame marco;
    JPanel panel;
    JButton boton1, boton2;
    JTextField linea1, linea2;
    JLabel etiqueta1, etiqueta2;
    JTextArea area;
    
    public void crear(){
        //Creamos los objetos
        marco = new JFrame();
        panel = new JPanel();
        boton1 = new JButton("PREMER");
        boton2 = new JButton("LIMPAR");
        linea1 = new JTextField();
        linea2 = new JTextField();
        etiqueta1 = new JLabel("NOME");
        etiqueta2 = new JLabel("PASSWORD");
        area = new JTextArea("Area de Texto.");
        
        //Le damos tamaño al marco y al panel
        marco.setSize(600, 600);
        panel.setSize(600, 600);
        
        //Le damos tamaño y posicion a los componentes 
        boton1.setBounds(100, 475, 175, 50);
        boton2.setBounds(350, 475, 175, 50);
        linea1.setBounds(300, 50, 200, 50);
        linea2.setBounds(300, 150, 200, 50);
        etiqueta1.setBounds(50, 50, 50, 50);
        etiqueta2.setBounds(50, 150, 150, 50);
        area.setBounds(50, 250, 400, 200);
        
        //Quitamos el layout automático para que se posicione bien
        panel.setLayout(null);
        
        //Introducimos los componentes dentro del panel
        panel.add(boton1);
        panel.add(boton2);
        panel.add(linea1);
        panel.add(linea2);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(area);
        
        //Introducimos el panel dentro del marco
        marco.add(panel);
        
        //Hacemos el marco visible
        marco.setVisible(true);
        
        //Se para la ejecucion cuando le damos a la x
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Posicionamos el frame en el medio
        marco.setLocationRelativeTo(null);
    }
}
