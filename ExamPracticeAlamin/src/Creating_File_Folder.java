
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Creating_File_Folder {
    public static void main(String[] args) {
       /* File f = new File("C:\\Users\\AL-AMIN HOSSAIN\\Desktop\\myfile.txt");
       boolean b = f.mkdir();
       if(b){
           System.out.println("Folder Successfully created");
       }else{
           System.out.println("Folder creation Failed");
       }
       */
       File fl =new File("C:\\Users\\AL-AMIN HOSSAIN\\Desktop\\myfile.txt\\my.txt");
       /* 
       try {
            fl.createNewFile();
            System.out.println("File creation successful");
        } catch (IOException ex) {
            System.out.println("File cration Failed");
            Logger.getLogger(Creating_File_Folder.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        try {
            FileWriter fw = new FileWriter(fl);
            fw.write("Hello, I am Al-Amin Hossain");
            System.out.println("File Writing successful");
            fw.close();
        } catch (IOException ex) {
            System.out.println("File Writing Failed");
            Logger.getLogger(Creating_File_Folder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\AL-AMIN HOSSAIN\\Desktop\\myfile.txt\\my.txt"));
            String s;
            while((s = bf.readLine()) != null){
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println("File read Failed");
        }
       
    }
 
}
