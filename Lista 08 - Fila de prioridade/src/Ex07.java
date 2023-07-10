public class Ex07 {

    /*
    7) Mostre passo a passo como o seguinte vetor de inteiros é ordenado pelo método Heapsort.
    Você deve mostrar apenas a sequência de alterações que são feitas no vetor a cada passo
    do algoritmo.
    22 4 35 12 3 18 12 55
     */


    //Resposta:

    /*
    Vetor original: 22 4 35 12 3 18 12 55
    Depois de construir: 55 35 18 22 3 4 12 12

    Primeira interação:
        Troca a raiz pelo último elemento
        vetor após a troca: 12, 35, 18, 22, 3, 4, 12, 55

    Segunda interação:
    Vetor ordenado:                 55
    Vetor original, reduzido: 12 35 18 22 3 4 12
    Refaço o heap: Troco o 12 pelo 35 e o 22 pelo 18
    Vetor após a troca: 35, 22, 18, 12, 3, 4, 12

    Terceira interação:
    Troca a raiz pelo último elemento:
    Vetor após a troca: 12, 22, 18, 12, 3, 4, 35
    Retiro o 35
    Vetor ordenado:                        35, 55

    Quarta interação:
    Refaço o heap: Troco o 22 pelo 12 e a raiz pelo último
    Após a 1° troca: 22, 12, 18, 12, 3, 4
    Após a 2° troca: 4, 12, 18, 12, 3, 22
    Retiro o 22
    Vetor ordenado:              22,35,55

    Quinta interação:
    Vetor: 4, 12, 18, 12, 3
    Troco o 4 pelo 18
    Vetor após a troca: 18, 12, 4, 12, 3
    Troca raiz pelo último:
    Vetor após a troca: 3, 12, 4, 2, 18
    Retiro o 18
    Vetor ordenado:      18, 22, 35, 55

    Sexta interação:
    Vetor: 3, 12, 4, 12
    Retiro o 12
    Vetor ordenado:         12, 18, 22, 35, 55

    Sétima interação:
    Vetor: 3, 12, 4
    troco 12 pelo 3
    Após a troca: 12, 3, 4
    Comparo 4 com 12, troco novamente
    4, 3, 12.
    Retiro o 12
    Vetor ordenado: 12, 12, 18, 22, 35, 55

    Oitava interação:
    Vetor: 4, 3
    Tem apenas um elemento, vou apenas comparar os dois
    Troco 4 e 3 de lugar
    Vetor: 3, 4

    Resultado: 3, 4, 12, 12, 18, 22, 35
     */


}
