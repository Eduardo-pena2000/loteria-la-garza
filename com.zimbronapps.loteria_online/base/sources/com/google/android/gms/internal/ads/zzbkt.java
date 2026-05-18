package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbkt extends O5.d {
    private final zzbks zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    public zzbkt(zzbks zzbksVar) {
        double d;
        int i;
        N6.a zzb;
        this.zza = zzbksVar;
        Uri uri = null;
        try {
            zzb = zzbksVar.zzb();
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
        Drawable drawable = zzb != null ? (Drawable) N6.b.r1(zzb) : null;
        this.zzb = drawable;
        try {
            uri = this.zza.zzc();
        } catch (RemoteException e2) {
            W5.p.d("", e2);
        }
        this.zzc = uri;
        try {
            d = this.zza.zzd();
        } catch (RemoteException e3) {
            W5.p.d("", e3);
            d = 1.0d;
        }
        this.zzd = d;
        int i2 = -1;
        try {
            i = this.zza.zze();
        } catch (RemoteException e4) {
            W5.p.d("", e4);
            i = -1;
        }
        this.zze = i;
        try {
            i2 = this.zza.zzf();
        } catch (RemoteException e5) {
            W5.p.d("", e5);
        }
        this.zzf = i2;
    }

    public final Drawable getDrawable() {
        return this.zzb;
    }

    public final double getScale() {
        return this.zzd;
    }

    public final Uri getUri() {
        return this.zzc;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }
}
