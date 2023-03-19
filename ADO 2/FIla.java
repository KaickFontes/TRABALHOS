public class FIla {

    Object[] elementos = new Object [5];
    int fim = -1;
    int ini = 0;
    int tam = 0;

    void enfileirar (Object valor) {
        if (tam == elementos.length) {
            System.out.println("Fila Cheia, você colocou mais de 6 pessoas que é o máximo da fila");
        } else {
          if  (fim == elementos.length - 1) {
            fim = -1;
          }

          fim++;

          elementos[fim] = valor;

          tam++;

        }
    }

    Object desenfileirar() {
        if (!isEmpty()) {
            Object temp = elementos[ini];
            elementos[ini] = null;
            ini++;
            if (ini == elementos.length) {
                ini = 0;
            }
            tam--;
            return temp;

        } else {
            System.out.println("Fila Vazia");
            return null;
        }
    }
    
    Object frente () {
        if (!isEmpty()) {
            return elementos[ini];
        } else {
            System.out.println("Fila Vazia");
            return null;
        }
    }

    boolean isEmpty() {
        return tam == 0;
    }

    int size() {
        System.out.println("Quantidade de pacientes por ordem de chegada " +tam);
        return fim;
    }

    void imprimir() {
        for (int i = 0; i < tam; i++) {
            System.out.println(frente() + " ");
            enfileirar(desenfileirar());
        }

        System.out.println();
    }
}
