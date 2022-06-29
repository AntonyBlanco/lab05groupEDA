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

-   ¿Como puedo compilar este ejercicio correctamente en mi pc?

Despúes de clonar este repositorio, para poder ejecutar este ejercicio sin dificultad es recomendable que se ejecute desde el IDE eclipse, pues su desarrollo se dio en este,y por ello mismo es que se subieron tambien los archivos necesarios para ejecutarse ahí. Sin embargo, al tener implementado todo el código en una sola clase de JAVA, puede ejecutarse con normalidad desde la consola.

-   Enlace a código en GitHub (solo código): https://github.com/AntonyBlanco/lab03groupEDA/blob/main/Ejercicio1/src/PilasIguales.java


-   Iniciamos La Resolución

-   Parte 1

-   Parte 2


-ejemplo de codigo 

```sh 
	static  Stack<Integer> pila1 = new Stack<Integer>(); //Primera pila de cilindros
	static Stack<Integer> pila2 = new Stack<Integer>(); //Segunda pila de cilindros
	static Stack<Integer> pila3 = new Stack<Integer>(); //Tercera pila de cilindros
```



-   Ejecución: Imagenes de la ejecución Corchetes equilibrados

<div align="center">

![Ejecucion](Imagenes%20Para%20Informe/Ejercicio01/FYVBI3nIML.png)
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

Ejemplo de codigo

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
-   Los conceptos solo teoricos de pilas ayudaron con la posibilidad de resolver la igualación de pilas.

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
   
    
