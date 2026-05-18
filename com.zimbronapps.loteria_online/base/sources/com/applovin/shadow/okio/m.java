package com.applovin.shadow.okio;

import java.nio.file.Files;
import java.nio.file.LinkOption;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract /* synthetic */ class m {
    public static /* bridge */ /* synthetic */ boolean a(java.nio.file.Path path, LinkOption[] linkOptionArr) {
        return Files.exists(path, linkOptionArr);
    }
}
