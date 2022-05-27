package ss15_io_test_file.excersie.read_file_csv;

import java.util.List;

public class National {
    private int id;
    private String code;
    private String name;

    public National() {
    }

    public National(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "National have" +
                " id=" + id +
                " code is: " + code +
                " name is: " + name;
    }
}
