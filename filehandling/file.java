import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file {
    public static void main(String args[])throws Exception
    {
        char[] data =new char[400];
        
        try
        {
        //creating file
        File f= new File("content.txt");
        f.createNewFile();
        System.out.println("Name : "+f.getName());
        System.out.println(f.exists());
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.canWrite());
        System.out.println(f.canRead());
        System.out.println(f.getParent());
        //write
        String s="This is my file content.";
        FileWriter fw=new FileWriter("content.txt");
        fw.write(s);
        fw.close();
        System.out.println("Reading the content as a whole....");
        FileReader fr=new FileReader("content.txt");
        fr.read(data);
        System.out.println(data);
        fr.close();
        }catch(FileNotFoundException e)
        {
            System.out.println("The specified file does not exist...");
        }
        String s1;
        FileReader fr1=new FileReader("content.txt");
        BufferedReader br=new BufferedReader(fr1);
        System.out.println("Reading Line by Line ....");
        while ((s1=br.readLine())!=null)
        {
            System.out.println(s1);
        }
        fr1.close();


        FileReader fr2=new FileReader("content.txt");
        int i;//int i='A'->i=90 ; char ch=(char)97 ->ch='a' '\0'
        System.out.println("Reading character by character....");
        while((i=fr2.read())!=-1)
        {
            System.out.println((char)i);
        }
        fr2.close();
        
        String s2 = "\nThis is the appened sentence.";
        File f = new File("content.txt");
        FileWriter fw = new FileWriter(f,true);
        // fw.write(s2);
        fw.append(s2);
        fw.close();
        //insert at desired position
        FileReader fr=new FileReader("content.txt");
        fr.read(data);
        String updateStr = String.valueOf(data).substring(0, 4) + "ARE " + String.valueOf(data).substring(4);
        //write updated String in file
        FileWriter writer = new FileWriter("content.txt");
        writer.write(updateStr);
        FileReader r=new FileReader("content.txt");
        r.read(data);
        System.out.println(data);
        writer.close();

        r.close();
       // f.close();
        System.out.println();
        File w = new File("content.txt");
        Scanner sc = new Scanner(w); 
 
        int count = 0;

        while (sc.hasNext())  
        {
          String word  = sc.next();
          System.out.println(word);
          count = count + 1;
        }   
    }
}