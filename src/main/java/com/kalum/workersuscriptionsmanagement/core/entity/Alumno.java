package com.kalum.workersuscriptionsmanagement.core.entity;

import com.kalum.workersuscriptionsmanagement.WorkerSuscriptionsManagementApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Alumno extends AbstractPersona {
    private static Logger logger = LoggerFactory.getLogger(WorkerSuscriptionsManagementApplication.class);

    private String carne;
    private String foto;
    private String nivelAcademico;

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    @Override
    public void enviarInformacionPorEmail(String mensaje) {
        logger.debug(mensaje);
//javax.swing.JOptionPane.showMessageDialog(null,"Alumno","mensaje", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void tomarAsistencia() {
        logger.debug("Asistencia tomada al alumno: "+ this.carne + " " + this.getApelllidos() + " " + this.getNombres());

}
}
