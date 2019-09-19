Algoritmo PrimoNoprimo
	Escribir "Por favor ingrese el numero a evaluar"
	leer n
	
	Para x<-1 Hasta n Hacer
		Si n MOD x = 0 Entonces
			cont<-cont+1
		FinSi
	FinPara
	
	si cont=2 Entonces
		Escribir n," Es numero primo"
	SiNo
		Escribir n," No es numero primo"
	FinSi
	
FinAlgoritmo
