package com.revenuecat.purchases.utils;

import java.io.File;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FileExtensionsKt {
    private static final double BYTE_UNIT_CONVERSION = 1024.0d;

    public static final long getSizeInBytes(File file) {
        t.g(file, "<this>");
        return file.length();
    }

    public static final double getSizeInKB(File file) {
        t.g(file, "<this>");
        return getSizeInBytes(file) / 1024.0d;
    }
}
