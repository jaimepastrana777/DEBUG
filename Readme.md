# Resolución de Katas y Depuración en Java

Este repositorio contiene la solución a dos Katas de programación (FizzBuzz y Tamagotchi) y evidencia del uso de herramientas de depuración en VS Code.

## Estructura del Proyecto
* `FizzBuzz.java`: Algoritmo clásico de FizzBuzz.
* `Tamagotchi.java`: Clase lógica de la mascota virtual.
* `MainTamagotchi.java`: Clase ejecutable para probar la mascota.

## 1. Kata FizzBuzz
El programa imprime números del 1 al 100 siguiendo las reglas de sustitución por "Fizz", "Buzz" o "FizzBuzz".

### Código
![<img width="844" height="513" alt="image" src="https://github.com/user-attachments/assets/79823581-a3b7-4886-baf3-2e854a18db77" />
]

### Depuración
En esta captura se puede observar el valor de la variable `i` durante la iteración 15, donde entra en la condición principal.
![<img width="1919" height="992" alt="image" src="https://github.com/user-attachments/assets/daf508ed-ec3a-4ee6-976c-d2bee9867e90" />
]

---

## 2. Kata Tamagotchi v1.0
Implementación simplificada de un Tamagotchi con atributos de hambre, energía y humor.

### Código
![<img width="946" height="834" alt="image" src="https://github.com/user-attachments/assets/0ce54297-c4cf-467e-8280-e7d6be169b7a" />
]

### Depuración
Aquí se observa el objeto `miMascota` en el panel de variables. Se han desplegado sus atributos para verificar que, tras ejecutar el método `play()`, la energía ha disminuido y el humor ha aumentado.
![Inserta aquí captura del debug Tamagotchi mostrando las variables del objeto]

---

## Conclusiones
La depuración ha permitido verificar paso a paso que la lógica de prioridades en el estado del Tamagotchi funciona correctamente, especialmente en los casos límite donde la energía llega a 0.
