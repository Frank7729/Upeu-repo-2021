def Ejercicios01FGCM():
  #Definir variables y otros
  print("--Ejercicio 01--")
  #Datos de entrada
  e1=int(input("Nota 01:"))
  e2=int(input("Nota 02:"))
  e3=int(input("Nota 03:"))
  e4=int(input("Nota 04:"))
  #Proceso
  promediofinal=(e1*0.20+e2*0.15+e3*0.15+e4*0.50)
  #Datos de salida
  print("La nota final es:", promediofinal)
Ejercicios01FGCM()
print("")

def Ejercicios02FGCM():
  #Definir variables y otros
  print("--> EJERCICIO 02 <--")
  numero=0
  #Datos de entrada
  numeroX=int(input("Ingrese los puntos:"))
  cantidadX=int(input("Ingrese el salario minimo:"))
  #Proceso
  if numeroX<50: 
   cantidadX="No tienes bono"
  elif numeroX>=50 and numeroX<=100: 
   cantidadX=cantidadX*0.10
  elif numeroX>=101 and numeroX<=150: 
   cantidadX=cantidadX*0.40
  else: 
   cantidadX=cantidadX*0.70
  #Datos de salida
  print("El bono es:", cantidadX)
Ejercicios02FGCM()
print("")

def Ejercicios03FGCM():
  #Definir variables y otros
  print("--Ejercicio 03--")
  vacuna=0
  #Datos de entrada
  cantidadX=int(input("Ingrese la edad:"))
  #Proceso
  if cantidadX<16:
   vacuna= ("Sexo(Mixto) de Tipo A")
  elif cantidadX>16 and cantidadX<69:
   vacuna=("Tipo B si es Sexo(F)","Tipo A si es Sexo(M)")
  else:
   vacuna= ("Sexo(Mixto) de Tipo C")
  #Datos de salida
  print("La vacuna es:", vacuna)
Ejercicios03FGCM()
print("")

def Ejercicios04FGCM():
  #Definir variables y otros
  print("--> EJERCICIO 04 <--")
  operadorX=0
  resultado=0
  #Datos de entrada
  operadorX=input("El signo es:")
  n1=int(input("Ingrese el 1er numero:"))
  n2=int(input("Ingrese el 2do numero:"))
  #Proceso
  if operadorX=="suma" or operadorX=="+":
    resultado=n1+n2
  elif operadorX=="Resta" or operadorX=="-":
    resultado=n1-n2
  elif operadorX=="Multiplicacion" or operadorX=="*":
    resultado=n1*n2
  elif operadorX=="Division" or operadorX=="/":
    resultado=n1/n2
  elif operadorX=="Potencia" or operadorX=="**":
    resultado=n1**n2
  #Datos de salida
  print("La resultado es:", resultado)
Ejercicios04FGCM()
print("")
