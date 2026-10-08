package VicenteDiomedi;

public class CursoLibre extends Curso{
    protected int cantidadIncritos;
    public CursoLibre(String codigoCurso, int duracion, int cupoMaximo, int cantidadIncritos) {
        super(codigoCurso, duracion, cupoMaximo);
        this.cantidadIncritos = cantidadIncritos;
    }
    public int getCantidadIncritos() {
        return cantidadIncritos;
    }
    public void setCantidadIncritos(int cantidadIncritos) {
        this.cantidadIncritos = cantidadIncritos;
    }
    @Override
    public double calcularCoste(){
        double costeBase = 45000.0;
        if(this.cantidadIncritos > 20){
            return (costeBase + (costeBase * 0.1));
        }
        return costeBase;
    };
    @Override
    public String detalleCurso(){
        String detalleCurso = "Tipo: Curso Libre";
        detalleCurso += " | " + super.detalleCurso();
        detalleCurso += " | Costo Curso: " + calcularCoste();
        return detalleCurso;

    }
}
