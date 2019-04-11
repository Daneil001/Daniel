def factorial(variable1, variable2):
    if(variable2>0):
        variable1= variable1*variable2
        variable1= factorial(variable1,variable2-1)
        return variable1
    else:
        return variable1

numero = int(input("inserte numero"))
calculo = factorial(1, numero)
print("el factorial de variable1 es variable2", calculo)
