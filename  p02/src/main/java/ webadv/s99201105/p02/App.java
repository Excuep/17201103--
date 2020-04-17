package  webadv.s99201105.p02;
import java.util.*;
import org.apache.commons.codec.digest.DigestUtils;
public class App {
    public static void main(String args[]){// 17201103-Œ‚…Ÿ—Ù
Scanner input=new Scanner(System.in);
  System.out.println("«Î ‰»Î’À∫≈");
  String no = input.nextLine();
  System.out.println("«Î ‰»Î√‹¬Î");
  String password = input.nextLine();
        if((no.equals("17201103"))&&(password.equals("123456"))){
           System.out.println("µ«¬º≥…π¶!");
        }
        System.out.println(sha256hex(password));
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}