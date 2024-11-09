class Hello{
int a;
int b;
static int c=30;
Hello(){
System.out.println("Default Constructor");
}
Hello(int a){
System.out.println("1 parameterized Constructor");
this.a=a;
}
Hello(int a,int b){
System.out.println("2 Paramerized Constructor");
this.a=a;
this.b=b;
}
Hello(int a,int b,int c){
System.out.println("3 Parameterized Constructor");
this.a=a;
this.b=b;
this.c=c;
}
void show(){
System.out.println("Show method inside Hello Class");
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(this.a);
System.out.println(this.b);
System.out.println(this.c);
}
}
class Jtc29{
public static void main(String []args){
Hello h1=new Hello();
h1.show();
Hello h2=new Hello(10);
h2.show();
Hello h3=new Hello(11,13);
h3.show();
Hello h4=new Hello(101,201,301);
h4.show();
}}