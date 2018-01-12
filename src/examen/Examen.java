/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author oracle
 */
public class Examen {
     
    public double examenPractico(){
        
    String e=JOptionPane.showInputDialog("ponga las notas correspondientes: ");
    int a = Integer.parseInt(e);
    String d=JOptionPane.showInputDialog("ponga las notas correspondientes: ");
    int b = Integer.parseInt(d);
    float c= (a+b)/2;
    JOptionPane.showMessageDialog(null,"las pruebas parácticas dan: "+c);
    return c*40/100;
    } 
   
    public double examenTeorico(){
        String e=JOptionPane.showInputDialog("ponga las notas correspondientes: ");
    int a = Integer.parseInt(e);
    String d=JOptionPane.showInputDialog("ponga las notas correspondientes: ");
    int b = Integer.parseInt(d);
    float f= (a+b)/2;
    JOptionPane.showMessageDialog(null,"las pruebas parácticas dan: "+f);
            return f*40/100;
    }
    public int boletin(){
       int v=0;
          String e=JOptionPane.showInputDialog("ponga el número de trabajos: ");
        int c = Integer.parseInt(e);
         String d=JOptionPane.showInputDialog("ponga el número de trabajos entregados: ");
        int b = Integer.parseInt(d);
     if (b<=0.9*c)
       JOptionPane.showMessageDialog(null,"las pruebas parácticas dan: "+c);
     else if(b<=0.7*9)
         v=1;
     else if(b>0.7*9)
         v=0;
        return v;
        
    }

      
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Examen a= new Examen();
       a.boletin();
    }
    
}
//Realiza un programa que calcule a nota final da avaliación (Ésta pode levar 2 decimais). Para eso ten en conta o seguinte :
//Probas escritas  son 2 probas e, a cualificación global é do 40 % sobre a media destas dúas probas 
//Proba práctica  A cualificación é do 40 % 
//Boletins   A cualificación global é do 20 % . Tendo en conta que se temos  :
//Máis  do 90 % do total  2 puntos 
//Entre o 70% e o 90% ( ambos os dous incluidos )  1 punto
//Menos do 70 %  - 0 puntos .
//
// A saida será :
//   PROBAS TEÓRICAS……………
//  PROBAS PRÁCTICA……………
//  BOLETÍNS  ……………………….  
// NOTA TOTAL…………………… 