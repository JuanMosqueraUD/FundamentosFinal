select * from registro;

--- parqueadero fontibon

INSERT INTO localidad (k_nombrelocalidad) VALUES ('fontibon');
INSERT INTO parqueadero (k_nombre, k_direccion, q_nivelessub, q_nivelessup, n_tiposuelo, k_nombrelocalidad) 
VALUES ('fontibon', 'cra89b-16b', 0, 1, 'concreto', 'fontibon');
INSERT INTO area (k_idarea, n_descripcion, k_nombre, k_direccion) 
VALUES ('fa', 'primer area del parqueadero de fontibon', 'fontibon', 'cra89b-16b');
INSERT INTO area (k_idarea, n_descripcion, k_nombre, k_direccion) 
VALUES ('fb', 'segunda area del parqueadero de fontibon', 'fontibon', 'cra89b-16b');
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea) VALUES ('fa1', FALSE, 'fa');
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea) VALUES ('fa2', FALSE, 'fa');
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea) VALUES ('fb1', FALSE, 'fb');
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea) VALUES ('fb2', FALSE, 'fb');

--- parqueadero bosa

INSERT INTO localidad (k_nombrelocalidad) VALUES ('bosa');
INSERT INTO parqueadero (k_nombre, k_direccion, q_nivelessub, q_nivelessup, n_tiposuelo, k_nombrelocalidad) 
VALUES ('bosa', 'cra2b-09', 0, 1, 'concreto', 'bosa');
INSERT INTO area (k_idarea, n_descripcion, k_nombre, k_direccion) 
VALUES ('ba', 'primer area del parqueadero de bosa', 'bosa', 'cra2b-09');
INSERT INTO area (k_idarea, n_descripcion, k_nombre, k_direccion) 
VALUES ('bb', 'segunda area del parqueadero de bosa', 'bosa', 'cra2b-09');
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea) VALUES ('ba1', FALSE, 'ba');
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea) VALUES ('ba2', FALSE, 'ba');
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea) VALUES ('bb1', FALSE, 'bb');
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea) VALUES ('bb2', FALSE, 'bb');

--- parqueadero suba

INSERT INTO localidad (k_nombrelocalidad) VALUES ('suba');
INSERT INTO parqueadero (k_nombre, k_direccion, q_nivelessub, q_nivelessup, n_tiposuelo, k_nombrelocalidad) 
VALUES ('suba', 'cra21b-02c', 0, 1, 'concreto', 'suba');
INSERT INTO area (k_idarea, n_descripcion, k_nombre, k_direccion) 
VALUES ('sa', 'primer area del parqueadero de suba', 'suba', 'cra21b-02c');
INSERT INTO area (k_idarea, n_descripcion, k_nombre, k_direccion) 
VALUES ('sb', 'segunda area del parqueadero de suba', 'suba', 'cra21b-02c');
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea) VALUES ('sa1', FALSE, 'sa');
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea) VALUES ('sa2', FALSE, 'sa');
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea) VALUES ('sb1', FALSE, 'sb');
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea) VALUES ('sb2', FALSE, 'sb');


--- Tarifas 
insert into tarifa values('Automovil', 163, '03/03/2025')
insert into tarifa values('Campero', 163, '03/03/2025')
insert into tarifa values('Camioneta', 163, '03/03/2025')
insert into tarifa values('Vehiculo Pesado', 163, '03/03/2025')
insert into tarifa values('Motocicleta', 114, '03/03/2025')
insert into tarifa values('Bicicleta', 10, '03/03/2025')


