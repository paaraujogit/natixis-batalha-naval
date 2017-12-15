package batalhanaval.pa;

import java.util.Random;
import java.util.Scanner;

public class MyBatalhaNaval {

    public static void main(String[] args) {
        int[][] tabuleiro = new int[5][5];
        int[][] navios = new int[3][2];
        int[] tiro = new int[2];
        int tentativas=0,
            acertos=0;
        inicializaTabuleiro(tabuleiro);
        iniciaNavios(navios);
        System.out.println("Jogo Batalha naval 3 navios:");
        do{
            mostraTabuleiro(tabuleiro);
            darTiro(tiro);
            tentativas++;        
            if(acertou(tiro,navios,true))
                acertos++;  
            dica(tiro,navios,tentativas);
            alteraTabuleiro(tiro,navios,tabuleiro);
        }while(acertos<3);
        System.out.println("\n\n\nJogo terminado. Você acertou os 3 navios em "+tentativas+" tentativas");
        mostraTabuleiro(tabuleiro);
    }
    
    public static void inicializaTabuleiro(int[][] tabuleiro){
        for(int linha=0 ; linha < 5 ; linha++ )
            for(int coluna=0 ; coluna < 5 ; coluna++ )
                tabuleiro[linha][coluna]=-1;
    }
    
    public static void mostraTabuleiro(int[][] tabuleiro){
        System.out.println("\t1 \t2 \t3 \t4 \t5");
        System.out.println();
        for(int linha=0 ; linha < 5 ; linha++ ){
            System.out.print((linha+1)+"");
            for(int coluna=0 ; coluna < 5 ; coluna++ ){
                if(tabuleiro[linha][coluna]==-1){
                    System.out.print("\t"+"~");
                }else if(tabuleiro[linha][coluna]==0){
                    System.out.print("\t"+"*");
                }else if(tabuleiro[linha][coluna]==1){
                    System.out.print("\t"+"X");
                }
                
            }
            System.out.println();
        }
    }

    public static void iniciaNavios(int[][] navios){
        Random sorteio = new Random();
        
        for(int navio=0 ; navio < 3 ; navio++){
            navios[navio][0]=sorteio.nextInt(5);
            navios[navio][1]=sorteio.nextInt(5);
            
            //agora vamos confirmar se o tiro acertou (foi sorteado)
            //se foi, so sai do do...while enquanto sortear um diferente
            for(int anterior=0 ; anterior < navio ; anterior++){
                if( (navios[navio][0] == navios[anterior][0])&&(navios[navio][1] == navios[anterior][1]) )
                    do{
                        navios[navio][0]=sorteio.nextInt(5);
                        navios[navio][1]=sorteio.nextInt(5);
                    }while( (navios[navio][0] == navios[anterior][0])&&(navios[navio][1] == navios[anterior][1]) );
            }
            
        }
    }

    public static void darTiro(int[] tiro){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Linha L: ");
        tiro[0] = entrada.nextInt();
        tiro[0]--;
        
        System.out.print("Coluna C: ");
        tiro[1] = entrada.nextInt();
        tiro[1]--;
        
    }
    
    public static boolean acertou(int[] tiro, int[][] navios, boolean show){
        
        for(int navio=0 ; navio<navios.length ; navio++){
            if( tiro[0]==navios[navio][0] && tiro[1]==navios[navio][1]){
            	if(show)
            		System.out.printf("Você acertou o tiro :) [L%d,C%d]\n",tiro[0]+1,tiro[1]+1);
                return true;
            }
        }
        if(show)
        	System.out.printf("Tiro no charco :( [L%d,C%d]\n",tiro[0]+1,tiro[1]+1);
        return false;
    }

    public static void dica(int[] tiro, int[][] navios, int tentativa){
        int linha=0,
            coluna=0;
        
        for(int fila=0 ; fila < navios.length ; fila++){
            if(navios[fila][0]==tiro[0])
                linha++;
            if(navios[fila][1]==tiro[1])
                coluna++;
        }
        
        System.out.printf("\nDica %d: (L%d: %d navios)" +
                                 "(C%d: %d navios)\n",tentativa,tiro[0]+1,linha,tiro[1]+1,coluna);
    }

    public static void alteraTabuleiro(int[] tiro, int[][] navios, int[][] tabuleiro){
        if(acertou(tiro,navios,false))
            tabuleiro[tiro[0]][tiro[1]]=1;
        else
            tabuleiro[tiro[0]][tiro[1]]=0;
    }
}
