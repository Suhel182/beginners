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
    char[] ch = parseThis.toCharArray();
    for(int i=0;i<ch.length;i++) {
      int x = (int) ch[i];
      x--;
      ch[i] = (char) x;
    }
    String decryptedText = String.valueOf(ch);
    for(int i=0;i<ch.length-3;i++){
      if(decryptedText.substring(i,i+3).equals("3.0")){
        System.out.println(decryptedText.substring(i,i+3));
      }
    }
  }

  public static void main(String[] args) {
    new Main();
  }
}
