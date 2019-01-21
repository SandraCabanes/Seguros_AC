/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import model.AsistenciaMedica;
import model.Direccion;
import model.Seguro;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Sandra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory sessionfactory;
        Configuration config = new Configuration();
        config.configure();
        config.addClass(Seguro.class);
        sessionfactory = config.buildSessionFactory();

        //CREAMOS UN OBJETO
        //Direccion direccion = new Direccion(10, "Calle Reina", 5, "Xàtiva", "Valencia");
        Seguro seguro = new Seguro(311, "12345678Z", "Juan", "Cano", "Morales", 38, 3, Calendar.getInstance().getTime());
        AsistenciaMedica asistencia1=new AsistenciaMedica(311, "Valencia", "Ir al médico de cabecera por fiebre", "seguro");
        AsistenciaMedica asistencia2=new AsistenciaMedica(312, "Castellón", "Operación por apendicitis", "seguro");
        
        
        Set<AsistenciaMedica> asistenciaMedica = new HashSet<>();
        asistenciaMedica.add(asistencia1);
        asistenciaMedica.add(asistencia2);

        seguro.setAsistenciaMedica(asistenciaMedica);
        //seguro.setDireccion(direccion);

        //CREAR UNA SESION
        Session session = sessionfactory.openSession();
        session.beginTransaction();

        //GUARDAR OBJETO
        session.save(seguro);

        //ACTUALIZAR
        seguro = new Seguro(51, "11111M", "Antonia", "García", "Pérez", 50, 6, Calendar.getInstance().getTime());
        //session.update(seguro);

        //BORRAR
        //session.delete(seguro);
        //LEER
        Seguro s = (Seguro) session.get(Seguro.class, 50);
        System.out.println(s);

        //CERRAR CONEXIÓN
        session.getTransaction().commit();
        session.close();
        sessionfactory.close();
    }

}
