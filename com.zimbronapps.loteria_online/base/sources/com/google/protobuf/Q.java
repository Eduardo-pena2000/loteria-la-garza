package com.google.protobuf;

import java.nio.Buffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class q {
    public static void a(Buffer buffer) {
        buffer.clear();
    }

    public static void b(Buffer buffer, int i) {
        buffer.limit(i);
    }

    public static void c(Buffer buffer) {
        buffer.mark();
    }

    public static void d(Buffer buffer, int i) {
        buffer.position(i);
    }

    public static void e(Buffer buffer) {
        buffer.reset();
    }
}
