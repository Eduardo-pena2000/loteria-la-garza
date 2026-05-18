package org.apache.tika.detect;

import java.io.InputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ long a(InputStream inputStream, Path path, CopyOption[] copyOptionArr) {
        return Files.copy(inputStream, path, copyOptionArr);
    }
}
