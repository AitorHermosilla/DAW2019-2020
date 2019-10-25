Algoritmo media
	
	definir med Como Real
	definir cont Como Entero
	cont = 0
	definir edad Como Entero
	edad = 1
	
	Mientras edad > 0
		Escribir "Introduzca la edad del alumn@, para parar de introducir alumn@s escriba una edad negativa"
		leer edad
		
		si edad >0
			cont = cont +1
			
			med = med + edad
		FinSi

	FinMientras
	
	med = med/cont
	
	Escribir "la media es: ", med
	
FinAlgoritmo
