import java.util.Scanner;
public class jogada {
    Scanner input=new Scanner(System.in);

    //Os inteiros "linha" e "coluna" vão servir para pegarem o total de linhas e colunas do tabuleiro, eles vão pegar
    //essas informações do arquivo "BatalhaNaval.java"
    int linha;
    int coluna;

    //Esse método "jogar()" vai ser usado para cada jogada do usuário
    public void jogar(char tabuleiro[][]){
        int navio = 5, contador = 0;

        //Esse while que mantém o usuário jogando enquanto ainda tem navios escondidos
        while (navio > 0) {
            contador++;
            int jogadalinha = linha+1, jogadacoluna = coluna+1;


            //Os dois "while" abaixo vão servir para o usuário digitar em qual linha e coluna ele quer atacar, o while
            //é necessário para não deixar o usuário selecionar um lugar que não está no tabuleiro
            while(jogadalinha>=linha || jogadalinha < 0) {
                System.out.println("Faça sua jogada \nEscolha a posição da linha: ");
                jogadalinha = input.nextInt()-1;
                if(jogadalinha>=linha){
                    System.out.println("POSIÇÃO INVÁLIDA");
                    System.out.println();
                }
            }
            while(jogadacoluna>=coluna || jogadacoluna < 0) {
                System.out.println("Escolha a posição da coluna: ");
                jogadacoluna = input.nextInt()-1;
                if(jogadacoluna>=coluna){
                    System.out.println("POSIÇÃO INVÁLIDA");
                    System.out.println();
                }
            }

            //A partir daqui são somente os comandos necessários para escrever o tabuleiro de novo, então as posições que
            // não foram jogadas ficam com "~" , as posições que o usuário atacou e errou ficam com "O" e as que ele
            //acertou com "X"
            if(tabuleiro[jogadalinha][jogadacoluna] == 'n'){
                tabuleiro[jogadalinha][jogadacoluna] = 'x';
                for(int contl=0;contl<linha;contl++){
                    for(int contc=0;contc<coluna;contc++){
                        if(tabuleiro[contl][contc] == 'x'){
                            System.out.print("X  ");
                        }
                        else if(tabuleiro[contl][contc] == 'o'){
                            System.out.print("O  ");
                        }
                        else{
                            System.out.print("~  ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println("Você ACERTOU!");
                System.out.println();
                System.out.println();
                navio--;
            }
            else if(tabuleiro[jogadalinha][jogadacoluna] == 'a'){
                tabuleiro[jogadalinha][jogadacoluna] = 'o';
                for(int contl=0;contl<linha;contl++){
                    for(int contc=0;contc<coluna;contc++){
                        if(tabuleiro[contl][contc] == 'o'){
                            System.out.print("O  ");
                        }
                        else if(tabuleiro[contl][contc] == 'x'){
                            System.out.print("X  ");
                        }
                        else{
                            System.out.print("~  ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println("Você ERROU!");
                System.out.println();
                System.out.println();
            }
            else{
                System.out.println();
                System.out.println("Essa posição já foi atacada");
                System.out.println();
            }

        }
        //O contador foi usado para dizer em quantas tentativas o usuário terminou o jogo
        System.out.println("  ____       _      ____       _      ____    _____   _   _   ____  \n" +
                " |  _ \\     / \\    |  _ \\     / \\    | __ )  | ____| | \\ | | / ___| \n" +
                " | |_) |   / _ \\   | |_) |   / _ \\   |  _ \\  |  _|   |  \\| | \\___ \\ \n" +
                " |  __/   / ___ \\  |  _ <   / ___ \\  | |_) | | |___  | |\\  |  ___) |\n" +
                " |_|     /_/   \\_\\ |_| \\_\\ /_/   \\_\\ |____/  |_____| |_| \\_| |____/ \n" +
                "                                                                    ");
        System.out.println("Você venceu com "+contador+" tentativas!");
    }
}
