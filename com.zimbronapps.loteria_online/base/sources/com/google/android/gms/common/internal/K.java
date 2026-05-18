package com.google.android.gms.common.internal;

import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class k {
    public final String a;
    public final String b;

    public k(String str) {
        this(str, null);
    }

    public boolean a(int i) {
        return Log.isLoggable(this.a, i);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, l(str2));
        }
    }

    public void c(String str, String str2, Throwable th) {
        if (a(3)) {
            Log.d(str, l(str2), th);
        }
    }

    public void d(String str, String str2) {
        if (a(6)) {
            Log.e(str, l(str2));
        }
    }

    public void e(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, l(str2), th);
        }
    }

    public void f(String str, String str2, Object... objArr) {
        if (a(6)) {
            Log.e(str, m(str2, objArr));
        }
    }

    public void g(String str, String str2, Throwable th) {
        if (a(4)) {
            Log.i(str, l(str2), th);
        }
    }

    public void h(String str, String str2) {
        if (a(2)) {
            Log.v(str, l(str2));
        }
    }

    public void i(String str, String str2) {
        if (a(5)) {
            Log.w(str, l(str2));
        }
    }

    public void j(String str, String str2, Throwable th) {
        if (a(5)) {
            Log.w(str, l(str2), th);
        }
    }

    public void k(String str, String str2, Object... objArr) {
        if (a(5)) {
            Log.w(this.a, m(str2, objArr));
        }
    }

    public final String l(String str) {
        String str2 = this.b;
        return str2 == null ? str : str2.concat(str);
    }

    public final String m(String str, Object... objArr) {
        String str2 = this.b;
        String format = String.format(str, objArr);
        return str2 == null ? format : str2.concat(format);
    }

    public k(String str, String str2) {
        t.m(str, "log tag cannot be null");
        t.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.a = str;
        this.b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
