package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.RemoteException;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbfw implements Runnable {
    private final /* synthetic */ zzbfx zza;
    private final /* synthetic */ zzbfo zzb;
    private final /* synthetic */ zzbfp zzc;
    private final /* synthetic */ zzcen zzd;

    public /* synthetic */ zzbfw(zzbfx zzbfxVar, zzbfo zzbfoVar, zzbfp zzbfpVar, zzcen zzcenVar) {
        this.zza = zzbfxVar;
        this.zzb = zzbfoVar;
        this.zzc = zzbfpVar;
        this.zzd = zzcenVar;
    }

    public final /* synthetic */ void run() {
        zzcen zzcenVar = this.zzd;
        zzbfo zzbfoVar = this.zzb;
        zzbfx zzbfxVar = this.zza;
        try {
            zzbfr zzq = zzbfoVar.zzq();
            boolean zzp = zzbfoVar.zzp();
            zzbfp zzbfpVar = this.zzc;
            zzbfm zzf = zzp ? zzq.zzf(zzbfpVar) : zzq.zze(zzbfpVar);
            if (!zzf.zza()) {
                zzcenVar.zzd(new RuntimeException("No entry contents."));
                zzbfxVar.zzc.zzb();
                return;
            }
            zzbfu zzbfuVar = new zzbfu(zzbfxVar, zzf.zzb(), 1);
            int read = zzbfuVar.read();
            if (read == -1) {
                throw new IOException("Unable to read from cache.");
            }
            zzbfuVar.unread(read);
            zzcenVar.zzc(zzbgb.zza(zzbfuVar, zzf.zzd(), zzf.zzg(), zzf.zzf(), zzf.zze()));
        } catch (IOException e) {
            e = e;
            int i = o0.b;
            W5.p.d("Unable to obtain a cache service instance.", e);
            zzcenVar.zzd(e);
            zzbfxVar.zzc.zzb();
        } catch (RemoteException e2) {
            e = e2;
            int i2 = o0.b;
            W5.p.d("Unable to obtain a cache service instance.", e);
            zzcenVar.zzd(e);
            zzbfxVar.zzc.zzb();
        }
    }
}
