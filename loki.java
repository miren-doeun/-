import java.util.*;


public class loki{
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        int[] num=new int[5];
        
        int max=0,i=1;

        System.out.println("정수 5개를 입력해 주세요");

        while(i<5){
            System.out.println(i+"번째 정수를 입력해 주세요");
            num[i]=sc.nextInt();

            if(max<num[i]){
                max=num[i];
            }
            i++;
        }
        System.out.println("5개의 정수중 가장 큰 수는"+max+"입니다.");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 3; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        for (int i = 1; i < 4 ; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println("");
        }
        Scanner sc=new Scanner(System.in);
        int month=0;
        System.out.print("달 입력:");
        month=sc.nextInt();
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println(month+"월은 31일입니다."); break;
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println(month+"월은 30일입니다."); break;
            case 2:
            System.out.println(month+"월은 28일입니다."); break;
            default:
            System.out.println("존재하지 않습니다."); break;
        }
        Scanner sc=new Scanner(System.in);
        String[] name=new String[2];
        int[][] score=new int[2][3];
        int sum=0;
        double avg=0;

        for (int i = 0; i < 2; i++) {
            System.out.print("학생"+(i+1)+" 이름 입력:");
            name[i]=sc.next();
            for (int j = 0; j < 3; j++) {
                System.out.print("성적"+(j+1)+"입력:");
                score[i][j]=sc.nextInt();
            }
        }
        System.out.println("***************입력 완료****************");
        for (int i = 0; i < 2; i++) {
            sum=0;
            for (int j = 0; j < 3; j++) {
                sum+=score[i][j];
            }
            System.out.println(name[i]+"학생의 총점은"+sum+"점이고");
            avg=sum/3.0;
            System.out.printf("평균은 %.2f점 입니다.\n",avg);
            if(avg>=90)
                  System.out.println("학생의 학점은 A입니다.");
            else if(avg>=80)
                  System.out.println("학생의 학점은 B입니다.");
            else if(avg>=70)
                  System.out.println("학생의 학점은 C입니다.");
            else if(avg>=90)
                  System.out.println("학생의 학점은 D입니다.");
            else
                  System.out.println("학생의 학점은 F입니다.");
        }

        Scanner sc=new Scanner(System.in);
        String[] name=new String[2];
        int[][] score=new int[2][3];
        int sum=0;
        double avg=0;

        for (int i = 0; i < 2; i++) {
            System.out.print("학생"+(i+1)+"이름 입력:");
            name[i]=sc.next();
            for (int j = 0; j < 3; j++) {
                System.out.print("성적"+(j+1)+"입력:");
                score[i][j]=sc.nextInt();
            }

        }
        System.out.println("**********입력완료**********");
        for (int i = 0; i < 2; i++) {
            sum=0;
            for (int j = 0; j < 3; j++) {
                sum+=score[i][j];
            }
            System.out.print(name[i]+"학생의 총점은"+sum+"점이고, ");
            avg=sum/3.0;
            System.out.printf("평균은 %.2f점 입니다.\n",avg);
            if(avg>=90)
                System.out.println(name[i]+"학생의 학점은 A입니다.");
            else if(avg>=80)
                System.out.println(name[i]+"학생의 학점은 B입니다.");
            else if(avg>70)
                System.out.println(name[i]+"학생의 학점은 C입니다.");
            else if(avg>=60)
                System.out.println(name[i]+"학생의 학점은 D입니다.");
            else
                System.out.println(name[i]+"학생의 학점은 F입니다.");
        }
        Scanner sc=new Scanner(System.in);

        int num=0, sum=0;
        System.out.print("숫자 입력:");
        num=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if(i%2==0){
                sum-=i;
                System.out.print("-"+i);
            }
            else{
                sum+=i;
                System.out.print("+"+i);
            }
        }
        System.out.println("="+sum);
        Scanner sc=new Scanner(System.in);
        int sum=0,num=0;
        System.out.print("숫자입력:");
        num=sc.nextInt();

        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.print("-"+i);
                sum-=i;
            }
            else{
                System.out.print("+"+i);
                sum+=i;
            }
        }
        System.out.println("="+sum);
        int num1=3;
        int num2=7;
        if(++num1<5|++num2>8)
            System.out.println(num1);
        System.out.println(num2);
        int num1=3;
        int num2=7;
        if(++num1<5||++num2>8)
            System.out.println(num1);
        System.out.println(num2);*/
        for (int i = 1; i <= 10; i++) {
            if(i%2==0)
                continue;
            System.out.print(i+" ");
        }


    }
}