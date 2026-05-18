package com.applovin.shadow.okio;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract /* synthetic */ class y {
    public static /* bridge */ /* synthetic */ BasicFileAttributes a(java.nio.file.Path path, Class cls, LinkOption[] linkOptionArr) {
        return Files.readAttributes(path, cls, linkOptionArr);
    }
}
