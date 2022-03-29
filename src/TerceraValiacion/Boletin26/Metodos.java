
package TerceraValiacion.Boletin26;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dam1
 */
public class Metodos implements ActionListener {
    //Declaramos los componentes que vamos a utilizar
    JFrame marco;
    JPanel panel;
    JButton botonP, botonL;
    JTextField lineaN, linea2;
    JLabel etiqueta1, etiqueta2;
    JTextArea area;
    
    public void crear(){
        //Creamos los objetos
        marco = new JFrame();
        panel = new JPanel();
        botonP = new JButton("PREMER");
        botonL = new JButton("LIMPAR");
        lineaN = new JTextField();
        linea2 = new JTextField();
        etiqueta1 = new JLabel("NOME");
        etiqueta2 = new JLabel("PASSWORD");
        area = new JTextArea("Area de Texto.");
        
        //Le damos tamaño al marco y al panel
        marco.setSize(600, 600);
        panel.setSize(600, 600);
        
        //Le damos tamaño y posicion a los componentes 
        botonP.setBounds(100, 475, 175, 50);
        botonL.setBounds(350, 475, 175, 50);
        lineaN.setBounds(300, 50, 200, 50);
        linea2.setBounds(300, 150, 200, 50);
        etiqueta1.setBounds(50, 50, 50, 50);
        etiqueta2.setBounds(50, 150, 150, 50);
        area.setBounds(50, 250, 400, 200);
        
        //Quitamos el layout automático para que se posicione bien
        panel.setLayout(null);
        
        //Introducimos los componentes dentro del panel
        panel.add(botonP);
        panel.add(botonL);
        panel.add(lineaN);
        panel.add(linea2);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(area);
        
        //Introducimos el panel dentro del marco
        marco.add(panel);

        //Añadimos listener a ambos botones
        botonP.addActionListener(this);
        botonL.addActionListener(this);

        //Hacemos el marco visible
        marco.setVisible(true);
        
        //Se para la ejecucion cuando le damos a la x
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Posicionamos el frame en el medio
        marco.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Recogemos la fuente de la accion
        Object ob = e.getSource();
        //Si presionamos el botonP
        if(ob == botonP)
            area.setText("Hola "+lineaN.getText()); //Escribimos hola mas el texto recogido de linea del nombre
            //Si presionamos el botonL
        else
            area.setText(" "); //Dejamos vacia el area de texto
    }

}
