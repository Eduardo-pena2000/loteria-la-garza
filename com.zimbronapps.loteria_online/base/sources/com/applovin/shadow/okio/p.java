package com.applovin.shadow.okio;

import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract /* synthetic */ class p {
    public static /* bridge */ /* synthetic */ OutputStream a(java.nio.file.Path path, OpenOption[] openOptionArr) {
        return Files.newOutputStream(path, openOptionArr);
    }
}
