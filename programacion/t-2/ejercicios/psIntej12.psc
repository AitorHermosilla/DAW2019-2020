Algoritmo pagaElTelefono
	
	Escribir "Introduce los minutos consumidos"
	leer m
	
	si m < 300
		Escribir "El consumo ha sido: ", m * 0.04
		
	SiNo
		si m < 500
			Escribir "El consumo es de: ", m * 0.03
			
		SiNo
			si m >= 800
				Escribir "El consume es de: ", ((300*0.03)+(m-300)*0.02)
				
			SiNo
				Escribir "El consume es de: ", ((300*0.03)+(m-300)*0.02)*0.9875
			FinSi
			
		FinSi
		
	FinSi
	
FinAlgoritmo
