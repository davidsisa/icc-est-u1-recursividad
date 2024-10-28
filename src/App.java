public class App {
    public static void main(String[] args) throws Exception {
        Recursividad rec = new Recursividad();
        int resultado = rec.factorial(5);
        System.out.println(" : " + resultado);
        int resultado2 = rec.sumaConsecutivos(10);
        System.out.println(":" + resultado2);
        int resultado3 = rec.potencia(5, 2);
        System.out.println(":potencia " + resultado3);
        int resultado4 = rec.sumDigitos(465);
        System.out.println(resultado4);
     }
}
