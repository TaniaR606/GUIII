/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiii;

import javax.swing.JFrame;
 public class PruebaLista
 {
 public static void main( String args[] )
 {
 MarcoLista marcoLista = new MarcoLista(); // crea objeto MarcoLista
 marcoLista.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 marcoLista.setSize( 350, 150 ); // establece el tamaño del marco
 marcoLista.setVisible( true ); // muestra el marco
 } // fin de main
 }