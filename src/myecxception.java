public class myecxception {
    public static void main(String[] args) {
        userdefinedexception udf=new userdefinedexception();
        try {
            udf.validate(19);
        }
        catch(invalidageexeption e){
            System.out.println(e.getMessage());

        }
    }
}
