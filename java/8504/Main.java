import java.util.Scanner;
import java.io.File;

public class Main{
    public static void main(String[] args) throws Exception {
        //Scanner cin =new Scanner(new File("data.in"));
        Scanner cin =new Scanner(System.in);
        StringBuilder bigNumber= new StringBuilder();
        while(cin.hasNext())
        {
            int count=0,sum=0;
        
            
            bigNumber=new StringBuilder(cin.next());
            if(bigNumber.length()<=1){
                System.out.println(0);
            }else{
                boolean tag=true;
               
                while(true){
                    count++;
                    for (int i =0 ; i < bigNumber.length(); i++) {
                        sum+=Integer.parseInt(bigNumber.charAt(i)+"");
                    }
                    if(sum<10){
                        System.out.println(count);
                        break;
                    }else{
                        bigNumber=new StringBuilder(sum+"");
                        sum=0;
                    }

                }
            }
          
          
        }
    }
}