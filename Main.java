import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        String File = "Src/datacuboid.txt";
        List<luas> data = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(File))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                luas Hitung = new luas();
                Hitung.panjang = Double.parseDouble(row[0]);
                Hitung.lebar = Double.parseDouble(row[1]);
                Hitung.tinggi = Double.parseDouble(row[2]);

                data.add(Hitung);
            }

            //nampilkan hasil luas dan volume balok

            for (luas B : data) {
                System.out.println("Luas Balok: ");
                System.out.println(B.Hitungluas());
                System.out.println("\n");
                System.out.println("Volume Balok: ");
                System.out.println(B.Hitungvolume());

            }



        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }

        //sorting

        data.sort(Comparator.comparingDouble(luas::Hitungluas));

        String f = "Src/sortingdata.txt";
        try (FileWriter tulis = new FileWriter(f)){
            for (luas luas : data) {
                tulis.write(luas.luas +"\n");
            }


        }
        catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}