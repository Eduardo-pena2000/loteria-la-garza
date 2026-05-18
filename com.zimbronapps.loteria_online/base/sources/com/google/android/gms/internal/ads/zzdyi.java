package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzdyi {
    protected final Map zza;
    protected final Context zzb;
    protected final Executor zzc;
    protected final W5.v zzd;
    protected final boolean zze;
    private final c6.c zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final AtomicBoolean zzi;
    private final AtomicReference zzj;

    public zzdyi(Executor executor, W5.v vVar, c6.c cVar, Context context) {
        this.zza = new HashMap();
        this.zzi = new AtomicBoolean();
        this.zzj = new AtomicReference(new Bundle());
        this.zzc = executor;
        this.zzd = vVar;
        this.zze = ((Boolean) S5.D.c().zzd(zzbhe.zzcD)).booleanValue();
        this.zzf = cVar;
        this.zzg = ((Boolean) S5.D.c().zzd(zzbhe.zzcI)).booleanValue();
        this.zzh = ((Boolean) S5.D.c().zzd(zzbhe.zzhS)).booleanValue();
        this.zzb = context;
    }

    private final void zza(Map map, boolean z) {
        if (map.isEmpty()) {
            int i = o0.b;
            W5.p.a("Empty paramMap.");
            return;
        }
        zzi(map);
        String a = this.zzf.a(map);
        o0.k(a);
        boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
        if (this.zze) {
            if (!z || this.zzg) {
                if (!parseBoolean || this.zzh) {
                    this.zzc.execute(new zzdyf(this, a));
                }
            }
        }
    }

    private final void zzi(Map map) {
        if (map == null || map.isEmpty()) {
            int i = o0.b;
            W5.p.a("Empty or null paramMap.");
            return;
        }
        if (!this.zzi.getAndSet(true)) {
            String str = (String) S5.D.c().zzd(zzbhe.zzlX);
            this.zzj.set(V5.d.c(this.zzb, str, new zzdyg(this, str)));
        }
        Bundle bundle = (Bundle) this.zzj.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    public final void zzb(Map map) {
        zza(map, false);
    }

    public final String zzc(Map map) {
        return this.zzf.a(map);
    }

    public final ConcurrentHashMap zzd() {
        return new ConcurrentHashMap(this.zza);
    }

    public final void zze(Map map) {
        zza(map, true);
    }

    public final W5.u zzf(Map map) {
        if (map.isEmpty()) {
            int i = o0.b;
            W5.p.a("Empty paramMap.");
            return W5.u.a;
        }
        String a = this.zzf.a(map);
        o0.k(a);
        return this.zzd.b(a, null);
    }

    public final void zzg(Map map) {
        if (map.isEmpty()) {
            int i = o0.b;
            W5.p.a("Empty paramMap.");
            return;
        }
        zzi(map);
        String a = this.zzf.a(map);
        o0.k(a);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzoF)).booleanValue() || this.zze) {
            this.zzc.execute(new zzdyh(this, a));
        }
    }

    public final /* synthetic */ void zzh(String str, SharedPreferences sharedPreferences, String str2) {
        this.zzj.set(V5.d.b(this.zzb, str));
    }
}
