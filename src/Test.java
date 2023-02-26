import java.io.File;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        String output = "zz";

        FileWriter fw = new FileWriter("test.txt");
        try {

            for (int i = 0; i < output.length(); i++){
                char c = output.charAt(i);
                fw.write(c);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            fw.close();
        }
    }

    public static void haveAVI(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    if (f.getName().endsWith(".mp4")) {
                        System.out.println(f);
                    }
                } else {
                    haveAVI(f);
                }
            }
        }
        int[] test = {1, 2, 3, 5};

        Arrays.stream(test).forEach(s -> System.out.println(s));
    }

    public static List<String> toStringList(String[] arr) {
        List<String> list = new ArrayList<>();
        for (String element : arr) {
            list.add(element);
        }
        return list;
    }

    public static <E> void swap(E[] arr, int a, int b) {
        E sem = arr[a];
        arr[a] = arr[b];
        arr[b] = sem;
    }

}