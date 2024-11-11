# Proyecto Quickpass para El Condominio Valhalla

El Condominio Valhalla desea contratar el desarrollo de un programa que permita centralizar la data de los accesos del condominio con la finalidad de tener mayor control de la información y fortalecer sus protocolos de seguridad en cuando a los propietarios, residentes o inquilinos que pueden acceder al condominio mediante accesos
quickpass.

El condominio a contratado los servicios de su grupo de programación para desarrollar el software con los requerimientos especificados en esta documentación.

## Especificación del proyecto
1. Se desarrollará el  proyecto utilizando la clase JOptionPane de la librería SWING de Java para la interfaz.
2. Se desarrollarán los siguientes módulos del sistema:
	- Gestión de Quickpass
	- Gestión de accesos
	- Módulo de reportes

## Requerimientos de cada módulo del programa
### Gestión de Quickpass
Este módulo permite registrar, consultar, bloquear y eliminar los stiker que la administración va despachando a los condóminos.

Especificaciones técnicas del módulo de gestión de Quickpass:
1. Utilizará como medio de almacenamiento un Arreglo de Objetos.
2. El arreglo deberá contener: Objetos de tipo Quickpass (Filial, Código, Placa, Estado).
3. Estos datos serán modelados a través de una clase.
4. Creará los métodos de agregar, consultar y eliminar para el medio de almacenamiento seleccionado.
5. Al registrar el código este deberá ser numérico (de 10 dígitos) pero absolutamente todos inician con 101XXXXXXX, las X son otros números por lo cual el sistema debe validar siempre que el código ingresado sea válido.
6. Al eliminar un quickpass deberá moverse a un segundo arreglo de objetos llamado QuickpassEliminados. Cabe resaltar que deben existir dos métodos para eliminar uno que funciona por código y el otro por placa.
7. El sistema debe permitir visualizar por tres formas diferentes: 
	1. Todos
	2. Solo los de una filial
	3. Uno en específico
	Además, debe permitir visualizar los códigos de la lista de eliminados y buscar de las mismas tres formas del anterior.
8. El estado por defecto es activo pero el sistema debe permitir inactivar el mismo para que puedan gestionar los casos donde por algún motivo deben bloquear el ingreso de un condómino.
9. El programa debe permitir hacer consultas por código de manera tal que devuelva “Aceptado” o “Rechazado” según las siguientes condiciones: 
	1. Existes dentro de la lista 
	2. El código no se encuentra inactivado. 
	3. El código debe cumplir ambas.


### Gestión de accesos
Este módulo maneja los accesos y las bitácoras del mismo con el propósito de dotar a la administración sobre la información de quienes accedieron y la frecuencia de los accesos.

Especificaciones técnicas del módulo de gestión de accesos:
1. Utilizará como medio de almacenamiento un archivo txt.
2. Todas las llamadas a este método de consultas debe registrar la actividad en un documento txt llamado "Historial.txt" donde además de la consulta y resultado debe adjuntar la fecha y hora sacada del sistema de manera automática en conjunto con la información del quickpass, por ejemplo: "Código: 1011234567; Placa: 123123; Filial: A01; Condición: Aceptado; Fecha: 15/05/2024 14:40".
3. El sistema debe permitir consultar el histórico de accesos de una filial específica.
4. El sistema debe permitir consultar por los accesos que se realizaron durante un rango de fechas.
5. El sistema debe permitir consultar por los accesos de un código o placa específica.

### Módulo de reportes
Este módulo permite ver el comportamiento de los accesos al condominio.

Especificaciones técnicas del módulo de reportes:
1. El programa debe leer los TXT y el arreglo de objetos para obtener la siguiente información necesaria para los reportes.
2. El sistema debe mostrar el total de accesos registrados.
3. El sistema debe mostrar el total de accesos por filial.
4. El sistema debe mostrar el total de quickpass registrados.
5. El sistema debe mostrar el total de quickpass Activos e Inactivos.
6. El sistema debe mostrar el total de quickpass eliminados.


## Glosario
- Filial: número de propiedad.
- Condómino: Persona que vive dentro de un condominio.
- Quickpass: Stiker que poseen los condóminos para un acceso ágil y rápido a un condominio.