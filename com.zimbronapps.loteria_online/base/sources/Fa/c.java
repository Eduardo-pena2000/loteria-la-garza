package Fa;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class c extends b {
    public static int g(int i, int... other) {
        t.g(other, "other");
        for (int i2 : other) {
            i = Math.max(i, i2);
        }
        return i;
    }
}
