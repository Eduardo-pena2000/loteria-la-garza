package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfjt implements zzboh {
    private final /* synthetic */ zzfqk zza;
    private final /* synthetic */ zzeiu zzb;

    public /* synthetic */ zzfjt(zzfqk zzfqkVar, zzeiu zzeiuVar) {
        this.zza = zzfqkVar;
        this.zzb = zzeiuVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcjc zzcjcVar = (zzcjc) obj;
        String str = (String) map.get("u");
        if (str == null) {
            int i = o0.b;
            W5.p.f("URL missing from httpTrack GMSG.");
            return;
        }
        zzfir zzC = zzcjcVar.zzC();
        if (zzC != null && !zzC.zzai) {
            this.zza.zzb(str, zzC.zzax, null, null);
            return;
        }
        zzfiu zzaC = ((zzcks) zzcjcVar).zzaC();
        if (zzaC != null) {
            this.zzb.zze(new zzeiw(R5.t.o().a(), zzaC.zzb, str, 2));
        } else {
            R5.t.l().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
        }
    }
}
