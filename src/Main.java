class FillerClass {
    public FillerClass(){
        this.message("Object was created!");
    }

    public void message(){
        System.out.println("You can pass a message in this function!");
    }

    public void message(String message){
        System.out.println(message);
    }
}

public class Main{
    public static void main(String[] args) {

        //creating an object as class doesn't follow singleton pattern!
        FillerClass filler = new FillerClass();

        filler.message("Hello world!");
    }
}