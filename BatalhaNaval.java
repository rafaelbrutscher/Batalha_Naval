public class BatalhaNaval {
    public static void main (String args[]){
            //Aqui é onde eu chamo o método jogada
            jogada play = new jogada();

            System.out.println("  ____       _      _____      _      _       _   _      _        _   _      _     __     __     _      _     \n" +
                    " | __ )     / \\    |_   _|    / \\    | |     | | | |    / \\      | \\ | |    / \\    \\ \\   / /    / \\    | |    \n" +
                    " |  _ \\    / _ \\     | |     / _ \\   | |     | |_| |   / _ \\     |  \\| |   / _ \\    \\ \\ / /    / _ \\   | |    \n" +
                    " | |_) |  / ___ \\    | |    / ___ \\  | |___  |  _  |  / ___ \\    | |\\  |  / ___ \\    \\ V /    / ___ \\  | |___ \n" +
                    " |____/  /_/   \\_\\   |_|   /_/   \\_\\ |_____| |_| |_| /_/   \\_\\   |_| \\_| /_/   \\_\\    \\_/    /_/   \\_\\ |_____|\n" +
                    "                                                                                                              ");
            System.out.println();
            System.out.println("Esse é o BATALHA NAVAL, o jogo onde você deve acertar os navios inimigos que estão escondidos no tabuleiro... ");
            System.out.println("O tabuleiro contém 5 navios de tamanho 1x1");
            System.out.println("Primeiro você deve definir o tamanho do tabuleiro (mínimo 2x3 ou 3x2)");
            System.out.println();

            //o tabuleiro.tabuleiro() é usado para gerar o tabuleiro do tamanho que o usuário quiser, com os navios
            //sendo gerados aleatóriamente
            char tab[][] = tabuleiro.tabuleiro();
            int nlinha = tab.length;
            int ncoluna = tab[0].length;

            //O método "jogada" que eu chamei é usado aqui, passando o número de linhas e colunas para o método "jogada"
            //e também executando o mesmo com o "jogar()", assim repetindo jogadas até terminar a partida
            play.linha = nlinha;
            play.coluna = ncoluna;
            play.jogar(tab);
    }
}
