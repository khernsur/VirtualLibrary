import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Scanner;
public class VirtualLibrary {
    private static VirtualLibrary instance = null;
    private HashMap<Integer, String> library;
    private Scanner scan;

    private VirtualLibrary(){
        library = new HashMap<Integer,String>();
        scan = new Scanner(System.in);
    }

    public static VirtualLibrary getInstance(){
        if(instance == null){
            instance = new VirtualLibrary();
        }
        return instance;
    }
    public void addBook(){
        System.out.println("Enter the Book name: ");
        String bookName = scan.nextLine();
        int bookNumber = library.size()+1;
        library.put(bookNumber,bookName);
        System.out.println("Book added: " + bookName);
    }
public void viewBook(){
    System.out.println("\n The books in the virtual library are: ");
    for(int key: library.keySet()){
        System.out.println(key + ". " + library.get(key));
    }
}

public void removeBook(){
    System.out.println("Enter the number you wish to remove: ");
    int bookNumber = scan.nextInt();
    String bookName = library.remove(bookNumber);
    if(bookName == null){
        System.out.println("There is no book with number" + bookNumber + " in the virtual library database.");
    }
    else{
        System.out.println("The book \"" + bookName + "\"  with number " + bookNumber + " has been removed from the virtual database");
    }
}



}
