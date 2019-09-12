Algoritmo Notas
	definir aprobados Como Real
	aprobados = 0
	definir x Como Entero
	
	Escribir "Escriba el numero de alumnos a introducir"
	leer x
	
	Para z=1 hasta x Con Paso 1 Hacer
		Escribir "Escriba la nota del/la alumn@"
		leer nota
		
		si nota>=6
			aprobados = aprobados +1
		FinSi
		
	FinPara
	
	Escribir "El cumulo de alumn@s aprobad@s es: ",aprobados
FinAlgoritmo
