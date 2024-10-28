package GradeOfPlayers;

public class MovementMerge {
  private Input input;
  static List<Integer> drivingActivity = Input.movementOfCarInput();
  private GameBreak gamebreak;

  public static void mergeSort(List<Integer> drivingActivity, int player, int otherplayer) {
    if (player < otherplayer) {
      int center = (player + otherplayer) / 2;

      //오른쪽 왼쪽 돌아가며 경주하며 정렬
      mergeSort(drivingActivity, player, center);
      mergeSort(drivingActivity, center + 1, otherplayer);

      //합치기
      merge(drivingActivity, player, center, otherplayer);
      //휴식이필요하다면 입력하기
    }else if(player || otherplayer){
      GameBreak.restResponse(String insert);
    }

  }

  public static void merge(List<Integer> drivingActivity,int player, int otherplayer){
    int speedMerge=mid-left+1;
    int otherMerge=right-mid;

    List<Integer> location=new ArrayList<>(speedMerge);
    List<Integer> otherlocation=new ArrayList<>(otherMerge);

    for(int guess=0; guess<speedMerge;guess++){
      location.get(guess1)=drivingActivity.set(player+guess);
    }

    for(int guessTwo=0; guessTwo<anotherMerge; guessTwo++){
      location.get(guessTwo)=drivingActivity.set(center+1+guessTwo);
    }
    int guess=0, int guessTwo=0;
    int result=player;

    while(guess<speedMerge && guessTwo < otherMerge){
      if(Location.get(guess) <= otherlocation.get(guessTwo)){
        drvingActivity.get(result)=location.get(guess);
        guess++;
      }
      drvingActivity.get(result)=otherlocation.get(guessTwo);
      guessTwo++;
    }
    result++;
  }

  while(guess<speedMerge){
    drivintActivity[result]=location.get(guess);
    guess++;
    result++;
  }

  while(guessTwo<otherMerge){
    drivintActivity[result]=otherlocation.get(guessTwo);
    guessTwo++;
    result++;
  }

}
