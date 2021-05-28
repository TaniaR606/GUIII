/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiii;
import javax.swing.JFrame;

 public class PruebaSeleccionMultiple
 {
 public static void main( String args[] )
 {
 MarcoSeleccionMultiple marcoSeleccionMultiple =
 new MarcoSeleccionMultiple();
 marcoSeleccionMultiple.setDefaultCloseOperation(
 JFrame.EXIT_ON_CLOSE );
 marcoSeleccionMultiple.setSize( 350, 140 ); // establece el tamaño del marco
 marcoSeleccionMultiple.setVisible( true ); // muestra el marco
 } // fin de main
 }