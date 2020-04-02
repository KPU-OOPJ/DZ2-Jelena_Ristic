package Zadatak2;
import java.util.*;

public class JelenaRistic {
    private String s1;
    private String s2;
        
    public String getS1() {
        return s1;
    }
    public void setS1(String s1) {
        this.s1 = s1;
    }
    public String getS2() {
        return s2;
    }
    public void setS2(String s2) {
        this.s2 = s2;
    }
    public void ucitajS1() {
        System.out.print("Unesite string s1: ");
        Scanner ulaz = new Scanner(System.in);
        setS1(ulaz.nextLine());
    }
    public void ucitajS2() {
        System.out.print("Unesite string s2: ");
        Scanner ulaz = new Scanner(System.in);
        setS2(ulaz.nextLine());
    }
    public void ispisiS3() {
        String s3 = "";
        for (int i = s1.length()-1 ; i > -1 ; i--) {
            s3 += s1.charAt(i);
        }
        s3+=s2;
        System.out.println("Novi string s3 je: " + s3);
    }
}