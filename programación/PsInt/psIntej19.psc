Algoritmo CuadradoSumas
	
	Escribir "Escriba el numero a elevar a n"
	leer n
	j = 0
	
	para x=0 hasta n*2 Con Paso 1 Hacer
		
		si j MOD 2 = 0
			
		SiNo
			total = total + x
		FinSi
		
		j = j+1
		
	FinPara
	
	Escribir n," elevado al cuadrado = ", total
	
FinAlgoritmo
	