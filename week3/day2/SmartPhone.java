package week3.day2;

public class SmartPhone extends AndroidPhone {

	public void takeVideo() {

		System.out.println("Video is taken from child class");
	}

	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone();
		sp.takeVideo();
	}
}
