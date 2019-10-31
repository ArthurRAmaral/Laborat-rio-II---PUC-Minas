package dataEstructures.exeptions;

import java.io.Serializable;

public class DicionaryDupKeyAreadyExists extends Exception implements Serializable {
    public DicionaryDupKeyAreadyExists() {
        super("This key already exists");
    }
}
