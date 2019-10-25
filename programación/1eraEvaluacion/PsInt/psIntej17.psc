Algoritmo sin_titulo
	//17.  Diseña un programa que obtenga la calificación mayor y la calificación menor
	//de  un  grupo  de  40  estudiantes,  además  de  los  nombres  de dichos alumnos
	
	Definir calMay Como Real
	Definir calMen Como Real
	Definir nomMay Como Caracter
	Definir nomMen Como Caracter
	
	calMay = -10
	
	calMen = 11
	
	Para x=0 Hasta 40 Con Paso 1 Hacer
		
		Escribir "Escriba la nota del/la alumn@"
		leer nota
		
		Escribir "Nombre de el/la alumn@"
		leer nombre
		
		si nota > calMay
			calMay = nota
			nomMay = nombre
			
		SiNo
			si nota<calMen
				calMen = nota
				nomMen = nombre
			FinSi
			
		FinSi
		
	FinPara
	
	Escribir "La nota mas alta ha sido de: ", nomMay, " con un: ",calMay
	
	Escribir "La nota mas baja ha sido de: ", nomMen " con un: ", calMen

	
FinAlgoritmo
