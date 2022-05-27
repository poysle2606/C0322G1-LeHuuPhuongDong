package ss15_io_test_file.excersie.read_file_csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestNational {

    public List<National> readFileNational() {
        List<National> list = new ArrayList<>();
        String line = null;
        try {
            FileReader fileReader = new FileReader("D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\ss15_io_test_file\\excersie\\read_file_csv\\input_csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                int id = Integer.parseInt(arr[0]);
                String code = arr[1];
                String name = arr[2];
                list.add(new National(id, code, name));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        TestNational test = new TestNational();
        List<National> list = test.readFileNational();
        for (National item :
                list) {
            System.out.println(item);
        }
    }
}
