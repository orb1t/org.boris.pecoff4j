/*******************************************************************************
 * This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Peter Smith
 *******************************************************************************/
package org.boris.pecoff4j.io;

import java.io.IOException;

public interface IDataReader
{
    int readByte() throws IOException;

    int readWord() throws IOException;

    int readDoubleWord() throws IOException;

    long readLong() throws IOException;

    int getPosition();
    
    int getLength();

    void jumpTo(int location) throws IOException;

    void skipBytes(int numBytes) throws IOException;

    void close() throws IOException;

    void read(byte[] b) throws IOException;

    String readUtf(int size) throws IOException;

    String readUtf() throws IOException;

    String readUnicode() throws IOException;

    String readUnicode(int size) throws IOException;
}
