package utp.misiontic2022.c2.p23.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p23.reto4.controlador.ControladorRequerimientos;
import Model.vo.Requerimiento_1;
import Model.vo.Requerimiento_2;
import Model.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {

        System.out.println("----------Listado de Proyectos de la ciudad de Pereira----------");
        try {
            // Su código

            // Encabezado del resultado
            System.out
                    .println("Constructora Ciudad Banco_Vinculado Porcentaje_Cuota_Inicial Clasificacion Fecha_Inicio");

            // Cada VO cargado, mostrarlo en la vista
            ArrayList<Requerimiento_1> lista = controlador.consultarRequerimiento1();

            lista.forEach(item -> {
                System.out.println(item.getConstructora() + " " + item.getCiudad() + " " + item.getBanco() + " "
                        + String.format("%.6f", item.getPorcentaje()).replace(",", ".")  + " " + item.getClasificacion() + " " + item.getFecha());
            });

        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void requerimiento2() {
        try {
            // Su código

            System.out.println("----------Listado de compras----------");
            // Encabezado del resultado
            System.out.println("Proveedor Constructora Pagado");

            // Cada VO cargado, mostrarlo en la vista
            ArrayList<Requerimiento_2> lista = controlador.consultarRequerimiento2();

            lista.forEach(item -> {
                System.out.println(item.getProveedor() + " " + item.getConstructora() + " " + item.getPagado());
            });
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void requerimiento3() {
        try {
            // Su código

            System.out.println("----------Cargo y el máximo de los salarios----------");
            // Encabezado del resultado
            System.out.println("Cargo MAX(l.Salario)");

            // Cada VO cargado, mostrarlo en la vista
            ArrayList<Requerimiento_3> lista = controlador.consultarRequerimiento3();

            lista.forEach(item -> {
                System.out.println(item.getCargo() + " " + item.getMaxSalario());
            });
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error! " + e.getMessage());
        }
    }

}
