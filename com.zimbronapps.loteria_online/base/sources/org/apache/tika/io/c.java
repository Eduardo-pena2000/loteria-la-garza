package org.apache.tika.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ Path a(Path path, String str, String str2, FileAttribute[] fileAttributeArr) {
        return Files.createTempFile(path, str, str2, fileAttributeArr);
    }
}
