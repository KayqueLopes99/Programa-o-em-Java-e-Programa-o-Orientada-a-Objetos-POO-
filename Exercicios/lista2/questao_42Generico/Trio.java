package lista2.questao_42Generico;
public class Trio <T> {
    private T a, b, c;

    public Trio(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int contarIguais() {
        int iguais = 0;

        if (a.equals(b) && a.equals(c)) {
            iguais = 3;
        } else if (a.equals(b) || a.equals(c) || b.equals(c)) {
            iguais = 2;
        } else {
            iguais = 0;
        }

        return iguais;
    }

    public void imprimir() {
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
    }
 
}