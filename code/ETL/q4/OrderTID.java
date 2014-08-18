/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Administrator
 */
public class OrderTID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        TreeMap<String, String> order = null;
        File file = new File("q4data");
        Scanner f = new Scanner(file);
        f.useDelimiter("\nzhangnihqinghaohshengyiz");
        String time = null;
        FileWriter writer = new FileWriter("q4datacombined");
        String result = "";
        //int max = 0;
        // int count = 0;
        while (f.hasNext()) {
            String line = f.next();
            //line = line.trim();
            String[] columns = line.split("\t");
            if (columns[0].equals(time)) {
                order.put(columns[1], columns[2]);
                /*if (order.containsKey(columns[1])) {
                    System.out.println(columns[1]);
                }*/
            } else {
                if (time != null) {
                    result = time + "\t";
                    for (Iterator<Map.Entry<String, String>> it = order.entrySet().iterator(); it.hasNext();) {
                        Map.Entry<String, String> entry = it.next();
                        result = result + entry.getKey() + ":" + entry.getValue() + ";";
                    }
                    writer.write(result + "\nzhangnihqinghaohshengyiz");
                }
                time = columns[0];
                order = new TreeMap<>();
                order.put(columns[1], columns[2]);
            }
        }
        if (time != null) {
            result = time + "\t";
            for (Iterator<Map.Entry<String, String>> it = order.entrySet().iterator(); it.hasNext();) {
                Map.Entry<String, String> entry = it.next();
                result = result + entry.getKey() + ":" + entry.getValue() + ";";
            }
            writer.write(result + "\nzhangnihqinghaohshengyiz");
        }
        writer.close();
        f.close();
    }

}
