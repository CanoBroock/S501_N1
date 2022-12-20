Tenemos una entidad llamada Sucursal, que dispone de las siguientes propiedades:

-          pk_SucursalID entero

-          String nomSucursal

-          String paisSucursal

 

También tenemos una DTO llamada SucursalDTO, que tendrá las mismas propiedades que la entidad Sucursal, añadiendo una:

-          String tipusSucursal.

Esta propiedad, en función del país de la sucursal, deberá indicar si es "UE" o "Fuera UE". Para hacer esto, puedes tener una lista privada en la misma DTO (por ejemplo: List<String> países), con los países que forman parte de la UE.

Aprovechando la especificación JPA, deberás persistir la entidad Sucursal a una base de datos MySql, siguiendo el patrón MVC.


Para ello, dependiendo del package principal, crearás una estructura de packages, donde ubicarás las clases que necesites:

-          cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.controllers

-          cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.domain

-          cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.dto

-          cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.services

-          cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.repository

La clase ubicada en el paquete controllers (SucursalController, por ejemplo), deberá ser capaz de dar respuesta a las siguientes peticiones para actualizar y consultar información:

http://localhost:9000/sucursal/add

http://localhost:9000/sucursal/update

http://localhost:9000/sucursal/delete/{id}

http://localhost:9000/sucursal/getOne/{id}

http://localhost:9000/sucursal/getAll

 

Como puedes ver, en el archivo application.properties, deberás configurar que el puerto a utilizar sea el 9000.

La vista deberá estar desarrollada con Thymeleaf.
