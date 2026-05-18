package com.google.android.gms.internal.auth-api;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zbbj extends zbbi {
    static final zbbi zba = new zbbj(new Object[0], 0);
    final transient Object[] zbb;
    private final transient int zbc;

    public zbbj(Object[] objArr, int i) {
        this.zbb = objArr;
        this.zbc = i;
    }

    public final Object get(int i) {
        zbbc.zba(i, this.zbc, "index");
        Object obj = this.zbb[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    public final int size() {
        return this.zbc;
    }

    public final Object[] zbb() {
        return this.zbb;
    }

    public final int zbc() {
        return 0;
    }

    public final int zbd() {
        return this.zbc;
    }

    public final boolean zbf() {
        return false;
    }

    public final int zbg(Object[] objArr, int i) {
        Object[] objArr2 = this.zbb;
        int i2 = this.zbc;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }
}
