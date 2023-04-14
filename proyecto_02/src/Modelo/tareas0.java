/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class tareas0 {

    String tarea;
    String estado;
    String prioridad;
    private tareas0 siguiente;
    private tareas0 Anterior;
    public String dato;
    private int valor;

    public tareas0(String tarea, String estado, String prioridad) {
        this.tarea = tarea;
        this.estado = estado;
        this.prioridad = prioridad;
        this.valor = 0;
        this.siguiente = null;
        
    }
   public tareas0() {
    }
    public tareas0(String crear,String d, tareas0 n) {
        dato = d;
        siguiente = n;
    }
   
    public void enlazarSiguiente(tareas0 n) {
        siguiente = n;
    }

    public tareas0 obtenerSiguiente() {
        return siguiente;

    }

   

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

   

    public tareas0 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(tareas0 siguiente) {
        this.siguiente = siguiente;
    }
 @Override
    public String toString() {
        return "tareas0{" + "tarea=" + tarea + ", estado=" + estado + ", prioridad=" + prioridad + '}';
    }
}
