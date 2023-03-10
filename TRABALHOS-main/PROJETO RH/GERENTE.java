

public class GERENTE extends FUNCIONARIO{

    private String area; 
     private double bonus;
   
    

    public GERENTE(String nome, String codigo, double i, String area, double j) {
        super(nome, codigo, i);
        this.area = area;
        this.bonus = j;
    }

    @Override
    public String dados(){
        return " \narea " + getArea() + " \nnome " + getNome() + " \ncodigo " + getCodigo();   }

        @Override
        public double calcularSalario(){
            return getSalario() ;
        }

        public double getBonus() {
                return bonus;
            }
     public String getArea() {
        return area;
    }
    
}