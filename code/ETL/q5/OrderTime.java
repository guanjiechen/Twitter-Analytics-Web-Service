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
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Administrator
 */
public class OrderTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*String prefix = "part-000";
        int fn = 0;
        String filename = "";
        for (; fn <= 16; fn++) {
            if(fn<10){
                filename = prefix + "0" + fn;
            }
            else{
                filename = prefix+fn;
            }*/
            TreeMap<String, String> order = new TreeMap<>();
            File file = new File("q5data4");
            Scanner f = new Scanner(file);
            //int max = 0;
           // int count = 0;
            while (f.hasNextLine()) {
                String line = f.nextLine();
                line = line.trim();
                //String[] columns = line.split("\t");
                //String key = columns[1].trim() + "\t" + columns[0] + "\t" + columns[2];
                String value = "";
                /*if(order.containsKey(key)){
                    count++;
                }
                //int len = columns[1].length();
                //max = Math.max(max, len);
                /*String key = columns[0] + "\t" + columns[1];
                String value = columns[2];
                //Timestamp time = Timestamp.valueOf(columns[0]);*/
                if(order.containsKey(line)) {
                    System.out.println(line);
                   /* String v = order.get(key);
                    order.remove(key);
                    value = value + "," + v;
                    /*String[] tid = value.split(",");
                     Arrays.sort(tid);
                     int n = tid.length;
                     value = tid[0];
                     for(int i = 1; i<n; i++){
                     value = value + "," + tid[i];
                     }*/
                }
                order.put(line, value);
                }
            //System.out.println(max);
            String outfile = "q5datao4";
            try (FileWriter writer = new FileWriter(outfile)) {
                for (Iterator<Map.Entry<String, String>> it = order.entrySet().iterator(); it.hasNext();) {
                    Map.Entry<String, String> entry = it.next();
                //String time = entry.getKey().toString();
                    //time = time.substring(0, 19);
                    /*String[] tid = entry.getValue().split(",");
                    String key = entry.getKey();
                    int n = tid.length;
                    for (int i = 0; i < n; i++) {
                        writer.write(key + "\t" + tid[i] + "\n");
                    }*/
                    writer.write(entry.getKey() + "\n");
                }
                writer.close();
            }
            f.close();       
        }
   // }
}
