package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  SimpleThing[] simpleThings = new SimpleThing[] {
          new SimpleThing("hello", 1),
          new SimpleThing("mello", 2),
          new SimpleThing("mell", 3),
          new SimpleThing("1mell", 4),
          new SimpleThing("hmmm", 5),
          new SimpleThing("h2mmm", 6),
          new SimpleThing("zxcvb", 7),
          new SimpleThing("asdf", 8),
          new SimpleThing("%$compli", 9)
  };

  public Main() {
    // Write your code here
    for(int i=0; i<simpleThings.length;i++){
      for(int j=i;j>0;j--){
        int a = (int) simpleThings[j].nothingSpecial.charAt(0);
        int b = (int) simpleThings[j-1].nothingSpecial.charAt(0);
        if(a<b){
            SimpleThing temp = new SimpleThing(null,0);
            temp = simpleThings[j];
            simpleThings[j]=simpleThings[j-1];
            simpleThings[j-1]=temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    new Main();
  }
}
