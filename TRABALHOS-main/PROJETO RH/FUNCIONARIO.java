

public abstract class FUNCIONARIO {


    private String nome, codigo;
    public double salario;


    public abstract double calcularSalario();
    public abstract String dados();
    
    public FUNCIONARIO(String nome, String codigo, double salario) {
        this.nome = nome;
        this.codigo = codigo;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public double getSalario() {
        return salario;
    }

   

    

    
}