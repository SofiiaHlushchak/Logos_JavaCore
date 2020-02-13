package ua.lviv.lgs;

import java.io.*;

public class Methods {



    public static void serialize(File file, Object object) throws IOException {
        OutputStream os = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(object);
        oos.close();
        os.close();
    }


    public static Object deserialize(File file) throws IOException, ClassNotFoundException{

        FileInputStream is = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(is);
        Serializable object = (Serializable) ois.readObject();
        is.close();
        ois.close();
        return object;

    }


}
