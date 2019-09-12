Algoritmo Baloncesto
	
	Definir jugadores Como Caracter
	Dimension jugadores[5]
	
	Definir jugadoresapt Como Caracter
	Dimension jugadoresapt[5]
	
	Definir sexo Como Caracter
	Definir estatura Como Real
	Definir peso Como Entero
	x=1
	
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		
		Escribir "Introduce el nombre de el/la alumn@",i,": "
		leer jugadores[i]
		
		Escribir "Peso de el/la alumn@ ",jugadores[i],": "
		leer peso
		
		Escribir "Altura de el/la alumn@ ",jugadores[i],": "
		leer estatura
		
		Escribir "Escriba el sexo de el/la alumn@ ",jugadores[i],": "
		leer sexo
		
		Si sexo="f" y estatura>1.60 y peso>60 
			jugadoresapt[x] = jugadores[i]
			x = x+1
		SiNo
			si sexo="m" y estatura>1.70 y peso>70
				jugadoresapt[x] = jugadores[i]
				x = x+1
			FinSi
		FinSi
		
	FinPara
	
	Para j<-1 Hasta 5 Con Paso 1 Hacer
		Escribir "Alum@: ",j,": ", jugadoresapt[j]
	FinPara
	
FinAlgoritmo
