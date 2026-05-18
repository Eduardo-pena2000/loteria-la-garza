package com.google.android.gms.internal.ads;

import V5.F0;
import V5.o0;
import android.content.Context;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbro implements zzbrg, zzbre {
    private zzcjl zza;

    public zzbro(Context context, W5.a aVar, zzazh zzazhVar, R5.a aVar2) throws zzcka {
        R5.t.h();
        zzcjl zza = zzckb.zza(context, zzclv.zzb(), "", false, false, null, null, aVar, null, null, null, zzbgd.zza(), null, null, null, null, null);
        this.zza = zza;
        zza.zzE().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        S5.B.a();
        if (W5.g.G()) {
            o0.k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            o0.k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (F0.l.post(runnable)) {
                return;
            }
            W5.p.f("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    public final void zza(String str) {
        o0.k("invokeJavascript on adWebView from js");
        zzs(new zzbrn(this, str));
    }

    public final void zzf(String str) {
        o0.k("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new zzbrj(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final void zzg(String str) {
        o0.k("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new zzbrl(this, str));
    }

    public final void zzh(String str) {
        o0.k("loadHtml on adWebView from html");
        zzs(new zzbrk(this, str));
    }

    public final void zzi(zzbrf zzbrfVar) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzclj zzP = zzcjlVar.zzP();
            Objects.requireNonNull(zzbrfVar);
            zzP.zzH(new zzbri(zzbrfVar));
        }
    }

    public final void zzj() {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.destroy();
            this.zza = null;
        }
    }

    public final boolean zzk() {
        zzcjl zzcjlVar = this.zza;
        return zzcjlVar == null || zzcjlVar.zzX();
    }

    public final zzbsn zzl() {
        return new zzbsn(this);
    }

    public final void zzm(String str, zzboh zzbohVar) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.zzab(str, new zzbrh(this, zzbohVar));
        }
    }

    public final void zzn(String str, zzboh zzbohVar) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.zzad(str, new zzbrm(zzbohVar));
        }
    }

    public final /* synthetic */ void zzo(String str) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.zza(str);
        }
    }

    public final /* synthetic */ void zzp(String str) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.loadData(str, "text/html", "UTF-8");
        }
    }

    public final /* synthetic */ void zzq(String str) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.loadData(str, "text/html", "UTF-8");
        }
    }

    public final /* synthetic */ void zzr(String str) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            zzcjlVar.loadUrl(str);
        }
    }
}
