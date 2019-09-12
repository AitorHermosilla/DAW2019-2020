Algoritmo tresNumeros
	
	Escribir "Introduce el numeoro 1"
	leer n1
	
	Escribir "Introduce el numero 2"
	leer n2
	
	Escribir "Introduce el numero 3"
	leer n3
	
	ng = 0
	
	np = -1
	
	si n1 > n2 y n1 > n3
		
		ng = n1
		
	SiNo
		si n2 > n1 y n2 > n3
			
			ng = n2
			
		SiNo
			
			ng = n3
			
		FinSi
		
		
	FinSi
	
	si n1 < n2 y n1 < n3
		
		np = n1
		
	SiNo
		si n2 < n1 y n2 < n3
			
			np = n2
			
		SiNo
			
			np = n3
			
		FinSi
		
		
	FinSi
	
	Escribir "el numero mayor es: ", ng
	
	Escribir "El numero pequeño es: ", np
	
FinAlgoritmo
