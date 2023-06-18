
import java.util.*;
  class libraryIPS{


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter number of books");
        int n= sc.nextInt();
        ArrayList<String> books = new ArrayList<String>();
        System.out.println("Enter books");
        for(int i=0;i<n;i++){
            String book1=sc.next();
            books.add(book1);
        }
        ArrayList<String> books2 = new ArrayList<String>();
        for(int i=0;i<n;i++){
            books2.add(books.get(i));
        }
    
        int a=0;
        int b=0;

        String book2,book3;
        System.out.println("Enter operations");
        while(b!=4){
            a=sc.nextInt();
            b=sc.nextInt();
            if (a==1){
                Collections.sort(books);
                for (String i:books){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            
            if(b==2){
                book2=sc.next();
                if(books2.contains(book2)) {
                        books.remove(book2);
                        System.out.println("Available");
                }
            }
                
            
            if(b==3){
                book3=sc.next();
                books.add(book3);
                System.out.println("Deposited");
            }
        }

    }
    catch(Exception e){
        System.out.println(e);
    }
} 

}