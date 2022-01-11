

class FillerClass {
    public static FillerClass filler = null;

    private FillerClass(){
        this.message("Object was created!");
    }

    public void message(){
        System.out.println("You can pass a message in this function!");
    }

    public void message(String message){
        System.out.println(message);
    }

    public static FillerClass getInstance(){
        if (filler == null)
            filler = new FillerClass();
        return filler;
    }
}

public class Main{
    public static void main(String[] args) {

        //getting object with getInstance() method as the class follows singleton pattern
        FillerClass filler = FillerClass.getInstance();

        filler.message("Hello world!");
        filler.messageWithRandomNumber();
    }
}