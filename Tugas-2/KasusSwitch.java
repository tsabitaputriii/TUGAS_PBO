import java.util.Scanner; 

public class KasusSwitch { 
    public static void main(String[] args) { 
        // Deklarasi Scanner
        Scanner masukan = new Scanner(System.in); 

        // Input dari pengguna
        System.out.print("Ketikkan sebuah huruf, akhiri dengan RETURN: ");  
        char cc = masukan.next().charAt(0); 

        // Switch case untuk menentukan huruf vokal atau konsonan
        switch (cc) { 
            case 'a': 
                System.out.println("Yang anda ketik adalah a"); 
                break;
            case 'u': 
                System.out.println("Yang anda ketik adalah u"); 
                break;
            case 'e': 
                System.out.println("Yang anda ketik adalah e"); 
                break;
            case 'i': 
                System.out.println("Yang anda ketik adalah i"); 
                break;
            case 'o': 
                System.out.println("Yang anda ketik adalah o"); 
                break;
            default: 
                System.out.println("Yang anda ketik adalah huruf mati"); 
        } 

        // Menutup Scanner
        masukan.close();
    } 
}
