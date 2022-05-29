	
//RBCA-20-142
package journalwork;


public class Apple {
	String color;
	Orange(String color)
	{
	this.color=color;
	}
	String getColor()
	{
		return color;
	}
	
	public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Apple A1 = new Apple("Red");
	        String color = A1.getColor();
	        System.out.println("color of apple is " + color);
	
       }
	
}
