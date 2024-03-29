package AttestationWork;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {
    public void write(String []arrData, String data) {
        String fileName = arrData[0]+".txt";
        FileWriter writer = null;
        try {
            writer= new FileWriter(fileName,true);
            writer.append(data+"\n");
           writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
