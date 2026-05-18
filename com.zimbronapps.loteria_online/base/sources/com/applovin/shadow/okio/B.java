package com.applovin.shadow.okio;

import java.nio.file.CopyOption;
import java.nio.file.Files;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ java.nio.file.Path a(java.nio.file.Path path, java.nio.file.Path path2, CopyOption[] copyOptionArr) {
        return Files.move(path, path2, copyOptionArr);
    }
}
