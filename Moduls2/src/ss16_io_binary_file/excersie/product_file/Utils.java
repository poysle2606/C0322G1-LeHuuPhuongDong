package ss16_io_binary_file.excersie.product_file;


import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Utils {
    public static void writeFileProduct(String filePath, List<ProductBinaryFile> data) {
        try (FileOutputStream fos = new FileOutputStream(filePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<ProductBinaryFile> readFileProduct(String filePath) {
        List<ProductBinaryFile> list = new LinkedList<>();
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            list = (List<ProductBinaryFile>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}