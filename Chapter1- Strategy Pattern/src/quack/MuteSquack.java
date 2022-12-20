package quack;

public class MuteSquack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("No quack at all");
		
	}

}
