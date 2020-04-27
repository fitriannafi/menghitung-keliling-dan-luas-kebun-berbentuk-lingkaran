
import java.util.Scanner;

public class formula {
    void keliling (){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Menghitung Keliling Kebun Pak Budi Berbentuk Lingkaran \n");
        System.out.print("Diameter Kebun (meter): ");
        int diameter = input.nextInt();
       
        double phi = 3.14;
        double keliling;
        keliling = phi*diameter;
        System.out.print("Keliling Kebun = "+keliling);
        
        if (diameter >= 20){
            System.out.print(" Jadi Kebun Pak Budi Ditanami Jagung \n");
        }else {
            System.out.print(" Jadi Kebun Pak Budi Ditanami Bunga \n");
        }

    }
    void luas (){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Menghitung Luas Kebun Pak Budi Berbentuk Lingkaran \n");
        System.out.print("Jari-jari Kebun (meter): ");
        int jari = input.nextInt();
        
        double phi = 3.14;
        double luas;
        luas = phi*jari*jari;
        
        System.out.print("Jika Luas Kebun = "+luas);
        
        if (jari >= 10){
            System.out.print(" Maka Kebun Pak Budi termasuk Kebun yang Luas");
        }else{
            System.out.print(" Maka Kebun Pak Budi termasuk Kebun yang Sempit");
        }
    }
}

    