<<<<<<<< HEAD:Base de datos/Creacion DB.sql
========
INSERT INTO Vehiculo ( k_placa, i_tipo, n_marca, n_modelo, n_color, k_nomenclatura)
VALUES ('abs122','Corolla', 'Red', 'dlaskdlas', 'dsad', 'a2') 


UPDATE Vehiculo
SET i_tipo = 'Corolla',
    n_marca = 'Red',
    n_modelo = 'dlaskdlas',
    n_color = 'dsad',
    k_nomenclatura = 'a1'
WHERE k_placa = 'dfkds';
 
INSERT INTO Vehiculo (k_placa)
VALUES ('dfkds')

insert into Plaza (k_nomenclatura, i_estaOcupado, k_idArea , k_placa) values ('a1', TRUE,'1','dfkds');

insert into Plaza (k_nomenclatura, i_estaOcupado, k_idArea ) values ('a4', TRUE,'1');

insert into Localidad (k_nombreLocalidad) values ('Chapinero');

insert into Parqueadero (k_nombre, k_direccion, q_nivelesSub, q_nivelesSup, n_tipoSuelo, k_nombreLocalidad)
values ('roberto', 'cll 10', 2, 3, 'concreto', 'Chapinero');
insert into Area (k_idArea, n_descripcion, k_nombre, k_direccion) 
values ('1', 'askal', 'roberto', 'cll 10')

INSERT INTO Factura (f_salida) VALUES (null)
select * from Factura
select * from Registro
insert into factura (k_idpago, f_salida,k_idregistro,v_valortotal) values ('1', NULL)
insert into Registro (i_tiposervicio) values (null)

--funcion
CREATE OR REPLACE FUNCTION registrar_salida_vehiculo(
    placa varchar(6),
    fecha_salida timestamp with time zone
) RETURNS void AS $$
BEGIN
    -- Actualiza el registro con la fecha y hora de salida
    UPDATE Registro
    SET f_salida = fecha_salida,
        q_minutosTotales = EXTRACT(EPOCH FROM (fecha_salida - f_ingreso)) / 60
    WHERE k_idRegistro = (
        SELECT k_idRegistro
        FROM Plaza
        WHERE k_placa = placa
        ORDER BY f_ingreso DESC
        LIMIT 1
    );

    -- Opcional: Marca la plaza como desocupada
    UPDATE Plaza
    SET i_estaOcupado = FALSE,
        k_placa = NULL
    WHERE k_placa = placa;
END;
$$ LANGUAGE plpgsql;


>>>>>>>> sergio:Base de datos/Final sql.sql
/* ---------------------------------------------------- */
/*  Generated by Enterprise Architect Version 16.1 		*/
/*  Created On : 24-may.-2024 8:17:42 p. m. 				*/
/*  DBMS       : PostgreSQL 						*/
/* ---------------------------------------------------- */

/* Drop Sequences for Autonumber Columns */

/* Drop Tables */

DROP TABLE IF EXISTS Area CASCADE
;

DROP TABLE IF EXISTS AreaVigilante CASCADE
;

DROP TABLE IF EXISTS Contrato CASCADE
;

DROP TABLE IF EXISTS Factura CASCADE
;

DROP TABLE IF EXISTS Localidad CASCADE
;

DROP TABLE IF EXISTS Parqueadero CASCADE
;

DROP TABLE IF EXISTS ParqueaderoTarifa CASCADE
;

DROP TABLE IF EXISTS Plaza CASCADE
;

DROP TABLE IF EXISTS PlazaContrato CASCADE
;

DROP TABLE IF EXISTS PropietarioVehiculo CASCADE
;

DROP TABLE IF EXISTS Registro CASCADE
;

DROP TABLE IF EXISTS Tarifa CASCADE
;

DROP TABLE IF EXISTS Vehiculo CASCADE
;

DROP TABLE IF EXISTS Vigilante CASCADE
;

/* Create Tables */

CREATE TABLE Area
(
	k_idArea varchar(10) ,
	n_descripcion text ,
	k_nombre varchar(20) ,
	k_direccion varchar(40) 
)
;

CREATE TABLE AreaVigilante
(
	k_numId varchar(10) ,
	k_tipoId varchar(2) ,
	n_areaAsignada varchar(15) ,
	n_horario varchar(10) ,
	k_idAreaParqueadero varchar(10) 
)
;

