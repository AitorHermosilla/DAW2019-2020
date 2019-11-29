/*
Error que empieza en la línea: 1 del comando :
DROP TABLE pedidos CASCADE CONSTRAINT
Informe de error -
ORA-00942: la tabla o vista no existe
00942. 00000 -  "table or view does not exist"
*Cause:    
*Action:

Error que empieza en la línea: 2 del comando :
DROP TABLE ventas CASCADE CONSTRAINT
Informe de error -
ORA-00942: la tabla o vista no existe
00942. 00000 -  "table or view does not exist"
*Cause:    
*Action:

Error que empieza en la línea: 3 del comando :
DROP TABLE articulos CASCADE CONSTRAINT
Informe de error -
ORA-00942: la tabla o vista no existe
00942. 00000 -  "table or view does not exist"
*Cause:    
*Action:

Error que empieza en la línea: 4 del comando :
DROP TABLE fabricantes CASCADE CONSTRAINT
Informe de error -
ORA-00942: la tabla o vista no existe
00942. 00000 -  "table or view does not exist"
*Cause:    
*Action:

Error que empieza en la línea: 6 del comando :
DROP TABLE tiendas CASCADE CONSTRAINT
Informe de error -
ORA-00942: la tabla o vista no existe
00942. 00000 -  "table or view does not exist"
*Cause:    
*Action:

CAUSA DE LOS ERRORES:   Por una parte, las tablas no han sido creadas por lo que no se pueden borrar
                        por otro lado, la palabra CONSTRAINTS esta mal escrita

SOLUCION:               AGUANTAR LOS ERRORES DE "table or view does not exist"
                        Corregir la S que falta
*/


DROP TABLE pedidos CASCADE CONSTRAINTS;
DROP TABLE ventas CASCADE CONSTRAINTS;
DROP TABLE articulos CASCADE CONSTRAINTS;
DROP TABLE fabricantes CASCADE CONSTRAINTS;
DROP TABLE tiendas CASCADE CONSTRAINTS;

/*
Error que empieza en la línea: 68 del comando :
INSERT INTO fabricantes
VALUES ('1','FABRICANTE 1','portugal')
Informe de error -
ORA-02290: restricción de control (SCOTT.FABR_PAIS_CK) violada

CAUSA:  No se esta respetando la restricción FABR_PAIS_CK, la cual dice que el pais debe de estar en mayuscula
SOLUCION: Escribir portugal en mayuscula

*/

/*VALUES ('ARTICULO3','3',100, 'Segunda',322,280,300)*/

CREATE TABLE fabricantes
(
cod_fabricante VARCHAR2(3),
nombre VARCHAR2(15),
pais VARCHAR2(15),
  CONSTRAINT fabr_pk PRIMARY KEY(cod_fabricante),
  CONSTRAINT fabr_nombre_ck CHECK (nombre=UPPER(nombre)),
  CONSTRAINT fabr_pais_ck CHECK (pais=UPPER(pais))
);

INSERT INTO fabricantes
VALUES ('1','FABRICANTE 1','PORTUGAL');

INSERT INTO fabricantes
VALUES ('2','FABRICANTE 2','FRANCIA');

INSERT INTO fabricantes
VALUES ('3','FABRICANTE 2','ITALIA');


CREATE TABLE articulos
 (
articulo VARCHAR2(20),
cod_fabricante VARCHAR2(3),
peso NUMBER(3),
categoria VARCHAR2(10),
precio_venta NUMBER(4),
precio_costo NUMBER(4),
existencias NUMBER(5),
  CONSTRAINT art_comp_pk PRIMARY KEY(articulo,cod_fabricante,peso,categoria),
  CONSTRAINT art_fab_fk FOREIGN KEY(cod_fabricante) REFERENCES fabricantes(cod_fabricante),
  CONSTRAINT art_precio_venta_ck CHECK(precio_venta>0),
  CONSTRAINT art_precio_costo_ck CHECK(precio_costo>0),
  CONSTRAINT art_peso_ck CHECK(existencias>0),
  CONSTRAINT art_categoria_ck CHECK(categoria IN ('Primera','Segunda','Tercera'))
);


INSERT INTO articulos
VALUES ('ARTICULO1','1',100, 'Primera',222,180,1000);

