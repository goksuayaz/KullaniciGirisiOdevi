import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, password2, answer;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz :");
        userName = inp.nextLine();

        System.out.println("Şifreniz : ");
        password = inp.nextLine();


        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız : ");
        }else{
            System.out.print("Hatalı Giriş. Şifrenizi sıfırlamak ister misiniz ? Evet? Hayır? : ");
            answer = inp.nextLine();
            if(answer.equals("Evet")){
                System.out.println("Yeni Şifreniz hatalı ve unutulan şifre ile aynı olmamalı.");
                System.out.print("Yeni Şifreyi giriniz : ");
                password2 = inp.nextLine();
                System.out.println("Şifre Oluşturuldu.");
            } else {
                if(answer.equals("Hayır")){
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz : ");
                    password2 = inp.nextLine();
                    System.out.println("Şifre Oluşturuldu.");
                }

            }
        }


    }
}