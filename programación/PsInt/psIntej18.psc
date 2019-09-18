Algoritmo Fibonacci
	
	Definir n1 Como Entero
	Definir n2 Como Entero
	
	Escribir "Escribe los numeros que quieres en la seguida"
	leer j
	
	n1 = 1
	
	n2 = 1
	
	Escribir n1
	
	Escribir n2
	
	para x = 3 Hasta j Con Paso 1 Hacer
		
		n3 = n1 + n2
		
		escribir n3
		
		n2 = n1
		
		n1 = n3
		
	FinPara
	
FinAlgoritmo
