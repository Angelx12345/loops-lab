# Laboratorio: estructuras de repetición y salto

En este laboratorio completas trece métodos que repiten instrucciones con `while`, `do-while`,
`for`, `break` y `continue`. Cada método recibe datos y devuelve el resultado con `return`.

## Objetivos

- Elegir el ciclo adecuado según se conozca o no el número de vueltas.
- Aplicar los patrones de acumular, contar, buscar y recorrer dígitos.
- Construir textos dentro de un ciclo y usar ciclos anidados.
- Cuidar los casos extremos: 0, 1, negativos.

## Qué contiene el proyecto

```text
loops-lab/
├── README.md     este enunciado
├── pom.xml       configuración de Maven
└── src/
    ├── main/java/programming/loops/Loops.java      los métodos que completas
    ├── main/java/programming/loops/LoopsApp.java   programa con un menú que se repite (ya está hecho)
    └── test/java/programming/loops/LoopsTest.java  pruebas visibles
```

Solo modificas `Loops.java`. No cambies las pruebas ni los nombres, los parámetros o el tipo de
retorno de los métodos: el docente califica con estas pruebas y con otras adicionales.

## Cómo trabajar

1. Abre el proyecto desde el `pom.xml` y ejecuta las pruebas: al inicio fallan todas.
2. Para cada método, haz primero la **prueba de escritorio** de un ejemplo pequeño en papel.
3. Escribe el ciclo con sus tres partes claras: inicialización, condición y actualización.
4. Ejecuta las pruebas; si un ciclo no termina, detén la ejecución (botón Stop o Ctrl+C) y revisa
   la actualización.
5. Al final, ejecuta `LoopsApp` y prueba las opciones del menú.

## Los métodos

### Parte A ★

| Método | Devuelve | Ejemplo |
|---|---|---|
| `sumTo(limit)` | 1 + 2 + … + limit (0 si limit ≤ 0) | 10 → 55 |
| `factorial(number)` | number! como `long` (0! = 1) | 5 → 120 |
| `countDigits(number)` | cantidad de dígitos (el 0 tiene uno; sin el signo) | -450 → 3 |
| `countdown(start)` | `"3 2 1 ¡Despegue!"` | 0 → `"¡Despegue!"` |

### Parte B ★★

| Método | Devuelve | Ejemplo |
|---|---|---|
| `digitSum(number)` | suma de los dígitos (sin el signo) | 4721 → 14 |
| `reverse(number)` | los dígitos al revés (number ≥ 0) | 120 → 21 |
| `isPrime(number)` | `true` si es primo | 17 → `true`, 1 → `false` |
| `gcd(first, second)` | máximo común divisor (Euclides) | 48, 18 → 6 |
| `multiplicationTable(number)` | `TABLE_LIMIT` (10) líneas `"7 x 1 = 7"`, cada una con `"\n"` | |

### Parte C ★★★

| Método | Devuelve | Ejemplo |
|---|---|---|
| `isPerfect(number)` | `true` si es igual a la suma de sus divisores menores | 28 → `true` |
| `toBinary(number)` | el número en binario como texto | 13 → `"1101"`, 0 → `"0"` |
| `collatzSteps(number)` | pasos de Collatz hasta llegar a 1 | 6 → 8 |
| `triangle(rows)` | triángulo de asteriscos, filas con `"\n"` | 3 → `"*\n**\n***\n"` |

## Pistas

- Usa las constantes que ya están al inicio de `Loops.java` (`DECIMAL_BASE`, `BINARY_BASE`,
  `SMALLEST_PRIME`, `TABLE_LIMIT`) en lugar de escribir los números sueltos.
- Para recorrer los dígitos, trabaja sobre una copia del parámetro: `int remaining = number;`.
- Un texto se construye en un ciclo como un acumulador: `countdownText = countdownText + i + " ";`.
- `countDigits`: con un `while (remaining > 0)`, el 0 da cero vueltas; ¿qué ciclo se ejecuta al menos una vez?
- `isPrime`: basta buscar divisores mientras `divisor * divisor <= number`; en cuanto hay uno, ya no es primo.
- `toBinary`: cada residuo de dividir entre 2 va **a la izquierda** del texto: `binary = remaining % BINARY_BASE + binary;`.
- `collatzSteps`: no se sabe cuántas vueltas habrá: el ciclo sigue mientras el valor actual no sea 1.

## Entrega

Entrega el archivo `Loops.java` (o el proyecto completo, sin la carpeta `target/`) según indique
tu docente. Antes de entregar, comprueba que el proyecto compila y ejecuta `mvn test`.
