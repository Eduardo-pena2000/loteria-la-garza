package com.google.android.gms.internal.ads;

import S5.W1;
import S5.Y;
import S5.d1;
import S5.g0;
import S5.i0;
import S5.q2;
import V5.o0;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfqz extends zzfsa {
    public zzfqz(ClientApi clientApi, Context context, int i, zzfkg zzfkgVar, W1 w1, g0 g0Var, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, E6.f fVar) {
        super(clientApi, context, i, zzfkgVar, w1, g0Var, scheduledExecutorService, zzfmyVar, zzfraVar, fVar);
    }

    public final x7.e zza(Context context) {
        zzbtt zzd = this.zzd.zzd();
        if (zzd == null) {
            return zzgzo.zzc(new zzfqs(1, "Failed to create an app open ad manager."));
        }
        Y E0 = this.zza.E0(N6.b.s1(context), q2.P1(), this.zze.a, zzd, this.zzc);
        if (E0 == null) {
            return zzgzo.zzc(new zzfqs(1, "Failed to create an app open ad manager."));
        }
        zzhah zze = zzhah.zze();
        try {
            zzx(this.zze.c);
            E0.zzJ(new zzfqy(this, zze, this.zze));
            E0.zze(this.zze.c);
            return zze;
        } catch (RemoteException e) {
            W5.p.g("Failed to load app open ad.", e);
            return zzgzo.zzc(new zzfqs(1, "remote exception"));
        }
    }

    public final long zzb() {
        return ((Long) S5.D.c().zzd(zzbhe.zzS)).longValue();
    }

    public final /* bridge */ /* synthetic */ d1 zzc(Object obj) {
        try {
            return ((zzbex) obj).zzg();
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.b("Failed to get response info for the app open ad.", e);
            return null;
        }
    }

    public zzfqz(String str, ClientApi clientApi, Context context, int i, zzfkg zzfkgVar, W1 w1, i0 i0Var, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, E6.f fVar, zzfqr zzfqrVar) {
        super(str, clientApi, context, i, zzfkgVar, w1, i0Var, scheduledExecutorService, zzfmyVar, zzfraVar, fVar, zzfqrVar);
    }
}
