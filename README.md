# Ejercicios-programacion-2-

# Taller de Nivelación de Programación I a Programación II

### Introducción a Markdown

**Respuesta:**

Markdown es un lenguaje de marcado ligero que permite dar formato a un texto utilizando caracteres sencillos. Se utiliza principalmente para crear documentos con títulos, listas, enlaces, tablas, imágenes y bloques de código sin necesidad de utilizar un editor visual.

Markdown es muy utilizado en plataformas como GitHub, especialmente para crear archivos README.md, documentación de proyectos y guías.

## Git 

### 1.¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”? 
Un repositorio en Git es un espacio donde se almacena un proyecto junto con el historial de cambios que se han realizado sobre sus archivos.
La principal diferencia con un proyecto normal es que Git permite controlar las diferentes versiones del proyecto. Esto permite saber qué cambios se realizaron, cuándo se realizaron y recuperar versiones anteriores cuando sea necesario.

### 2.¿Cuáles son las tres áreas principales de Git (working directory, staging area/index y repository) y qué papel cumple cada una? 
Git trabaja principalmente con tres áreas:

1. Working Directory

Es el directorio de trabajo donde se encuentran los archivos del proyecto y donde realizamos modificaciones.

2. Staging Area o Index

Es un área temporal donde colocamos los cambios que queremos incluir en el próximo commit.

Para agregar archivos al staging se utiliza:

git add .
3. Repository

Es el lugar donde Git almacena permanentemente los commits y el historial del proyecto.

Para guardar los cambios del staging en el repositorio se utiliza:

git commit -m "Descripción del cambio"

El proceso básico sería:

Working Directory
       ↓
   git add
       ↓
Staging Area
       ↓
  git commit
       ↓
 Repository

 ###  3.¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag).
 Git representa la información mediante diferentes tipos de objetos:

Blob

Un blob almacena el contenido de un archivo. No almacena directamente el nombre del archivo, sino su contenido.

Tree

Un tree representa la estructura de directorios y relaciona nombres de archivos con objetos blob y otros árboles.

Commit

Un commit representa un punto específico en la historia del proyecto. Guarda información sobre los cambios realizados y referencia el estado del proyecto.

Tag

Un tag es una referencia que permite identificar un commit específico con un nombre. Se utiliza frecuentemente para marcar versiones importantes, por ejemplo:

v1.0
v2.0

Estos objetos permiten que Git pueda almacenar y reconstruir diferentes versiones del proyecto.

### 4.¿Cómo se crea un commit y qué información almacena un objeto commit?
Primero se deben agregar los cambios al área de staging:

git add .

Después se crea el commit:

git commit -m "Agregar nueva funcionalidad"

El objeto commit almacena información como:

El autor.
La persona que realizó el commit.
La fecha.
Un mensaje descriptivo.
Una referencia al árbol que representa el estado del proyecto.
Una referencia al commit anterior o a los commits anteriores.

Por ejemplo:

git commit -m "Corregir calculadora"

El mensaje permite identificar fácilmente qué modificación representa ese commit.

### 5.	¿Cuál es la diferencia entre git pull y git fetch?
La diferencia principal es que ambos permiten obtener información de un repositorio remoto, pero realizan acciones diferentes.

git fetch

Descarga los cambios del repositorio remoto, pero no modifica directamente nuestra rama de trabajo.

git fetch

Esto permite revisar los cambios antes de integrarlos.

git pull

Obtiene los cambios del repositorio remoto y además intenta integrarlos en la rama actual.

git pull

De manera simplificada:

git fetch → Descargar cambios

git pull → Descargar + integrar cambios

### 6.	¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits? 
Un branch o rama es una línea independiente de desarrollo dentro de un repositorio.

Las ramas permiten trabajar en diferentes funcionalidades sin modificar directamente la rama principal.

Por ejemplo:

git branch nueva-funcionalidad

Para cambiar a esa rama:

git switch nueva-funcionalidad

También podemos crear y cambiar de rama en un solo comando:

