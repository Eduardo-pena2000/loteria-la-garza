package com.applovin.shadow.okio;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract /* synthetic */ class w {
    public static /* bridge */ /* synthetic */ FileTime a(BasicFileAttributes basicFileAttributes) {
        return basicFileAttributes.lastAccessTime();
    }
}
