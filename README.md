**primer ejercicio¡**
habia obtenido un error porque en el primer codigo porque metì todo dentro del primer for, haciendo que por cada linea de codigo me diera cada que leia un dato el promedio y la cantidad total producida.
**correcciòn del codigo** 
aplique mas o menos un sdlc pa5ra poder ordenar mi algoritmo y aplicarle una mejor logica.
 
 **analisis de datos**
 El objetivo es crear un programa para monitorear el consumo de agua en 10 sectores urbanos/agrícolas.

• **Entradas:** Consumos individuales (enteros no negativos).

• **Salidas:** Consumo total, promedio, sector con mayor consumo, cantidad de sectores sobre el promedio, racha más larga de sectores sobre el promedio y resumen por sector.

**paso a paso de mi codigo**
**entrada de datos**
Se crea un arreglo de 10 posiciones para almacenar cada sector.Se usa un ciclo for para iterar desde el sector 1 hasta el 10.Dentro del ciclo, el while (consumo[i] < 0) actúa como filtro de validación: no permite continuar hasta que el usuario ingrese un valor.A medida que se valida cada dato, se suma al acumulador total.
**promedio y sector de mayor consumo**
Se realiza un casting explícito (double) sobre total. Esto es clave para evitar la división entera y obtener la precisión decimal del promedio.

lueglo, para calcular el sector de mayor consumo se asume temporalmente que el primer sector (consumo[0]) tiene el valor más alto.

Se recorre el arreglo: si se encuentra un valor mayor al registrado en mayor, se actualiza tanto el valor máximo como la posición del sector (i + 1).
**para la racha y el conteo de sectores sobre promedio**
cantidad: Cuenta cuántos sectores superan la media matemática.

racha y mayorRacha: Evalúan sectores consecutivos que superan la media. Si el sector actual supera el promedio, la racha aumenta en 1; si no, la racha actual se reinicia a 0. Se conserva el récord histórico en mayorRacha.
**resultados**
Se imprimen los consolidados finales e históricos por sector mediante líneas divisorias.

leer.close() libera la memoria asignada al objeto Scanner.

**segundo ejercicio**
en el segundo ejercicio empecè quemando valores en la matriz por problemas de tiempo y no logrè terminar el algoritmo.

**correcòn de errores**
apliquè un paso a paso en mi logica logaritmica.

**declaracion de variables**
longitudfilas y longitudcolumnas: Definen las dimensiones fijas de la matriz .matriz: Es la estructura donde se almacenan las 20 entradas .suma, sumadias, sumatotal: Variables acumuladoras para las distintas etapas de cálculo.
se evalua para que si ingresan un numero negativo, diga que error y reitere al print 

**calculo de la produccion por maquina y la mayor cantidad producida**
El recorrido por Filas  mantiene fija la fila j (máquina) y suma todos los días k que pertenecen a esa fila.

Imprime el total producido por la máquina actual.

Compara el acumulado suma con mayorMaquina. Si es superior, actualiza la mayor producción encontrada y guarda la posición de la máquina en posicionMayor

**calculo de produccion por dia y el minimo de produccion**
El recorrido por Columnas mantiene fija la columna k (día) e iterando las filas j suma la producción de todas las máquinas en ese mismo día.

Imprime el total producido en el dia.
para calcular la menor produccion; La condición k == 0 permite inicializar menorDia con el valor del primer día. En los días subsiguientes, si sumadias < menorDia, se actualiza el valor mínimo y la variable posicionMenor

**mostrar las veces que la producciòn por dia fue inferior a 20**
Recorre de nuevo la matriz celda por celda con un nuevo for pero esta vez con un if que evalue que si la matriz {j}{k} es menor a 20, a la variable menores20 se le sume 1.

Cada vez que encuentra un registro donde las piezas producidas son estrictamente menores a 20, incrementa el contador menores20.

**imprimir resultados y la matriz completa**

Imprime la matriz en forma de cuadrícula mediante saltos de línea al término de cada fila.

Muestra el resumen consolidado empleando System.out.println para generar las líneas divisoras.

Cierra la lectura del escáner mediante leer.close().


