package org.apache.tika.fork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
class ClassLoaderResource implements ForkResource {
    private final ClassLoader loader;

    public ClassLoaderResource(ClassLoader classLoader) {
        this.loader = classLoader;
    }

    private void writeAndCloseStream(DataOutputStream dataOutputStream, InputStream inputStream) throws IOException {
        try {
            byte[] bArr = new byte[65535];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    dataOutputStream.writeShort(0);
                    inputStream.close();
                    return;
                } else {
                    dataOutputStream.writeShort(read);
                    dataOutputStream.write(bArr, 0, read);
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    public Throwable process(DataInputStream dataInputStream, DataOutputStream dataOutputStream) throws IOException {
        byte readByte = dataInputStream.readByte();
        String readUTF = dataInputStream.readUTF();
        if (readByte == 1) {
            InputStream resourceAsStream = this.loader.getResourceAsStream(readUTF);
            if (resourceAsStream != null) {
                dataOutputStream.writeBoolean(true);
                writeAndCloseStream(dataOutputStream, resourceAsStream);
            } else {
                dataOutputStream.writeBoolean(false);
            }
        } else if (readByte == 2) {
            Enumeration resources = this.loader.getResources(readUTF);
            while (resources.hasMoreElements()) {
                dataOutputStream.writeBoolean(true);
                writeAndCloseStream(dataOutputStream, ((URL) resources.nextElement()).openStream());
            }
            dataOutputStream.writeBoolean(false);
        }
        dataOutputStream.flush();
        return null;
    }
}
