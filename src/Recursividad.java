public class Recursividad {
    public int  factorial (int n){
        System.out.println("Calculando el factorial de:  " + n );
        //Caso base: n sea 0! y 1! son iguales a 1
        if(n == 0 || n == 1){
            System.out.println("Caso base alcanzado el factorial de " + n + " es 1 ");
            return 1;
        } 
        int resultado =  n * factorial( n - 1);
        System.out.println("Resultado parcial de  " + n + " factorial ("+ ( n - 1) +")  = " + resultado );
        return resultado;
    }
    //Calcular la suma de los numeros consecutivos
    public int sumaConsecutivos(int n){
        if(n == 1 ){
            return 1;
        }
        return n + sumaConsecutivos(n - 1);
    }
    //Calcular la potencia de numero
    public int potencia(int base , int exponente ){
        if(exponente  == 0){
            return 1;

        }
        return base * potencia(base, exponente - 1);

    }
    //Crear un metodo que sume los digitos de un numero
    //Si mando 456 me da 15
    // 4 + 5 + 6
    public  int sumDigitos(int digito){
        if (digito < 10) {
            return digito;
        }
        int ultimo = digito % 10;
        return ultimo + sumDigitos(ultimo);

    }
}