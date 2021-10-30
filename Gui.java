import org.jfree.chart.JFreeChart;

import java.awt.*;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Gui{

  public Frame fr;
public Gui(String str){

initialization_exesive(str);

}

public static void main(String[]args){

Gui alpha = new Gui("hey");
System.out.println(Gui.stock_data());


}
//=================Stock_Data_Generator===================================
public static List<Integer> stock_data(){
  List<Integer> moneyHistory = new ArrayList<Integer>();

  Random rand = new Random();
  double money = 10000.0;
  int time = 1;
  int finalmoney=10000;
  while (time != 100&&finalmoney>=300){
    time++;
  int  pmdecision = rand.nextInt(2);
    System.out.print(pmdecision+"   ");
      int changerate = rand.nextInt(100);
      System.out.println(changerate);
    if(pmdecision == 1){
      money = money + (money * ((double)changerate/130.));
      finalmoney = (int)money;


      System.out.println("in time "+time+ "s, money = "+finalmoney);

      moneyHistory.add(finalmoney);

    }
    else{
      money = money - (money*((double)changerate/200.));
      finalmoney = (int)money;
      System.out.println("in time "+time+ "s, money = "+finalmoney);
      moneyHistory.add(finalmoney);

    }


  }
  System.out.println(moneyHistory);
return moneyHistory;
}
//=============================================================

public void initialization_exesive(String str){
  fr = new Frame(str);
  fr.setSize(1000,500);
  Font f3 = new Font("Serif", Font.BOLD, 30);
  Label labeler = new Label("   STOCKY STOCKER");
  labeler.setFont(f3);
  Button east = new Button("매수");
  Button west = new Button("매도");
  Button west1 = new Button("종목1");
  Button west2 = new Button("종목2");
  Button west3 = new Button("종목3");
  Button west4 = new Button("종목4");
  Button west5 = new Button("종목5");
  Button west6 = new Button("내 거래내역");
  Button west7 = new Button("TIMER");
  Button north = new Button("전체매도");
  Button south = new Button("초기자산 복구");
  Button center = new Button("현재 차트");
  Panel buttonset = new Panel();
  buttonset.add(west1);
  buttonset.add(west2);
  buttonset.add(west3);
  buttonset.add(west4);
  buttonset.add(west5);
  buttonset.add(west6);
  buttonset.add(west7);

  fr.add(east,BorderLayout.EAST);
  fr.add(west,BorderLayout.WEST);
  fr.add(labeler,BorderLayout.NORTH);
  fr.add(buttonset,BorderLayout.SOUTH);
  fr.add(center,BorderLayout.CENTER);
  fr.setVisible(true);
}


}
