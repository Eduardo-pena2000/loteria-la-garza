package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbwz extends NativeAd.a {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbwz(zzbkl zzbklVar) {
        try {
            this.zzb = zzbklVar.zzb();
        } catch (RemoteException e) {
            W5.p.d("", e);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbklVar.zzc()) {
                zzbks zzh = obj instanceof IBinder ? zzbkr.zzh((IBinder) obj) : null;
                if (zzh != null) {
                    this.zza.add(new zzbxb(zzh));
                }
            }
        } catch (RemoteException e2) {
            W5.p.d("", e2);
        }
    }

    public final List getImages() {
        return this.zza;
    }

    public final CharSequence getText() {
        return this.zzb;
    }
}
