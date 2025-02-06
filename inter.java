interface Playable {
  void play();
}


class Football implements Playable {
  @Override
  public void play() {
      System.out.println("Let's Play Football: Kicking the ball and scoring goals.");
  }
}

class Volleyball implements Playable {
  @Override
  public void play() {
      System.out.println("Let's Play Volleyball: Serving and spiking the ball over the net.");
  }
}


class Basketball implements Playable {
  
  @Override
  public void play() {
      System.out.println("Let's Play Basketball: Dribbling and shooting hoops.");
  }
}


public class inter {
  public static void main(String[] args) {

      Playable football = new Football();
      Playable volleyball = new Volleyball();
      Playable basketball = new Basketball();

      System.out.println("Sports Activities:");
      football.play();
      volleyball.play();
      basketball.play();
  }
}