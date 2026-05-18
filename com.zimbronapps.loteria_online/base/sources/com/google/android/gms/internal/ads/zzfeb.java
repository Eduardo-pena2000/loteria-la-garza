package com.google.android.gms.internal.ads;

import S5.w2;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzfeb implements zzesf {
    protected final zzcma zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzfer zzd;
    private final zzfgj zze;
    private final W5.a zzf;
    private final ViewGroup zzg;
    private final zzfor zzh;
    private final zzfjj zzi;
    private x7.e zzj;

    public zzfeb(Context context, Executor executor, zzcma zzcmaVar, zzfgj zzfgjVar, zzfer zzferVar, zzfjj zzfjjVar, W5.a aVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcmaVar;
        this.zze = zzfgjVar;
        this.zzd = zzferVar;
        this.zzi = zzfjjVar;
        this.zzf = aVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcmaVar.zzx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized zzdal zzg(zzfgh zzfghVar) {
        zzfdy zzfdyVar = (zzfdy) zzfghVar;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzjx)).booleanValue()) {
            zzctu zzctuVar = new zzctu(this.zzg);
            zzdan zzdanVar = new zzdan();
            zzdanVar.zza(this.zzb);
            zzdanVar.zzb(zzfdyVar.zza);
            zzdao zze = zzdanVar.zze();
            zzdhe zzdheVar = new zzdhe();
            zzfer zzferVar = this.zzd;
            Executor executor = this.zzc;
            zzdheVar.zzd(zzferVar, executor);
            zzdheVar.zzg(zzferVar, executor);
            return zzc(zzctuVar, zze, zzdheVar.zzn());
        }
        zzfer zzn = zzfer.zzn(this.zzd);
        zzdhe zzdheVar2 = new zzdhe();
        Executor executor2 = this.zzc;
        zzdheVar2.zzc(zzn, executor2);
        zzdheVar2.zzi(zzn, executor2);
        zzdheVar2.zzj(zzn, executor2);
        zzdheVar2.zzk(zzn, executor2);
        zzdheVar2.zzd(zzn, executor2);
        zzdheVar2.zzg(zzn, executor2);
        zzdheVar2.zzl(zzn);
        zzctu zzctuVar2 = new zzctu(this.zzg);
        zzdan zzdanVar2 = new zzdan();
        zzdanVar2.zza(this.zzb);
        zzdanVar2.zzb(zzfdyVar.zza);
        return zzc(zzctuVar2, zzdanVar2.zze(), zzdheVar2.zzn());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zza(S5.l2 r10, java.lang.String r11, com.google.android.gms.internal.ads.zzesd r12, com.google.android.gms.internal.ads.zzese r13) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfeb.zza(S5.l2, java.lang.String, com.google.android.gms.internal.ads.zzesd, com.google.android.gms.internal.ads.zzese):boolean");
    }

    public final boolean zzb() {
        x7.e eVar = this.zzj;
        return (eVar == null || eVar.isDone()) ? false : true;
    }

    public abstract zzdal zzc(zzctu zzctuVar, zzdao zzdaoVar, zzdhf zzdhfVar);

    public final void zzd(w2 w2Var) {
        this.zzi.zzp(w2Var);
    }

    public final /* synthetic */ void zze() {
        this.zzd.zzdI(zzfkm.zzd(6, null, null));
    }

    public final /* synthetic */ Executor zzh() {
        return this.zzc;
    }

    public final /* synthetic */ zzfer zzi() {
        return this.zzd;
    }

    public final /* synthetic */ zzfgj zzj() {
        return this.zze;
    }

    public final /* synthetic */ zzfor zzk() {
        return this.zzh;
    }

    public final /* synthetic */ void zzl(x7.e eVar) {
        this.zzj = null;
    }
}
