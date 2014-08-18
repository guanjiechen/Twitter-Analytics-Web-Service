/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ordertime;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class SortData {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String prefix = "q5datam1";
        int fn = 1;
        String f1 = "";
        String f2 = "";
        for (; fn <= 1; fn+=2) {
            f1 = prefix+fn;
            int fn2 = fn+1;
            f2 = prefix+fn2;
            File file1 = new File(f1);
            File file2 = new File(f2);
            Scanner fin1 = new Scanner(file1);
            Scanner fin2 = new Scanner(file2);
            String line1;
            String line2;
            int ofn = (fn+1)/2;
            String outfile = "q5data";
            if(fin1.hasNextLine()){
                    line1 = fin1.nextLine();
            }
            else{
                fin1.close();
                fin2.close();
                System.out.println("Empty file: " + f1);
                return;
            }
            if(fin2.hasNextLine()){
                    line2 = fin2.nextLine();
            }
            else{
                fin1.close();
                fin2.close();
                System.out.println("Empty file: " + f2);
                return;
            }
            FileWriter writer = new FileWriter(outfile);
            while (true){
               int c = line1.compareTo(line2);
               if(c<0){
                   writer.write(line1 + "\n");
                   if(fin1.hasNextLine()){
                        line1 = fin1.nextLine();
                   }
                   else{
                       writer.write(line2 + "\n");
                       while(fin2.hasNextLine()){
                           line2=fin2.nextLine();
                           writer.write(line2 + "\n");
                       }
                       break;
                   }
               }
               else{
                   writer.write(line2 + "\n");
                   if(fin2.hasNextLine()){
                        line2 = fin2.nextLine();
                   }
                   else{
                       writer.write(line1 + "\n");
                       while(fin1.hasNextLine()){
                           line1=fin1.nextLine();
                           writer.write(line1 + "\n");
                       }
                       break;
                   }
               }
            }
            fin1.close();
            fin2.close();
            writer.close();  
        }
    }
}
