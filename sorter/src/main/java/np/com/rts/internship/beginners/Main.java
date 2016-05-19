package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  String[] strings = new String[] {
          "hello",
          "mello",
          "mell",
          "1mell",
          "hmmm",
          "h2mmm",
          "zxcvb",
          "asdf",
          "%$compli"
  };

  public Main() {
    // Write your code here
      ArrayList<String> al = new ArrayList<String>();
      for(String s:strings){
          al.add(s);
      }
      Collections.sort(al);
      strings = al.toArray(new String[al.size()]);
      for(String s:strings){
          System.out.print(s+"\t");
      }
  }

  public static void main(String[] args) {
    new Main();
  }
}
