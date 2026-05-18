package org.apache.tika.config;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ boolean a(Path path, LinkOption[] linkOptionArr) {
        return Files.isRegularFile(path, linkOptionArr);
    }
}
