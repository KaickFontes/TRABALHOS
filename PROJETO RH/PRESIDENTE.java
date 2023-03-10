import java.math.BigDecimal;

public final class Presidente extends Funcionarios{

    private BigDecimal cota;

    @Override
    public String dados(){
        return "\nnome"+getNome()+"ncodigo"+getCodigo();
    }

    @Override
    public BigDecimal calcularSalario(){
        return getSalario();
    }

    public Presidente(String nome, String codigo, double salario, BigDecimal cota) {
        super(nome, codigo, salario);
        this.cota = cota;
    }

    public BigDecimal getCota() {
        return cota;
    }
    
    
}