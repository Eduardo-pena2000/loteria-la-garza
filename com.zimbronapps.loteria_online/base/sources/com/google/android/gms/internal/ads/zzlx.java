package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzlx implements zzwv, zztk {
    final /* synthetic */ zzmc zza;
    private final zzlz zzb;

    public zzlx(zzmc zzmcVar, zzlz zzlzVar) {
        Objects.requireNonNull(zzmcVar);
        this.zza = zzmcVar;
        this.zzb = zzlzVar;
    }

    private final Pair zzf(int i, zzwk zzwkVar) {
        zzwk zzwkVar2;
        zzwk zzwkVar3 = null;
        if (zzwkVar != null) {
            zzlz zzlzVar = this.zzb;
            int i2 = 0;
            while (true) {
                List list = zzlzVar.zzc;
                if (i2 >= list.size()) {
                    zzwkVar2 = null;
                    break;
                }
                if (((zzwk) list.get(i2)).zzd == zzwkVar.zzd) {
                    Object obj = zzwkVar.zza;
                    Object obj2 = zzlzVar.zzb;
                    int i3 = zzmj.zzb;
                    zzwkVar2 = zzwkVar.zza(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (zzwkVar2 == null) {
                return null;
            }
            zzwkVar3 = zzwkVar2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzwkVar3);
    }

    public final void zzai(int i, zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar, int i2) {
        Pair zzf = zzf(0, zzwkVar);
        if (zzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new zzlw(this, zzf, zzwbVar, zzwgVar, i2));
        }
    }

    public final void zzaj(int i, zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar) {
        Pair zzf = zzf(0, zzwkVar);
        if (zzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new zzls(this, zzf, zzwbVar, zzwgVar));
        }
    }

    public final void zzak(int i, zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar) {
        Pair zzf = zzf(0, zzwkVar);
        if (zzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new zzlt(this, zzf, zzwbVar, zzwgVar));
        }
    }

    public final void zzal(int i, zzwk zzwkVar, zzwb zzwbVar, zzwg zzwgVar, IOException iOException, boolean z) {
        Pair zzf = zzf(0, zzwkVar);
        if (zzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new zzlu(this, zzf, zzwbVar, zzwgVar, iOException, z));
        }
    }

    public final void zzam(int i, zzwk zzwkVar, zzwg zzwgVar) {
        Pair zzf = zzf(0, zzwkVar);
        if (zzf != null) {
            zzmc zzmcVar = this.zza;
            zzmcVar.zzk().zzn(new zzlv(this, zzf, zzwgVar));
        }
    }
}
