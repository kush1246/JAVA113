abstract class studen {
    String name;
    int roll_no;

    public studen(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
    abstract void attend_class();
    abstract void give_exam();
}

