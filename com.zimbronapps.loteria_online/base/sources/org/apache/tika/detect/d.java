package org.apache.tika.detect;

import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class d {
    public static /* bridge */ /* synthetic */ BufferedWriter a(Path path, Charset charset, OpenOption[] openOptionArr) {
        return Files.newBufferedWriter(path, charset, openOptionArr);
    }
}
