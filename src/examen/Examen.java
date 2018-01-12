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
    private double c,f;
    private int v;
     
    public double examenPractico(){
        
    String e=JOptionPane.showInputDialog("ponga las notas correspondientes: ");
    int a = Integer.parseInt(e);
    String d=JOptionPane.showInputDialog("ponga las notas correspondientes: ");
    int b = Integer.parseInt(d);
    c= (a+b)/2;
    JOptionPane.showMessageDialog(null,"las pruebas parácticas dan: "+c);
    return c;
    } 
   
    public double examenTeorico(){
        String e=JOptionPane.showInputDialog("ponga las notas correspondientes: ");
    int a = Integer.parseInt(e);
    String d=JOptionPane.showInputDialog("ponga las notas correspondientes: ");
    int b = Integer.parseInt(d);
    f= (a+b)/2;
    JOptionPane.showMessageDialog(null,"las pruebas parácticas dan: "+f);
            return f;
    }
    public int boletin(){
      
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
public void total(){
    double q=v+f*40/100+c*40/100;
    JOptionPane.showMessageDialog(null,"el total es: "+q);
}
      
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Examen a= new Examen();
       a.boletin();
       a.examenPractico();
       a.examenTeorico();
       a.total();
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