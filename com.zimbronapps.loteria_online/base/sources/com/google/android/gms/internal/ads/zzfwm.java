package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfwm extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzfwn();
    public final int zza;
    private zzaxg zzb = null;
    private byte[] zzc;

    public zzfwm(int i, byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzaxg zzaxgVar = this.zzb;
        if (zzaxgVar != null || this.zzc == null) {
            if (zzaxgVar == null || this.zzc != null) {
                if (zzaxgVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzaxgVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, i2);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzaN();
        }
        y6.c.k(parcel, 2, bArr, false);
        y6.c.b(parcel, a);
    }

    public final zzaxg zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzaxg.zzi(this.zzc, zzibb.zza());
                this.zzc = null;
            } catch (zzicg | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.zzb;
    }
}
