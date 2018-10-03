# Resumen primer parcial Algoritmos y Programación I
## Teoria
### Definiciones
*Hardware*: Hardware es el soporte físico para operar programas, las computadoras y dispositivos.

*Software:* Los programas y todo lo relacionado se le llama a software, es lo que convierte a una maquina con un propósito general, en una maquina especializada. Necesitan un soporte físico para ser ejecutados y son algo inmaterial.

*Algoritmo:* Construir soluciones complejas (y simples) requiere componer múltiples soluciones en una solución mayor. Existen múltiples formas de composición, la más simple es la secuencia de pasos para resolver un problema.

*Lenguaje de Programación:* Es la herramienta para describir las soluciones que desarrollamos. Determina la sintaxis (forma) y semántica (significado) de las sentencias que podemos usar para construir una solución

*Clase*: A la clase la pueden ver como si fuera un témplate o plantilla. Puede tener ciertos atributos y cuando la instanciemos mediante su constructor vamos a tener a distintos objetos que pertenecen a esa clase.

*Encapsulamiento:* Guardar el comportamiento que veíamos que tenían objetos o instancias dentro de sí mismos y solo exponer los métodos que sean relevantes para otros objetos.

*Modularidad:* Separar complejidad dentro de la solución que queremos resolver en ciertas partes que sean de fácil compresión y de fácil manejo. Esos partes son módulos y cada uno de esos tengan cohesión y funcionen independiente y que tengamos bajo acoplamiento. Acoplamiento es la dependencia entre los módulos, mayor dependencia, mucho más complejo es el código.

*Contrato:* Definimos ciertos métodos que deben tener expuesto en una interfaz y mostramos ciertos métodos que lo compone pre y post condiciones. 
+ Precondiciones: Lo que debo de cumplir antes de invocarlo
+ Postcondiciones: Lo que se cumple luego de ejecutarlo.

## Logica

___Conjución___(AND o (y)): En java se marca con los símbolos ```&&```. Para que la condición sea verdadera todas sus partes deben ser verdaderas. 
¿Cuándo es el cortocircuito? Cuando una es falsa, si una es falsa no hay que seguir analizando el resto de condiciones ya que el resultado va a ser falso.

___Disyunción___(AND o (y)): En java se marca con los símbolos ```||```. Para que la condición sea verdadera, una de las condiciones mínimamente tiene que serlo.
El cortocircuito aparece cuando una es verdadera, si la otra es falsa o verdadera no altera el resultado final, por eso se deja de analizar. 

___Negación___ (NOT) o (no): En java es con el símbolo ```!``` Cambia el resultado de la condición. Ejemplo: ```!false``` => ```true```.

Para realizar los ejercicios separar por términos guiándonos por los paréntesis y analizar cada uno de los términos. 


