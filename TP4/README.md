## Consideraciones

En este documento encontrará las consideraciones y gráficos utilizados para el desarrollo del trabajo práctico #4 de la asignatura Programación Orientada a Objetos I.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

@startuml
abstract class Material {                   // porq no se debería poder instanciar
- titulo: string
- fechaPub: date
- codigoId: int
}

class Prestamo {
- fechaPrestamo: date
- fechaDevolucion: date
}

class libro {
- autor: string
- numeroPaginas: int
}

class revista {
- numeroEdicion: int
- periodicidad: string
}

class multimedia {
- formato: string
- tamaño: float
}

Material <|-- libro
Material <|-- revista
Material <|-- multimedia

Prestamo --> lector : lector
Prestamo "*" <--> "*" Material : material


class lector {
- nombre: string
- apellido: string
- dni: string
- correo: string
}
@enduml
