public class ListaEncadeada {
    No cabeca;
    int contagem = 0;

    public void addValor(Contas conta){
        No novoValor = new No(conta);

        if (contagem == 0){
            this.cabeca = novoValor;
        } else {
            No atual = cabeca;

            while (atual.proximo != null){
                atual = atual.proximo;
            }
            atual.proximo = novoValor;
        }
    }

    public void remover(int valor){
        No atual = cabeca;

        while (atual.proximo != null){
            atual = atual.proximo;
            while (atual.proximo != null){
                if ()
            }
        }
    }
}
