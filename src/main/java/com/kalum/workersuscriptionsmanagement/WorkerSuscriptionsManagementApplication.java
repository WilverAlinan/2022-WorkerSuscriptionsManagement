package com.kalum.workersuscriptionsmanagement;

import com.kalum.workersuscriptionsmanagement.core.entity.Alumno;
import com.kalum.workersuscriptionsmanagement.core.entity.Aspirante;
import com.kalum.workersuscriptionsmanagement.core.entity.AbstractPersona;
import com.kalum.workersuscriptionsmanagement.demo.MiVentana;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class WorkerSuscriptionsManagementApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(WorkerSuscriptionsManagementApplication.class);

    public static void main(String[] args) {
        MiVentana ventana = new MiVentana();
        SpringApplication.run(WorkerSuscriptionsManagementApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {


        ArrayList<AbstractPersona> lista = new ArrayList<AbstractPersona>();

        Aspirante aspirante1 = new Aspirante();
        aspirante1.setNoExpediente("EXP-2022001");
        aspirante1.setCui("24871246987");
        aspirante1.setApelllidos("Martinez Muñoz");
        aspirante1.setNombres("Maria Alejandra");
        aspirante1.setDireccion("Guatemala, Guatemala");
        aspirante1.setTelefono("24711529");
        aspirante1.setEmail("mmartinez@gmail.com");
        aspirante1.setEstatus("No Asignado");
        aspirante1.setFechaExamen(new Date());
        aspirante1.enviarInformacionPorEmail("Su examen ha sido exitoso.");
        logger.debug("Registro operado de: " + aspirante1.getNoExpediente() + " " + aspirante1.getApelllidos() +" " + aspirante1.getNombres());

        Alumno alumno1 = new Alumno();
        alumno1.setCarne("2022001");
        alumno1.setApelllidos("Lopez Garcia");
        alumno1.setNombres("Juan Alberto");
        alumno1.setDireccion("Guatemala, Guatemala");
        alumno1.setTelefono("24402389");
        alumno1.setEmail("jlopez@gmail.com");
        alumno1.setFoto("default.jpg");
        alumno1.setNivelAcademico("Nivel diversificado");
        alumno1.enviarInformacionPorEmail("Sus clases han sido asignadas correctamente");

        lista.add(aspirante1);
        lista.add(alumno1);

        for (AbstractPersona elemento: lista) {
            if (elemento instanceof Alumno){
            logger.debug("carne:" + ((Alumno) elemento).getCarne()+"Nombre Completo:"+ elemento.getApelllidos() + " " + elemento.getNombres());
            } else if(elemento instanceof Aspirante){
                logger.debug("No Expediente:" + ((Aspirante) elemento).getNoExpediente() + "Nombre Completo:"+ elemento.getApelllidos() + " " + elemento.getNombres());
            }
           elemento.tomarAsistencia();
        }

    }
}
