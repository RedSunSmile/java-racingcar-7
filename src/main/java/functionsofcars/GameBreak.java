package functionsofcars;

import java.util.concurrent.CompletableFuture;
import java.functionsofcars.GameQuit;
//기다림,자리비움시 10분, 20분, 30분 대기
public class GameBreak {
  static int restTime=0;

  //휴식시간또는 대기신청
  public String restResponse(String insert){
    try {
      String input = "abc123def456";
      String result = input.replaceAll("[^0-9]", "");
      for (char reverseNum : insertText.toCharArray()) {
        if(Character.isDigit(reverseNum)) {
          restTime = Character.getNumericValue(reverseNum);
        }

      }
      //      System.out.println();
    }catch(IllegalArgumentException e){
      System.out.println("잘못된 값을 입력하였습니다.");
    }

    return String.valueOf(restTime);
  }

  CompletableFuture<String> delation2 = CompletableFuture.supplyAsync(() -> {
    try(restResponse(restTime)) {
      TimeUnit.MINUTES.sleep(10);
    } catch (InterruptedException e) {
      throw new IllegalStateException(e);
    }
    // 쉬는 작업이 완료되면 게임 복귀
    future.thenRun(() -> {
      System.out.println("게임으로 복귀!");
     //게임을 종료하기
      if(userWantsToQuit()){
        cleanUpResources();
        return;
      }
    });

    // 쉬는 작업이 완료되면 게임 복귀
    future.thenRun((GoStopPlus4.calculatingSpeed(player, givenCount)) -> {
      System.out.println("게임으로 복귀!");
      //게임을 종료하기
      if(GameQuit()){
        cleanUpResources();
        return;
      }
    });

    // main 스레드가 종료되지 않도록 대기
    try {
      future.get();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return "10분대기를 시작합니다. 10분후 대기종료합니다./n"
            + "최장 3번 사용 후 종료 확인 없으면 게임 종료합니다.";
  });
  CompletableFuture<String> delation2 = CompletableFuture.supplyAsync(() -> {
    try(restResponse(restTime)) {
      TimeUnit.MINUTES.sleep(20);
    } catch (InterruptedException e) {
      throw new IllegalStateException(e);
    }
    // 쉬는 작업이 완료되면 게임 복귀
    future.thenRun(((GoStopPlus4.calculatingSpeed(player, givenCount)) -> {
      System.out.println("게임으로 복귀!");
      //게임을 종료하기
      if(GameQuit()){
        cleanUpResources();
        return;
      }
    });

    // main 스레드가 종료되지 않도록 대기
    try {
      future.get();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return "20분대기를 시작합니다. 20분후 대기종료합니다./n"
            + "최장 3번 사용 후 종료 확인 없으면 게임 종료합니다.";
  });

  CompletableFuture<String> delation3 = CompletableFuture.supplyAsync(() -> {
    try (restResponse(restTime)){
      TimeUnit.MINUTES.sleep(30);

    } catch (InterruptedException e) {
      throw new IllegalStateException(e);
    }
    // 쉬는 작업이 완료되면 게임 복귀
    future.thenRun(((GoStopPlus4.calculatingSpeed(player, givenCount)) -> {
      System.out.println("게임으로 복귀!");
      // 여기서 게임 복귀 로직을 작성하세요
      if(GameQuit()){
        cleanUpResources();
        return;
      }
    });

    // main 스레드가 종료되지 않도록 대기
    try {
      future.get();
    } catch (Exception e) {

      e.printStackTrace();
    }

    return "30분대기가 시작되었습니다./n"
            + "최장 3번 사용 후 종료 확인 없으면 게임 종료합니다.";
  });
}
