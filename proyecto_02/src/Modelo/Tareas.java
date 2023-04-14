/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Tareas {

    private String Crear;
    public String dato;
    public Tareas siguiente;
    private int valor;
    public String Ver;

    public Tareas(String crear, String d, String ver) {

        this.Crear = crear;
        this.dato = d;
        this.siguiente = null;
        this.valor = 0;
        this.Crear = ver;

    }//fin del constructor con parametros 

    public Tareas() {

    }//fin del constructor sin parametros

    public Tareas(String d, Tareas n) {
        dato = d;
        siguiente = n;
    }

    public void enlazarSiguiente(Tareas n) {
        siguiente = n;
    }

    public Tareas obtenerSiguiente() {
        return siguiente;
    }

    public String getVer() {
        return Ver;
    }

    public void setVer(String ver) {
        this.Ver = ver;
    }

    public String getCrear() {
        return Crear;
    }

    public void setCrear(String crear) {
        this.Crear = crear;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Tareas getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Tareas siguiente) {
        this.siguiente = siguiente;
    }
 
}
