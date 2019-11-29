/*05_Tareas_a_realizar_DML*/


/*3. Utiliza las tablas depart y emple para:*/
    
    /*1. Añadir un nuevo departamento: 'Calidad', con localización Santander y código 11. 
    Añadir un empleado vinculado al departamento recién creado sus datos son:  7230, Aguirre, empleado.*/
    
    INSERT INTO depart VALUES(
        11, 'Calidad','Santander'
    );
    
    INSERT INTO EMPLE(emp_no,apellido,oficio,fecha_alta,dept_no,salario) VALUES(
        7230,'Aguirre','empleado',SYSDATE,11,2000
    );
    
    ----------COMPROBACIONES----------
    SELECT dept_no, dnombre, loc
    FROM depart
    WHERE dept_no = 11;
    
    SELECT EMP_NO, APELLIDO, OFICIO, ID_JEFE, FECHA_ALTA, SALARIO, COMISION_PCT, DEPT_NO
    FROM emple
    WHERE dept_no = 11;
    
    COMMIT;
    /*2. Aplicar un recorte presupuestario del 10% a todos los sueldos.*/
    
    --Pre-- 
    /*6500-3867-3705-3185-3900-3900-2080-1625-1625-1950-1235-1040-1430-1690-2000*/
    SELECT salario
    FROM emple;
    
    -- -10%
    UPDATE emple
    SET salario = salario*0.90;
    
    --Post--
    /*5850-3480-3335-2867-3510-3510-1872-1463-1463-1755-1112-936-1287-1521-1800*/
    SELECT salario
    FROM emple;
    
    /*3. Reasignar a los empleados del departamento de contabilidad (código 10) al departamento de producción  (código 40).*/
    
    --ANTES--
    SELECT *
    FROM emple
    WHERE dept_no IN (10);
    
    UPDATE emple
    SET dept_no = 40
    WHERE dept_no = 10;
    
    --DESPUES--
    SELECT *
    FROM emple
    WHERE dept_no IN (10);
    
    /*4. Modificar a todos los empleados cuyo director es el  7566, pasan a ser subordinados del jefe de tovar.*/
    
    --MIRAMOS LOS DATOS QUE VAMOS A USAR PARA EVITAR ERRORES
    SELECT *
    FROM emple
    WHERE emp_no = 7566;
    
    SELECT apellido, id_jefe
    FROM emple
    WHERE UPPER (apellido) = 'TOVAR';
    
    UPDATE emple
    SET id_jefe = (
                    SELECT id_jefe
                    FROM emple
                    WHERE UPPER (apellido) = 'TOVAR'
                    )
    WHERE emp_no = 7566;                 
                    
    --COMPROBAMOS
    
    SELECT *
    FROM emple
    WHERE id_jefe = '7698';
    
    
    /*5. A los trabajadores cuyo oficio sea empleado se les adjudicara el mismo sueldo que tiene      MUÑOZ.*/
    
    SELECT *
    FROM emple
    WHERE UPPER(oficio) = 'EMPLEADO';
    
    SELECT *
    FROM emple
    WHERE UPPER(apellido) = 'MUÑOZ';
    
    UPDATE EMPLE
    SET SALARIO= NVL((SELECT SALARIO FROM EMPLE WHERE APELLIDO='MUNOZ'),0)
    WHERE OFICIO='EMPLEADO';
    SELECT OFICIO, SALARIO FROM EMPLE;
    
    /*6. Todos los trabajadores cuyo departamento este localizado en Santander tendrán una comisión de 300€.*/
    
    UPDATE EMPLE
    SET SALARIO= SALARIO+300
    WHERE DEPT_NO=(
                    SELECT DEPT_NO 
                    FROM DEPART 
                    WHERE UPPER(DNOMBRE)='SANTANDER'
                    );
    SELECT SALARIO FROM EMPLE;
    
    
    /*7. Despedir a todos los empleados que trabajan para el departamento de ventas (código 30).*/
    
    SELECT emp_no, dept_no, apellido
    FROM emple
    WHERE dept_no IN (SELECT dept_no
                        FROM depart
                        WHERE UPPER(dnombre) IN ('','')