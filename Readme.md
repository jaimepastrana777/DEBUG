# Resolución de katas en Java
Este repositorio contiene la solución a dos Katas (FizzBuzz y Tamagotchi) y evidencia del uso de herramientas de depuración en VS Code.

## Estructura del proyecto
* `FizzBuzz.java`: Algoritmo clásico de FizzBuzz.
* `Tamagotchi.java`: Clase de la mascota virtual.
* `MainTamagotchi.java`: Clase ejecutable para probar la mascota.

## 1. Kata FizzBuzz
El programa imprime números del 1 al 100 siguiendo las reglas de sustitución por "Fizz", "Buzz" o "FizzBuzz".

### Código
<img width="844" height="513" alt="image" src="https://github.com/user-attachments/assets/79823581-a3b7-4886-baf3-2e854a18db77"/>

## Capturas de pantalla
---
Esta captura muestra la ejecución del kata FizzBuzz en modo depuración en VS Code. Se observa un breakpoint activo en una condición if, deteniendo la ejecución en una iteración del bucle for. En el panel de Variables se pueden ver los valores actuales de las variables i y 

<img width="1421" height="987" alt="Captura de pantalla 2026-01-21 135140" src="https://github.com/user-attachments/assets/015f1b20-fec9-4398-a6d0-f22f7645accc" />


---
## 2. Kata Tamagotchi 
Implementación simplificada de un Tamagotchi con atributos de hambre, juego y diversión.

<img width="946" height="834" alt="image" src="https://github.com/user-attachments/assets/0ce54297-c4cf-467e-8280-e7d6be169b7a" />

### Capturas de pantalla 

Captura del proceso de depuración durante la ejecución del kata Tamagotchi. Aquí se detiene la ejecución justo después de instanciar un objeto Tamagotchi y antes de modificar sus atributos. El breakpoint en el método alimentar() permite observar el estado de los atributos hambre, diversion y otros, para verificar que el cambio de estado se realiza correctamente.
<img width="1330" height="986" alt="Captura de pantalla 2026-01-21 141525" src="https://github.com/user-attachments/assets/3dd3627f-3132-4f65-92ad-403a7f70f5b3" />
