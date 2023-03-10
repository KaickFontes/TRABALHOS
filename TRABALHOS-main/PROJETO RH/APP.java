public class APP {
  
    public static void main(String[] args) throws Exception {
        
     var ger = new GERENTE("lucas",   "1", 800, "GERENTE", 200);  

     System.out.println(ger.dados()+ger.calcularSalario());
    }
}