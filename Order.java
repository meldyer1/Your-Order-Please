import java.util.*;
import java.lang.Integer;

public class Order {
  public static String order(String words) {
    String[] toks = words.split(" ");
    Map<Integer, String> place = new HashMap<Integer, String>();
    if (words.equals(""))
    {
      return "";
    }
    for (String token : toks)
    {
    Integer position = Integer.parseInt(token.replaceAll("\\D+", ""));
      // Parse Int from the string
      if(token != null){
      String temp = token;
      // Add to a map. The map will contain the place where each token should be
      place.put(position, temp);
      }
    }
    // iterate through a for loop and output the words
    StringBuilder finalString = new StringBuilder();
    for (int i = 1; i <= toks.length; i++)
    {
      if (i != toks.length){
      finalString.append(place.get(i) + " ");
      }
      else{
      finalString.append(place.get(i));
      }
       
    }
     return finalString.toString();
    }

  }
