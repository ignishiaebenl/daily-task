class Computer{
	
	private String brand="Dell";
	
	class Processor{
		void show() {
			System.out.println("Processor Inside "+ brand +" Computer");
		}
	}
}
public class Member_inner_class_ex {
	
	public static void main(String[] args) {
	
	Computer comp = new Computer();
	Computer.Processor proc = comp.new Processor();
	proc.show();
	
	}
	
}