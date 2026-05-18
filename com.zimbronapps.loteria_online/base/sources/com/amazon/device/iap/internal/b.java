package com.amazon.device.iap.internal;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    private static b a = new b();
    private static final String b = b.class.getName();
    private static volatile e c;

    private b() {
    }

    public static b a() {
        return a;
    }

    public e a(Context context) {
        if (c == null) {
            synchronized (b.class) {
                try {
                    if (c == null) {
                        if (com.amazon.a.a.a(context.getApplicationContext())) {
                            c = new com.amazon.device.iap.internal.c.e();
                        } else {
                            c = new com.amazon.device.iap.internal.a.d();
                        }
                    }
                } finally {
                }
            }
        }
        return c;
    }
}
