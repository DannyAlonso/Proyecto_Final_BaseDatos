package Modelo;

import Vista.NewJFrame1;
import javax.swing.JOptionPane;
import Vista.NewJFrame;
import Vista.NewJFrame2;
import Vista.NewJFrame3;
import Vista.NewJFrame4;
import Vista.NewJFrame5;

public class RegistroTareas {

    NewJFrame newJFrame;
    NewJFrame1 newJFrame1;
    public tareas0 inicio1;
    public tareas0 fin1;
    public Tareas inicio;
    public Tareas fin;
    private int tamanio;
 
    public RegistroTareas() {
        this.newJFrame = newJFrame;
        this.newJFrame1 = newJFrame1;

        inicio = null;
        fin = null;
        inicio1 = null;
        fin1 = null;

    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public int getTamanio() {
        return tamanio;
    }

    public boolean estaVacia() {
        if (inicio == fin) {
            return true;
        } else {
            return false;
        }
    }
    
    
     public boolean estaVacia1() {
        if (inicio1 == fin1) {
            return true;
        } else {
            return false;
        }
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public String crear(String tareas) {
        if (tamanio==5) {
      JOptionPane.showMessageDialog(null, "lista de Tareas llena ");       
        }else{
        inicio = new Tareas(tareas, inicio);

        if (fin == null) {
            fin = inicio;
            JOptionPane.showMessageDialog(null, "lista de Tareas a sido agregada ");
        }
        tamanio++;
             JOptionPane.showMessageDialog(null, "lista:"+tareas);
        }

        return tareas;
    }
      
    
    
    
    public String crear2(String tarea,String estados,String prioridad) {
        
        inicio1 = new tareas0(tarea, estados, prioridad);
        
        if (fin1 == null) {
            fin1 = inicio1;
            JOptionPane.showMessageDialog(null, "lista de Tareas a sido agregada inicio");
                    
        }
        tamanio++;
        JOptionPane.showMessageDialog(null, "Tarea: "+tarea+"\nEstado: "+estados+"\nPrioridad: "+prioridad);
        return null;
                

    }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public String listar() {
        // Verifica si la lista contiene elementoa.
        if (!estaVacia()) {
            // Crea una copia de la lista.
            Tareas aux = inicio;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while (aux != null) {
                // Imprime en pantalla el valor del nodo.
                JOptionPane.showMessageDialog(null, i + ".[ " + aux.dato + " ]" + " ->  ");
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
        return null;
    }
    
    
     public String listar2() {
        // Verifica si la lista contiene elementoa.
        if (!estaVacia()) {
            // Crea una copia de la lista.
            tareas0 aux = inicio1;
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while (aux != null) {
                // Imprime en pantalla el valor del nodo.
                JOptionPane.showMessageDialog(null, i + ".[ " + aux.dato + " ]" + " ->  ");
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
                // Incrementa el contador de la posión.
                i++;
            }
        }
        return null;
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public String ver() {

        NewJFrame1 mewjframe = new NewJFrame1();
        mewjframe.setVisible(true);

        return null;
    }

    public String getVer(int posicion) throws Exception {
        // Verifica si la posición ingresada se encuentre en el rango
        // >= 0 y < que el numero de elementos del la lista.
       
        if (posicion >= 0 && posicion < tamanio) {
            // Consulta si la posicion es el inicio de la lista.
            if (posicion == 0) {
                // Retorna el valor del inicio de la lista.
                JOptionPane.showMessageDialog(null, "La lista es de;" + inicio.dato);
                NewJFrame1 mewjfrae = new NewJFrame1();
                mewjfrae.setVisible(true);
                return inicio.getVer();
            } else {
                // Crea una copia de la lista.
                Tareas aux = inicio;
                // Recorre la lista hasta la posición ingresada.
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();

                }
                // Retorna el valor del nodo.
                JOptionPane.showMessageDialog(null, "La lista es de;" + aux.dato);

                switch (posicion) {

                    case 1:
                        NewJFrame2 mewjframe = new NewJFrame2();
                        mewjframe.setVisible(true);
                        break;
                    case 2:
                        NewJFrame3 newjframe = new NewJFrame3();
                        newjframe.setVisible(true);
                        break;
                    case 3:
                        NewJFrame4 newjfram = new NewJFrame4();
                        newjfram.setVisible(true);
                        break;
                    case 4:
                        NewJFrame5 ewjframe = new NewJFrame5();
                        ewjframe.setVisible(true);
                        break;

                    default:
                        throw new AssertionError();
                }
                return aux.getVer();

            }
            // Crea una excepción de Posicion inexistente en la lista.
        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }

    }

}
