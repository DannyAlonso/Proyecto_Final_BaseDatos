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
    private Tareas inicio;
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
        if (tamanio == 5) {
            JOptionPane.showMessageDialog(null, "lista de Tareas llena ");
        } else {
            inicio = new Tareas(tareas, inicio);

            if (fin == null) {
                fin = inicio;
                JOptionPane.showMessageDialog(null, "lista de Tareas a sido agregada ");
            }
            tamanio++;
            JOptionPane.showMessageDialog(null, "lista:" + tareas);
        }

        return tareas;
    }



    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public String listar() {

        if (!estaVacia()) {
            Tareas aux = inicio;
            int i = 0;
            while (aux != null) {
                JOptionPane.showMessageDialog(null, i + ".[ " + aux.dato + " ]" + " ->  ");
                aux = aux.getSiguiente();
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

        if (posicion >= 0 && posicion < tamanio) {

            if (posicion == 0) {

                JOptionPane.showMessageDialog(null, "La lista es de;" + inicio.dato);
                NewJFrame1 mewjfrae = new NewJFrame1();
                mewjfrae.setVisible(true);
                return inicio.getVer();
            } else {

                Tareas aux = inicio;

                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();

                }

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

        } else {
            throw new Exception("Posicion inexistente en la lista.");
        }

    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public void Eliminar(int posicion) {

        if (posicion >= 0 && posicion < tamanio) {
            if (posicion == 0) {
                inicio = inicio.getSiguiente();
            } else {
                Tareas aux = inicio;
                for (int i = 0; i < posicion - 1; i++) {
                    aux = aux.getSiguiente();
                }
                Tareas siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }

            tamanio--;
            JOptionPane.showMessageDialog(null, "La lista a sido eliminada;");

        }
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public void Editar(int posicion, String valor) {
      
        if (posicion >= 0 && posicion < tamanio) {
      
            if (posicion == 0) {
            
                inicio.setEditar(valor);
            
            } else {
        
                Tareas aux = inicio;

                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
           
                aux.setEditar(valor);
         
               

            }
        }
    }

}
