package org.boris.pecoff4j.imports;

import java.io.IOException;

import org.boris.pecoff4j.io.IDataReader;
import org.boris.pecoff4j.util.Reflection;

public class ImportEntry {
    private int val;
    private int ordinal;
    private String name;

    public static ImportEntry read(IDataReader dr) throws IOException {
        ImportEntry ie = new ImportEntry();
        ie.val = dr.readDoubleWord();
        if (ie.val == 0) {
            return null;
        }

        return ie;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVal() {
        return val;
    }

    public String toString() {
        return Reflection.toString(this);
    }
}