
import java.io.*;
import java.util.Iterator;
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class Workshop {
    
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try (Reader reader = new FileReader("Person.txt")) {
                    
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            System.out.println(jsonObject);

            
            // loop array
            JSONArray personList = (JSONArray) jsonObject.get("person");
            Iterator<JSONObject> iterator = personList.iterator();  
            int count = 0;
            int sum =0;
            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//                System.out.println(iterator.next().get("name"));
                if (iterator.next().get("name").toString().contains("John")) {
                    count++;
                }    
//                if (iterator.next().toString().contains("John")) {
//                  System.out.println("Sum: "+sum);
//                }    
            }
            System.out.println("John Dup: "+count);
            System.out.println(personList);
            System.out.println("AVG: "+avg(7,count));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    
    public static double avg(int sum, int count)
    {
        double avg = sum / count;
        return avg;
    }
    
}
