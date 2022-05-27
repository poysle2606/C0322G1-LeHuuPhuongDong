package ss15_io_test_file.excersie.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CloneFile {

    public List<String> readFile(String filePath) {
        List<String> list = new ArrayList<>();
        String line;
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writeFile(String pathFile, String data) {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(pathFile, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        CloneFile cloneFile = new CloneFile();
        List<String> item = cloneFile.readFile("D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\ss15_io_test_file\\excersie\\copy_file_text\\input_file");
        for (String str : item) {
            writeFile("D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\ss15_io_test_file\\excersie\\copy_file_text\\output_file", str);
        }

    }

}

