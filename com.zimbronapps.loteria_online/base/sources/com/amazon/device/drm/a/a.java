package com.amazon.device.drm.a;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a {
    private static a a = new a();
    private static volatile c b;

    private a() {
    }

    public static a a() {
        return a;
    }

    public c a(Context context) {
        if (b == null) {
            synchronized (a.class) {
                try {
                    if (b == null) {
                        if (com.amazon.a.a.a(context.getApplicationContext())) {
                            b = new com.amazon.device.drm.a.d.c();
                        } else {
                            b = new com.amazon.device.drm.a.b.c();
                        }
                    }
                } finally {
                }
            }
        }
        return b;
    }
}
