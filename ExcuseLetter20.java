public class ExcuseLetter20 {

    String id;
    String name;
    String className;
    char typeOfExcuse;
    int duration;

    public ExcuseLetter20 () {
    }

    public ExcuseLetter20(String id, String name, String className, char typeOfExcuse, int duration) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.typeOfExcuse = typeOfExcuse;
        this.duration = duration;
    }

    void print() {
    System.out.println(id + "\t" + name + "\t" + className + "\t" + typeOfExcuse + "\t" + duration + " days");
}
    
}

