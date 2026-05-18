package com.google.android.gms.common.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class DowngradeableSafeParcel extends y6.a implements ReflectedParcelable {
    public static final Object b = new Object();
    public boolean a = false;

    public static boolean M1(String str) {
        synchronized (b) {
        }
        return true;
    }

    public static Integer N1() {
        synchronized (b) {
        }
        return null;
    }

    public boolean O1() {
        return this.a;
    }
}
