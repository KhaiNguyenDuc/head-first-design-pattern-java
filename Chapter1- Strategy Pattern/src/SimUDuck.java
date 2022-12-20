import duck.Duck;
import duck.MallardDuck;
import fly.FlyNoWay;

public class SimUDuck {

	public static void main(String[] args) {
		// This is call strategy pattern with group the behavior and 
		// it's implementation in separate from the clien ( duck.java )
		//
		
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.setFlyBehavior(new FlyNoWay());
		duck.performFly();
		duck.performQuack();

	}

}
