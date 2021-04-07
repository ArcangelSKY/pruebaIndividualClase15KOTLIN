fun main(p:Array<String>){
    //desafioUno()
    //desafioDos()
    //desafioTres()
    //desafioCinco()
    //desafioSeis()
}

fun desafioUno(){
    var suma = 0
    var nCuenta = 0
    do {
        print("Ingrese el numero de cuenta: ")
        val cuenta = readLine()!!.toInt()
        if (cuenta>0) {
            print("Ingrese el Saldo$: ")
            val saldo = readLine()!!.toInt()
            if (saldo < 0) {
                println("Su cuenta $cuenta es DEUDORA")
            } else if (saldo > 0) {
                println("Su cuenta $cuenta es ACREEDORA")
            } else {
                println("Su cuenta $cuenta es NULO")
            }

            suma = suma + saldo
            nCuenta = nCuenta + 1
            println("Se ingreso la cantidad de $nCuenta Cuentas, teniendo un total de $$suma Saldo")
            println("Para salir ingrese en cuenta valor -1")
        }
    }while (cuenta>0)

}
fun desafioDos(){

    println("Cuantos puntos desea ingresar para calcular las coordenadas X e Y")
    val puntos = readLine()!!.toInt()
        for (i in 1..puntos){
            print("Ingrese el $i punto de X: ")
            val x= readLine()!!.toInt()
            print("Ingrese el $i punto de Y: ")
            val y= readLine()!!.toInt()
            when{
                x>0 && y>0-> println("Cuadrante 1 //: puntos (X,Y)=($x,$y)")
                x<0 && y>0-> println("Cuadrante 2 //: puntos (X,Y)=($x,$y)")
                x<0 && y<0-> println("Cuadrante 3 //: puntos (X,Y)=($x,$y)")
                x>0 && y<0-> println("Cuadrante 4 //: puntos (X,Y)=($x,$y)")
                else -> println(" Datos no corresponde a ningun valor")
            }
        }
}
fun desafioTres(){
    var pos = 0
    var neg = 0
    var multQuince =0
    var parAcum = 0

    for (x in 1..10){
        print("Ingrese el $x numero entero: ")
        val num = readLine()!!.toInt()
        if (num > 0) {
            pos++
            if (num%15 == 0 ) multQuince++
            if (num%2==0) parAcum = parAcum + num
        }else {
            neg++
        }

    }
    println("La cantidad de valores positivos: $pos")
    println("La cantidad de valores negativos: $neg")
    println("La cantidad de multiplos de 15: $multQuince")
    println("El valor acumulado en los numeros ingresados que son pares son: $parAcum")

}
fun desafioCuatros(){

    var equi = 0
    var isos = 0
    var esca = 0
    print("Ingrese la cantidad de triangulos a calcular sus lados: ")
    var nTriangulo = readLine()!!.toInt()
    for (i in 1..nTriangulo){
        print("Ingresa el lado A: ")
        val a = readLine()!!.toInt()
        print("Ingresa el lado B: ")
        val b = readLine()!!.toInt()
        print("Ingresa el lado C: ")
        val c = readLine()!!.toInt()
        when{
            (a == b && b == c && c==a)->{
                println("Es un triangulo EQUILATERO")
                 equi++
            }
            (a == b || a == c || b == c)->{
                println("Es un triangulo ISOSCELES")
                isos++
            }
            else->{
                println("es un triangulo ESCALENO")
                esca++
            }
        }
    }
    println("la cantidad de triangulos EQUILATERO: $equi")
    println("la cantidad de triangulos ISOSCELES: $isos")
    println("la cantidad de triangulos ESCALENO: $esca")
}

fun desafioCinco(){
    primer()
    println("***********************************************************")
    segundo()
}
fun primer(){
    println("EL cuadrado de un entero")
    print("Ingrese un valor entero: ")
    val num1 = readLine()!!.toInt()
    println("El cuadrado ${Math.pow(num1.toDouble(),2.0)}")

}
fun segundo(){
    println("Ingrese el primer valor: ")
    var num1 = readLine()!!.toInt()
    println("Ingrese el segundo valor: ")
    var num2 = readLine()!!.toInt()
    print("el producto de los valores $num1 * $num2 = ${num1*num2} ")
}

fun desafioSeis(){

    ingresoDatos()
    ingresoDatos()

}

fun ingresoDatos(){
    println("Ingrese el primer valor: ")
    var num1 = readLine()!!.toInt()
    println("Ingrese el segundo valor: ")
    var num2 = readLine()!!.toInt()
    println("Ingrese el segundo valor: ")
    var num3 = readLine()!!.toInt()
    println("El numero menor (${numMenor(num1,num2,num3)}) de la serie: $num1 // $num2 // $num3")
}

fun numMenor(num1:Int, num2:Int, num3:Int):Int{

    if (num1 < num2 && num1 < num3 ){
        return num1
    }else if(num2 < num3 && num2 < num1 ){
        return num2
    }else{
        return num3
    }
}
