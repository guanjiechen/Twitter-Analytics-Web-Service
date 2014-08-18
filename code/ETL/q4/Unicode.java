/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Unicode {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("smalltest");
        String prefix = "out";
        int i = 0;
        for (; i <= 0; i++) {
            String filename = "small";
            File file = new File(filename);

            Scanner f = new Scanner(file);
            //f.useDelimiter("\nzhangnihqinghaohshengyiz");
            while (f.hasNextLine()) {
                String line = f.nextLine();
                //System.out.println(line);
                //byte[] b = line.getBytes();
                //String uni1 = new String(b,"UNICODE");
                //System.out.println(uni1);
                // System.out.print(uni);
                String[] tokens = line.split("\t");
                String[] content = tokens[1].split(":");
                //String uni = URLDecoder.decode(tokens[2], "UTF-8");
                //byte[] y = uni.getBytes("UNICODE");
                //ni = new String(y);
                String uni = URLEncoder.encode(content[1], "UTF-8");
                // System.out.print(uni);
                writer.write(tokens[0] + "\t"  + content[0] + ":" + uni + "\nzhangnihqinghaohshengyiz");
            }
            f.close();

        }
        writer.close();
    }
}
