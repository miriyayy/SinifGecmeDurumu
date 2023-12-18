import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, turkce,kimya,muzık;
        Scanner inp= new Scanner(System.in);

        System.out.print("Matematik notunuzu :");
        mat= alınanNotuKontrolEt(inp.nextInt());
        System.out.print("Fizik notunuz:");
        fizik= alınanNotuKontrolEt(inp.nextInt());;
        System.out.print("Türkçe notunuz:");
        turkce= alınanNotuKontrolEt(inp.nextInt());
        System.out.print("Kimya notunuz:");
        kimya= alınanNotuKontrolEt(inp.nextInt());
        System.out.print("Müzik notunuz:");
        muzık= alınanNotuKontrolEt(inp.nextInt());

        double avarage = (mat+ fizik+turkce+kimya+muzık)/5;
        if(avarage<=55){
            System.out.println("Sınıfı geçemediniz.Seneye görüşürüz.");
        }else {
            System.out.println("Sınıfı geçtiniz.Tebrikler.");
        }
        System.out.println("Ortalamanız:"+ avarage);

        }
        public static int alınanNotuKontrolEt( int not){
         if (not<0 || not>100){
             System.out.println("Geçersiz not girdiniz. Notunuz 0 ile 100 arasında bir değer olmalı.");
              // geçersiz not giriildiğinde 0 döner
             return 0;
         }
         return not;

        }
    }

