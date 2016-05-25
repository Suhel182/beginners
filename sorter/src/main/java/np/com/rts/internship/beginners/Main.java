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
  int index=0;
  public Main() {
    // Write your code here
    for(int i=0; i<simpleThings.length;i++){
      for(int j=i;j>0;j--){
        int[] a = new int[2];
        a=get(j, index);
        if(a[0]<a[1]){
            SimpleThing temp = new SimpleThing(null,0);
            temp = simpleThings[j];
            simpleThings[j]=simpleThings[j-1];
            simpleThings[j-1]=temp;
        }
      }
    }
    for(SimpleThing s : simpleThings){
        System.out.println(s.nothingSpecial+" : "+s.stillNothingSpecial);
    }
  }
  public int[] get(int j,int index){
      int[] a = new int[2];
      try {
          a[0] = (int) simpleThings[j].nothingSpecial.charAt(index);
      }catch(Exception e){
          a[0]=-1;
      }
      try{
          a[1] = (int) simpleThings[j-1].nothingSpecial.charAt(index);
      }catch(Exception e){
          a[1]=-1;
      }

      if(a[0]!=a[1]){
          index=0;
          return a;
      }else{
          index++;
          return get(j,index);
      }
  }

  public static void main(String[] args) {
    new Main();
  }
}
