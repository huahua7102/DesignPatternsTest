package chocolate;

public class ChocolateBoiler {
	
	private boolean empty;
	private boolean boiled;
	
	private  static ChocolateBoiler uniqueBoiler;
	private ChocolateBoiler(){
		empty=true;
		boiled=false;
	}
	
	public  static ChocolateBoiler getInstance(){
		if(uniqueBoiler == null){
			System.out.println("Creating unique instance of Chocolate Boiler");
			uniqueBoiler = new ChocolateBoiler();
		}
		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueBoiler;
	}
	
	public void fill(){
		if(isEmpty()){
			empty=false;
			boiled = false;
		}
	}
	
	public void drain(){
		if(!isEmpty()&&isBoiled())
			empty=true;
	}
	
	public void boil(){
		if(!isEmpty()&&!isBoiled())
			boiled=true;
	}
	public boolean isEmpty(){
		return empty;
	}
	public boolean isBoiled(){
		return boiled;
	}

}
