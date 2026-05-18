package com.google.android.gms.internal.ads;

import S5.g1;
import V5.o0;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdnp extends zzbko {
    private final zzdoh zza;
    private N6.a zzb;

    public zzdnp(zzdoh zzdohVar) {
        this.zza = zzdohVar;
    }

    private static float zzb(N6.a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) N6.b.r1(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    public final float zze() throws RemoteException {
        zzclv zzN;
        int i;
        int i2;
        zzdoh zzdohVar = this.zza;
        if (zzdohVar.zzab() != 0.0f) {
            return zzdohVar.zzab();
        }
        if (zzdohVar.zzy() != null) {
            try {
                return zzdohVar.zzy().zzm();
            } catch (RemoteException e) {
                int i3 = o0.b;
                W5.p.d("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        }
        N6.a aVar = this.zzb;
        if (aVar != null) {
            return zzb(aVar);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zznO)).booleanValue() && zzdohVar.zzU() != null && (zzN = zzdohVar.zzU().zzN()) != null && (i = zzN.zzb) >= 0 && (i2 = zzN.zza) > 0) {
            return i / i2;
        }
        zzbks zzD = zzdohVar.zzD();
        if (zzD == null) {
            return 0.0f;
        }
        float zze = (zzD.zze() == -1 || zzD.zzf() == -1) ? 0.0f : zzD.zze() / zzD.zzf();
        return zze == 0.0f ? zzb(zzD.zzb()) : zze;
    }

    public final void zzf(N6.a aVar) {
        this.zzb = aVar;
    }

    public final N6.a zzg() throws RemoteException {
        N6.a aVar = this.zzb;
        if (aVar != null) {
            return aVar;
        }
        zzbks zzD = this.zza.zzD();
        if (zzD == null) {
            return null;
        }
        return zzD.zzb();
    }

    public final float zzh() throws RemoteException {
        zzdoh zzdohVar = this.zza;
        if (zzdohVar.zzy() != null) {
            return zzdohVar.zzy().zzj();
        }
        return 0.0f;
    }

    public final float zzi() throws RemoteException {
        zzdoh zzdohVar = this.zza;
        if (zzdohVar.zzy() != null) {
            return zzdohVar.zzy().zzk();
        }
        return 0.0f;
    }

    public final g1 zzj() throws RemoteException {
        return this.zza.zzy();
    }

    public final boolean zzk() throws RemoteException {
        return this.zza.zzy() != null;
    }

    public final boolean zzl() throws RemoteException {
        return this.zza.zzV();
    }

    public final void zzm(zzbma zzbmaVar) {
        zzdoh zzdohVar = this.zza;
        if (zzdohVar.zzy() instanceof zzckr) {
            ((zzckr) zzdohVar.zzy()).zzv(zzbmaVar);
        }
    }
}
