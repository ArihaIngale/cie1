package cie1;

public class overload {
 public void display(int num){
        System.out.println("displaying integer: " + num);
 }
 public void display(String text){
        System.out.println("displaying string: " + text);
 }
    public void display(int num, double val){
        System.out.println("displaying integer and double: " + num + " " + val);
    }
    public static void main(String[] args) {
        overload o = new overload();
        o.display(5);
        o.display("Hello");
        o.display(10, 20.5);
        System.out.println("this is master branch");
    }
}
