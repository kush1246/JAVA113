public class userdefinedexception{
    public void validate(int age)throws invalidageexeption{
        if(age<18)
            throw new invalidageexeption("cannot vote");
        else
            System.out.println("elegible to vote");
    }
}
