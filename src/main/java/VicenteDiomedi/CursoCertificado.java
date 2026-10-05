package VicenteDiomedi;

public class CursoCertificado extends Curso implements ConDiploma {
    protected String entidadCertificadora;
    protected boolean evaluacionAlDia;
    protected boolean diplomaEmitido;

    public CursoCertificado(String codigoCurso, int duracion, int cupoMaximo,String entidadCertificadora,  boolean evaluacionAlDia, boolean diplomaEmitido) {
        super(codigoCurso, duracion, cupoMaximo);
        this.entidadCertificadora = entidadCertificadora;
        this.evaluacionAlDia = evaluacionAlDia;
    }
    public String getEntidadCertificadora() {
        return entidadCertificadora;
    }
    public void setEntidadCertificadora(String entidadCertificadora) {
        this.entidadCertificadora = entidadCertificadora;
    }
    public boolean isEvaluacionAlDia() {
        return evaluacionAlDia;
    }
    public void setEvaluacionAlDia(boolean evaluacionAlDia) {
        this.evaluacionAlDia = evaluacionAlDia;
    }
    public boolean isDiplomaEmitido() {
        return diplomaEmitido;
    }
    public void setDiplomaEmitido(boolean diplomaEmitido) {
        this.diplomaEmitido = diplomaEmitido;
    }
    @Override
    public double calcularCoste(){
        int costeBase = 85000;
        if(!this.evaluacionAlDia){
            return (costeBase + (costeBase * 0.2));
        }
        return costeBase;}
    @Override
    public void EmitirDiploma(){
        this.diplomaEmitido = true;
    }
    @Override
    public boolean estaEmitido(){
        return this.diplomaEmitido;
    }
    @Override
    public String detalleCurso(){
        String detalleCurso = "Tipo: Curso Certificado";
        detalleCurso += super.detalleCurso();
        detalleCurso += "| Entidad Certificadora: " + this.entidadCertificadora ;
        if(this.evaluacionAlDia){
            detalleCurso += "| Evaluacion Al Dia: No";
            if(this.diplomaEmitido){
                detalleCurso += "| Diploma Emitido: Si" + "| Coste: " + calcularCoste();
            }else{
                detalleCurso += "| Diploma Emitido: No" + "| Coste: " + calcularCoste();
            }
            return detalleCurso;
        } else {
            detalleCurso += "| Evaluacion Al Dia: Si";
            if(this.diplomaEmitido){
                detalleCurso += "| Diploma Emitido: Si" + "| Coste: " + calcularCoste();
            }else{
                detalleCurso += "| Diploma Emitido: No" + "| Coste: " + calcularCoste();
            }
            return detalleCurso;
        }

    }
}
