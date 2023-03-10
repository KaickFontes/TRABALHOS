public class APP {
  
    public static void main(String[] args) throws Exception {

        int codigo;
        Object area;
        Object nome;
        Object bonus;
        double salario;
        
        Gerente gerente = new gerente(codigo, nome , salario , area , bonus);
        System.out.println(gerente.dados() + gerente.getSalario());
    }
}