package Arvore;

public class ArvoreBinaria {

    private Folha folha;
    private ArvoreBinaria esquerda;
    private ArvoreBinaria direita;

    public ArvoreBinaria() {
        this.folha = null;
        this.esquerda = null;
        this.direita = null;
    }

    public ArvoreBinaria(Folha folha) {
        this.folha = folha;
        this.esquerda = null;
        this.direita = null;
    }

    public boolean isEmpty() {
        return this.folha == null;
    }

    public void inserir(Folha novo) {
        if (isEmpty()) {
            this.folha = novo;
        } else {
            ArvoreBinaria novaArvore = new ArvoreBinaria(novo);
            if (novo.getValor() < this.folha.getValor()) {
                if (this.esquerda == null) {
                    this.esquerda = novaArvore;
                } else {
                    this.esquerda.inserir(novo);
                }
            } else if (novo.getValor() > this.folha.getValor()) {
                if (this.direita == null) {
                    this.direita = novaArvore;
                } else {
                    this.direita.inserir(novo);
                }

            }
        }
    }
}
