// Classe que representa a árvore binária
public class ArvoreBinaria {
    Node raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    // Inserir com recursividade
    public void inserir(int valor) {
        // Se não tiver raiz cria uma
        if (raiz == null) {
            raiz = new Node(valor);
        } else {
            // Chamada do método recursivo
            inserirRecursivamente(raiz, valor);
        }
    }


    private void inserirRecursivamente(Node atual, int valor) {
        // Se o valor for menor, vai pra esquerda
        if (valor < atual.valor) {
            if (atual.esquerda == null) {
                atual.esquerda = new Node(valor);
            } else {
                inserirRecursivamente(atual.esquerda, valor);
            }
        // Se o valor for menor vai pra  direita
        } else if (valor > atual.valor) {
            if (atual.direita == null) {
                atual.direita = new Node(valor);
            } else {
                inserirRecursivamente(atual.direita, valor);
            }
        }
    }

    // Buscar com recursividade
    public boolean buscar(int valor) {
        return buscarRecurcivamente(raiz, valor);
    }

    private boolean buscarRecurcivamente(Node atual, int valor) {
        // Caso cehgue em um valor vazio significa que ele não existe na árvore
        if (atual == null) {
            return false;
        }
        // Se encontrar o valor retorna verdadeiro
        if (atual.valor == valor) {
            return true;
        }

        // Se for menor procura na esquerda
        if (valor < atual.valor) {
            return buscarRecurcivamente(atual.esquerda, valor);
        // Se for maior procura na direita
        } else {
            return buscarRecurcivamente(atual.direita, valor);
        }
    }


    // Mostrar em pré-ordem
    public void mostrarPreOrdem(Node no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            mostrarPreOrdem(no.esquerda);
            mostrarPreOrdem(no.direita);
        }
    }


    // Mostrar em ordem
    public void mostrarEmOrdem(Node no) {
        if (no != null) {
            mostrarEmOrdem(no.esquerda);
            System.out.print(no.valor + " ");
            mostrarEmOrdem(no.direita);
        }
    }


    // Mostrar em pós-ordem
    public void mostrarPosOrdem(Node no) {
        if (no != null) {
            mostrarPosOrdem(no.esquerda);
            mostrarPosOrdem(no.direita);
            System.out.print(no.valor + " ");
        }
    }
}
