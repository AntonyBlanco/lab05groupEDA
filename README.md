# lab04groupEDA
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>
<div align="center">
    <span style="font-weight:bold;"><h2>INFORME DE LABORATORIO 5</h2></span>
</div>


<table>
<theader>
    <tr><th colspan="6" style="width:50%; height:auto; text-align:center">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
    <tr>
        <td>ASIGNATURA:</td><td colspan="5">Estructuras de Datos y Algoritmos</td>
    </tr>
    <tr>
        <td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Árboles</td>
    </tr>
    <tr>
        <td>NÚMERO DE PRÁCTICA:</td><td>05</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
    </tr>
    <tr>
        <td colspan="2">FECHA DE PRESENTACIÓN:</td><td>29-Jun-2022</td><td colspan="2">HORA DE PRESENTACIÓN:</td><td>11:55</td>
    </tr>
    <tr>
        <td colspan="3">INTEGRANTES:
        <ol>
        <li>Blanco Trujillo, Antony Jacob</li>
        <li>Checalla Soto, Edisson Franklin</li>
        <li>Vilca Suelo, Gionvanni Gabriel</li>
        </ol>
        </td>
        <td colspan="2"> NOTA:</td>
        <td>     </td>
    </tr>
    <tr>
        <td colspan="6">DOCENTE:<br>
        Mg. Richart Smith Escobedo Quispe
        </td>
    </tr>
</table>

#
<div align="center">
    <span style="font-weight:bold;"><h2>I. SOLUCIÓN Y RESULTADOS </h2></span>
</div>

#
## SOLUCIÓN DE EJERCICIOS/PROBLEMAS

#
## Ejercicio 1: Corchetes Equilibrados

- ¿Como puedo compilar este ejercicio correctamente en mi pc?

Despúes de clonar este repositorio, para poder ejecutar este ejercicio (Ejericio01) sin dificultad es recomendable que se ejecute desde el IDE eclipse, pues su desarrollo se dio en este,y por ello mismo es que se subieron tambien los archivos necesarios para ejecutarse ahí. Sin embargo, al tener implementado todo el código en una sola clase de JAVA, puede ejecutarse con normalidad desde la consola.

</div>

