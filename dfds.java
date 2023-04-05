import javax.swing.plaf.synth.SynthStyleFactory;

public class dfds{
    public static void main(String[] args) {
        //이중 반복문
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("=========================================");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 4-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("=========================================");
        //구구단
        int a=0,b=0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=" + j*i);
                System.out.print("     ");
            }
            System.out.println("");
        }
        //치킨집
        //for문
        System.out.println("=========================================");
        int max=20;
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i+"번 손님, 주문하신 치킨 나왔습니다.");
            if(i==max){
                System.out.println("금일 재료가 모두 소진되었습니다."); break;


            }
            System.out.println("영업을 종료하겠습니다.");
        }
        System.out.println("=========================================");


        //while문
        int indax=1;//손님 대기번호
        while(indax<=50){
            System.out.println(indax+"번 손님 주문하신 치킨 나왔습니다.");
            if(indax==max){
                System.out.println("금일 재료가 모두 소진되었습니다."); break;
            }
            indax++;
        }
        System.out.println("영업을 종료하겠습니다. ");       




    }
}