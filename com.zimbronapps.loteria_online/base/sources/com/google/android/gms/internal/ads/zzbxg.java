package com.google.android.gms.internal.ads;

import S5.I1;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.c;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbxg implements com.google.android.gms.ads.nativead.c {
    private final zzblm zza;
    private c.a zzb;

    public zzbxg(zzblm zzblmVar) {
        this.zza = zzblmVar;
    }

    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }

    public final List getAvailableAssetNames() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final String getCustomFormatId() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final c.a getDisplayOpenMeasurement() {
        try {
            if (this.zzb == null) {
                zzblm zzblmVar = this.zza;
                if (zzblmVar.zzo()) {
                    this.zzb = new zzbxa(zzblmVar);
                }
            }
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
        return this.zzb;
    }

    public final NativeAd.b getImage(String str) {
        try {
            zzbks zzf = this.zza.zzf(str);
            if (zzf != null) {
                return new zzbxb(zzf);
            }
            return null;
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final L5.o getMediaContent() {
        try {
            zzblm zzblmVar = this.zza;
            if (zzblmVar.zzs() != null) {
                return new I1(zzblmVar.zzs(), zzblmVar);
            }
            return null;
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.zza.zze(str);
        } catch (RemoteException e) {
            W5.p.d("", e);
            return null;
        }
    }

    public final void performClick(String str) {
        try {
            this.zza.zzi(str);
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }

    public final void recordImpression() {
        try {
            this.zza.zzj();
        } catch (RemoteException e) {
            W5.p.d("", e);
        }
    }
}
