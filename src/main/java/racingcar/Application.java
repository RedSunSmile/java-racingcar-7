package racingcar;

public class Application {
  public static void main(String[] args) {
    // TODO: 프로그램 구현
//    SpeedLevelGuess speed = new SpeedLevelGuess("yellow", 1);
//    speed.calculatingSpeed();
    Input input = new Input();
    input.carNameInput();
    input.movementOfCarInput();

    MovementMerge merge = new MovementMerge();
    merge.mergeSort(20, 8, 5);
  }
}