/*
Error que empieza en la línea: 106 del comando :
INSERT INTO articulos
VALUES ('ARTICULO2','1',200, 'PRIMERA',522,480,500)
Informe de error -
ORA-02290: restricción de control (SCOTT.ART_CATEGORIA_CK) violada

CAUSA:  La restricción nos solicita que categoria este entre los valores 'Primera', 'Segunda','Tercera'
SOLUCION:   cambiar el valor de PRIMERA por Primera
*/

INSERT INTO articulos
VALUES ('ARTICULO2','1',200, 'Primera',522,480,500);

/*
Error que empieza en la línea: 120 del comando :
INSERT INTO articulos
VALUES ('ARTICULO3','3',100, 'Segunda',322,280,300)
Informe de error -
ORA-02291: restricción de integridad (SCOTT.ART_FAB_FK) violada - clave principal no encontrada

CAUSA:      No se encuentra la clave foranea que relacióna el codigo del fabricante de las tablas fabricantes
            y articulos.

SOLUCION:   Vamos a la tabla donde no se encuentra la referencia y vemos que los unicos codigos reconocidos
            son o el 1 o el 2, no el 3 por lo que quitamos eso
*/

INSERT INTO articulos
VALUES ('ARTICULO3','3',100, 'Segunda',322,280,300);


/*Error que empieza en la línea: 137 del comando :
INSERT INTO articulos
VALUES ('ARTICULO2','1',200, 'Primera',522,480,500)
Informe de error -
ORA-00001: restricción única (SCOTT.ART_COMP_PK) violada

CAUSA:      No se esta respetando la clave primaria, se introducen dos veces los mismos campos haciendo que la
            la clave primaria no se respete al no ser unica.
            
SOLUCION:   Borramos el articulo repetido
*/


--INSERT INTO articulos
--VALUES ('ARTICULO2','1',200, 'Primera',522,480,500);

INSERT INTO articulos
VALUES ('ARTICULO3','2',100, 'Segunda',322,280,300);

INSERT INTO articulos
VALUES ('ARTICULO4','2',200, 'Primera',422,380,400);





CREATE TABLE tiendas (
nif VARCHAR2(10),
nombre VARCHAR2(20),
direccion VARCHAR2(20),
poblacion VARCHAR2(20),
provincia VARCHAR2(20),
codpostal VARCHAR2(5),
  CONSTRAINT tien_pk PRIMARY KEY(nif),
  CONSTRAINT tien_provincia_ck CHECK(provincia=UPPER(provincia))
);

INSERT INTO tiendas
VALUES ('A010038I','TIENDA 1', 'SANTIAGO, 25', 'VITORIA','ALAVA','01003');

INSERT INTO tiendas
VALUES ('A020058I','TIENDA 2', 'DIVINO PASTOR, 15', 'MADRID','MADRID','28004');




CREATE TABLE pedidos (
nif VARCHAR2(10),
articulo VARCHAR2(20),
cod_fabricante VARCHAR2(3),
peso NUMBER(3),
categoria VARCHAR2(10),
fecha_pedido DATE,
unidades_pedidas NUMBER(4),
  CONSTRAINT ped_comp_pk PRIMARY KEY(nif,articulo,cod_fabricante,peso,categoria,fecha_pedido),
  CONSTRAINT ped_fab_fk FOREIGN KEY(cod_fabricante) REFERENCES fabricantes(cod_fabricante),
  CONSTRAINT ped_tien_fk FOREIGN KEY(nif) REFERENCES tiendas(nif),
  CONSTRAINT ped_art_fk FOREIGN KEY(articulo,cod_fabricante,peso,categoria) 
     REFERENCES articulos(articulo,cod_fabricante,peso,categoria) ON DELETE CASCADE,
  CONSTRAINT ven_unidades_pedidas_ck CHECK(unidades_pedidas>0),
  CONSTRAINT ped_categoria_ck CHECK(categoria IN ('Primera','Segunda','Tercera'))
);  

INSERT INTO pedidos
VALUES ('A010038I', 'ARTICULO4',2,200, 'Primera',SYSDATE,100);

