 	public class Dog {
 	 
 	    static abstract class Ball {
 	        abstract String getName();
 	    }
 	 
 	    void play(Ball b){
 	        System.out.println(b.getName());
 	    }
 	 
 	    public static void main(String[] args){
 	        Dog dog = new Dog();
 	 
 	        dog.play(new Ball(){
 	            @Override
 	            String getName() {
 	                return "qiu qiu";
 	            }});
 	    }
 	}