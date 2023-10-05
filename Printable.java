public interface Printable {
	void print();
}
interface Showable{
	void show();
}
class A7interface implements Printable,Showable{ 
	public void print(){
		System.out.println("Hello");
		} 
public void show(){
	System.out.println("Welcome");
	}
public static void main(String args[]){
A7interface obj = new A7interface();
obj.print();
obj.show();
}
}