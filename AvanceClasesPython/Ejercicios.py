def Ejercicios01():
  #Definir variables y otros
  print("--Ejercicio 01--")
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
Ejercicios01()
print("")

def Ejercicios02():
  #Definir variables y otros
  print("--Ejercicio 02--")
  edad=0
  #Datos de entrada
  cantidadX=int(input("Ingrese el numero de años:"))
  #Proceso
  if cantidadX<=17:
   edad= ("No vota")
  else:
   edad= ("Si vota")
  #Datos de salida
  print("El ciudadano:", edad)
Ejercicios02()
print("")

def Ejercicios03():
  #Definir variables y otros
  print("--Ejercicio 03--")
  regalo=0
  #Datos de entrada
  cantidadX=int(input("Ingrese el monto:"))
  #Proceso
  if cantidadX>10 and cantidadX<=100:
   regalo=("Chocolates")
  elif cantidadX<=10:
   regalo=("Tarjeta") 
  elif cantidadX>=101 and cantidadX<=250:
   regalo=("Flores")
  else:
   regalo=("Anillo")
  #Datos de salida
  print("El regalo es:", regalo)
Ejercicios03()
print("")

def Ejercicios04():
  #Definir variables y otros
  print("--Ejercicio 04--")
  monto=0
  #Datos de entrada
  cantidadX=int(input("Ingrese la hora:"))
  #Proceso
  if cantidadX<=40: 
   monto=(cantidadX)*15
  else:
   monto=(cantidadX)*15+15
  #Datos de salida
  print("El pago mensual es:", monto)
Ejercicios04()
print("")

def Ejercicios05():
  #Definir variables y otros
  print("--> EJERCICIO 07 <--")
  monto=0
  costo=0
  #Datos de entrada
  cantidadX=int(input("Ingrese el dinero que recibira:"))
  #Proceso
  if cantidadX<10000: 
   monto=("Paquete D : Un par de zapatos, 2 camisas y 2 pantalones")
  elif cantidadX>=10000 and cantidadX<20000:
   monto=("Paquete C : Dos pares de zapatos, 3 camisas y 3 pantalones")
  elif cantidadX>=20000 and cantidadX<50000:
   monto=("Paquete B : Una grabadora, 3 pares de zapatos, 5 camisas y 5 pantalones")
  else:
   monto=("Paquete A : Una television, un modular, 3 pares de zapatos, 5 camisas y 5 pantalones")
  #Datos de salida
  print("El se comprara el:", monto)
Ejercicios05()
print("")

def Ejercicios06():
  #Definir variables y otros
  print("--> EJERCICIO 06 <--")
  lugar=0
  costo=0
  #Datos de entrada
  lugar=input("Ingrese el lugar: ")
  pk=int(input("Ingrese el precio por km: "))
  #Proceso
  if lugar=="Mexico":
    costo=pk*750*2
  if lugar=="P.V":
    costo=pk*800*2
  if lugar=="Acapulco":
    costo=pk*1200*2
  elif lugar=="Cancun":
    costo=pk*1800*2
  #Datos de salida
  print("El monto a pagar es:", costo)
Ejercicios06()
print("")

def Ejercicios07():
  #Definir variables y otros
  print("--> EJERCICIO 07 <--")
  monto=0
  costo=0
  #Datos de entrada
  cantidadX=int(input("Ingrese el costo del articulo:"))
  #Proceso
  if cantidadX<100: 
   monto=(cantidadX)*0.1
   costo=(cantidadX)-(cantidadX)*0.1
  elif cantidadX>=100 and cantidadX<=199:
   monto=(cantidadX)*0.12
   costo=(cantidadX)-(cantidadX)*0.12
  else:
   monto=(cantidadX)*0.15
   costo=(cantidadX)-(cantidadX)*0.15
  #Datos de salida
  print("El descuento es:", monto, "y el costo es:", costo)
Ejercicios07()
print("")

def Ejercicios08():
  #Definir variables y otros
  print("--> EJERCICIO 08 <--")
  pnombre=0
  pedad=0
  #Datos de entrada
  p1nombre=input("Ingrese Nombre 1ra persona:")
  p1edad=int(input("Ingrese edad 1ra persona:"))
  p2nombre=input("Ingrese Nombre 2da persona:")
  p2edad=int(input("Ingrese edad 2da persona:"))
  p3nombre=input("Ingrese Nombre 3ra persona:")
  p3edad=int(input("Ingrese edad 3ra persona:"))
  #Proceso
  if p1edad<p2edad and p1edad<p3edad: 
   pnombre=p1nombre
   pedad=p1edad
  elif p2edad<p1edad and p2edad<p3edad:
   pnombre=p2nombre
   pedad=p2edad
  else:
   pnombre=p3nombre
   pedad=p3edad
  #Datos de salida
  print("La persona con menor edad es:", pnombre, "y su edad es:", pedad)
Ejercicios08()
print("")

def Ejercicios09():
  #Definir variables y otros
  print("--> EJERCICIO 09 <--")
  dinero=0
  #Datos de entrada
  cantidadX=int(input("Ingrese cantidad de alumnos:"))
  #Proceso
  if cantidadX<20:
   dinero=("70 soles")
  elif cantidadX>=20 and cantidadX<49:
   dinero=("40 soles") 
  elif cantidadX>=50 and cantidadX<=100:
   dinero=("35 soles")
  else:
   dinero=("20 soles")
  #Datos de salida
  print("El costo del pasaje es:", dinero)
Ejercicios09()
print("")

def Ejercicios10():
  #Definir variables y otros
  print("--> EJERCICIO 10 <--")
  numero=0
  #Datos de entrada
  cantidadX=int(input("Ingrese el año de antiguedad:"))
  #Proceso
  if cantidadX<=1: 
   numero=("$100")
  elif cantidadX<=2:
   numero=("$200")
  elif cantidadX<=3:
   numero=("$300")
  elif cantidadX<=4:
   numero=("$400")
  elif cantidadX<=5:
   numero=("$500")
  else:
   numero=("$1000")
  #Datos de salida
  print("El bono por año de antiguedad es:", numero)
Ejercicios10()
print("")