package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgbu implements zzgfb {
    private final zzgbl zza;
    private final zzgbr zzb;
    private Context zzc;
    private View zzd;
    private Activity zze;
    private String zzf;
    private Map zzg;
    private zzawg zzh;
    private zzgcc zzi;

    public /* synthetic */ zzgbu(zzgbl zzgblVar, zzgbr zzgbrVar, byte[] bArr) {
        this.zza = zzgblVar;
        this.zzb = zzgbrVar;
    }

    public final zzgfc zza() {
        zziko.zzc(this.zzc, Context.class);
        zziko.zzc(this.zzg, Map.class);
        zziko.zzc(this.zzh, zzawg.class);
        zziko.zzc(this.zzi, zzgcc.class);
        return new zzgbv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
    }

    public final /* bridge */ /* synthetic */ zzgfb zzb(zzgcc zzgccVar) {
        zzgccVar.getClass();
        this.zzi = zzgccVar;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzgfb zzc(zzawg zzawgVar) {
        zzawgVar.getClass();
        this.zzh = zzawgVar;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzgfb zzd(Map map) {
        this.zzg = map;
        return this;
    }

    public final /* synthetic */ zzgfb zze(String str) {
        this.zzf = str;
        return this;
    }

    public final /* synthetic */ zzgfb zzf(Activity activity) {
        this.zze = activity;
        return this;
    }

    public final /* synthetic */ zzgfb zzg(View view) {
        this.zzd = view;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzgfb zzh(Context context) {
        context.getClass();
        this.zzc = context;
        return this;
    }
}
