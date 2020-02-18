package ua.lviv.lgs.min;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.Field;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("text.txt");
        writeToFile(file, Aminal.class);

    }

    public static void writeToFile(File file, Class<?> customClass) throws Exception {
        Field[] fields = customClass.getDeclaredFields();
        Writer wr = new FileWriter(file);
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if (field.getAnnotation(Annotation.class) instanceof Annotation) {
                wr.write(field.getName() + " --- " + field.getAnnotation(Annotation.class).params() + ";  ");
            }
        }
        wr.close();
    }
}
