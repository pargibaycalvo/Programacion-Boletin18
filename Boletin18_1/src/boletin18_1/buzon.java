/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_1;

import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JOptionPane;

/**
 *
 * @author ped90
 */
public class buzon {
   private ArrayList<correo> listacorreo;
   
    public buzon(){
       listacorreo=new ArrayList();
    }
    public void cargaemail(){
       listacorreo.add(new correo("Miguel, callate",true));
       listacorreo.add(new correo("Alejandro, es un pro del nesbins",false));
       listacorreo.add(new correo("Steam, actualizacion del juego resident evil 7",true));
       listacorreo.add(new correo("WoW, su cuenta ha sido baneada por falta de uso",true));
   }
    public int numerodecorreos(){
        return listacorreo.size();
    }
    public void añadircorreo(correo c){
        //listacorreo.add(new correo());
        JOptionPane.showMessageDialog(null,"Mensaje a añadir :"+listacorreo.add(new correo()));
    }
    public boolean quedanporleer(boolean toMostrar){
        correo c=new correo(false);
        int aux=0;
        for(int i=0;i<listacorreo.size();i++){
          if(listacorreo.get(i).isLeido()==false)
        aux++; 
        }
        if(toMostrar==true) JOptionPane.showMessageDialog(null,"Tiene por leer un total de :"+aux);
        return listacorreo.contains(c); 
    }
    public String primernoleido() {
        correo c=new correo(false);
        correo d=listacorreo.get(listacorreo.indexOf(c));
        listacorreo.get(listacorreo.indexOf(c)).setLeido(true);
        return d.toString();
    }
    public String mostrar(int k) {
        correo c=listacorreo.get(k-1);
        if(listacorreo.get(k-1).isLeido()==false) {
            listacorreo.get(k-1).setLeido(true);
        }
        return c.toString();
    }
    public void eliminar(int k){
        listacorreo.remove(k-1);
    }
}
   
   
    