/*Error que empieza en la línea: 204 del comando :
INSERT INTO pedidos
VALUES ('A010038I', 'ARTICULO4',2,200, 'Tercera',SYSDATE,100)
Informe de error -
ORA-02291: restricción de integridad (SCOTT.PED_ART_FK) violada - clave principal no encontrada

CAUSA:      No se respeta la clave foranea, la referencia ahi señalada no existe en la tabla a la que se hace referencia

SOLUCION:   Eliminar datos no relacionados o crear nuevos para hacer lógica la referencia*/

--INSERT INTO pedidos
--VALUES ('A010038I', 'ARTICULO4',2,200, 'Tercera',SYSDATE,100);


/*Error que empieza en la línea: 218 del comando :
INSERT INTO pedidos
VALUES ('A010038I', 'ARTICULO4',2,200, 'PRIMERA',SYSDATE,100)
Informe de error -
ORA-02290: restricción de control (SCOTT.PED_CATEGORIA_CK) violada

CAUSA:      No se esta respetando la restriccion PED_CATEGORIA_CK, PRIMERA esta mal escrito
SOLUCION:   Escribir con el formato correcto PRIMERA*/

/*Error que empieza en la línea: 227 del comando :
INSERT INTO pedidos
VALUES ('A010038I', 'ARTICULO4',2,200, 'Primera',SYSDATE,100)
Informe de error -
ORA-00001: restricción única (SCOTT.PED_COMP_PK) violada

CAUSA:      No se esta respetando la clave primaria puesto que se esta intentando introducir dos veces el mismo valor
SOLUCION:   borrar uno de los dos*/

--INSERT INTO pedidos
--VALUES ('A010038I', 'ARTICULO4',2,200, 'Primera',SYSDATE,100);



CREATE TABLE ventas (
nif VARCHAR2(10),
articulo VARCHAR2(20),
cod_fabricante VARCHAR2(3),
peso NUMBER(3),
categoria VARCHAR2(10),
fecha_venta DATE,
unidades_vendidas NUMBER(4),
  CONSTRAINT ven_comp_pk PRIMARY KEY(nif,articulo,cod_fabricante,peso,categoria,fecha_venta),
  CONSTRAINT ven_fab_fk FOREIGN KEY(cod_fabricante) REFERENCES fabricantes(cod_fabricante),
  CONSTRAINT ven_tien_fk FOREIGN KEY(nif) REFERENCES tiendas(nif),
  CONSTRAINT ven_art_fk FOREIGN KEY(articulo,cod_fabricante,peso,categoria) REFERENCES articulos(articulo,cod_fabricante,peso,categoria) ON DELETE CASCADE,
  CONSTRAINT ven_unidades_vendidas_ck CHECK(unidades_vendidas>0),
  CONSTRAINT ven_categoria_ck CHECK(categoria IN ('Primera','Segunda','Tercera'))
);  

INSERT INTO ventas
VALUES ('A010038I', 'ARTICULO4',2,200, 'Primera','21-ENE-12',10);

INSERT INTO ventas
VALUES ('A010038I', 'ARTICULO4',2,200, 'Primera','15/01/2012',10);

/*Error que empieza en la línea: 264 del comando -
INSERT INTO ventas
VALUES ('A010038I', ''ARTICULO3','3',100, 'Segunda',TO_DATE('15-01-2012','DD-MM-YYYY'),10);
Error en la línea de comandos : 265 Columna : 23
Informe de error -
Error SQL: ORA-00917: falta la coma
00917. 00000 -  "missing comma"
*Cause:    
*Action:*/


/*Error que empieza en la línea: 274 del comando :
INSERT INTO ventas
VALUES ('A010038I', 'ARTICULO3','3',100, 'Segunda',TO_DATE('15-01-2012','DD-MM-YYYY'),10)
Informe de error -
ORA-02291: restricción de integridad (SCOTT.VEN_ART_FK) violada - clave principal no encontrada

CAUSA: El valor hace referencia a algo que no existe
SOLUCION: darle sentido a la referencia o eliminarlo
*/

INSERT INTO ventas
VALUES ('A010038I', 'ARTICULO3','3',100, 'Segunda','15-01-2012',10);

/*El TO DATE () sobra, un to date combierte un String en una fecha, pero aquí directamente podemos introducir una fecha
por lo que sobra.*/