- Enlace a código en GitHub (solo código): [Ver Código](https://github.com/AntonyBlanco/lab05groupEDA/blob/main/Ejercicio01/CorchetesEquilibrados.java)

- Planificamos La Resolución:

En sesiones anteriores habíamos hablado de las posibilidades del uso de pilas y colas para la solución de implementaciones que requiriesen almacenar informacón para luego retrotraer estas, por ejemplo, en la implementación de el conocido comando "CTRL+Z". Pues bien, ahora, para solucionar los requerimientos del primer Problema  de los ejercicios propuestos en: [Repositorio con Ejercicios propuestos](https://github.com/rescobedoq/eda/tree/main/labs/lab05) vamos a hacer uso de estas estructuras de datos para poder equilibrar los corchetes.

La idea es que tengamos una Pila y Una Cola. Una pila para almacenar las llaves de apertura y una cola para almacenar las llaves de cierre. 

Por Ejemplo: Almacenaremos las llaves de esta cadena segun corresponda.

-   La cadena de llaves:

<div align="center">

![Ejecucion](Imagenes%20Para%20Informe/Ejercicio01/img%20(8).png)
</div>

-   Almacenariamos las llaves de apertura en una Pila y las llaves de cierre en una cola.
<div align="center">

![Ejecucion](Imagenes%20Para%20Informe/Ejercicio01/img%20(10).png)
</div>

-   Para poder implementarlo vamos a asignarle un valor númerico para poder representar a cada tipo de llave, así tenemos:

<div align="center">

![Ejecucion](Imagenes%20Para%20Informe/Ejercicio01/img%20(7).png)
</div>

-Ahora, Lo que en realidad vamos a almacenar en la pila y cola, seran sus representaciones numericas, y ahora tendríamos:

<div align="center">

![Ejecucion](Imagenes%20Para%20Informe/Ejercicio01/img%20(6).png)
</div>

-Lo que hicimos es para poder aprovechar la forma en que se extrae un elemento de una pila (el último en entrar) y una cola (el primero en entrar). Así podemoso restar los valores númericos correspondientes e ir eliminando elementos de manera iterativa y cuando haya una correcto equilibrio las pila y cola deberá quedar vacia vacía.

<div align="center">

![Ejecucion](Imagenes%20Para%20Informe/Ejercicio01/img%20(11).png)
</div>

-   Iniciamos La Implememntación:

Ahora que tenemos la idea más clara de como implementaremos los requerimeintos vamos a ir con ello:


-   Parte 1

Primero, vamos a implmentar una funcion que permita Llenar asignar los valores númericos que habiamos propuesto a acada llave. Entonces tenemos:


```sh 
	public static int relacionarLLaves(char c) {
		int valor=0;
		char [] corchetes = {'{','}','[',']','(',')'};
		int  [] valorNum = {1,-1,2,-2,3,-3};
		for (int i = 0; i < corchetes.length; i++) {
			if (c==corchetes[i]) {
			valor= valorNum[i];
			}
		}
		return valor;
	}
```
En esta sección no hay mayor secreto. Hacemos uso de un arreglo para poder asignar a un caracter que se ingrese un valor númerico. 

-   Parte 2

Ya que tenemos lista la función de asignación, ahora vamos a crear una función "LlenarColaYPila" la que permitirá agregar los valores númericos de las llaves de apertura en una pila y los valores númericos de las llaves de cierre en una cola. Así tenemos:

```sh 
	public static void llenarColaYPila(String cadena) {
		for (int i = 0; i < cadena.length(); i++) {
			if ((i<cadena.length()/2)) {
				pila.push(relacionarLLaves(cadena.charAt(i)));
			}else {
				cola.offer(relacionarLLaves(cadena.charAt(i)));
			}
		}
	}
```
Vemos que para lograr una asignación. dividimos en dos el tamaño de la cadena, esto para forzar a que la primera mitad de los caracteres(valores númericos) se vayan a alamcenar en la pila, y la siguiente tanda en de caracteres (valores numericos) en la cola.

-   Parte 3

Teeniendo ya estas dos funciones es que podemos implementar la función principal "isBalanced" con esta podemos saber si una cadena de llaves esta correctamente balanceada. Esta consistira en  

-ejemplo de codigo 

```sh 
	public static String isBalanced(String s) {
		//asignaremos valores numericos a cada llave/corchete
		if (s.length()%2==0) {
			llenarColaYPila(s);
			while (pila.empty()==false && cola.isEmpty()==false) {
				if ((pila.peek() + cola.peek()==0)&& pila.peek()>=1) {
				pila.pop();
				cola.poll();
				}else {
					return "NO";
				}
			}
			return "SI";
		}else {
			return "NO";
		}
	}
```
Haremos uso de un IF principal que determinará en primera instancia que una cadena de llaves esta balanceada, bajo un primer criterio de que para que pueda estar balanceado el numero de caracteres en total deberia de ser un numdeterminar si esta balnceado, tendremos que ampliar los criterios, por ello haremos uso de un bucle para poder comparar los valores númericos de la pila y cola y restarlos si es correspondiente (cuando su resta es cero) y así ir reduciendo los elementos de la pila y cola, hasta quedar vacio. lo que indicaría que esta balanceado, y en caso de una resta diferente a cero, es que no se saldrá anticipadamente del bucle para determinar que no esta balanceado correctamente.


-   Ejecución: Imagenes de la ejecución Corchetes equilibrados con distintas salidas

Ejemplo 1:

<div align="center">

![Ejecucion](Imagenes%20Para%20Informe/Ejercicio01/img%20(9).png)
</div>

Ejemplo 2:
<div align="center">

![Ejecucion](Imagenes%20Para%20Informe/Ejercicio01/imgresultados%20(1).png)
</div>

Ejemplo 3:
<div align="center">

![Ejecucion](Imagenes%20Para%20Informe/Ejercicio01/imgresultados%20(2).png)
</div>

Ejemplo 4:
<div align="center">

![Ejecucion](Imagenes%20Para%20Informe/Ejercicio01/imgresultados%20(3).png)
</div>

Ejemplo 5:
<div align="center">

![Ejecucion](Imagenes%20Para%20Informe/Ejercicio01/imgresultados%20(4).png)
</div>

#
## Ejercicio 2: Operaciones de Árbol AVL

-   ¿Como puedo compilar este ejercicio correctamente en mi pc?

Despúes de clonar este repositorio, para poder ejecutar este ejercicio en particular es recomendable que se ejecute desde el IDE eclipse, pues su desarrollo se dio en este,y por ello mismo es que se subieron tambien los archivos necesarios para ejecutarse ahí. Como tarea adicional debemos de agregar el archivo "JavaPlot" que se encuentra en el siguiente enlace [JavaPlot.jar](https://github.com/AntonyBlanco/lab04groupEDA/tree/echecalla/JavaPlot/JavaPlot-0.5.0/dist)

-   Enlace a código en GitHub de archivos principales (ListaDobleEnlazada.jar, Node, Test) para ejecutar la solución.[Ver clases Principlaes](https://github.com/AntonyBlanco/lab04groupEDA/tree/echecalla/Ejercicio2/src/LinkedListSort)

-   Iniciamos La Resolución...

Bien, se nos plantea implementar una lista enlazada Doble (génerica), por ello es que vamos a crear 3 clases: [ListaDobleEnlazada](https://github.com/AntonyBlanco/lab04groupEDA/blob/echecalla/Ejercicio2/src/LinkedListSort/ListaDobleEnlazada.java), [Node](https://github.com/AntonyBlanco/lab04groupEDA/blob/echecalla/Ejercicio2/src/LinkedListSort/Node.java), y [Test](https://github.com/AntonyBlanco/lab04groupEDA/blob/echecalla/Ejercicio2/src/LinkedListSort/Test.java). 

-   Parte 1

La Clase Node solo tiene una variante significativa en cuanto a la implememntación de un nodo de una lista enlazada simple, y es que esta tienen los nodos con referencia a un nodo anterior, y tambien una referencia a un nodo posterior.

```sh 
    private Node <T> nextNode ;
    private Node <T > previousNode ;

    //getters and setters
```
-   Parte 2



Ejemplo de codigo
```sh
    public class Node<E>{
        private E data;
        private Node<E> next;

        public Node(E data,Node<E> next) {
                this.data=data;
                this.next=next;
        }
        public Node(E data) {
                this(data,null);
        }
        public E getData() {
                return this.data;
        }
        public void setData(E data) {
                this.data=data;
        }
        public Node<E> getNext() {
                return this.next;
        }
        public void setNext(Node<E> next) {
                this.next=next;
        }
        public String toString() {
                return this.data.toString();
        }

```

#
## Ejercicio 3: Árbol AVL

Se realizó la implementación de inserción de un árbol AVL basado en la implementación de un Arbol Binario de Busqueda.

Se diseñaron pruebas para diferentes casos como la aplicacion de rotaciones cuando el factor de equilibrio supera los límites definidos por la definición de un arbol AVL.

El código se puede revisar en el siguiente link: [Arbol AVL](https://github.com/AntonyBlanco/lab04groupEDA/blob/echecalla/Ejercicio3) ubicado en el directorio "Ejercicio03" del repositorio actual.

#
<div align="center">
    <span style="font-weight:bold;"><h2>II. SOLUCIÓN DEL CUESTIONARIO </h2></span>
</div>

#

- ¿Cómo se ejecutaría sus implementaciones desde terminal(consola)?

    En general una lista enlazada requiere de una estructura de datos compleja, al contrario de las pilas que pueden operar con elementos simples o complejos. la forma en la que se agregan elemntos no difieren mucho en su implementación, sin embargo para la eliminación es donde tienen más diferencias, y esto basicamente es por donde las pilas pueden ejecutarse para tareas muy especificas que de hacerse con las listas enlazadas requewririan de más costo de memoria. 

- ¿Cómo lo haría desde la terminal?


Compilamos el archivo asi:

```sh
   javac -cp PATH_TO_JAVAPLOT/dist/JavaPlot.jar test.java
```



and corremos esto:

```sh
java -cp PATH_TO_JAVAPLOT/dist/JavaPlot.jar:. test
```

#
<div align="center">
    <span style="font-weight:bold;"><h2>III. CONCLUSIONES </h2></span>
</div>

#

-   Las colas y pilas se van a utilizar como una solución precisa para diversos problemas de administración de la información así como la ordenada ejecución de procesos


#
<div align="center">
    <span style="font-weight:bold;"><h2>RETROALIMENTACIÓN </h2></span>
</div>

#

-   

#
<div align="center">
    <span style="font-weight:bold;"><h2>REFERENCIAS Y BIBLIOGRAFÍA </h2></span>
</div>

#

-   https://www.w3schools.com/java/
-   https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developers
-   https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
-   https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html

    
