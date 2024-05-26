INSERT INTO Vehiculo ( k_placa, i_tipo, n_marca, n_modelo, n_color, k_nomenclatura)
VALUES ('abs122','Corolla', 'Red', 'dlaskdlas', 'dsad', 'a2') ;


UPDATE Vehiculo
SET i_tipo = 'Corolla',
    n_marca = 'Red',
    n_modelo = 'dlaskdlas',
    n_color = 'dsad',
    k_nomenclatura = 'a1'
WHERE k_placa = 'dfkds';
 
INSERT INTO Vehiculo (k_placa)
VALUES ('dfkds');

insert into Plaza (k_nomenclatura, i_estaOcupado, k_idArea , k_placa) values ('a1', TRUE,'1','dfkds');

insert into Plaza (k_nomenclatura, i_estaOcupado, k_idArea ) values ('a4', TRUE,'1');

insert into Localidad (k_nombreLocalidad) values ('Chapinero');

insert into Parqueadero (k_nombre, k_direccion, q_nivelesSub, q_nivelesSup, n_tipoSuelo, k_nombreLocalidad)
values ('roberto', 'cll 10', 2, 3, 'concreto', 'Chapinero');
insert into Area (k_idArea, n_descripcion, k_nombre, k_direccion) 
values ('1', 'askal', 'roberto', 'cll 10');



select * from Vehiculo;