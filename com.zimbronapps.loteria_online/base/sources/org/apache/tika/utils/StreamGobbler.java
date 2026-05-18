package org.apache.tika.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class StreamGobbler implements Runnable {
    private final InputStream is;
    private final int maxBufferLength;
    List lines = new ArrayList();
    long streamLength = 0;
    boolean isTruncated = false;

    public StreamGobbler(InputStream inputStream, int i) {
        this.is = inputStream;
        this.maxBufferLength = i;
    }

    public boolean getIsTruncated() {
        return this.isTruncated;
    }

    public List getLines() {
        return this.lines;
    }

    public long getStreamLength() {
        return this.streamLength;
    }

    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.is, StandardCharsets.UTF_8));
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    if (this.maxBufferLength >= 0) {
                        long length = this.streamLength + readLine.length();
                        int i = this.maxBufferLength;
                        if (length > i) {
                            int i2 = i - ((int) this.streamLength);
                            if (i2 > 0) {
                                this.isTruncated = true;
                                this.lines.add(readLine.substring(0, Math.min(readLine.length(), i2)));
                            }
                        } else {
                            this.lines.add(readLine);
                        }
                    }
                    this.streamLength += readLine.length();
                }
                bufferedReader.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }
}
