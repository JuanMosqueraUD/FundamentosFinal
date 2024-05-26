--- parqueadero fontibon

select * from area
INSERT INTO localidad (k_nombrelocalidad) VALUES ('fontibon');
INSERT INTO parqueadero (k_nombre, k_direccion, q_nivelessub, q_nivelessup, n_tiposuelo, k_nombrelocalidad) 
VALUES ('fontibon', 'cra89b-16b', 0, 1, 'concreto', 'fontibon');
INSERT INTO area (k_idarea, n_descripcion, k_nombre, k_direccion) 
VALUES ('fa', 'primer area del parqueadero de fontibon', 'fontibon', 'cra89b-16b');
INSERT INTO area (k_idarea, n_descripcion, k_nombre, k_direccion) 
VALUES ('fb', 'segunda area del parqueadero de fontibon', 'fontibon', 'cra89b-16b');
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea, k_placa) VALUES ('fa1', FALSE, 'fa', null);
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea, k_placa) VALUES ('fa2', FALSE, 'fa', null);
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea, k_placa) VALUES ('fb1', FALSE, 'fb', null);
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea, k_placa) VALUES ('fb2', FALSE, 'fb', null);

--- parqueadero bosa

INSERT INTO localidad (k_nombrelocalidad) VALUES ('bosa');
INSERT INTO parqueadero (k_nombre, k_direccion, q_nivelessub, q_nivelessup, n_tiposuelo, k_nombrelocalidad) 
VALUES ('bosa', 'cra2b-09', 0, 1, 'concreto', 'bosa');
INSERT INTO area (k_idarea, n_descripcion, k_nombre, k_direccion) 
VALUES ('ba', 'primer area del parqueadero de bosa', 'bosa', 'cra2b-09');
INSERT INTO area (k_idarea, n_descripcion, k_nombre, k_direccion) 
VALUES ('bb', 'segunda area del parqueadero de bosa', 'bosa', 'cra2b-09');
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea, k_placa) VALUES ('ba1', FALSE, 'ba', null);
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea, k_placa) VALUES ('ba2', FALSE, 'ba', null);
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea, k_placa) VALUES ('bb1', FALSE, 'bb', null);
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea, k_placa) VALUES ('bb2', FALSE, 'bb', null);

--- parqueadero suba

INSERT INTO localidad (k_nombrelocalidad) VALUES ('suba');
INSERT INTO parqueadero (k_nombre, k_direccion, q_nivelessub, q_nivelessup, n_tiposuelo, k_nombrelocalidad) 
VALUES ('suba', 'cra21b-02c', 0, 1, 'concreto', 'suba');
INSERT INTO area (k_idarea, n_descripcion, k_nombre, k_direccion) 
VALUES ('sa', 'primer area del parqueadero de suba', 'suba', 'cra21b-02c');
INSERT INTO area (k_idarea, n_descripcion, k_nombre, k_direccion) 
VALUES ('sb', 'segunda area del parqueadero de suba', 'suba', 'cra21b-02c');
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea, k_placa) VALUES ('sa1', FALSE, 'sa', null);
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea, k_placa) VALUES ('sa2', FALSE, 'sa', null);
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea, k_placa) VALUES ('sb1', FALSE, 'sb', null);
INSERT INTO plaza (k_nomenclatura, i_estaocupado, k_idarea, k_placa) VALUES ('sb2', FALSE, 'sb', null);




