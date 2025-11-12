public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // Números para criação da árvore
        int[] valores = {8, 3, 10, 1, 6, 14, 4, 7, 13};
        for (int v : valores) {
            arvore.inserir(v);
        }

        // Busca
        System.out.println("Buscar 7: " + arvore.buscar(7));
        System.out.println("Buscar 2: " + arvore.buscar(2));

        // Ordens
        System.out.println("\nPré-ordem:");
        arvore.mostrarPreOrdem(arvore.raiz);

        System.out.println("\n\nEm ordem:");
        arvore.mostrarEmOrdem(arvore.raiz);

        System.out.println("\n\nPós-ordem:");
        arvore.mostrarPosOrdem(arvore.raiz);

        System.out.println();
    }
}
