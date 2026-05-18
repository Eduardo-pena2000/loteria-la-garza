package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbnj implements zzboh {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        try {
            zzgal.zzh(zzcjlVar.getContext()).zzk();
            zzgam.zzh(zzcjlVar.getContext()).zzj();
            zzgan.zza(zzcjlVar.getContext()).zzb(null);
        } catch (IOException e) {
            R5.t.l().zzg(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
