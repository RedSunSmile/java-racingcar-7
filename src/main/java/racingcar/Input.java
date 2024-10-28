package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {

  public void carNameInput() {
    System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
    Scanner sc = new Scanner(System.in);
    //   String input = sc.nextLine();
    String Input = Console.readLine();
    List<String> makingCarName = new ArrayList<>();
    makingCarName.add(input);

    for (int user = 0; user < makingCarName.size(); user++) {
      if (user < makingCarName.size() - 1) {
        System.out.println(makingCarName.get(user) + ",");
      }
      System.out.print(makingCarName.get(user) + " ");
    }
  }

  public void movementOfCarInput() {
    System.out.println("시도할 횟수는 몇 회인가요");
    Scanner sc = new Scanner(System.in);
//      Integer Insert = Console.readLine();
    int insert = Integer.parseInt(sc.nextLine());
    List<Integer> movementCount = new ArrayList<>();

    for (int number = 0; number < insert; number++) {
      movementCount.add(number);
    }
  }

}




