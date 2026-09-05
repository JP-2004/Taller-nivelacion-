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