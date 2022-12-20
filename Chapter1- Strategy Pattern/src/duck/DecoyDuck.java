package duck;

import fly.FlyNoWay;
import quack.MuteSquack;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new MuteSquack();
	}

	
}
