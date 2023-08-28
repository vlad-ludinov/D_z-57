import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Task2 {
    public static void main(String[] args) throws IOException {
        callMethod6("");
        ArrayList<String> stringArraysList = (ArrayList<String>) callMethod1();
        int a=10, b=0;
        callMethod6("");
        Integer div = callMethod2(a, b);
        System.out.println(div);
        callMethod6("");
        callMethod3(stringArraysList);
    }

    private static void callMethod6(String s) {
        System.out.println("Hello World, it's me!");
    }

    private static void callMethod3(ArrayList<String> stringArraysList) {
        callMethod6("");
    }

    private static Collection<String> callMethod1() throws IOException {
        callMethod2(100000000, 10-10);
        return new ArrayList<>();
    }

    public static Integer callMethod2(int a, int b) throws IOException {
        callMethod6("");
        try {
            FileInputStream fis = new FileInputStream("1.txt");
            fis.read();
            if(fis.available() > 0) throw new RuntimeException();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        
        int num = callMethod4("1240");
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
            return null;
        }
        return a/b;
    }

    private static Integer callMethod4(String s) {
        callMethod5(s);
        try {
            Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println("Эту строку нельзя конвертировать в число");
            return null;
        }
        return Integer.parseInt(s);
    }

    private static void callMethod5(String s) {
        callMethod6("");
        String[] strings = new String[5];
        for (int i = 1; i < strings.length; i++){
            strings[i] = s;
        }
    }
}
