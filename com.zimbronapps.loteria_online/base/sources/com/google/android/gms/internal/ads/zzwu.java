package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzwu {
    public final int zza;
    public final zzwk zzb;
    private final CopyOnWriteArrayList zzc;

    private zzwu(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzwk zzwkVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzwkVar;
    }

    public final zzwu zza(int i, zzwk zzwkVar) {
        return new zzwu(this.zzc, 0, zzwkVar);
    }

    public final void zzb(Handler handler, zzwv zzwvVar) {
        this.zzc.add(new zzwn(handler, zzwvVar));
    }

    public final void zzc(zzwv zzwvVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzwn zzwnVar = (zzwn) it.next();
            if (zzwnVar.zzb == zzwvVar) {
                copyOnWriteArrayList.remove(zzwnVar);
            }
        }
    }

    public final void zzd(zzwb zzwbVar, zzwg zzwgVar, int i) {
        zzi(new zzwt(this, zzwbVar, zzwgVar, i));
    }

    public final void zze(zzwb zzwbVar, zzwg zzwgVar) {
        zzi(new zzwo(this, zzwbVar, zzwgVar));
    }

    public final void zzf(zzwb zzwbVar, zzwg zzwgVar) {
        zzi(new zzwp(this, zzwbVar, zzwgVar));
    }

    public final void zzg(zzwb zzwbVar, zzwg zzwgVar, IOException iOException, boolean z) {
        zzi(new zzwq(this, zzwbVar, zzwgVar, iOException, z));
    }

    public final void zzh(zzwg zzwgVar) {
        zzi(new zzwr(this, zzwgVar));
    }

    public final void zzi(zzdr zzdrVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzwn zzwnVar = (zzwn) it.next();
            zzfj.zzd(zzwnVar.zza, new zzws(zzdrVar, zzwnVar.zzb));
        }
    }

    public zzwu() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
