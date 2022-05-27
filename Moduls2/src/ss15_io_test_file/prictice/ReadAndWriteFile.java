package ss15_io_test_file.prictice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> reaFile(String filePath) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try{
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File khong ton tai or noi dung co loi");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.reaFile("D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\ss15_io_test_file\\prictice\\find_max");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\ss15_io_test_file\\prictice\\find_max", maxValue);
    }

}
