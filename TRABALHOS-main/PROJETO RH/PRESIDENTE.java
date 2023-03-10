

public final class PRESIDENTE extends FUNCIONARIO{

    private double cota;

    @Override
    public String dados(){
        return " \nnome "+getNome()+" ncodigo "+getCodigo();
    }

    @Override
    public double calcularSalario(){
        return getSalario()+getCota();
    }

   

    public PRESIDENTE(String nome, String codigo, double salario, double cota) {
        super(nome, codigo, salario);
        this.cota = cota;
    }

    public double getCota() {
        return cota;
    }
    
    
}