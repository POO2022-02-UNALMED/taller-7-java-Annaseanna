public class Fabula extends Escrito{
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen,String titulo,String autor,int paginas,String ensenanza,String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanza=ensenanza;
        this.interpretacion=interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    @Override
    int palabrasTotales(int palabrasPagina) {
        return super.getPaginas() * palabrasPagina * 1;
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
        System.out.println(this.ensenanza);
        return null;
    }
}
