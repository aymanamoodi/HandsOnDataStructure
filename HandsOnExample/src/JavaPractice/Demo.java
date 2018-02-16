package JavaPractice;

 interface Demo1{
	 void a();
	 void b();
	 void c();
 }
 abstract class Demo2 implements Demo1{
	 public void a() {
		 System.out.println("i am a");
	 }
 }
 class Demo4 extends Demo2{
	 public void b() {
		 System.out.println("i am b");
	 }
	 public void c() {
		 System.out.println("i am c");
	 }
 }
class Demo {
	public static void main(String[] args) {
		Demo4 d = new Demo4();
		d.a();
		d.b();
		d.c();
	}
}

