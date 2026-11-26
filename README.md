Ejercicio 11 - Notificador de Clic en Botón de Interfaz

Explicación del programa

En este ejercicio se implementó el patrón de diseño Observer para notificar a oyentes suscritos cuando se hace clic en un botón, sin utilizar librerías externas ni imports.
El programa cuenta con:
- Una interfaz ObservadorClic con el método alHacerClic(String etiquetaBoton).
- Una clase ManejadorVentana que implementa ObservadorClic y responde al evento de clic.
- Una clase Boton que gestiona los observadores suscritos y notifica cuando se simula un clic.

Luego, dentro del método main, se crea un botón, se suscriben dos oyentes, se dispara un clic, se desuscribe uno y se dispara otro clic.

Lógica utilizada

La lógica del programa consiste en:
- Definir una interfaz común ObservadorClic para desacoplar Boton de los manejadores concretos.
- Mantener en Boton la lista de observadores registrados y notificarlos al producirse hacerClic().

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
[Ventana principal] Se hizo clic en el botón: Guardar
[Barra de estado] Se hizo clic en el botón: Guardar
[Ventana principal] Se hizo clic en el botón: Guardar

Captura de pantalla

<img width="554" height="179" alt="image" src="https://github.com/user-attachments/assets/d25e020f-8e5a-4cf1-9f99-e4e37cfac46d" />
