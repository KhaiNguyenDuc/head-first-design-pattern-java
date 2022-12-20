package duck;

import fly.FlyNoWay;
import quack.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Squeak();
	}

	
}
