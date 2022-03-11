/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.common.reflect.TypeToken;
import com.google.gson.*;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {


    public static void main(String[] args) {


        String data = readJson();
        // it will put the element of json file in array list
        Type quote = new TypeToken<ArrayList<QuotesReader>>() { }.getType();
        // it will convert Json type format to Gson type  object
        List<QuotesReader> result = new Gson().fromJson(data, quote);


        // generating the index using Math.random()
        int index = (int) (Math.random() * result.size());
        // it will print for us random element of array list
        System.out.println("Random Author and His Quote :"
                + result.get(index));

//          to print all Author name and text in list
//          System.out.println(g);

    }


    //method that read elements of json file
    public static String readJson() {

        File file = new File("recentquotes.json");
        BufferedReader bufferedReader = null;
        String line = null;
        String message = new String();


        {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));

                while ((line = bufferedReader.readLine()) != null) {
                    message += line;


                }

            } catch (IOException e) {
                e.printStackTrace();

            }
        }
        return message;
    }

}