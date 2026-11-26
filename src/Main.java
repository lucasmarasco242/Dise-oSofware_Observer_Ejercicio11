public class Main {
    public static void main(String[] args) {
        Boton botonGuardar = new Boton("Guardar");

        ObservadorClic ventanaPrincipal = new ManejadorVentana("Ventana principal");
        ObservadorClic estadoBarra = new ManejadorVentana("Barra de estado");

        botonGuardar.suscribir(ventanaPrincipal);
        botonGuardar.suscribir(estadoBarra);

        botonGuardar.hacerClic();
        botonGuardar.desuscribir(estadoBarra);
        botonGuardar.hacerClic();
    }
}