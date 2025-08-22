public class student {
    int roll_no;
    String name;
    student(){
        System.out.println("hello");
    }
    student(int r,String n){
        roll_no=r;
        name=n;
    }
    student(student s){
        roll_no=s.roll_no;
        name=s.name;
    }
    public void display(){
        System.out.println("roll no "+roll_no);
        System.out.println("name is "+name);
    }
}
