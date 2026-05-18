package com.google.android.gms.internal.ads;

import V5.W;
import V5.o0;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzboc implements zzboh {
    static final /* synthetic */ zzboc zza = new zzboc();

    private /* synthetic */ zzboc() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzckx zzckxVar = (zzckx) obj;
        zzboh zzbohVar = zzbog.zza;
        String str = (String) map.get("u");
        if (str == null) {
            int i = o0.b;
            W5.p.f("URL missing from httpTrack GMSG.");
            return;
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzg)).booleanValue() && str.isEmpty()) {
            int i2 = o0.b;
            W5.p.f("URL is empty from httpTrack GMSG.");
        } else {
            zzcjc zzcjcVar = (zzcjc) zzckxVar;
            new W(zzckxVar.getContext(), ((zzclf) zzckxVar).zzs().a, str, null, zzcjcVar.zzC() != null ? zzcjcVar.zzC().zzax : null).zzb();
        }
    }
}
