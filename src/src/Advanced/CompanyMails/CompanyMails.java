/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Advanced.CompanyMails;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import static java.util.Map.Entry.comparingByValue;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.stream.Collectors.toMap;

/**
 *
 * @author akram
 */
public class CompanyMails {

    public static void main(String[] args) {
        try {

            Scanner BR = new Scanner(new FileInputStream("data.txt"));

            PrintWriter PW = new PrintWriter(new FileWriter("All_Email.txt"));

//            BufferedReader BR = new BufferedReader(new FileReader("data.txt"));
//            String Emails[] = new String[5];
            ArrayList<String> Emails = new ArrayList<>();

            String from = "From";

            String Line;

            while (BR.hasNext()) {

                Line = BR.nextLine();

                String Word[] = Line.split(" ", 2); // قسم السطر على  اثنين اول مره لحد المسافه والباقى على العنصر الثانى

                String item[] = Line.split(" ", 3);

                if (Word[0].equals(from)) {
                    String Pat = "^(.+)@(.+)$";
                    Pattern pattern = Pattern.compile(Pat);
                    Matcher mat = pattern.matcher(item[1]);
                    boolean m = mat.matches();
                    if (m == true) {
                        Emails.add(item[1]);
                    }
                }
            }
            for (int j = 0; j < Emails.size(); j++) {
                PW.println(Emails.get(j));
            }

            PW.println("----------------------------------------------------");

            Set<String> one = new LinkedHashSet<>(Emails);

            ArrayList<String> only = new ArrayList<>();
            only.addAll(one);

            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < only.size(); i++) {
                int count = Collections.frequency(Emails, only.get(i));
                map.put(only.get(i), count);
            }

            Map<String, Integer> sorted ;
            
            
            // let's sort this map by values first 
//            sorted = map.entrySet()
//                    .stream().sorted(comparingByValue())
//                    .collect(toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));


            // now let's sort the map in decreasing order of value 
            sorted = map.entrySet()
                    .stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

            
             for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
                PW.println(entry.getKey() + "      " + entry.getValue());
            }
            
            PW.close();
            PW.flush();
            BR.close();
        } catch (IOException e) {
        }
    }

}
