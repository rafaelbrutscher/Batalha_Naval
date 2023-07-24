import java.util.Scanner;
import java.util.Random;

//Esse método é usado para criar o tabuleiro e também mostrar ele pela primeira vez ao usuário
public class tabuleiro {
    public static char[][] tabuleiro(){
        Scanner input = new Scanner(System.in);
        Random gerador = new Random();

        int linha=0, coluna=0;

        //O while serve para o usuário somente conseguir criar um tabuleiro em que os 5 navios consigam entrar
        while(linha*coluna<5){
            System.out.println("Digite o número de linhas do tabuleiro: ");
            linha = input.nextInt();
            System.out.println("Digite o número de colunas do tabuleiro: ");
            coluna = input.nextInt();
            if(linha*coluna<5){
                System.out.println("O tabuleiro precisa ter no mínimo 5 espaços");
                pulaLinha();
            }
        }
        char tab[][] = new char[linha][coluna];
        int linha1=0;
        int coluna1=0;

        //Esse "for" é usado para gerar os navios em posições aleatórias, se a posição gerada já tiver um navio,
        // ele diminui 1 vez o contador e tenta novamente até ter 5 navios no tabuleiro. 'n' significa navios
        for(int cont=0;cont<5;cont++){
            linha1=gerador.nextInt(linha);
            coluna1=gerador.nextInt(coluna);
            if(tab[linha1][coluna1]== 'n'){
                cont--;
            }
            else{
                tab[linha1][coluna1] = 'n';
            }
        }

        //Esse "for" serve para colocar 'a' que significa água nos espaços vazios
        for(int contl=0;contl<linha;contl++){
            for(int contc=0;contc<coluna;contc++){
                if(tab[contl][contc]!='n'){
                    tab[contl][contc] = 'a';
                }
            }
        }

        //e aqui é somente usado para escrever o tabuleiro pela primeira vez
        for(int contl=0;contl<linha;contl++){
            for(int contc=0;contc<coluna;contc++){
                System.out.print("~  ");
            }
            pulaLinha();
        }
        return tab;
    }
    //Esse método "pulaLinha()" foi criado somente para ser uma maneira mais rápida de pular as linhas quando for
    //aparecer na tela o programa
    public static void pulaLinha(){
            System.out.println();
    }
}

