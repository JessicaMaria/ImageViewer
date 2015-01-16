package model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class BitMap {
    
    private final String file;
    private final byte[] byteArray;

    public BitMap(String file) {
        this.file = file;
        this.byteArray = extractFromFile();
    }

    public byte[] getByteArray() {
        return byteArray;
    }
    
    private byte[] extractFromFile(){
        
        try {
            return Files.readAllBytes(new File(file).toPath());
        } catch (IOException ex) {
            return null;
        }
    }
          
}
