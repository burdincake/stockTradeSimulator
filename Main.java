import java.util.Random;
import java.util.List;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    List<Integer> moneyHistory = new ArrayList<Integer>();
    Random rand = new Random();
    double money = 10000.0;
    int time = 10;
    int finalmoney=10000;
    while (time != 100&&finalmoney>=300){
      time++;
    int  pmdecision = rand.nextInt(2);
      System.out.print(pmdecision+"   ");
        int changerate = rand.nextInt(100);
        System.out.println(changerate);
      if(pmdecision == 1){
        money = money + (money * ((double)changerate/150.));
        finalmoney = (int)money;


        System.out.println("in time "+time+ "s, money = "+finalmoney);

        moneyHistory.add(finalmoney);

      }
      else{
        money = money - (money*((double)changerate/160.));
        finalmoney = (int)money;
        System.out.println("in time "+time+ "s, money = "+finalmoney);
        moneyHistory.add(finalmoney);

      }

    }
    System.out.println(moneyHistory);
  }
}
