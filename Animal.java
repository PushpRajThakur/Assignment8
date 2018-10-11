interface Animals {
    void speak();
    void eat();	
}
 class Dog implements Animals{
	public void speak() {
		System.out.println("Dog bark");
	}
	public void eat() {
		System.out.println("Dog eat bones");
	}
 }
 class cat implements Animals{
		public void speak() {
			System.out.println("Cat meow");
		}
		public void eat() {
			System.out.println("Cat veggies");
		}
	 }

class Animal{
 public static void main(String[] args) {
      Animals a=new Dog();
      a.speak();
      a.eat();
      a=new cat();
System.out.println("   ");
      a.speak();
      a.eat();
}
}