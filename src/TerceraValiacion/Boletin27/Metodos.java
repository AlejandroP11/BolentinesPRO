/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TerceraValiacion.Boletin27;;

import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author dam1
 */
public class Metodos {

/**
 *
 * @author dam1
 */
    //Declaramos los componentes que vamos a utilizar
    JFrame marco;
    JPanel panel, panel2;
    JButton botonP, botonL, botonB;
    JTextField lineaN, lineaP;
    JLabel etiqueta1, etiqueta2;
    JTextArea area, area2;
    JList lista;
    
    public void crear(){
        //Creamos los objetos
        marco = new JFrame();
        panel = new JPanel();
        botonP = new JButton("PREMER");
        botonL = new JButton("LIMPAR");
        lineaN = new JTextField();
        lineaP = new JTextField();
        etiqueta1 = new JLabel("NOME");
        etiqueta2 = new JLabel("PASSWORD");
        area = new JTextArea("Area de Texto.");
        
        //Objetos del segundo panel
        panel2 = new JPanel();
        //Podemos crear un array para la lista o ir agregando elemento a elemento despues de crear dicha lista
        String elementos[] = {"Elemento 1", "Elemento 2", "Elemento 3"};
        lista = new JList(elementos);
        botonB = new JButton("boton");
        area2 = new JTextArea("Area de Texto.");
        
        //Le damos tamaño al marco y al panel
        marco.setSize(600, 950);
        panel.setSize(600, 500);
        panel2.setBounds(0, 500, 600, 500);

        //Quitamos el layout automático para que se posicione bien
        panel.setLayout(null);
        panel2.setLayout(null);
        
        //Le damos tamaño y posicion a los componentes 
        botonP.setBounds(100, 375, 175, 50);
        botonL.setBounds(350, 375, 175, 50);
        lineaN.setBounds(300, 50, 200, 50);
        lineaP.setBounds(300, 150, 200, 50);
        etiqueta1.setBounds(50, 50, 50, 50);
        etiqueta2.setBounds(50, 150, 150, 50);
        area.setBounds(50, 250, 400, 100);
        
        //Le damos tamaño y posicion a los componentes del segundo panel
        lista.setBounds(50, 50, 150, 350);
        botonB.setBounds(250, 200, 100, 50);
        area2.setBounds(400, 150, 150, 200);
        
        //Introducimos los componentes dentro del panel
        panel.add(botonP);
        panel.add(botonL);
        panel.add(lineaN);
        panel.add(lineaP);
        panel.add(etiqueta1);
        panel.add(etiqueta2);
        panel.add(area);
        
        //Introducimos los componentes dentro del segundo panel
        panel2.add(lista);
        panel2.add(botonB);
        panel2.add(area2);
        
        marco.setLayout(null);
        
        //Introducimos el panel dentro del marco
        marco.add(panel);
        marco.add(panel2);
        
        //Hacemos el marco visible
        marco.setVisible(true);
        
        //Se para la ejecucion cuando le damos a la x
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Posicionamos el frame en el medio
        marco.setLocationRelativeTo(null);
    }
}
