public class Test3 {
public static void main(String[] args){
  float zero = 0;
  float one = 0;
  float two = 0;
  float three = 0;
  int numtimes = 10000000;
   for(int i=0; i<numtimes; i++){
     int rand = (int)(Math.random() * 4);
     switch (rand) {
     case 0:
         zero ++;
         break;
     case 1:
         one ++;
         break;
     case 2:
         two ++;
         break;
     case 3:
         three ++;
         break;
     };
   }
   System.out.println((zero/numtimes)*100);
   System.out.println((one/numtimes)*100);
   System.out.println((two/numtimes)*100);
   System.out.println((three/numtimes)*100);
}
  }
