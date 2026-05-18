package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbkd extends zzbkr {
    private final Drawable zza;
    private final Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;
    private final Map zzf;

    public zzbkd(Drawable drawable, Uri uri, double d, int i, int i2, Map map) {
        this.zza = drawable;
        this.zzb = uri;
        this.zzc = d;
        this.zzd = i;
        this.zze = i2;
        this.zzf = map;
    }

    public final N6.a zzb() throws RemoteException {
        return N6.b.s1(this.zza);
    }

    public final Uri zzc() throws RemoteException {
        return this.zzb;
    }

    public final double zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zze;
    }

    public final Map zzg() {
        return this.zzf;
    }
}
