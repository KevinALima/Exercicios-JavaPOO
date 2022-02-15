package faculdade2;
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAumento(float Aumento) {
        this.salario += Aumento;
        System.out.println("O professor " + this.nome + " recebeu um aumento e seu salário agora é " + salario);
    }

    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
