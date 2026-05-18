package org.apache.tika.exception;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ZeroByteFileException extends TikaException {
    public static IgnoreZeroByteFileException IGNORE_ZERO_BYTE_FILE_EXCEPTION = new IgnoreZeroByteFileException();

    public static class IgnoreZeroByteFileException {
    }

    public ZeroByteFileException(String str) {
        super(str);
    }
}
