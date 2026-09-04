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