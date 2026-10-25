public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor("Temperatura", "°C");

        System.out.println("ID: " + sensor.getId());
        System.out.println("Tipo: " + sensor.getTipo());
        System.out.println("Unidad: " + sensor.getUnidad());
        System.out.println("Lectura inicial: " + sensor.getLectura());

        sensor.setLectura(24.5);
        System.out.println("Lectura actualizada: " + sensor.getLectura() + " " + sensor.getUnidad());

        System.out.println("Total sensores: " + Sensor.getCantidadSensores());
    }
}
