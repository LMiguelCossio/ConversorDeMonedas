<h1 align="center">Conversor de Monedas</h1>


Descripción

Este proyecto es un conversor de monedas desarrollado en Java para el challege conversor de monedas de Alura. Utiliza la API de ExchangeRate para obtener las tasas de conversión actuales entre diferentes monedas y permite a los usuarios convertir cantidades entre ellas.

Funcionamiento

El programa ofrece un menu interactivo que permite a los usuarios seleccionar la conversión de moneda deseada. Una vez seleccionada la opción, el programa solicita la cantidad a convertir y muestra el resultado basado en la tasa de conversión actual.

Flujo del Programa
<dl>
  <dt>Inicio del Programa</dt>
  <dd>El programa se inicia y muestra un menu con diferentes opciones de conversión de monedas.</dd>
  <dt>Selección de Opción</dt>
  <dd>El usuario selecciona una opción del menu para convertir entre dos monedas específicas o ingresar los códigos de las monedas manualmente.</dd>
  <dt>Entrada del Usuario</dt>
  <dd>El programa solicita al usuario que ingrese la cantidad de la moneda base que desea convertir.</dd>
  <dt>Llamada a la API</dt>
  <dd>El programa utiliza la clase <code>ConsultarMoneda</code> para realizar una solicitud a la API de ExchangeRate y obtener la tasa de conversión actual entre las dos monedas seleccionadas.</dd>
  <dt>Cálculo y Resultado</dt>
  <dd>El programa calcula el monto resultante basado en la tasa de conversión y la cantidad ingresada por el usuario.<br>
  Muestra el resultado al usuario.</dd>
  <dt>Repetición o Finalización</dt>
  <dd>El usuario puede optar por realizar otra conversión o finalizar el programa.</dd>
</dl>
Estructura del Código
<ul>
  <li><code>Principal.java</code>: Contiene el <code>main</code> y gestiona la interacción del usuario con el menu.</li>
  <li><code>ConsultarMoneda.java</code>: Realiza solicitudes HTTP a la API de ExchangeRate y convierte las respuestas JSON.</li>
  <li><code>ConvertirMoneda.java</code>: Contiene métodos para manejar las conversiones de moneda basadas en la entrada del usuario y las tasas de conversion obtenidas.</li>
  <li><code>Monedas.java</code>: Define la estructura de los datos de las monedas, que incluye los codigos de las monedas base y objetivo, y la tasa de conversión.</li>
</ul>
