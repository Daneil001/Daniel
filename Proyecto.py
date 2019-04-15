class Automovil:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo

    def andar (self, direccion):
        print("estoy andando para ", direccion)

    def frenar (self):
        print("estoy frenando")

Honda = Automovil("Honda","crv")
Honda.andar("derecha")
Honda.frenar()