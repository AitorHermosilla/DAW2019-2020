--Tareas a realizar 0 especialista B


/*4. Ahora ve a Oracle SQLDeveloper, y ejecuta el script denominado creacion_tablas_emple_depart.sql. 
Tras ejecutarlo comprueba que tienes las tablas EMPLE, DEPART, así como que contienen datos.*/

SELECT table_name
FROM user_tables
WHERE UPPER(table_name) IN ('EMPLE','DEPART');

--------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------

SELECT EMP_NO, APELLIDO ,OFICIO ,ID_JEFE ,FECHA_ALTA ,SALARIO ,COMISION_PCT ,DEPT_NO
FROM emple;

--------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------

SELECT DEPT_NO ,DNOMBRE ,LOC 
FROM depart;

/*5. Responde a las siguientes cuestiones(20 min):*/

    /*1.  A partir de la tabla EMPLE, obtener aquellos empleados cuyo apellido empiece por una ‘J’. */
        
        SELECT apellido
        FROM emple
        WHERE UPPER(apellido) LIKE 'J%';
        
    /*2. A partir de la tabla EMPLE, obtener el apellido y el salario de los empleados cuyo salario 
    NO esté comprendido entre 150000 y 200000.*/

        SELECT apellido, salario
        FROM emple
        WHERE salario NOT BETWEEN 150000 AND 200000;

    /*3. Consultar los empleados cuyo departamento no sea ni 10 ni 30. (B)*/

        SELECT nombre
        FROM emple

    /*4. Consultar los oficios de la empresa pero sin que aparezcan repeticiones.(B)*/