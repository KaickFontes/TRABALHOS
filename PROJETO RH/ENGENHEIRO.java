import java.math.BigDecimal;

public class ENGENHEIRO extends  FUNCIONARIO{

    private String crea, departamento;

 @Override

 public BigDecimal calcularSalario(){
    return salario;
 }

 @Override
 public String dados(){
    return "\ncrea" + getCrea() + "\ndepartamento" + getDepartamento() + "\ncodigo" + getCodigo() + "\nnome" + getNome();
 }

    
public ENGENHEIRO(String nome, String codigo, BigDecimal salario, String crea, String departamento) {
    super(nome, codigo, salario);
    this.crea = crea;
    this.departamento = departamento;
}




    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}