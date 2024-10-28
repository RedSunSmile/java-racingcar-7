package racingcar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.test.NsTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InputTest extends NsTest {

  @Test
  @DisplayName("자동차이름입력_테스트")
  public void carNameInputTest() {
    List<String> makingCarName = new ArrayList<>();
//    String input = "pobi,woni,mango";
    makingCarName.add(input);
    String Input = Console.readLine();

    assertFalse(makingCarName.isEmpty(), "입력값이 비어있지 않아야 한다");
    assertEquals(1, makingCarName.size(), "입력리스트 크기가 1이어야 한다");
    assertTrue(makingCarName.get(0).contains("pobi"), "리스트 첫번째 요소에 위치한다");
  }

//  @Test
//  void 예외_테스트() {
//  assertSimpleTest(() ->
//          assertThatThrownBy(() -> runException("pobi,javaji", "1"))
//                  .isInstanceOf(IllegalArgumentException.class));
//  }

  @Override
  public void runMain() {
    Application.main(new String[]{});
  }
}

