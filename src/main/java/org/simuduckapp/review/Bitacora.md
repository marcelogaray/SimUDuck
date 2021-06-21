##Bitacora

#Pasos acorde fue el avance

1. Cree el proyecto maven y empeze revisar funcionalidad basica
   DuckTest
   * testSimpleJunitFive()
   * testSoundsMultipleInputs(String sound)

2. Creacion de la herencia Duck padre y clases hijas: MallardDuck y ReadheadDuck

3. Nuevo requerimiento fue Fly
   * Primera falla realizada sobre la clase Duck, donde se agrego fly()
4. No todos los patos vuela, por la nueva implementadion de "Pato de goma"

5. segundo requerimiento nuevo pato "Readhead duck" y los problemas incrementan, 
   ya q se verifica que  "DecoyDuck" su metodo fly no hace nada
   
6. Primer intento de uso de interfaces Flyable, y Quackable, pero de igual manera
   no cubre el requerimiento que no todos los patos vuelvan. Sin embargo esta interface 
   quien la usa, la obligara a implementarla

7. Dando solucion al tema de comportamientos propios, flexibilidad adeacuada, sin embargo
   aun existe el problema de la comportamiento de duck
   
8. Reconociendo los paquetes, organizando mejor las clases, pero pese a esta buena solucion
   aun existe el problema de instanciacion de las clases