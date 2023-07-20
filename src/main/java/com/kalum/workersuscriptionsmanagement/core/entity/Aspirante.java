package com.kalum.workersuscriptionsmanagement.core.entity;

import com.kalum.workersuscriptionsmanagement.WorkerSuscriptionsManagementApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date; //usar la clase y no *

public class Aspirante extends AbstractPersona {

    private static Logger logger = LoggerFactory.getLogger(WorkerSuscriptionsManagementApplication.class);

    private String noExpediente;
    private String cui;
    private String estatus;
    private Date fechaExamen;

    public String getNoExpediente() {
        return noExpediente;
    }

    public void setNoExpediente(String noExpediente) {
       /* int posicion = noExpediente.indexOf("-");
        if (posicion > 0) {
            if (noExpediente.substring(0, 3).equals("EXP")) {
                if (noExpediente.substring(4, 8).length() == 4) {
                    if (Integer.parseInt(noExpediente.substring(4, 8)) > 0) {
                        this.noExpediente = noExpediente;
                    }
                } else {
                    this.noExpediente = "";
                }
            } else {
                this.noExpediente = "";
            }
        } else {
            this.noExpediente = "";
        }
*/
        this.noExpediente = noExpediente;
    }

    public String getCui() {
        return cui;
    }

    public void setCui(String cui) {
        this.cui = cui;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Date getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(Date fechaExamen) {
        this.fechaExamen = fechaExamen;
    }


    @Override
    public void enviarInformacionPorEmail(String mensaje) {
        logger.debug(mensaje);
        //javax.swing.JOptionPane.showMessageDialog(null,"Aspirante","mensaje", JOptionPane.INFORMATION_MESSAGE);

            }

    @Override
    public void tomarAsistencia() {
        logger.debug("Asistencia tomada al aspirante: "+ this.noExpediente + " " + this.getApelllidos() + " " + this.getNombres());
    }
}
