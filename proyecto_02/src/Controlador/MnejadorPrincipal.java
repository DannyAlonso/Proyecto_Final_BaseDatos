package Controlador;

import Modelo.Tareas;
import Modelo.RegistroTareas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.NewJFrame;
import javax.swing.JOptionPane;

public class MnejadorPrincipal implements ActionListener {

    NewJFrame newJFrame;
    Tareas tareas;
    RegistroTareas tareasl;

    public MnejadorPrincipal(NewJFrame newJFrame) {
        this.newJFrame = newJFrame;
        tareasl = new RegistroTareas();
        this.tareas = new Tareas();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Crear")) {

            if (newJFrame.getCrear().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese la nueva nota!!");
            } else {

                tareas.setCrear(newJFrame.getCrear());
                tareasl.crear(tareas.getCrear());

                //this.newJFrame.listar();
                this.newJFrame.limpiar();
            }
        }
        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        if (e.getActionCommand().equals("Mostrar")) {
            tareasl.listar();

        }

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        if (e.getActionCommand().equals("Ver Tarea")) {

            if (newJFrame.getVer().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un numero para ver las tareas!!");
            } else {
                try {
                    tareas.setVer(newJFrame.getVer());
                    tareasl.getVer(Integer.parseInt(tareas.getVer()));

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No Existe,Digitelo de nuevo!!");
                }
            }
        }
    }
}
