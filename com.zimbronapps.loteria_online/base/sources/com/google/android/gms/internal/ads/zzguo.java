package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzguo extends zzgtz {
    Object[] zzd;
    private int zze;

    public zzguo() {
        super(4);
    }

    public final /* bridge */ /* synthetic */ zzgua zzd(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzguo zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzn = zzgup.zzn(this.zzb);
            Object[] objArr = this.zzd;
            if (zzn <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int zza = zzgty.zza(hashCode);
                while (true) {
                    int i = zza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        zza = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzguo zzg(Object... objArr) {
        if (this.zzd != null) {
            for (int i = 0; i < 2; i++) {
                zzf(objArr[i]);
            }
        } else {
            zzb(objArr, 2);
        }
        return this;
    }

    public final zzguo zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzgup zzi() {
        zzgup zzt;
        int i = this.zzb;
        if (i == 0) {
            return zzgwg.zza;
        }
        if (i == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzgwq(obj);
        }
        if (this.zzd == null || zzgup.zzn(i) != this.zzd.length) {
            zzt = zzgup.zzt(this.zzb, this.zza);
            this.zzb = zzt.size();
        } else {
            int i2 = this.zzb;
            Object[] objArr = this.zza;
            if (zzgup.zzu(i2, objArr.length)) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            zzt = new zzgwg(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzt;
    }

    public zzguo(int i, boolean z) {
        super(i);
        this.zzd = new Object[zzgup.zzn(i)];
    }
}
