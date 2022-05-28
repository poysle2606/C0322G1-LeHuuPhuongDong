package ss15_io_test_file.excersie.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainNational {
    public static void main(String[] args) {

        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\ss15_io_test_file\\excersie\\read_file_csv\\input.csv"));

            while ((line = br.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "id= "
                        + country.get(0)
                        + " code is: " + country.get(1)
                        + " name is: " + country.get(2));
    }
}
