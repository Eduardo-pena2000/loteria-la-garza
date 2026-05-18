package com.google.android.gms.internal.firebase-auth-api;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzana extends zzajp implements RandomAccess {
    private static final Object[] zza;
    private static final zzana zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzana(objArr, 0, false);
    }

    public zzana() {
        this(zza, 0, true);
    }

    private static int zzb(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzc(int i) {
        return "Index:" + i + ", Size:" + this.zzd;
    }

    public static zzana zzd() {
        return zzb;
    }

    public final void add(int i, Object obj) {
        int i2;
        zza();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzc(i));
        }
        Object[] objArr = this.zzc;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[zzb(objArr.length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i);
            System.arraycopy(this.zzc, i, objArr2, i + 1, this.zzd - i);
            this.zzc = objArr2;
        }
        this.zzc[i] = obj;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    public final Object get(int i) {
        zzd(i);
        return this.zzc[i];
    }

    public final Object remove(int i) {
        zza();
        zzd(i);
        Object[] objArr = this.zzc;
        Object obj = objArr[i];
        if (i < this.zzd - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        zza();
        zzd(i);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    public final int size() {
        return this.zzd;
    }

    public final /* synthetic */ zzalm zza(int i) {
        if (i >= this.zzd) {
            return new zzana(i == 0 ? zza : Arrays.copyOf(this.zzc, i), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zzana(Object[] objArr, int i, boolean z) {
        super(z);
        this.zzc = objArr;
        this.zzd = i;
    }

    private final void zzd(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new IndexOutOfBoundsException(zzc(i));
        }
    }

    public final boolean add(Object obj) {
        zza();
        int i = this.zzd;
        Object[] objArr = this.zzc;
        if (i == objArr.length) {
            this.zzc = Arrays.copyOf(this.zzc, zzb(objArr.length));
        }
        Object[] objArr2 = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
