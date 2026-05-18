package com.amazon.device.simplesignin.a;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class a {
    private static final String a = "a";
    private static final a b = new a();
    private static volatile b c;

    private a() {
    }

    public static a a() {
        return b;
    }

    public boolean b(Context context) {
        return com.amazon.a.a.a(context.getApplicationContext());
    }

    public b a(Context context) {
        if (c == null) {
            synchronized (a.class) {
                try {
                    if (c == null) {
                        if (b(context)) {
                            c = new com.amazon.device.simplesignin.a.c.b();
                            com.amazon.device.simplesignin.a.d.a.a(a, "SDK initialized in Sandbox mode.");
                        } else {
                            c = new com.amazon.device.simplesignin.a.a.b();
                            com.amazon.device.simplesignin.a.d.a.a(a, "SDK initialized in Production mode.");
                        }
                    }
                } finally {
                }
            }
        }
        return c;
    }
}
