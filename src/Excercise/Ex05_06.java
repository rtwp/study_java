package Excercise;
//동전으로 거슬러 주기
public class Ex05_06 {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("입력 ");
        String input = s.nextLine();
        int money  = Integer.parseInt(input);
        System.out.println("money="+money);


        int[]coinUnit={500,100,50, 10}; // 토탈 3,300원
        int[]coin={5,5,5, 5};

        for(int i = 0; i < coinUnit.length; i++) {
            int coinNum = money / coinUnit[i];
            coinNum = (coinNum > coin[i]) ? coin[i] : coinNum;
            coin[i] -= coinNum;
            money -= coinUnit[i] * coinNum;

            System.out.print(coinUnit[i] + "원 : " + coinNum + "\t");
        }

        if ( money > 0 ) {
            System.out.println("돈부족");
            System.exit(0);
        }

        System.out.println("\n@ 남은 동전 갯수 @ ");

        for(int i = 0; i < coinUnit.length; i++) {
            System.out.println(coinUnit[i] + "원 : " + coin[i] );
        }
    }
}
