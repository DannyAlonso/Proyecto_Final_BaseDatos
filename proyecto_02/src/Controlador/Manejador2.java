/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.tareas0;
import Modelo.RegistroTareas;
import Vista.NewJFrame2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Manejador2 implements ActionListener {

    NewJFrame2 newJFrame;
    tareas0 tareas;
    RegistroTareas tareasl;

    public Manejador2(NewJFrame2 newJFrame2) {
        this.newJFrame = newJFrame2;
        tareasl = new RegistroTareas();
        this.tareas = new tareas0();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Agregar")) {

            if (newJFrame.getTarea().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese la nueva nota!!");
            } else {
                tareas.setTarea(newJFrame.getTarea());
                tareas.setEstado(newJFrame.getEstado());
                tareas.setPrioridad(newJFrame.getPrioridad());
                tareasl.crear2(tareas.getTarea(), tareas.getEstado(), tareas.getPrioridad());

            }
        }

    }
}
