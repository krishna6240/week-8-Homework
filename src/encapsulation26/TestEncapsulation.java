package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        //setting values of the variables
        obj.setName("krishna");
        obj.setAge(40);
        obj.setGetRollNo(79);
        System.out.println("Prime's name:" + obj.getName());
        System.out.println("Prime's age:" + obj.getAge());
        System.out.println("Prime's rollNo:" + obj.getRollNo());



    }

}
