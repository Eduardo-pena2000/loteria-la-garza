package com.google.android.gms.internal.auth-api;

import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zbbh extends zbbi {
    final transient int zba;
    final transient int zbb;
    final /* synthetic */ zbbi zbc;

    public zbbh(zbbi zbbiVar, int i, int i2) {
        Objects.requireNonNull(zbbiVar);
        this.zbc = zbbiVar;
        this.zba = i;
        this.zbb = i2;
    }

    public final Object get(int i) {
        zbbc.zba(i, this.zbb, "index");
        return this.zbc.get(i + this.zba);
    }

    public final int size() {
        return this.zbb;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return zbh(i, i2);
    }

    public final Object[] zbb() {
        return this.zbc.zbb();
    }

    public final int zbc() {
        return this.zbc.zbc() + this.zba;
    }

    public final int zbd() {
        return this.zbc.zbc() + this.zba + this.zbb;
    }

    public final boolean zbf() {
        return true;
    }

    public final zbbi zbh(int i, int i2) {
        zbbc.zbc(i, i2, this.zbb);
        int i3 = this.zba;
        return this.zbc.zbh(i + i3, i2 + i3);
    }
}
