package com.google.android.gms.internal.ads;

import S5.W1;
import S5.d1;
import S5.g0;
import S5.i0;
import V5.o0;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfsf extends zzfsa {
    public zzfsf(ClientApi clientApi, Context context, int i, zzfkg zzfkgVar, W1 w1, g0 g0Var, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, E6.f fVar) {
        super(clientApi, context, i, zzfkgVar, w1, g0Var, scheduledExecutorService, zzfmyVar, zzfraVar, fVar);
    }

    public final x7.e zza(Context context) {
        zzbtt zzd = this.zzd.zzd();
        if (zzd == null) {
            return zzgzo.zzc(new zzfqs(1, "Failed to create a rewarded ad."));
        }
        zzcaz q = this.zza.q(N6.b.s1(context), this.zze.a, zzd, this.zzc);
        if (q == null) {
            return zzgzo.zzc(new zzfqs(1, "Failed to create a rewarded ad."));
        }
        zzhah zze = zzhah.zze();
        try {
            zzx(this.zze.c);
            q.zzc(this.zze.c, new zzfse(this, zze, q));
            return zze;
        } catch (RemoteException unused) {
            W5.p.f("Failed to load rewarded ad.");
            return zzgzo.zzc(new zzfqs(1, "remote exception"));
        }
    }

    public final long zzb() {
        return ((Long) S5.D.c().zzd(zzbhe.zzR)).longValue();
    }

    public final /* bridge */ /* synthetic */ d1 zzc(Object obj) {
        try {
            return ((zzcaz) obj).zzm();
        } catch (RemoteException e) {
            int i = o0.b;
            W5.p.b("Failed to get response info for the rewarded ad.", e);
            return null;
        }
    }

    public zzfsf(String str, ClientApi clientApi, Context context, int i, zzfkg zzfkgVar, W1 w1, i0 i0Var, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, E6.f fVar, zzfqr zzfqrVar) {
        super(str, clientApi, context, i, zzfkgVar, w1, i0Var, scheduledExecutorService, zzfmyVar, zzfraVar, fVar, zzfqrVar);
    }
}
