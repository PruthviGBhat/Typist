import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Typist{

    static String [] words = {"accomplish","believe","comfortable","delicious","embarrassed","excellent","fantastic","goodbye",
        "hello","important","interesting","kind","love","mistake","opportunity","outstanding","perfect",
        "question","remember","smile","thankful","together","understand","wonderful","elephant"};

    public static void main(String[] args) throws InterruptedException{
        System.out.println("Get Ready to type in ");
        for(int i=5;i>=1;i--){
            TimeUnit.SECONDS.sleep(1);
            System.out.println(i+"....");
        }
        Random rand = new Random();
        for(int i=0;i<25;i++){
            System.out.print(words[rand.nextInt(19)]+" ");
        }
        System.out.println();
       double start = LocalTime.now().toNanoOfDay();
        Scanner sc = new Scanner(System.in);
        String typedwords = sc.nextLine();
        double end = LocalTime.now().toNanoOfDay();
        double diffrence = end-start;
        double diffInSec = diffrence/1000000000.0;
        int numOfChar = typedwords.length();
        int wpm = (int)((((double)numOfChar/5)/diffInSec)*60);
        System.out.println();
        System.out.println("Your typing Words per minute is "+wpm+"!!!");
        sc.close();
    }
}