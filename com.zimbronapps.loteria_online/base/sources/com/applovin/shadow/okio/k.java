package com.applovin.shadow.okio;

import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract /* synthetic */ class k {
    public static /* bridge */ /* synthetic */ java.nio.file.Path a(java.nio.file.Path path, FileAttribute[] fileAttributeArr) {
        return Files.createDirectory(path, fileAttributeArr);
    }
}
