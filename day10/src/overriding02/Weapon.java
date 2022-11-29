package overriding02;

class Weapon {
	protected int fire() {
		return 1;
	}
}

class Cannon extends Weapon{
	@Override
	protected int fire() {
		// TODO Auto-generated method stub
		return 10;
	}
}
