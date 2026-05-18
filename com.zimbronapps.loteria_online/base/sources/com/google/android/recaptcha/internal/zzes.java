package com.google.android.recaptcha.internal;

import Ca.I;
import Ca.o;
import Da.D;
import android.content.Context;
import cb.O;
import cb.Q;
import cb.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzes implements zzeo {
    private static Timer zza;
    private final Context zzb;
    private final zzet zzc;
    private final O zzd;
    private final zzei zze;

    public zzes(Context context, zzet zzetVar, O o) {
        this.zzb = context;
        this.zzc = zzetVar;
        this.zzd = o;
        zzei zzeiVar = null;
        try {
            zzei zzc = zzei.zzc();
            zzc = zzc == null ? new zzei(context, null) : zzc;
            zzei.zze(zzc);
            zzeiVar = zzc;
        } catch (Exception unused) {
        }
        this.zze = zzeiVar;
        zzh();
    }

    public static final /* synthetic */ zzei zzb(zzes zzesVar) {
        return zzesVar.zze;
    }

    public static final /* synthetic */ Timer zzc() {
        return zza;
    }

    public static final /* synthetic */ O zzd(zzes zzesVar) {
        return zzesVar.zzd;
    }

    public static final /* synthetic */ void zze(zzes zzesVar) {
        zzesVar.zzg();
    }

    public static final /* synthetic */ void zzf(Timer timer) {
        zza = null;
    }

    private final void zzg() {
        zzei zzeiVar;
        zztx zzk;
        int zzN;
        int i;
        zzei zzeiVar2 = this.zze;
        if (zzeiVar2 != null) {
            for (List<zzej> list : D.R0(zzeiVar2.zzd(), 20, 20, true)) {
                zzrd zzi = zzrf.zzi();
                List arrayList = new ArrayList();
                for (zzej zzejVar : list) {
                    try {
                        zzk = zztx.zzk(zzkh.zzg().zzj(zzejVar.zzc()));
                        zzN = zzk.zzN();
                        i = zzN - 1;
                    } catch (Exception unused) {
                        zzei zzeiVar3 = this.zze;
                        if (zzeiVar3 != null) {
                            zzeiVar3.zzf(zzejVar);
                        }
                    }
                    if (zzN == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        zzi.zzq(zzk.zzf());
                    } else if (i == 1) {
                        zzi.zzr(zzk.zzg());
                    } else {
                        if (i != 2) {
                            throw new o();
                        }
                        I i2 = I.a;
                    }
                    arrayList.add(zzejVar);
                }
                if (zzi.zze() + zzi.zzf() != 0) {
                    if (this.zzc.zza(((zzrf) zzi.zzi()).zzd()) && (zzeiVar = this.zze) != null) {
                        zzeiVar.zza(arrayList);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzep(this), 120000L, 120000L);
        }
    }

    public final void zza(zztx zztxVar) {
        i.d(this.zzd, (Ga.i) null, (Q) null, new zzer(this, zztxVar, null), 3, (Object) null);
        zzh();
    }
}
