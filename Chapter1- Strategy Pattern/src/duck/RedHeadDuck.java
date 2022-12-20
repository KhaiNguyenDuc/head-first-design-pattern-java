package duck;

import fly.FlyWithWings;
import quack.Quack;

public class RedHeadDuck extends Duck{

	public RedHeadDuck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}

	
}