CREATE TABLE Contrato
(
	k_idContrato bigserial ,	-- identificador del contrato
	i_tipo varchar(6) ,	-- tipo de cotrato(semana, mes, año)
	f_inicio timestamp(6) with time zone ,	-- fecha inicio del contrato
	f_fin timestamp(6) with time zone ,	-- fecha finalizacion del contrato
	v_valor money ,
	k_tipoId varchar(2) ,
	k_numId varchar(15) 
)
;

CREATE TABLE Factura
(
	k_idPago bigserial ,	-- identificador del pago
	f_salida timestamp(6) with time zone ,	-- Fecha de creacion de la factura
	k_idRegistro serial ,
	v_valorTotal money 	-- Valor total que se pago
)
;

CREATE TABLE Localidad
(
	k_nombreLocalidad varchar(20) 
)
;

CREATE TABLE Parqueadero
(
	k_nombre varchar(20) ,	-- Nombre del parqueadero
	k_direccion varchar(40) ,	-- Direccion del parqueadero
	q_nivelesSub smallint ,	-- Niveles subterraneos del parqueadero
	q_nivelesSup smallint ,	-- Niveles superiores del parqueadero
	n_tipoSuelo varchar(10) ,
	k_nombreLocalidad varchar(20) 
)
;

CREATE TABLE ParqueaderoTarifa
(
	k_nombre varchar(20) ,
	k_direccion varchar(40) ,
	k_tipoVehiculo varchar(20) 
)
;

CREATE TABLE Plaza
(
	k_nomenclatura varchar(6) ,	-- Identificador de la plaza compuesto por numero del piso, letra del area y numero de la plaza
	i_estaOcupado boolean ,	-- Define si esta ocupado o no la plaza
	k_idArea varchar(10) ,
	k_placa varchar(6) 
)
;

CREATE TABLE PlazaContrato
(
	k_nomenclatura varchar(6) ,
	k_idContratoc bigserial 
)
;

CREATE TABLE PropietarioVehiculo
(
	k_tipoId varchar(2) ,	-- Tipo de identificacion(CC, PA, CE)
	k_numId varchar(15) ,	-- numero de identificacion
	n_primerNombre varchar(10) ,	-- Primer nombre del propietario
	n_segundoNombre varchar(10) ,	-- Segundo nombre del propietario
	n_primerApellido varchar(10) ,	-- Primer apellido del Propietario
	n_segundoApellido varchar(10) 	-- Segundo Apellido del propietario
)
;

CREATE TABLE Registro
(
	k_idRegistro serial ,	-- Identificador del registro
	f_ingreso timestamp(6) with time zone ,	-- Fecha y hora de ingreso del vehiculo
	f_salida timestamp(6) with time zone ,	-- Fecha y hora de la salida del vehiculo
	q_minutosTotales numeric(8) ,	-- Cantidad de minutos en los que el vehiculo utilizo el servicio
	i_tipoServicio varchar(8) ,
	k_direccion varchar(40) ,
	k_nombre varchar(20) ,
	k_idPago bigserial 
)
;

CREATE TABLE Tarifa
(
	k_tipoVehiculo varchar(20) ,	-- tipo del vehiculo
	v_valor money ,	-- valor total a pagar
	f_vigencia timestamp with time zone 	-- fecha de vigencia de la tarifa
)
;

CREATE TABLE Vehiculo
(
	k_placa varchar(6) ,	-- Placa del vehiculo
	i_tipo varchar(15) ,	-- Tipo de vehiculo(bicicleta, motocicleta, automovil, camioneta, campero, vehiculo pesado)
	n_marca varchar(15) ,	-- marca del vehiculo
	n_modelo varchar(20) ,	-- modelo del vehiculo
	n_color varchar(10) ,	-- color del vehiculo
	k_nomenclatura varchar(6) 
)
;

CREATE TABLE Vigilante
(
	k_tipoId varchar(2) ,	-- Tipo de identificacion(CC, PA, CE)
	k_numId varchar(10) ,	-- numero de identificacion
	n_nombre varchar(20) ,	-- nombres del vigilante
	n_apellido varchar(20) ,	-- apellidos del vigilante
	i_acompañanteCanino boolean 	-- Si el vigilante cuenta con acompañante canino o no
)
;

/* Create Primary Keys, Indexes, Uniques, Checks */

ALTER TABLE Area ADD CONSTRAINT PK_Area
	PRIMARY KEY (k_idArea)
;

ALTER TABLE AreaVigilante ADD CONSTRAINT PK_ParqueaderoVigilante
	PRIMARY KEY (k_tipoId,k_numId,k_idAreaParqueadero)
;

