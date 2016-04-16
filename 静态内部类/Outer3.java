
public class Outer3 {
	public interface Inner{
			public void play();
	}
	public static void main(String[] args){
		
		Inner inner = new Inner() {
			
			@Override
			public void play() {
				System.out.println("¾²Ì¬ÄÚ²¿Àà");	
			}
		};
		
		inner.play();
	}
}
