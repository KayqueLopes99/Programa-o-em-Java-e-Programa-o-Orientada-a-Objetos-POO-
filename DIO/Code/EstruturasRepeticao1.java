package DIO.Code;

public class EstruturasRepeticao1 {
    public static void main(String[] args) {
        int count = 0;
        while(count < 10){
            System.out.print(count + " ");
            count += 1;
        }
        int numero = 7;
        int resultado;
        System.out.println("\n-- Tabuada --");

        for (int i = 0; i <= 10; i++) {
            resultado = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, resultado);
            
        }


    }
    
}
