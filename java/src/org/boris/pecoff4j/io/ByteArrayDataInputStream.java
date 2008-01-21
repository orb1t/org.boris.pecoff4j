package org.boris.pecoff4j.io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public class ByteArrayDataInputStream extends DataInputStream {

    public ByteArrayDataInputStream(byte[] b) {
        super(new ByteArrayInputStream(b));
    }

    public ByteArrayDataInputStream(byte[] b, int offset, int length) {
        super(new ByteArrayInputStream(b, offset, length));
    }
}