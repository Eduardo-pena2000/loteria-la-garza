package Oa;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class c {
    public static /* bridge */ /* synthetic */ DirectoryStream a(Path path, String str) {
        return Files.newDirectoryStream(path, str);
    }
}
