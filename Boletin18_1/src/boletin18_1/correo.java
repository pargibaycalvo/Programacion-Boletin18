/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18_1;
import milibreria.Milibreria;
import java.util.Objects;

/**
 *
 * @author ped90
 */
public class correo {
    private String mensaje;
    private boolean leido;

    public correo() {
    }

    public correo(boolean leido) {
        this.leido = leido;
    }

    public correo(String mensaje, boolean leido) {
        this.mensaje = mensaje;
        this.leido = leido;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    @Override
    public String toString() {
        return "El mensaje del correo es:\n\n" + mensaje;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.mensaje);
        
        hash = 73 * hash + (this.leido ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final correo other = (correo) obj;
        if (this.leido != other.leido) {
            return false;
        }
        return true;
    }

   
    
    
}