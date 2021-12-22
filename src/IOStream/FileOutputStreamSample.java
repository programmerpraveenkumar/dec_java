package IOStream;

import java.io.FileOutputStream;

public class FileOutputStreamSample {
        public static void main(String args[]){
            try{
                FileOutputStream fos = new FileOutputStream("/Volumes/softwares/projects/logs/text1.txt");
                fos.write("this is updated content for this file.".getBytes());//bytes .(Strin to bytes conversion);
                System.out.println("File has created");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
}
