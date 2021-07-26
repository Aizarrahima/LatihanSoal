package Perulangan;

/**
 *
 * @author Aizar
 */
public class DeretAritmatika {

    public static void main(String[] args) {

        int a, b; // sebagai inisialisasi variabel dengan tipe data integer
        a = 3; // variabel a sebagai nilai pertama dengan nilai 3
        System.out.println("Nilai suku pertama = " + a); // untuk menampilkan nilai pertama pada output
        b = 5; // variabel b sebagai beda setiap-setiap sukunya dengan nilai 5
        System.out.println("Nilai beda setiap suku = " + b); // untuk menampilkan nilai beda pada output

        for (int n = 1; n <= 10; n++) { // sebagai perulangan angka 1 sampai 10

            int Un = a + (n - 1) * b; // sebagai operator dengan rumus mencari suku ke-n
            System.out.println("Nilai suku ke-" + n + " adalah = " + Un); // untuk menampilkan hasil suku ke-n sesuai perulangan dengan rumus tersebut

            int Sn = (a + Un) * n / 2; // sebagai operator dengan rumus mencari jumlah ke-n suku
            System.out.println("Jumlah Deret Aritmatika dengan suku ke-" + n + " adalah = " + Sn); // untuk menampilkan hasil jumlah suku ke-n sesuai perulangan dengan rumus tersebut

        }
    }
}
