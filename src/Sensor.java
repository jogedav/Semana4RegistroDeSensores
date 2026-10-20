public class Sensor {
    private int id;
    private String tipo;
    private String unidad;
    private double lectura;
    private static int cantidadSensores = 0;

    public Sensor(String tipo, String unidad) {
        cantidadSensores++;
        id = cantidadSensores;
        this.tipo = tipo;
        this.unidad = unidad;
        lectura = 0;
    }
}
