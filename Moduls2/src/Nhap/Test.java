package Nhap;

import ss15_io_test_file.excersie.read_file_csv.National;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void writerFile(String filePath, String line) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<National> readFile(String filePath) {
        List<National> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
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
       List<National> item =  Test.readFile("D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\ss15_io_test_file\\excersie\\copy_file_text\\input_file");
//        for (String str: item) {
//            writerFile("D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\ss15_io_test_file\\excersie\\copy_file_text\\output_file", str);
//        }
        for (National str: item) {
            System.out.println(str);
        }
    }
}
