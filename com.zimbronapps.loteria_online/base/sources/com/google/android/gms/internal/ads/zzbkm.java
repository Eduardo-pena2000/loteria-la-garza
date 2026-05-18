package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbkm extends O5.c {
    private final zzbkl zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbkm(zzbkl zzbklVar) {
        IBinder iBinder;
        this.zza = zzbklVar;
        try {
            this.zzc = zzbklVar.zzb();
        } catch (RemoteException e) {
            W5.p.d("", e);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbklVar.zzc()) {
                zzbks zzbksVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbksVar = queryLocalInterface instanceof zzbks ? (zzbks) queryLocalInterface : new zzbkq(iBinder);
                }
                if (zzbksVar != null) {
                    this.zzb.add(new zzbkt(zzbksVar));
                }
            }
        } catch (RemoteException e2) {
            W5.p.d("", e2);
        }
    }

    public final List getImages() {
        return this.zzb;
    }

    public final CharSequence getText() {
        return this.zzc;
    }
}
