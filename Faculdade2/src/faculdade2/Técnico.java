package faculdade2;
public class Técnico extends Aluno{
    private String registroProfissional;
    
    public void praticar() {
        System.out.println("Estou praticando " + this.registroProfissional);
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
