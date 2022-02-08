package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileinputStreamSample {
        public static void main(String args[]){
            try{
                FileInputStream fin = new FileInputStream("/Volumes/softwares/projects/logs/text1.txt");
                //System.out.println((char)fin.read());
                ///always last character is -1 in the file.
                int read;
//                while((read = fin.read()) != -1){
////                    System.out.print((char)read);
////                }
                if((read = fin.read()) != -1){
                    System.out.print((char)read);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

}


/*

int age = 45

age == 35 ->false
age == 15 ->false
age == 25 ->false
age == 45 ->true

age != 35 ->true
age != 15 ->true
age != 25 ->true
age != 45 ->false

 */