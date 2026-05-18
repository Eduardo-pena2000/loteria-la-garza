package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbxb extends NativeAd.b {
    private final zzbks zzb;
    private final Drawable zzc;
    private final Uri zzd;
    private final double zze;
    private final int zzf;
    private final int zzg;

    public zzbxb(zzbks zzbksVar) {
        Uri uri;
        double d;
        int i;
        N6.a zzb;
        this.zzb = zzbksVar;
        Map map = null;
        try {
            zzb = zzbksVar.zzb();
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
        Drawable drawable = zzb != null ? (Drawable) N6.b.r1(zzb) : null;
        this.zzc = drawable;
        try {
            uri = this.zzb.zzc();
        } catch (RemoteException e2) {
            W5.p.d("", e2);
            uri = null;
        }
        this.zzd = uri;
        try {
            d = this.zzb.zzd();
        } catch (RemoteException e3) {
            W5.p.d("", e3);
            d = 1.0d;
        }
        this.zze = d;
        int i2 = -1;
        try {
            i = this.zzb.zze();
        } catch (RemoteException e4) {
            W5.p.d("", e4);
            i = -1;
        }
        this.zzf = i;
        try {
            i2 = this.zzb.zzf();
        } catch (RemoteException e5) {
            W5.p.d("", e5);
        }
        this.zzg = i2;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzeO)).booleanValue()) {
            try {
                map = this.zzb.zzg();
            } catch (RemoteException unused) {
            }
        }
        this.zza = map;
    }

    public final Drawable getDrawable() {
        return this.zzc;
    }

    public final double getScale() {
        return this.zze;
    }

    public final Uri getUri() {
        return this.zzd;
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zzg;
    }
}
