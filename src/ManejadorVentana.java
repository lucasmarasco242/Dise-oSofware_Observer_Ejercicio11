public class ManejadorVentana implements ObservadorClic {
    private String destino;

    public ManejadorVentana(String destino) {
        this.destino = destino;
    }

    public void alHacerClic(String etiquetaBoton) {
        System.out.println("[" + destino + "] Se hizo clic en el botón: " + etiquetaBoton);
    }
}