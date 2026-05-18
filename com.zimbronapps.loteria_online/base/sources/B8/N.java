package B8;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract /* synthetic */ class n {
    public static /* bridge */ /* synthetic */ Path a(Path path, FileAttribute[] fileAttributeArr) {
        return Files.createDirectories(path, fileAttributeArr);
    }
}
