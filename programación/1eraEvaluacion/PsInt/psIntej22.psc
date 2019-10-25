Algoritmo Primos
	
	Escribir "Teclee el numero del cual se mostrá por pantalla los Nº primos anteriores a su valor"
	Leer n
	
	divi = 0
	
	cont = 0
	
	Mientras cont <> n
		Para x=1 Hasta cont Con Paso 1 Hacer
			
			Si cont%x = 0 
				divi = divi + 1
			FinSi
			
		FinPara
		
		Si divi = 2
			Escribir cont
		FinSi
		
		cont = cont+1
		
		divi = 0
		
	FinMientras
	
FinAlgoritmo
