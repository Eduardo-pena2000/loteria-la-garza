package com.google.android.gms.internal.ads;

import V5.c0;
import V5.n0;
import android.content.Context;
import b6.r0;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzcma implements zzcqi {
    private static zzcma zza;

    private static synchronized zzcma zzH(Context context, zzbtt zzbttVar, int i, boolean z, int i2, zzcnl zzcnlVar) {
        synchronized (zzcma.class) {
            try {
                zzcma zzcmaVar = zza;
                if (zzcmaVar != null) {
                    return zzcmaVar;
                }
                long a = R5.t.o().a();
                zzbhe.zza(context);
                if (((Boolean) zzbiw.zze.zze()).booleanValue()) {
                    zzbgp.zza(context);
                }
                zzfkg zza2 = zzfkg.zza(context);
                W5.a zzb = zza2.zzb(254715000, false, i2);
                zza2.zzc(zzbttVar);
                zzcoa zzcoaVar = new zzcoa(null);
                zzcmb zzcmbVar = new zzcmb();
                zzcmbVar.zza(zzb);
                zzcmbVar.zzb(context);
                zzcmbVar.zzc(a);
                zzcoaVar.zza(new zzcmc(zzcmbVar, null));
                zzcoaVar.zzb(new zzcox(zzcnlVar));
                zzcma zzc = zzcoaVar.zzc();
                if (((Boolean) S5.D.c().zzd(zzbhe.zzpk)).booleanValue()) {
                    R5.t.i().zza(zzfmk.zzc(), zzc.zzD(), context);
                    R5.t.i().zzb();
                }
                ((zzecp) ((zzcnp) zzc).zzo.zzb()).zza();
                ((zzclt) ((zzcnp) zzc).zzn.zzb()).zza(context, zzb);
                R5.t.l().zze(context, zzb, zzc.zzD());
                R5.t.n().zza(context);
                R5.t.g().P(context);
                R5.t.g().Q(context);
                n0.a(context);
                R5.t.k().zza(context);
                R5.t.a().a(context);
                if (((Boolean) S5.D.c().zzd(zzbhe.zzpG)).booleanValue()) {
                    String str = (String) S5.D.c().zzd(zzbhe.zzpH);
                    if (!str.isEmpty()) {
                        if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                            zzc.zzE().zza(R5.t.k());
                        }
                    }
                } else {
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzpF)).booleanValue()) {
                        zzc.zzE().zza(R5.t.k());
                    }
                }
                ((c0) ((zzcnp) zzc).zzau.zzb()).a();
                zzccr.zzb(context);
                if (((Boolean) S5.D.c().zzd(zzbhe.zzhf)).booleanValue()) {
                    if (!((Boolean) S5.D.c().zzd(zzbhe.zzbe)).booleanValue()) {
                        new zzeii(context, zzb, new zzbgd(new zzbgi(context)), new zzehn(new zzehj(context), (zzgzy) ((zzcnp) zzc).zzd.zzb())).zza(R5.t.l().zzo().zzx());
                    }
                }
                if (((Boolean) S5.D.c().zzd(zzbhe.zzpz)).booleanValue()) {
                    zzc.zzg().zza();
                }
                zza = zzc;
                return zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static zzcma zza(Context context, zzbtt zzbttVar, int i) {
        return zzH(context, zzbttVar, 254715000, false, i, new zzcnl());
    }

    public abstract zzdzq zzA();

    public abstract zzfka zzB();

    public abstract zzecc zzC();

    public abstract zzdxz zzD();

    public abstract zzdvh zzE();

    public final zzcdk zzF() {
        return zzG();
    }

    public abstract zzcdk zzG();

    public abstract Executor zzb();

    public abstract ScheduledExecutorService zzc();

    public abstract zzdeg zzd();

    public abstract zzcpj zze();

    public abstract zzfrd zzf();

    public abstract zzefu zzg();

    public abstract zzefw zzh();

    public abstract zzcvb zzi();

    public abstract zzffh zzj();

    public abstract zzctk zzk();

    public abstract zzfdu zzl();

    public abstract zzdlt zzm();

    public abstract zzfgx zzn();

    public abstract zzdmp zzo();

    public abstract zzdud zzp();

    public abstract zzfik zzq();

    public abstract b6.d zzr();

    public abstract b6.w zzs();

    public abstract r0 zzt();

    public abstract zzejf zzu();

    public abstract zzfkj zzv();

    public abstract zzebf zzw();

    public abstract zzfor zzx();

    public final zzfbz zzy(zzbzu zzbzuVar, int i) {
        return zzz(new zzfdc(zzbzuVar, i));
    }

    public abstract zzfbz zzz(zzfdc zzfdcVar);
}
