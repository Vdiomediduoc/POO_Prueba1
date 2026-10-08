package VicenteDiomedi;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GestorCapacitacion gestor = new GestorCapacitacion();
        Curso certificado1 = null;
        Curso certificado2 = null;
        Curso libre1 = null;
        Curso libre2 = null;
        try{
            certificado1 = new CursoCertificado("CUR-C01", 40,25, "SENCE", false, true);
            gestor.registrarCurso(certificado1);}
        catch (IllegalArgumentException a){System.out.println(a.getMessage());}
        try {
            certificado2 = new CursoCertificado("CUR-C02", 60, 20, "ChileValora", false, true);
            gestor.registrarCurso(certificado2);
        }catch (IllegalArgumentException a){System.out.println(a.getMessage());}
        try {
            libre1 = new CursoLibre("CUR-L01", 20,30, 25);
            gestor.registrarCurso(libre1); }
        catch (IllegalArgumentException a){System.out.println(a.getMessage());}
        try{
        libre2 = new CursoLibre("CUR-L02", 16 ,15, 10);
        gestor.registrarCurso(libre2);}
        catch (IllegalArgumentException a){System.out.println(a.getMessage());}

        System.out.println("========= BUSQUEDA CODIGO CUR-C01 ========");
        for (Curso impreso: gestor.buscarPorCodigo("CUR-C01")){
            System.out.println(impreso.detalleCurso());
        }

        System.out.println("========= Listado de Cursos ========");
        for (Curso listado: gestor.getCursos())
        {System.out.println(listado.toString());}
    }
}