import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;
        Scanner scanner=new Scanner(System.in);
        int right=3;
        int select;
        int balance=1500;



        while(right>0){
            System.out.print("Kullanici Adiniz :");
            userName=scanner.nextLine();
            System.out.print("Parolaniz : ");
            password=scanner.nextLine();
            if (userName.equals("Patika")&& password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz.");
                do {
                    System.out.println("1-Para yatirma\n 2-Para Cekme\n 3-Bakiye Sorgula\n 4-Cikis Yap");
                    System.out.print("Lutfen yapmak isteginiz islemi seciniz.");
                    select=scanner.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatirmak isyediginiz Para miktarini Giriniz :");
                            int amount=scanner.nextInt();
                            balance +=amount;
                            System.out.println("Paraniz Hesaba Yatirilmistir :"+amount);
                            break;
                        case 2:
                            System.out.print("Cekmek istediginiz Para miktarini Giriniz :");
                             amount=scanner.nextInt();
                             System.out.println("Cekilen Para Miktari :"+amount);
                            if (amount>balance){
                                System.out.println("Bakiye yetersiz.");
                            }else {
                                balance -= amount;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+balance);
                            break;
                    }
                }while (select !=4);
                System.out.println("Tekrar Gorusmek uzere.");
                break;
            }else{
                right--;
                System.out.println( "Hatali Kullanici Adi veya Sifre. Tekrar Deneyiniz.");
                if(right==0){
                    System.out.println("Hesabiniz Bloke Olmustur Lutfen Banka ile iletisime Geciniz.");

                }else{
                    System.out.println("Kalan Hakkiniz:"+right);
                }
            }


        }
    }
}