package com.applovin.shadow.okio;

import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract /* synthetic */ class j {
    public static /* bridge */ /* synthetic */ java.nio.file.Path a(java.nio.file.Path path, java.nio.file.Path path2, FileAttribute[] fileAttributeArr) {
        return Files.createSymbolicLink(path, path2, fileAttributeArr);
    }
}