git switch -c nueva-funcionalidad

Git administra las ramas mediante punteros o referencias a commits. Una rama básicamente apunta al último commit de esa línea de trabajo.

Cuando realizamos un nuevo commit, el puntero de la rama avanza al nuevo commit.

### 7.	¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven? 
Un merge permite combinar los cambios de una rama con otra.

Por ejemplo, si estamos en la rama main y queremos incorporar una rama llamada desarrollo:

git switch main
git merge desarrollo

Git intentará combinar automáticamente los cambios.

Conflictos

Un conflicto puede aparecer cuando dos ramas modifican la misma parte de un archivo de maneras diferentes.

Git marcará el conflicto dentro del archivo, por ejemplo:

Código de la rama actual
Código de la otra rama

Para resolverlo debemos:

Abrir el archivo.
Decidir qué código conservar.
Eliminar las marcas del conflicto.
Guardar el archivo.
Agregarlo al staging.
git add archivo.java

Finalmente se completa el merge:

git commit

### 8.	¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso? 
El área de staging permite seleccionar los cambios que serán incluidos en el próximo commit.

Por ejemplo:

git add Main.java

Esto coloca los cambios de Main.java en staging.

También podemos agregar todos los archivos modificados:

git add .

Después realizamos:

git commit -m "Actualizar proyecto"

Si omitimos git add, los cambios permanecerán en el directorio de trabajo y no serán incluidos en el commit.

Por ejemplo:

Modificar archivo
       ↓
Working Directory
       ↓
git add
       ↓
Staging
       ↓
git commit
       ↓
Repository

### 9.	¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos? 
El archivo .gitignore indica a Git qué archivos o carpetas no deben ser rastreados por el repositorio.

Es útil para evitar subir archivos innecesarios, archivos temporales, configuraciones personales o información que no debería formar parte del proyecto.

Por ejemplo:

*.class
*.log
.env
target/

Esto puede indicar que Git ignore archivos .class, archivos .log, el archivo .env y la carpeta target.

Un ejemplo de .gitignore para un proyecto Java podría ser:

*.class
out/
target/

Es importante utilizar .gitignore porque ayuda a mantener el repositorio organizado.

### 10.	¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit? 
El comando:

git commit --amend

permite modificar el commit más reciente.

Por ejemplo, podemos utilizarlo para corregir el mensaje del último commit o agregar un archivo que olvidamos incluir.

git add archivo.java
git commit --amend

En cambio, un nuevo commit crea un nuevo punto en el historial.

Por ejemplo:

git commit -m "Agregar funcionalidad"

La diferencia principal es:

--amend → Modifica el último commit

Nuevo commit → Crea otro commit en el historial

Se debe tener cuidado con --amend cuando el commit ya fue enviado a un repositorio remoto, porque puede modificar el historial compartido.

### 11.	¿Cómo se utiliza git stash y en qué escenarios es útil? 
git stash permite guardar temporalmente cambios que todavía no queremos convertir en un commit.

Por ejemplo, estamos trabajando en una funcionalidad y tenemos cambios sin terminar, pero necesitamos cambiar de rama.

Podemos utilizar:

git stash

Git guarda temporalmente esos cambios y deja limpio el directorio de trabajo.

Después podemos recuperarlos mediante:

git stash pop

Un ejemplo sería:

Estoy trabajando
      ↓
Cambios sin terminar
      ↓
git stash
      ↓
Directorio limpio
      ↓
Cambio de rama
      ↓
git stash pop
      ↓
Recupero mis cambios

Es especialmente útil cuando necesitamos cambiar temporalmente de tarea sin realizar un commit incompleto.

### 12.	¿Qué mecanismos ofrece Git para deshacer cambios (por ejemplo, git reset, git revert, git checkout)? 
Git proporciona diferentes mecanismos dependiendo del tipo de cambio que queremos deshacer.

git reset

Puede mover la referencia de una rama hacia otro commit y modificar el estado del staging o del directorio de trabajo dependiendo de la opción utilizada.

Por ejemplo:

