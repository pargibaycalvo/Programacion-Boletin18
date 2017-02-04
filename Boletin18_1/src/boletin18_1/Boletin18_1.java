/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_1;
import milibreria.Milibreria;
import javax.swing.JOptionPane;

/**
 *
 * @author ped90
 */
public class Boletin18_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        buzon email = new buzon();
        email.cargaemail();
        int opcion;
        do{
        opcion= Integer.parseInt(JOptionPane.showInputDialog("1) Numero de correos.\n2) Añadir correo.\n3) Numero de correos sin leer.  \n4) Primer correo no leido. \n5) Eliminar correo deseado. \n6) Mostrar. \n0) Salir."));
        switch(opcion){
            case 1:
                //email.numerodecorreos();
                JOptionPane.showMessageDialog(null,"Tiene "+email.numerodecorreos()+" correos");
            case 2:
                email.añadircorreo(new correo(Milibreria.añadirnombre(),false));
                break;
            case 3:
                email.quedanporleer(true);
                break;
            case 4:
                 if(email.quedanporleer(false)== true)
                    JOptionPane.showMessageDialog(null,email.primernoleido());
                    else
                        JOptionPane.showMessageDialog(null, "No Tienes correos por Leer");
                    break;
            case 5:
                 if(email.numerodecorreos()!=0)
                    JOptionPane.showMessageDialog(null,email.mostrar(Milibreria.añadirdorsal("Mensaje que desea eliminar",1,email.numerodecorreos())));
                    else
                        JOptionPane.showMessageDialog(null, "No Tienes correos en el Buzon.");
                    break;
            case 6:
                if(email.numerodecorreos()!=0){
                      JOptionPane.showMessageDialog(null,"Tienes correos " +email.numerodecorreos());
                }else
                        JOptionPane.showMessageDialog(null, "No Tienes correos en el Buzon.");
                    break;
            case 0:
                JOptionPane.showMessageDialog(null,"Pulse aceptar para salir");
                System.exit(0); 
                break;
            default:
                JOptionPane.showMessageDialog(null,"Fallo");
        }
    }while(opcion!=0);
    }
    }
    

