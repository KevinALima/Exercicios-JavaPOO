package exercício09;
public class Exercício09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Kevin", 23, "M");
        p[1] = new Pessoa("Paty", 22, "F");
        
        l[0] = new Livro("Elefantes Voadores", "Aleh Lima", 100, p[0]);
        l[1] = new Livro("A volta dos que não foram", "Linda Lovely", 150, p[1]);
        l[2] = new Livro("Como fazer uma chuca bem feita", "LGBT", 30, p[1]);
        
        System.out.println(l[0].detalhes());
    }

}