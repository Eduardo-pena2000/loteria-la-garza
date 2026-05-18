package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbfm extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzbfn();
    private ParcelFileDescriptor zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    public zzbfm() {
        this(null, false, false, 0L, false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 2, zzc(), i, false);
        y6.c.g(parcel, 3, zzd());
        y6.c.g(parcel, 4, zze());
        y6.c.x(parcel, 5, zzf());
        y6.c.g(parcel, 6, zzg());
        y6.c.b(parcel, a);
    }

    public final synchronized boolean zza() {
        return this.zza != null;
    }

    public final synchronized InputStream zzb() {
        if (this.zza == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zza);
        this.zza = null;
        return autoCloseInputStream;
    }

    public final synchronized ParcelFileDescriptor zzc() {
        return this.zza;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze() {
        return this.zzc;
    }

    public final synchronized long zzf() {
        return this.zzd;
    }

    public final synchronized boolean zzg() {
        return this.zze;
    }

    public zzbfm(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.zza = parcelFileDescriptor;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = j;
        this.zze = z3;
    }
}
