package Disciplina.codes.Classes.Natal;

public class DemoNatal {
    public static void main(String[] args) {
        Natal d1 = new Natal(-13, 2, 2025);
        System.out.println(d1);
        
        Natal d2 = Natal.fabricaDeData(-13, 2, 2025);
        if (d1!=null) System.out.println(d2);

        Natal d3 = Natal.fabricaDeNatal(2025);
        System.out.println(d3);




        

    }
}
