package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgpy implements Runnable {
    private final /* synthetic */ zzgpz zza;
    private final /* synthetic */ IBinder zzb;

    public /* synthetic */ zzgpy(zzgpz zzgpzVar, IBinder iBinder) {
        this.zza = zzgpzVar;
        this.zzb = iBinder;
    }

    public final /* synthetic */ void run() {
        IInterface zzm;
        zzgoj zzb = zzgoi.zzb(this.zzb);
        zzgpz zzgpzVar = this.zza;
        zzgqf zzgqfVar = zzgpzVar.zza;
        zzgqfVar.zzn(zzb);
        zzgqfVar.zzi().zza("linkToDeath", new Object[0]);
        try {
            zzm = zzgqfVar.zzm();
        } catch (RemoteException e) {
            zzgpzVar.zza.zzi().zzd(e, "linkToDeath failed", new Object[0]);
        }
        if (zzm == null) {
            throw null;
        }
        zzm.asBinder().linkToDeath(zzgqfVar.zzl(), 0);
        zzgqf zzgqfVar2 = zzgpzVar.zza;
        zzgqfVar2.zzk(false);
        synchronized (zzgqfVar2.zzj()) {
            try {
                Iterator it = zzgqfVar2.zzj().iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                zzgqfVar2.zzj().clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
