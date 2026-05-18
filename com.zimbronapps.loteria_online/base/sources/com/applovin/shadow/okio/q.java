package com.applovin.shadow.okio;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract /* synthetic */ class q {
    public static /* bridge */ /* synthetic */ InputStream a(java.nio.file.Path path, OpenOption[] openOptionArr) {
        return Files.newInputStream(path, openOptionArr);
    }
}
