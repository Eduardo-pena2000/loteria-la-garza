package org.apache.tika.fork;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ Path a(String str, String str2, FileAttribute[] fileAttributeArr) {
        return Files.createTempFile(str, str2, fileAttributeArr);
    }
}
