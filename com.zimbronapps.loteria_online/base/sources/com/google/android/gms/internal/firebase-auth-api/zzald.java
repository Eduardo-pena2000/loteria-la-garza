package com.google.android.gms.internal.firebase-auth-api;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzald extends zzajp implements zzalm, RandomAccess {
    private static final float[] zza;
    private float[] zzb;
    private int zzc;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        new zzald(fArr, 0, false);
    }

    public zzald() {
        this(zza, 0, true);
    }

    private static int zzd(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zze(int i) {
        return "Index:" + i + ", Size:" + this.zzc;
    }

    private final void zzf(int i) {
        if (i < 0 || i >= this.zzc) {
            throw new IndexOutOfBoundsException(zze(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i < 0 || i > (i2 = this.zzc)) {
            throw new IndexOutOfBoundsException(zze(i));
        }
        float[] fArr = this.zzb;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[zzd(fArr.length)];
            System.arraycopy(this.zzb, 0, fArr2, 0, i);
            System.arraycopy(this.zzb, i, fArr2, i + 1, this.zzc - i);
            this.zzb = fArr2;
        }
        this.zzb[i] = floatValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        zzalh.zza(collection);
        if (!(collection instanceof zzald)) {
            return super.addAll(collection);
        }
        zzald zzaldVar = (zzald) collection;
        int i = zzaldVar.zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.zzb;
        if (i3 > fArr.length) {
            this.zzb = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(zzaldVar.zzb, 0, this.zzb, this.zzc, zzaldVar.zzc);
        this.zzc = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzald)) {
            return super.equals(obj);
        }
        zzald zzaldVar = (zzald) obj;
        if (this.zzc != zzaldVar.zzc) {
            return false;
        }
        float[] fArr = zzaldVar.zzb;
        for (int i = 0; i < this.zzc; i++) {
            if (Float.floatToIntBits(this.zzb[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Float.valueOf(zzb(i));
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.zzb[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.zzb[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i) {
        zza();
        zzf(i);
        float[] fArr = this.zzb;
        float f = fArr[i];
        if (i < this.zzc - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzb;
        System.arraycopy(fArr, i2, fArr, i, this.zzc - i2);
        this.zzc -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzf(i);
        float[] fArr = this.zzb;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.zzc;
    }

    public final /* synthetic */ zzalm zza(int i) {
        if (i >= this.zzc) {
            return new zzald(i == 0 ? zza : Arrays.copyOf(this.zzb, i), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zzb(int i) {
        zzf(i);
        return this.zzb[i];
    }

    public final void zzc(int i) {
        float[] fArr = this.zzb;
        if (i <= fArr.length) {
            return;
        }
        if (fArr.length == 0) {
            this.zzb = new float[Math.max(i, 10)];
            return;
        }
        int length = fArr.length;
        while (length < i) {
            length = zzd(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzald(float[] fArr, int i, boolean z) {
        super(z);
        this.zzb = fArr;
        this.zzc = i;
    }

    public final void zza(float f) {
        zza();
        int i = this.zzc;
        float[] fArr = this.zzb;
        if (i == fArr.length) {
            float[] fArr2 = new float[zzd(fArr.length)];
            System.arraycopy(this.zzb, 0, fArr2, 0, this.zzc);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i2 = this.zzc;
        this.zzc = i2 + 1;
        fArr3[i2] = f;
    }

    public final /* synthetic */ boolean add(Object obj) {
        zza(((Float) obj).floatValue());
        return true;
    }
}
