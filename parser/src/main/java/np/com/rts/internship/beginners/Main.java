package np.com.rts.internship.beginners;

import java.util.*;

public class Main {

  private String parseThis = "3127162:261111\n" +
          "TUY-7.4/1\n" +
          "DPOG5";

  // Parsed value must be inserted into this variable
  double value;

  public Main() {
    // Write your code here
      String[] s1 = null;
      String[] s2 = null;
      char[] ch = parseThis.toCharArray();
      for(int i=0;i<ch.length;i++) {
        if(!String.valueOf(ch[i]).equals("\n")){
          int x = (int) ch[i];
          x--;
          ch[i] = (char) x;
        }
      }
      String decryptedText = String.valueOf(ch);
      s1 = decryptedText.split("\n");
      s2 = s1[1].split("-");
      System.out.println(s2[1]);
  }

  public static void main(String[] args) {
    new Main();
  }
}
