Algoritmo Juego
	
	Definir n, aleat Como Entero
	
	aleat = azar(100)+1
	
	
Mientras n <> aleat
	Escribir "Ingrese un numero: "
	leer n
	
	si (aleat==n) Entonces
		Escribir "¡Adivinaste el numero aleatorio!"
	SiNo
		Escribir "No adivinaste, ¡Sigue intentando!"
	FinSi
	
	si aleat > n Entonces
		Escribir "El numero aleatorio es mayor al introducido"
		
	SiNo
		Escribir "El numeor aleatorio es menor al introducido"
	FinSi
FinMientras

	
FinAlgoritmo
