package DIO.Code;

public class EstruturasCondicionais6 {
    public static void main(String[] args) {
        int dia = 7;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final De Semana");
                break;
            
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
               System.out.println("Dia Util");
               break;
            default:
            System.out.println("Dia Invalido");
                break;

        }

    }
}

