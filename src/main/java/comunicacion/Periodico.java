package comunicacion;

public class Periodico extends Escrito{
    private String fecha;
    private String primicia;
    public String interpretacion;

    public Periodico(String origen,String titulo,String autor,int paginas,String fecha,String primicia,String interpretacion){
        super(origen, titulo, autor, paginas);
        this.fecha=fecha;
        this.primicia=primicia;
        this.interpretacion=interpretacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return super.getPaginas() * palabrasPagina * 10;
    }

    @Override
    String interpretacion() {
        return this.interpretacion;
    }

    @Override
    public String toString() {
        System.out.println(super.getOrigen());
        System.out.println(super.getTitulo());
        System.out.println(super.getAutor());
        Integer.toString(super.getPaginas());
        System.out.println(this.fecha);
        System.out.println(this.primicia);
        return null;
    }
}
