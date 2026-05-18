package com.google.android.gms.internal.ads;

import V5.F0;
import V5.q0;
import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzccr {
    static zzccr zzi;

    public static synchronized zzccr zzb(Context context) {
        synchronized (zzccr.class) {
            try {
                zzccr zzccrVar = zzi;
                if (zzccrVar != null) {
                    return zzccrVar;
                }
                Context applicationContext = context.getApplicationContext();
                zzbhe.zza(applicationContext);
                q0 zzo = R5.t.l().zzo();
                zzo.zza(applicationContext);
                zzccl zzcclVar = new zzccl(null);
                zzcclVar.zza(applicationContext);
                zzcclVar.zzb(R5.t.o());
                zzcclVar.zzc(zzo);
                zzcclVar.zzd(R5.t.d());
                zzccr zze = zzcclVar.zze();
                zzi = zze;
                ((zzccf) ((zzccm) zze).zzc.zzb()).zza();
                zzccw zzccwVar = (zzccw) ((zzccm) zzi).zzh.zzb();
                if (((Boolean) S5.D.c().zzd(zzbhe.zzbb)).booleanValue()) {
                    R5.t.g();
                    Map m0 = F0.m0((String) S5.D.c().zzd(zzbhe.zzbc));
                    Iterator it = m0.keySet().iterator();
                    while (it.hasNext()) {
                        zzccwVar.zzb((String) it.next());
                    }
                    zzccwVar.zza(new zzccv(zzccwVar, m0));
                }
                return zzi;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract zzccj zza();
}
