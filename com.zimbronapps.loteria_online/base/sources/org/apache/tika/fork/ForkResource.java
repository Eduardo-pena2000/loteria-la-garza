package org.apache.tika.fork;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface ForkResource {
    Throwable process(DataInputStream dataInputStream, DataOutputStream dataOutputStream) throws IOException;
}
