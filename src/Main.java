import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        while (true){

            System.out.println("1 = 25 minutos");
            System.out.println("2 = 5 minutos de descanço");
            System.out.println("3 = Frachar");
            System.out.println("Escolha um numero");
            int setnumero = entrada.nextInt();
            if(setnumero == 1){

                System.out.println("25 minutos de Foco Total.");
                System.out.println("Começa em");
                for(int i =5; i >= 0; i--){

                    System.out.println(i);
                    try {
                        Thread.sleep(1000);

                    }catch (InterruptedException e){

                        e.printStackTrace();
                    }
                }


                for(int i = 1; i <= (60 * 25); i++){
                    System.out.println(i);
//                 try {
//                    Thread.sleep(1000);
//                  }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
                }
            } else if (setnumero == 2) {
                System.out.println("5 minutos de descanso.");
                System.out.println("Começa em");
                for(int i =5; i >= 0; i--){
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                for(int i = 1; i <= (60 * 5); i++){
                    System.out.println(i);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                }
                System.out.println("Tempo de descanço terminou!");
            } else if (setnumero == 3) {
                System.out.println("Obrigado por usar nosso software");
                break;
            } else{
                System.out.println("Não temos essa opção no momento, tente denovo.");
            }
        }
        }
}