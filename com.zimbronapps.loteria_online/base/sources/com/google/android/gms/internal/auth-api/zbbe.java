package com.google.android.gms.internal.auth-api;

import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
abstract class zbbe extends zbbl {
    private final int zba;
    private int zbb;

    public zbbe(int i, int i2) {
        zbbc.zbb(i2, i, "index");
        this.zba = i;
        this.zbb = i2;
    }

    public final boolean hasNext() {
        return this.zbb < this.zba;
    }

    public final boolean hasPrevious() {
        return this.zbb > 0;
    }

    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.zbb;
        this.zbb = i + 1;
        return zba(i);
    }

    public final int nextIndex() {
        return this.zbb;
    }

    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.zbb - 1;
        this.zbb = i;
        return zba(i);
    }

    public final int previousIndex() {
        return this.zbb - 1;
    }

    public abstract Object zba(int i);
}
