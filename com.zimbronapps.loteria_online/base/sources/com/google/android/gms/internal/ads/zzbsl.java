package com.google.android.gms.internal.ads;

import V5.F0;
import V5.Y;
import V5.o0;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbsl {
    private final Context zzb;
    private final String zzc;
    private final W5.a zzd;
    private final zzfor zze;
    private final V5.E zzf;
    private final V5.E zzg;
    private zzbsk zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbsl(Context context, W5.a aVar, String str, V5.E e, V5.E e2, zzfor zzforVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = aVar;
        this.zze = zzforVar;
        this.zzf = e;
        this.zzg = e2;
    }

    public final zzbsk zza(zzazh zzazhVar) {
        zzfoe zzn = zzfoe.zzn(this.zzb, 6);
        zzn.zza();
        zzbsk zzbskVar = new zzbsk(this.zzg);
        o0.k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        zzcei.zzf.execute(new zzbsb(this, null, zzbskVar));
        o0.k("loadNewJavascriptEngine: Promise created");
        zzbskVar.zze(new zzbru(this, zzbskVar, zzn), new zzbrv(this, zzbskVar, zzn));
        return zzbskVar;
    }

    public final zzbsf zzb(zzazh zzazhVar) {
        o0.k("getEngine: Trying to acquire lock");
        Object obj = this.zza;
        synchronized (obj) {
            try {
                o0.k("getEngine: Lock acquired");
                o0.k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        o0.k("refreshIfDestroyed: Lock acquired");
                        zzbsk zzbskVar = this.zzh;
                        if (zzbskVar != null && this.zzi == 0) {
                            zzbskVar.zze(new zzbrx(this), zzbry.zza);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o0.k("refreshIfDestroyed: Lock released");
        zzbsk zzbskVar2 = this.zzh;
        if (zzbskVar2 != null && zzbskVar2.zzi() != -1) {
            int i = this.zzi;
            if (i == 0) {
                o0.k("getEngine (NO_UPDATE): Lock released");
                return this.zzh.zza();
            }
            if (i != 1) {
                o0.k("getEngine (UPDATING): Lock released");
                return this.zzh.zza();
            }
            this.zzi = 2;
            zza(null);
            o0.k("getEngine (PENDING_UPDATE): Lock released");
            return this.zzh.zza();
        }
        this.zzi = 2;
        this.zzh = zza(null);
        o0.k("getEngine (NULL or REJECTED): Lock released");
        return this.zzh.zza();
    }

    public final void zzc() {
        zzbsk zzbskVar = this.zzh;
        if (zzbskVar != null) {
            zzbskVar.zzc();
            this.zzh = null;
        }
    }

    public final /* synthetic */ void zzd(zzazh zzazhVar, zzbsk zzbskVar) {
        long a = R5.t.o().a();
        ArrayList arrayList = new ArrayList();
        try {
            o0.k("loadJavascriptEngine > Before createJavascriptEngine");
            zzbro zzbroVar = new zzbro(this.zzb, this.zzd, null, null);
            o0.k("loadJavascriptEngine > After createJavascriptEngine");
            o0.k("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbroVar.zzi(new zzbrz(this, arrayList, a, zzbskVar, zzbroVar));
            o0.k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbroVar.zzm("/jsLoaded", new zzbrq(this, a, zzbskVar, zzbroVar));
            Y y = new Y();
            zzbrr zzbrrVar = new zzbrr(this, null, zzbroVar, y);
            y.b(zzbrrVar);
            o0.k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            if (!((Boolean) zzbje.zzd.zze()).booleanValue() || TextUtils.equals(this.zzb.getPackageName(), "com.google.android.gms")) {
                zzbroVar.zzm("/requestReload", zzbrrVar);
            }
            String str = this.zzc;
            o0.k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
            if (str.endsWith(".js")) {
                o0.k("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbroVar.zzf(str);
                o0.k("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (str.startsWith("<html>")) {
                o0.k("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbroVar.zzh(str);
                o0.k("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                o0.k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbroVar.zzg(str);
                o0.k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            o0.k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            F0.l.postDelayed(new zzbrt(this, zzbskVar, zzbroVar, arrayList, a), ((Integer) S5.D.c().zzd(zzbhe.zze)).intValue());
        } catch (Throwable th) {
            int i = o0.b;
            W5.p.d("Error creating webview.", th);
            if (((Boolean) S5.D.c().zzd(zzbhe.zziK)).booleanValue()) {
                zzbskVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zziM)).booleanValue()) {
                R5.t.l().zzh(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbskVar.zzg();
            } else {
                R5.t.l().zzg(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbskVar.zzg();
            }
        }
    }

    public final /* synthetic */ void zze(zzbrg zzbrgVar) {
        if (zzbrgVar.zzk()) {
            this.zzi = 1;
        }
    }

    public final /* synthetic */ void zzf(zzbsk zzbskVar, zzbrg zzbrgVar, ArrayList arrayList, long j) {
        o0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            try {
                o0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (zzbskVar.zzi() != -1 && zzbskVar.zzi() != 1) {
                    if (((Boolean) S5.D.c().zzd(zzbhe.zziK)).booleanValue()) {
                        zzbskVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        zzbskVar.zzg();
                    }
                    zzgzy zzgzyVar = zzcei.zzf;
                    Objects.requireNonNull(zzbrgVar);
                    zzgzyVar.execute(new zzbrw(zzbrgVar));
                    String valueOf = String.valueOf(S5.D.c().zzd(zzbhe.zzd));
                    int zzi = zzbskVar.zzi();
                    int i = this.zzi;
                    String valueOf2 = String.valueOf(arrayList.get(0));
                    long a = R5.t.o().a() - j;
                    StringBuilder sb = new StringBuilder(valueOf.length() + 94 + String.valueOf(zzi).length() + 39 + String.valueOf(i).length() + 57 + valueOf2.length() + 42 + String.valueOf(a).length() + 15);
                    sb.append("Could not receive /jsLoaded in ");
                    sb.append(valueOf);
                    sb.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                    sb.append(zzi);
                    sb.append(". Update status(onEngLoadedTimeout) is ");
                    sb.append(i);
                    sb.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                    sb.append(valueOf2);
                    sb.append(" ms. Total latency(onEngLoadedTimeout) is ");
                    sb.append(a);
                    sb.append(" ms. Rejecting.");
                    o0.k(sb.toString());
                    o0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                o0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Object zzg() {
        return this.zza;
    }

    public final /* synthetic */ zzfor zzh() {
        return this.zze;
    }

    public final /* synthetic */ zzbsk zzi() {
        return this.zzh;
    }

    public final /* synthetic */ void zzj(zzbsk zzbskVar) {
        this.zzh = zzbskVar;
    }

    public final /* synthetic */ int zzk() {
        return this.zzi;
    }

    public final /* synthetic */ void zzl(int i) {
        this.zzi = i;
    }
}
