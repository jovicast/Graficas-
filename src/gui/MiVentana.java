/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
//PASO 1 - IMPORTAR
import graficas.*;
import javax.swing.*;//Libreria gràfica estandar multiplataforma
import java.awt.*;//Libreria Grafica del Sistema Operativo
/**
 *
 * @author LAB07
 */
//PASO 2 - HERREDAR MI CLASE DESDE JFRAME
public class MiVentana extends JFrame 
{

  //PASO 3 - DECLARAR LOS ELEMENTOS QUE VAMOS A UTILIZAR
    JPanel mipanel;//Creacion deobjetos JPanel
    JLabel milabel;
    JTextField mitexto;
    JButton miboton;
    
    //PASO 4 - DEFINICION DEL CONSTRUCTOR DE LA CLASE
    public MiVentana()//Tiene el mismo nombre de la clase
    {
     //PASO 5 - CREAR E INICIALIZAR LOS OBJETOS QUE UTILIZAREMOS
     mipanel = new JPanel();//Creamos el objeto
     milabel = new JLabel();
     mitexto = new JTextField(10);// son los caracteres
     miboton = new JButton();
     
     //PASO 6 - AGREGAR LOS ELEMENTOS AL JFRAME
     this.add(mipanel);//Agrego el JPanel al JFrame
     mipanel.add(milabel);//Agrego los elementos al JPanel
     mipanel.add(mitexto);
     mipanel.add(miboton);
     
    //PASO 7 - PROPIEDADES DE LAS ELEMENTOS 
    milabel.setText("campo");//
    miboton.setText("presioname");
            
    }
}
    
   /* public static void main(String[] args)
    { 
    JFrame miventana = new JFrame();//Creamos un Objeto tipo JFrame
    miventana.setVisible(true);//Esta sentencia muestra la ventana
    miventana.setBounds(0, 0, 400, 400);//Le asignamos Tamaño a la ventana
    miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Esta sentencia cierra esta ventana
    }*/
    

