import java.math.BigDecimal;

public abstract class FUNCIOARIO {


    private String nome, codigo;
    public BigDecimal salario;


    public abstract BigDecimal calcularSalario();
    public abstract String dados();
    public Funcionarios(String nome, String codigo, BigDecimal salario) {
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
    public BigDecimal getSalario() {
        return salario;
    }

   

    

    
}