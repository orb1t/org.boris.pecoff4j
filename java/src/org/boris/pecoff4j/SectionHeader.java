package org.boris.pecoff4j;

import java.io.IOException;

import org.boris.pecoff4j.io.DataReader;
import org.boris.pecoff4j.io.Reflection;

public class SectionHeader {
    private String name;
    private int virtualSize;
    private int virtualAddress;
    private int sizeOfRawData;
    private int pointerToRawData;
    private int pointerToRelocations;
    private int pointerToLineNumbers;
    private int numberOfRelocations;
    private int numberOfLineNumbers;
    private int characteristics;

    public static SectionHeader read(DataReader dr) throws IOException {
        SectionHeader sh = new SectionHeader();
        sh.readFrom(dr);
        return sh;
    }

    private void readFrom(DataReader dr) throws IOException {
        name = dr.readUtf(8);
        virtualSize = dr.readDoubleWord();
        virtualAddress = dr.readDoubleWord();
        sizeOfRawData = dr.readDoubleWord();
        pointerToRawData = dr.readDoubleWord();
        pointerToRelocations = dr.readDoubleWord();
        pointerToLineNumbers = dr.readDoubleWord();
        numberOfRelocations = dr.readWord();
        numberOfLineNumbers = dr.readWord();
        characteristics = dr.readDoubleWord();
    }

    public String toString() {
        return Reflection.toString(this);
    }

    public String getName() {
        return name;
    }

    public int getVirtualSize() {
        return virtualSize;
    }

    public int getVirtualAddress() {
        return virtualAddress;
    }

    public int getSizeOfRawData() {
        return sizeOfRawData;
    }

    public int getPointerToRawData() {
        return pointerToRawData;
    }

    public int getPointerToRelocations() {
        return pointerToRelocations;
    }

    public int getPointerToLineNumbers() {
        return pointerToLineNumbers;
    }

    public int getNumberOfRelocations() {
        return numberOfRelocations;
    }

    public int getNumberOfLineNumbers() {
        return numberOfLineNumbers;
    }

    public int getCharacteristics() {
        return characteristics;
    }
}