package nodeantri;

/**
 *
 Sayekti
 */
import java.util.Scanner;
public class Aplikasi {
    
    public static void main(String[] args) {
        //deklarasi var
        int dashboard,
                menu = 0,
                ayam = 0,
                pembayaran = 0;
        
        String namaPemesan = null;
        
        
        //deklarasi pilihan
        String ayam_1 = "Original Chicken",
                ayam_2 = "Spicy Hot Chicken",
                ayam_3 = "Honey Chicken",
                ayam_4 = "Cheese Chicken",
                ayam_5 = "Sweet Chicken";
        
        
        //deklarasi pilihan
        String menu_1 = "Menu",
                menu_2 = "Pembayaran";
        
        //deklarasi pembayaran
        String pembayaran_1 = "Pembayaran Via Kasir",
                pembayaran_2 = "Pembayaran Via M-Banking";
        
        //input objek
        Scanner inputObject = new Scanner(System.in);
        Scanner nameObject = new Scanner(System.in);
        
        //anterian
        Antri queueAntri = new Antri();
        Antri queueAntrian = new Antri();
        
        //UI
        System.out.println("=========SELAMAT DATANG DI AYAM AJA!=========");
        
        //loop
        while (true) {
            //dashboard
            System.out.println("==Silahkan Tulis Kebutuhan Kamu==");
            System.out.println("1. Menu");
            System.out.println("2. Pembayaran");
            
            ayam = inputObject.nextInt();
            
            //menu
            if(ayam == 1) {
                //jika salah tujuan
                while(true) {
                System.out.println();
                //pilihan menu
                System.out.println("==Pilih ayam Favoritmu==");
                System.out.println("1. " +ayam_1);
                System.out.println("2. " +ayam_2);
                System.out.println("3. " +ayam_3);
                System.out.println("4. " +ayam_4);
                System.out.println("5. " +ayam_5);
                System.out.println("6. terima kasih");
                
                ayam = inputObject.nextInt();
                
                if(ayam >=1 && ayam <= 5) {
                    //nama pemesan
                    System.out.println();
                    System.out.print("Masukkan nama kamu dulu : ");
                    namaPemesan = nameObject.nextLine();
                    
                    //enq ke q yang tersedia
                    if(ayam == 1) {
                        queueAntri.enqueue(namaPemesan, ayam_1);
                    }
                    if(ayam == 2) {
                        queueAntri.enqueue(namaPemesan, ayam_2);
                    }
                    if(ayam == 3) {
                        queueAntri.enqueue(namaPemesan, ayam_3);
                    }
                    if(ayam == 4) {
                        queueAntri.enqueue(namaPemesan, ayam_4);
                    }
                    if(ayam == 5) {
                        queueAntri.enqueue(namaPemesan, ayam_5);
                    }
                    
                    //ui
                    System.out.println();
                    System.out.println("--Ayam nihh!--");
                    System.out.println("Nomor antrian Kamu : "+queueAntri.size);
                    System.out.println("Pilihan Menu : ");
                    
                    if(ayam == 1) {
                        System.out.println(ayam_1);
                    }
                    if(ayam == 2) {
                        System.out.println(ayam_2);
                    }
                    if(ayam == 3) {
                        System.out.println(ayam_3);
                    }
                    if(ayam == 4) {
                        System.out.println(ayam_4);
                    }
                    if(ayam == 5) {
                        System.out.println(ayam_5);
                    }
                    break;
                }
                //kembali
                else if(ayam == 6) {
                    break;
                }
                //salah input
                else {
                    System.out.println("Nomor tidak valid");
                }
              }
            }
            //pembayaran
            if(ayam == 2) {
                //loop
                while(true) {
                    System.out.println();
                    System.out.println("Pilih metod pembayaran : ");
                    System.out.println("1. "+pembayaran_1);
                    System.out.println("2. "+pembayaran_2);
                    System.out.println("3. kembali");
                    
                    pembayaran = inputObject.nextInt();
                    
                    if(pembayaran >= 1 && pembayaran <= 3) {
                        //Masukkan nama nasabah
                        System.out.println();
                        System.out.print("Masukkan nama Anda : ");
                        namaPemesan = nameObject.nextLine();
                        
                        //nq ke q
                        if(pembayaran == 1) {
                            queueAntrian.enqueue(namaPemesan, pembayaran_1);
                        }
                        if(pembayaran == 2) {
                            queueAntrian.enqueue(namaPemesan, pembayaran_2);
                        }
                        
                        //ui
                        System.out.println("--Bayar dulu dong!--");
                        System.out.println("Nomor antrian kamu : "+queueAntrian.size);
                        System.out.println("Kamu memilih metode pembayaran via : ");
                        if(pembayaran == 1) {
                            System.out.println(pembayaran_1);
                            
                        }
                        if(pembayaran == 2) {
                            System.out.println(pembayaran_2);
                        }
                        break;
                    }
                    //  Jika ingin kembali ke menu
                    else if(pembayaran == 3) {
                        break;
                    }
                }
            }
        }
    }
}
