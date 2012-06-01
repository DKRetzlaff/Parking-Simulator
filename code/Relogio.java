public class Relogio {
	private static final Relogio relogio = new Relogio();
	private static double time;


	private Relogio(){
		time = 0;
	}


	public static Relogio getRelogio(){
		return relogio;
	}


	public void increaseTime(double newTime){
		time += newTime;
	}


}