git reset --soft HEAD~1

Puede utilizarse para deshacer el último commit manteniendo los cambios preparados.

git revert

Crea un nuevo commit que invierte los cambios realizados por un commit anterior.

git revert <commit>

Es una opción apropiada cuando queremos conservar el historial.

git restore

Permite restaurar archivos a un estado anterior.

Por ejemplo:

git restore archivo.java

Por lo tanto, estos comandos no son exactamente iguales:

reset  → Mueve referencias y puede modificar staging

revert → Crea un nuevo commit que deshace otro

restore → Recupera archivos

### 13.¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks? 
Un remote es una referencia a un repositorio remoto, normalmente ubicado en un servidor como GitHub.

Cuando clonamos un repositorio normalmente se crea un remoto llamado:

origin

Podemos consultar los remotos con:

git remote -v

Un proyecto puede tener más de un remoto.

Por ejemplo:

origin
upstream

En un proyecto basado en un fork, normalmente:

origin → nuestro repositorio.
upstream → repositorio original.

Para agregar upstream:

git remote add upstream URL_DEL_REPOSITORIO

Para obtener los cambios del repositorio original:

git fetch upstream

Después podemos integrar esos cambios en nuestra rama.

### 14.¿Cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git diff, git show)? 
Git proporciona diferentes comandos para revisar el historial.

git log

Muestra el historial de commits:

git log

También podemos utilizar:

git log --oneline

para obtener una versión más resumida.

git diff

Permite comparar cambios.

git diff
git show

Permite observar los detalles de un commit específico:

git show <commit>

Estos comandos permiten conocer qué cambios se han realizado y revisar la evolución del proyecto.

## Programación 

### 15.¿Cuáles son los tipos de datos primitivos en Java? 
Java tiene ocho tipos de datos primitivos:

Tipo	Descripción	Ejemplo
byte	Entero pequeño	byte edad = 20;
short	Entero	short numero = 1000;
int	Entero común	int edad = 20;
long	Entero grande	long poblacion = 1000000L;
float	Número decimal	float precio = 10.5f;
double	Número decimal de mayor precisión	double promedio = 4.5;
char	Un carácter	char letra = 'A';
boolean	Verdadero o falso	boolean activo = true;

Por ejemplo:

int edad = 20;
double salario = 2500000.50;
char inicial = 'J';
boolean estudiante = true;

### 16.¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en Java? 
Las estructuras de control permiten determinar cómo se ejecutan las instrucciones de un programa.

if

Permite ejecutar código cuando se cumple una condición.

if (edad >= 18) {
    System.out.println("Es mayor de edad");
}
else

Permite ejecutar una alternativa cuando la condición del if no se cumple.

if (edad >= 18) {
    System.out.println("Mayor de edad");
} else {
    System.out.println("Menor de edad");
}
switch

Permite seleccionar una opción entre diferentes casos.

switch (opcion) {
    case 1:
        System.out.println("Suma");
        break;

    case 2:
        System.out.println("Resta");
        break;

    default:
        System.out.println("Opción no válida");
}
Bucles

Los bucles permiten repetir instrucciones.

Por ejemplo, for:

for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

También existe while:

while (contador < 5) {
    contador++;
}

Estas estructuras permiten controlar las decisiones y repeticiones dentro de un programa.

### 17.¿Por qué es importante usar nombres significativos para variables y métodos? 
Es importante utilizar nombres significativos porque hace que el código sea más fácil de leer, entender y mantener.

Por ejemplo, no es recomendable:

int x = 20;

si esa variable realmente representa una edad.

Es más claro escribir:

int edad = 20;

De la misma manera, un método:

calcularPromedio()

es más descriptivo que:

calc()

Los nombres significativos permiten que otros programadores puedan comprender más fácilmente qué hace el código.

También ayudan a reducir errores y facilitan el mantenimiento del programa.

### 18.¿Qué es la Programación Orientada a Objetos (POO)? 
La Programación Orientada a Objetos (POO) es un paradigma de programación que organiza los programas utilizando objetos y clases.

