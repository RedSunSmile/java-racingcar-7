package functionsofcars;

import camp.nextstep.edu.missionutils.test.NsTest;
import racingcar.Application;
import camp.nextstep.edu.missionutils.Console;

public class GameQuit extends NsTest {
  Scanner sc=new Scanner(System.in);
  System.out.println("게임을종료하시겠습니까");
//String Insert = Console.readLine();
  String end=sc.nextLine();
  return end.equalsIgnoreCase("yes");

  @Override
  public void runMain() {
    Application.main(new String[]{});
  }
}
