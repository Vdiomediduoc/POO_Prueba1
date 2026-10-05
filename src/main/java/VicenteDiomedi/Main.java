package VicenteDiomedi;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CursoCertificado certificado1 = new CursoCertificado("CUR-C01", 40, 25, "SENCE", false, true);
        CursoCertificado certificado2 = new CursoCertificado("CUR-C02", 60, 20, "ChileValora", false, true);
        CursoLibre libre1 = new CursoLibre("CUR-L01", 20,30, 25);
        CursoLibre libre2 = new CursoLibre("CUR-L02", 16 ,15, 10);

        GestorCapacitacion gestor = new GestorCapacitacion();
        gestor.RegistrarCurso(certificado1);
        gestor.RegistrarCurso(certificado2);
        gestor.RegistrarCurso(libre1);
        gestor.RegistrarCurso(libre2);

        System.out.println("========= BUSQUEDA CODIGO CUR-C01 ========");
        for (Curso impreso: gestor.buscarPorCodigo("CUR-C01")){
            System.out.println(impreso.detalleCurso());
        }

        System.out.println("========= Listado de Cursos ========");
        for (Curso listado: gestor.getCursos())
        {System.out.println(listado.toString());}
    }
}