package faculdade2;
public class Faculdade2 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        
        Visitante v1 = new Visitante();
        v1.setNome("Lucas");
        v1.setIdade(24);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Kevin");
        a1.setIdade(23);
        a1.setSexo("M");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Matheus");
        b1.setIdade(24);
        b1.setSexo("M");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        
        Professor p1 = new Professor();
        p1.setNome("Duarte");
        p1.setIdade(45);
        p1.setSexo("M");
        p1.setEspecialidade("Educação Física");
        p1.setSalario(2500f);
        p1.receberAumento(450f);
        
        Técnico t1 = new Técnico();
        t1.setNome("Patrícia");
        t1.setIdade(23);
        t1.setSexo("F");
        t1.setRegistroProfissional("Desenvolvedora Júnior!");
        t1.praticar();
    }

}