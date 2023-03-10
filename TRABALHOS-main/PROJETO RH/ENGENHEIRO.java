public class ENGENHEIRO extends  FUNCIONARIO{

    private String crea, departamento;

 @Override

 public double calcularSalario(){
    return salario;
 }

 @Override
 public String dados(){
    return "\ncrea " + getCrea() + " \n departamento" + getDepartamento() + "\ncodigo" + getCodigo() + "\nnome" + getNome();
 }


    public ENGENHEIRO(String nome, String codigo, Double salario, String crea, String departamento) {
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