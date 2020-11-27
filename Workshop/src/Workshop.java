
import com.google.gson.Gson;
import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
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
    
//    public static void main(String[] args) throws FileNotFoundException  {
//        try {
//          File myFile = new File("Person.txt");
//          Scanner myReader = new Scanner(myFile);
//          Object obj = new Person();
//          while (myReader.hasNextLine()) {
//            String data = myReader.nextLine();
//            Gson g = new Gson(); 
//            String str = g.toJson(data);
//            obj = g.fromJson(str,Object.class);
//            System.out.println(obj);
//          }
//          myReader.close();
//          if (obj != null) {
//              System.out.println("test");
//          }
////          int sum = sum(1,4);
////          double avg = avg(sum,4);
////          System.out.println(sum);
////          System.out.println(avg);
//
//        } catch (FileNotFoundException e) {
//          System.out.println("Error occurred.");
//          e.printStackTrace();
//        }
//
//    }
    
    public static void main(String[] args) {

        JSONParser parser = new JSONParser();

        try (Reader reader = new FileReader("Person.txt")) {

            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            System.out.println(jsonObject);

            // loop array
            JSONArray msg = (JSONArray) jsonObject.get("person");
            Iterator<String> iterator = msg.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(msg);
//            }
            System.out.println(msg);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    
    public static int sum(int a, int b)
    {
        int sum = a + b;
        return sum;
    }
    
    public static double avg(int sum, int b)
    {
        double avg = sum / b;
        return avg;
    }
    
}
