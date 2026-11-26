public class Boton {
    private String etiqueta;
    private ObservadorClic[] observadores = new ObservadorClic[10];
    private int cantidad = 0;

    public Boton(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void suscribir(ObservadorClic observador) {
        if (observador == null || cantidad >= observadores.length) {
            return;
        }
        for (int i = 0; i < cantidad; i++) {
            if (observadores[i] == observador) {
                return;
            }
        }
        observadores[cantidad] = observador;
        cantidad++;
    }

    public void desuscribir(ObservadorClic observador) {
        for (int i = 0; i < cantidad; i++) {
            if (observadores[i] == observador) {
                for (int j = i; j < cantidad - 1; j++) {
                    observadores[j] = observadores[j + 1];
                }
                observadores[cantidad - 1] = null;
                cantidad--;
                return;
            }
        }
    }

    public void hacerClic() {
        notificar();
    }

    private void notificar() {
        for (int i = 0; i < cantidad; i++) {
            observadores[i].alHacerClic(etiqueta);
        }
    }
}