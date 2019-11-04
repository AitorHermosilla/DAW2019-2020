/*02_Tareas_a_realizar_DDL*/

--COMENTARIO DE UNA LINEA

/*COMENTARIO
DE
VARIAS
LINEAS*/

--------------------------------------------------------
/*EJERCICIO-1*/
--------------------------------------------------------

CREATE TABLE ALUMNOS(

dni VARCHAR2(10),
nombre VARCHAR2(30) NOT NULL,
edad NUMBER(2),
curso NUMBER(1),

CONSTRAINT alu_dni_pk PRIMARY KEY (dni),
CONSTRAINT alu_edad_ck CHECK (edad between 5 and 20),
CONSTRAINT alu_nombre_ck CHECK (nombre = UPPER(nombre)),
CONSTRAINT alu_curso_ck CHECK (curso IN (1,2,3))

);

--------------------------------------------------------
/*EJERCICIO-2*/
--------------------------------------------------------

ALTER TABLE ALUMNOS ADD
sexo char(1) NOT NULL,
