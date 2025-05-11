# FizzBuzz en Kotlin

## Descripción
Este proyecto implementa la solución al clásico problema de programación "FizzBuzz" utilizando Kotlin. FizzBuzz es un ejercicio común de programación que ayuda a practicar estructuras condicionales y manejo de divisibilidad.

## Problema FizzBuzz
El problema FizzBuzz consiste en:
- Imprimir los números del 0 al 100
- Si el número es divisible por 3, imprimir "Fizz" en lugar del número
- Si el número es divisible por 5, imprimir "Buzz" en lugar del número
- Si el número es divisible por ambos (3 y 5), imprimir "FizzBuzz" en lugar del número

## Estructura del código
El proyecto consta de tres funciones principales:

1. `entreTres(num: Int)`: Verifica si un número es divisible por 3
2. `entreCinco(num: Int)`: Verifica si un número es divisible por 5
3. `main()`: Función principal que itera del 0 al 100 y aplica la lógica de FizzBuzz

## Cómo ejecutar
Para ejecutar este programa, necesitarás tener instalado el compilador de Kotlin o un IDE que soporte Kotlin (como IntelliJ IDEA).

```bash
# Compilar el archivo
kotlinc FizzBuzz.kt -include-runtime -d FizzBuzz.jar

# Ejecutar el programa
java -jar FizzBuzz.jar
```

## Ejemplo de salida
```
0
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
...
```
