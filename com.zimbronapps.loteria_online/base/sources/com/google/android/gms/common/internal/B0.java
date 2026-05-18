package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class b0 {
    public static final Object a = new Object();
    public static boolean b;
    public static String c;
    public static int d;

    public static int a(Context context) {
        b(context);
        return d;
    }

    public static void b(Context context) {
        Bundle bundle;
        synchronized (a) {
            try {
                if (b) {
                    return;
                }
                b = true;
                try {
                    bundle = G6.e.a(context).c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
                if (bundle == null) {
                    return;
                }
                c = bundle.getString("com.google.app.id");
                d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
