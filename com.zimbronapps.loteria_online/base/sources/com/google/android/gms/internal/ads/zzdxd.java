package com.google.android.gms.internal.ads;

import S5.c1;
import S5.l2;
import V5.F0;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdxd implements zzdgh, S5.a, zzdbz, zzdbj, zzdea {
    private final Context zzc;
    private final zzfkd zzd;
    private final zzdxz zze;
    private final zzfjc zzf;
    private final zzfir zzg;
    private final zzeiu zzh;
    private final String zzi;
    private Boolean zzk;
    private long zzj = -1;
    final AtomicBoolean zza = new AtomicBoolean(false);
    final AtomicBoolean zzb = new AtomicBoolean(false);
    private final boolean zzl = ((Boolean) S5.D.c().zzd(zzbhe.zzhK)).booleanValue();

    public zzdxd(Context context, zzfkd zzfkdVar, zzdxz zzdxzVar, zzfjc zzfjcVar, zzfir zzfirVar, zzeiu zzeiuVar, String str) {
        this.zzc = context;
        this.zzd = zzfkdVar;
        this.zze = zzdxzVar;
        this.zzf = zzfjcVar;
        this.zzg = zzfirVar;
        this.zzh = zzeiuVar;
        this.zzi = str;
    }

    private final boolean zzf() {
        String str;
        if (this.zzk == null) {
            synchronized (this) {
                if (this.zzk == null) {
                    String str2 = (String) S5.D.c().zzd(zzbhe.zzbZ);
                    R5.t.g();
                    try {
                        str = F0.g0(this.zzc);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z = false;
                    if (str2 != null && str != null) {
                        try {
                            z = Pattern.matches(str2, str);
                        } catch (RuntimeException e) {
                            R5.t.l().zzg(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzk = Boolean.valueOf(z);
                }
            }
        }
        return this.zzk.booleanValue();
    }

    private final zzdxy zzg(String str) {
        zzfjc zzfjcVar = this.zzf;
        zzfjb zzfjbVar = zzfjcVar.zzb;
        zzdxy zza = this.zze.zza();
        zza.zza(zzfjbVar.zzb);
        zzfir zzfirVar = this.zzg;
        zza.zzb(zzfirVar);
        zza.zzc("action", str);
        zza.zzc("ad_format", this.zzi.toUpperCase(Locale.ROOT));
        List list = zzfirVar.zzt;
        if (!list.isEmpty()) {
            zza.zzc("ancn", (String) list.get(0));
        }
        if (zzfirVar.zzb()) {
            zza.zzc("device_connectivity", true != R5.t.l().zzs(this.zzc) ? "offline" : "online");
            zza.zzc("event_timestamp", String.valueOf(R5.t.o().a()));
            zza.zzc("offline_ad", "1");
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhR)).booleanValue()) {
            boolean a = b6.c.a(zzfjcVar);
            zza.zzc("scar", String.valueOf(a));
            if (a) {
                l2 l2Var = zzfjcVar.zza.zza.zzd;
                zza.zzc("ragent", l2Var.p);
                zza.zzc("rtype", b6.c.b(b6.c.c(l2Var)));
            }
        }
        return zza;
    }

    private final void zzi(zzdxy zzdxyVar) {
        if (!this.zzg.zzb()) {
            zzdxyVar.zzd();
            return;
        }
        this.zzh.zze(new zzeiw(R5.t.o().a(), this.zzf.zzb.zzb.zzb, zzdxyVar.zzg(), 2));
    }

    private final boolean zzj() {
        int i = this.zzg.zzb;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    public final void onAdClicked() {
        if (this.zzg.zzb()) {
            zzi(zzg("click"));
        }
    }

    public final void zzc(c1 c1Var) {
        c1 c1Var2;
        if (this.zzl) {
            zzdxy zzg = zzg("ifts");
            zzg.zzc("reason", "adapter");
            int i = c1Var.a;
            String str = c1Var.b;
            if (c1Var.c.equals("com.google.android.gms.ads") && (c1Var2 = c1Var.d) != null && !c1Var2.c.equals("com.google.android.gms.ads")) {
                c1 c1Var3 = c1Var.d;
                i = c1Var3.a;
                str = c1Var3.b;
            }
            if (i >= 0) {
                zzg.zzc("arec", String.valueOf(i));
            }
            String zza = this.zzd.zza(str);
            if (zza != null) {
                zzg.zzc("areec", zza);
            }
            zzg.zzd();
        }
    }

    public final void zzd(zzdmb zzdmbVar) {
        if (this.zzl) {
            zzdxy zzg = zzg("ifts");
            zzg.zzc("reason", "exception");
            if (!TextUtils.isEmpty(zzdmbVar.getMessage())) {
                zzg.zzc("msg", zzdmbVar.getMessage());
            }
            zzg.zzd();
        }
    }

    public final void zzdG() {
        if (zzf()) {
            zzdxy zzg = zzg("adapter_impression");
            zzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzb.get()) {
                zzg.zzc("po", "1");
                zzg.zzc("pil", String.valueOf(R5.t.o().a() - this.zzj));
            } else {
                zzg.zzc("po", "0");
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zzoZ)).booleanValue() && zzj()) {
                R5.t.g();
                zzg.zzc("foreground", true != F0.l(this.zzc) ? "1" : "0");
                zzg.zzc("fg_show", true != this.zza.get() ? "0" : "1");
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zzpa)).booleanValue() && zzj()) {
                zzg.zzc("fg_al", true == R5.t.k().zzf() ? "1" : "0");
            }
            zzg.zzd();
        }
    }

    public final void zzdH() {
        if (zzf()) {
            zzg("adapter_shown").zzd();
        }
    }

    public final void zzdr() {
        if (zzf() || this.zzg.zzb()) {
            zzdxy zzg = zzg("impression");
            zzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzj > 0) {
                zzg.zzc("p_imp_l", String.valueOf(R5.t.o().a() - this.zzj));
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zzoZ)).booleanValue() && zzj()) {
                R5.t.g();
                zzg.zzc("foreground", true != F0.l(this.zzc) ? "1" : "0");
                zzg.zzc("fg_show", true == this.zza.get() ? "1" : "0");
            }
            zzi(zzg);
        }
    }

    public final void zze() {
        if (this.zzl) {
            zzdxy zzg = zzg("ifts");
            zzg.zzc("reason", "blocked");
            zzg.zzd();
        }
    }

    public final void zzk() {
        if (zzf()) {
            this.zzb.set(true);
            this.zzj = R5.t.o().a();
            zzdxy zzg = zzg("presentation");
            if (((Boolean) S5.D.c().zzd(zzbhe.zzoZ)).booleanValue() && zzj()) {
                AtomicBoolean atomicBoolean = this.zza;
                R5.t.g();
                atomicBoolean.set(!F0.l(this.zzc));
                zzg.zzc("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zzpa)).booleanValue() && zzj()) {
                zzg.zzc("fg_al", true != R5.t.k().zzf() ? "0" : "1");
            }
            zzg.zzd();
        }
    }
}
