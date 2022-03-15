
class Inheritance_Animals {

		  String name;
		  public void eat() {
		    System.out.println("I can eat");
		  }
		}

class Dog extends Inheritance_Animals {

		  
		  public void display() {
		    System.out.println("My name is " + name);
		  }
		}

class Main {
	 public static void main(String[] args) {

		    
		    Dog labrador = new Dog();

		    
		    labrador.name = "Rohu";
		    labrador.display();

		    
		    labrador.eat();

		  }
		}