Una clase funciona como un modelo o plantilla que define características y comportamientos.

Un objeto es una instancia de una clase.

Por ejemplo:

class Persona {
    String nombre;
    int edad;

    void saludar() {
        System.out.println("Hola");
    }
}

Podemos crear un objeto:

Persona persona = new Persona();

persona.nombre = "Juan";
persona.edad = 20;

persona.saludar();

En este caso, Persona es la clase y persona es un objeto.

La POO permite organizar mejor programas grandes y facilita la reutilización y mantenimiento del código.

### 19.¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos? 
Los cuatro pilares principales de la POO son:

1. Encapsulamiento

Consiste en proteger los datos internos de una clase y controlar la forma en que se accede a ellos.

Por ejemplo:

class Cuenta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }
}
2. Abstracción

Consiste en mostrar solamente los aspectos importantes de un objeto y ocultar detalles innecesarios de implementación.

3. Herencia

Permite que una clase pueda adquirir características y comportamientos de otra clase.

class Animal {
    void comer() {
        System.out.println("El animal está comiendo");
    }
}

class Perro extends Animal {
}

Perro hereda de Animal.

4. Polimorfismo

Permite que una misma operación pueda comportarse de diferentes maneras dependiendo del objeto que la utilice.

Por ejemplo, diferentes clases pueden implementar un mismo método de manera diferente.

Los cuatro pilares son:

Encapsulamiento
Abstracción
Herencia
Polimorfismo

### 20.¿Qué es la herencia en POO y cómo se utiliza en Java? 
La herencia permite crear una clase nueva a partir de otra clase existente.

La clase que proporciona las características se conoce como clase padre o superclase, mientras que la nueva clase se conoce como clase hija o subclase.

En Java se utiliza la palabra clave extends.

Ejemplo:

class Animal {

    void comer() {
        System.out.println("El animal está comiendo");
    }
}

class Perro extends Animal {

    void ladrar() {
        System.out.println("El perro está ladrando");
    }
}

Podemos crear un objeto:

Perro perro = new Perro();

perro.comer();
perro.ladrar();

El objeto perro puede utilizar el método comer() porque lo heredó de Animal.

La herencia permite reutilizar código y establecer relaciones entre clases.

### 21.¿Qué son los modificadores de acceso y cuáles son los más comunes en Java? 
Los modificadores de acceso determinan desde qué partes del programa se puede acceder a una clase, atributo o método.

Los principales son:

Modificador	Acceso
public	Accesible desde cualquier clase
private	Accesible únicamente dentro de la misma clase
protected	Accesible dentro del mismo paquete y mediante herencia
Sin modificador	Accesible dentro del mismo paquete
public
public class Persona {
}

La clase o miembro puede ser accesible desde otras partes del programa según las reglas de Java.

private
private double saldo;

El atributo solamente puede ser utilizado directamente dentro de su propia clase.

protected

Se utiliza principalmente cuando existe una relación de herencia y permite acceso dentro del mismo paquete o desde subclases.

El uso adecuado de estos modificadores ayuda a implementar el encapsulamiento.

### 22.¿Qué es una variable de entorno y por qué son importantes para Java o la programación en general? 
Una variable de entorno es un valor almacenado por el sistema operativo que puede ser utilizado por diferentes programas para obtener información de configuración.

En Java, una de las variables de entorno más conocidas es:

JAVA_HOME

Esta variable puede indicar dónde está instalada la versión del JDK.

Por ejemplo, una configuración podría indicar:

JAVA_HOME=C:\Program Files\Java\jdk-21

Otra configuración importante puede ser el PATH, que permite que el sistema encuentre determinados comandos desde la terminal.

Las variables de entorno son importantes porque permiten configurar programas sin tener que escribir esa información directamente dentro del código.

Por ejemplo, en lugar de colocar una contraseña directamente en un programa:

String password = "123456";

es más seguro utilizar una variable de entorno y obtenerla desde el sistema.

Esto permite separar la configuración del código fuente.