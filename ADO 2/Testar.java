import java.util.Scanner;

public class Testar {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        String paciente1;
        String paciente2;
        String paciente3;
        String paciente4;
        String paciente5;
        int pular;
        
    
    
        FIla fila = new FIla();

        System.out.println("Por favor digite o nome dos pacientes para doação de Sangue em ordem de chegada (máximo de 5 por fila) ");
        paciente1 = entrada.next();
        paciente2 = entrada.next();
        paciente3 = entrada.next();
        paciente4 = entrada.next();
        paciente5 = entrada.next();
        

        
        fila.enfileirar(paciente1);
        fila.enfileirar(paciente2);
        fila.enfileirar(paciente3);
        fila.enfileirar(paciente4);
        fila.enfileirar(paciente5);
         

        fila.size();
        fila.imprimir();


        System.out.println("O paciente " + paciente1 + " foi atendido, aperte 1 para continuar");
        pular = entrada.nextInt();
        fila.desenfileirar();

        if (pular == 1) {

        fila.size();
        fila.imprimir();
        }

        System.out.println("O paciente " + paciente2 + " foi atendido, aperte 1 para continuar");
        pular = entrada.nextInt();
        fila.desenfileirar();

        if (pular == 1) {

        fila.size();
        fila.imprimir();
        }

        System.out.println("O paciente " + paciente3 + " foi atendido, aperte 1 para continuar");
        pular = entrada.nextInt();
        fila.desenfileirar();

        if (pular == 1) {

        fila.size();
        fila.imprimir();
        }

        System.out.println("O paciente " + paciente4 + " foi atendido, aperte 1 para continuar");
        pular = entrada.nextInt();
        fila.desenfileirar();

        if (pular == 1) {

        fila.size();
        fila.imprimir();
        }

        System.out.println("O paciente " + paciente5 + " foi atendido, a fila está vazia, aperte 1 para continuar");
        pular = entrada.nextInt();
        fila.desenfileirar();

        if (pular == 1) {

        fila.desenfileirar();   
        
        }

    }
    
}
