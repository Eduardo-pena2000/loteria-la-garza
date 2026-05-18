package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbno implements zzboh {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        if (zzcjlVar.zzaz() != null) {
            zzcjlVar.zzaz().zza();
        }
        U5.z zzL = zzcjlVar.zzL();
        if (zzL != null) {
            zzL.zzb();
            return;
        }
        U5.z zzM = zzcjlVar.zzM();
        if (zzM != null) {
            zzM.zzb();
        } else {
            int i = o0.b;
            W5.p.f("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
