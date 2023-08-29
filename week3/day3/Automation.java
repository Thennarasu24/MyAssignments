package week3.day3;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		
		Automation aut = new Automation();
		aut.python();
		aut.ruby();
		aut.Selenium();
		aut.Java();

	}

	public void Selenium() {
		System.out.println("Selenium WebDriver");
	}

	public void Java() {
		System.out.println("Java Language");
	}

	@Override
	public void ruby() {
		System.out.println("Ruby Language");
		
	}

}
