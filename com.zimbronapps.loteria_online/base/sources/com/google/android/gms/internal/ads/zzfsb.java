package com.google.android.gms.internal.ads;

import S5.W1;
import S5.g0;
import S5.i0;
import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfsb {
    private final Context zza;
    private final W5.a zzb;
    private final ScheduledExecutorService zzc;
    private final zzfmy zzd;
    private final ClientApi zze = new ClientApi();
    private final zzfkg zzf;
    private final E6.f zzg;
    private final zzfqr zzh;

    public zzfsb(Context context, W5.a aVar, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfkg zzfkgVar, E6.f fVar, zzfqr zzfqrVar) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfmyVar;
        this.zzg = fVar;
        this.zzf = zzfkgVar;
        this.zzh = zzfqrVar;
    }

    private final zzfra zzc() {
        return new zzfra(((Long) S5.D.c().zzd(zzbhe.zzG)).longValue(), 2.0d, ((Long) S5.D.c().zzd(zzbhe.zzH)).longValue(), 0.2d, this.zzg);
    }

    public final zzfsa zza(W1 w1, g0 g0Var) {
        L5.c a = L5.c.a(w1.b);
        if (a == null) {
            return null;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            ClientApi clientApi = this.zze;
            Context context = this.zza;
            W5.a aVar = this.zzb;
            return new zzfrc(clientApi, context, aVar.c, this.zzf, w1, g0Var, this.zzc, this.zzd, zzc(), this.zzg);
        }
        if (ordinal == 2) {
            ClientApi clientApi2 = this.zze;
            Context context2 = this.zza;
            W5.a aVar2 = this.zzb;
            return new zzfsf(clientApi2, context2, aVar2.c, this.zzf, w1, g0Var, this.zzc, this.zzd, zzc(), this.zzg);
        }
        if (ordinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zze;
        Context context3 = this.zza;
        W5.a aVar3 = this.zzb;
        return new zzfqz(clientApi3, context3, aVar3.c, this.zzf, w1, g0Var, this.zzc, this.zzd, zzc(), this.zzg);
    }

    public final zzfsa zzb(String str, W1 w1, i0 i0Var) {
        L5.c a = L5.c.a(w1.b);
        if (a == null) {
            return null;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1) {
            ClientApi clientApi = this.zze;
            Context context = this.zza;
            W5.a aVar = this.zzb;
            return new zzfrc(str, clientApi, context, aVar.c, this.zzf, w1, i0Var, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
        }
        if (ordinal == 2) {
            ClientApi clientApi2 = this.zze;
            Context context2 = this.zza;
            W5.a aVar2 = this.zzb;
            return new zzfsf(str, clientApi2, context2, aVar2.c, this.zzf, w1, i0Var, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
        }
        if (ordinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zze;
        Context context3 = this.zza;
        W5.a aVar3 = this.zzb;
        return new zzfqz(str, clientApi3, context3, aVar3.c, this.zzf, w1, i0Var, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
    }
}
