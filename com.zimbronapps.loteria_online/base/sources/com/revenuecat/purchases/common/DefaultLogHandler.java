package com.revenuecat.purchases.common;

import android.util.Log;
import com.revenuecat.purchases.LogHandler;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class DefaultLogHandler implements LogHandler {
    public void d(String str, String str2) {
        t.g(str, "tag");
        t.g(str2, "msg");
        Log.d(str, str2);
    }

    public void e(String str, String str2, Throwable th) {
        t.g(str, "tag");
        t.g(str2, "msg");
        if (th != null) {
            Log.e(str, str2, th);
        } else {
            Log.e(str, str2);
        }
    }

    public void i(String str, String str2) {
        t.g(str, "tag");
        t.g(str2, "msg");
        Log.i(str, str2);
    }

    public void v(String str, String str2) {
        t.g(str, "tag");
        t.g(str2, "msg");
        Log.v(str, str2);
    }

    public void w(String str, String str2) {
        t.g(str, "tag");
        t.g(str2, "msg");
        Log.w(str, str2);
    }
}