ALTER TABLE Contrato ADD CONSTRAINT PK_Contrato
	PRIMARY KEY (k_idContrato)
;



ALTER TABLE Factura ADD CONSTRAINT PK_Factura
	PRIMARY KEY (k_idPago)
;



ALTER TABLE Localidad ADD CONSTRAINT PK_Localidad
	PRIMARY KEY (k_nombreLocalidad)
;

ALTER TABLE Parqueadero ADD CONSTRAINT PK_Parqueadero
	PRIMARY KEY (k_nombre,k_direccion)
;





ALTER TABLE ParqueaderoTarifa ADD CONSTRAINT PK_PlazaParqueadero
	PRIMARY KEY (k_direccion,k_nombre,k_tipoVehiculo)
;

ALTER TABLE Plaza ADD CONSTRAINT PK_Plaza
	PRIMARY KEY (k_nomenclatura)
;

ALTER TABLE PlazaContrato ADD CONSTRAINT PK_PlazaContrato
	PRIMARY KEY (k_nomenclatura,k_idContratoc)
;

ALTER TABLE PropietarioVehiculo ADD CONSTRAINT PK_PropietarioVehiculo
	PRIMARY KEY (k_tipoId,k_numId)
;



ALTER TABLE Registro ADD CONSTRAINT PK_Registro
	PRIMARY KEY (k_idRegistro)
;









ALTER TABLE Tarifa ADD CONSTRAINT PK_Tarifa
	PRIMARY KEY (k_tipoVehiculo)
;



ALTER TABLE Vehiculo ADD CONSTRAINT PK_Vehiculo
	PRIMARY KEY (k_placa)
;



ALTER TABLE Vigilante ADD CONSTRAINT PK_Vigilante
	PRIMARY KEY (k_tipoId,k_numId)
;

/* Create Foreign Key Constraints */

ALTER TABLE Area ADD CONSTRAINT FK_Area_Parqueadero
	FOREIGN KEY (k_nombre,k_direccion) REFERENCES Parqueadero (k_nombre,k_direccion) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE AreaVigilante ADD CONSTRAINT FK_AreaVigilante_Area
	FOREIGN KEY (k_idAreaParqueadero) REFERENCES Area (k_idArea) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE AreaVigilante ADD CONSTRAINT FK_AreaVigilante_Vigilante
	FOREIGN KEY (k_tipoId,k_numId) REFERENCES Vigilante (k_tipoId, k_numId) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE Contrato ADD CONSTRAINT FK_Contrato_PropietarioVehiculo
	FOREIGN KEY (k_tipoId,k_numId) REFERENCES PropietarioVehiculo (k_tipoId,k_numId) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE Factura ADD CONSTRAINT FK_Factura_Registro
	FOREIGN KEY (k_idRegistro) REFERENCES Registro (k_idRegistro) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE Parqueadero ADD CONSTRAINT FK_Parqueadero_Localidad
	FOREIGN KEY (k_nombreLocalidad) REFERENCES Localidad (k_nombreLocalidad) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE ParqueaderoTarifa ADD CONSTRAINT FK_ParqueaderoTarifa_Parqueadero
	FOREIGN KEY (k_nombre,k_direccion) REFERENCES Parqueadero (k_nombre,k_direccion) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE ParqueaderoTarifa ADD CONSTRAINT FK_ParqueaderoTarifa_Tarifa
	FOREIGN KEY (k_tipoVehiculo) REFERENCES Tarifa (k_tipoVehiculo) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE Plaza ADD CONSTRAINT FK_Plaza_Area
	FOREIGN KEY (k_idArea) REFERENCES Area (k_idArea) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE Plaza ADD CONSTRAINT FK_Plaza_Vehiculo
	FOREIGN KEY (k_placa) REFERENCES Vehiculo (k_placa) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE PlazaContrato ADD CONSTRAINT FK_PlazaContrato_Contrato
	FOREIGN KEY (k_idContratoc) REFERENCES Contrato (k_idContrato) ON DELETE No Action ON UPDATE No Action
;

ALTER TABLE PlazaContrato ADD CONSTRAINT FK_PlazaContrato_Plaza
	FOREIGN KEY (k_nomenclatura) REFERENCES Plaza (k_nomenclatura) ON DELETE No Action ON UPDATE No Action
;




ALTER TABLE Registro ADD CONSTRAINT FK_Registro_Parqueadero
	FOREIGN KEY (k_nombre,k_direccion) REFERENCES Parqueadero (k_nombre,k_direccion) ON DELETE No Action ON UPDATE No Action
;




