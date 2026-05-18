package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdjg extends zzdhd implements zzbde {
    private final Map zzb;
    private final Context zzc;
    private final zzfir zzd;

    public zzdjg(Context context, Set set, zzfir zzfirVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfirVar;
    }

    public final synchronized void zza(View view) {
        try {
            Map map = this.zzb;
            zzbdg zzbdgVar = (zzbdg) map.get(view);
            if (zzbdgVar == null) {
                zzbdg zzbdgVar2 = new zzbdg(this.zzc, view);
                zzbdgVar2.zza(this);
                map.put(view, zzbdgVar2);
                zzbdgVar = zzbdgVar2;
            }
            if (this.zzd.zzX) {
                if (((Boolean) S5.D.c().zzd(zzbhe.zzbV)).booleanValue()) {
                    zzbdgVar.zzd(((Long) S5.D.c().zzd(zzbhe.zzbU)).longValue());
                    return;
                }
            }
            zzbdgVar.zze();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(View view) {
        Map map = this.zzb;
        if (map.containsKey(view)) {
            ((zzbdg) map.get(view)).zzb(this);
            map.remove(view);
        }
    }

    public final synchronized void zzdj(zzbdd zzbddVar) {
        zzs(new zzdjf(zzbddVar));
    }
}
