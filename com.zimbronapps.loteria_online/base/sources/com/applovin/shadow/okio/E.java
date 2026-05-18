package com.applovin.shadow.okio;

import java.nio.channels.FileChannel;
import java.nio.file.OpenOption;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ FileChannel a(java.nio.file.Path path, OpenOption[] openOptionArr) {
        return FileChannel.open(path, openOptionArr);
    }
}
