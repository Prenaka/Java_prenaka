public class sample{

public void sayHello(){
System.out.println("Hello");
}

public int sum(){
int add=4+5;
return add;
}

public static void main(String[]args){
System.out.println("Main Start");
sample obj=new sample();
obj.sayHello();

int result=obj.sum();
System.out.println(result);

System.out.println("Main End");

}
}
