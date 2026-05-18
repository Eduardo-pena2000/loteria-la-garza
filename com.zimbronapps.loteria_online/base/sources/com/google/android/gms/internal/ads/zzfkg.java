package com.google.android.gms.internal.ads;

import S5.G1;
import S5.y0;
import S5.z0;
import V5.F0;
import V5.o0;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import z.Y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfkg {
    private static zzfkg zza;
    private final Context zzb;
    private final z0 zzc;
    private final AtomicReference zzd = new AtomicReference();

    public zzfkg(Context context, z0 z0Var) {
        this.zzb = context;
        this.zzc = z0Var;
    }

    public static zzfkg zza(Context context) {
        synchronized (zzfkg.class) {
            try {
                zzfkg zzfkgVar = zza;
                if (zzfkgVar != null) {
                    return zzfkgVar;
                }
                Context applicationContext = context.getApplicationContext();
                long longValue = ((Long) zzbjf.zzb.zze()).longValue();
                z0 z0Var = null;
                if (longValue > 0 && longValue <= 254715000) {
                    z0Var = zzf(applicationContext);
                }
                zzfkg zzfkgVar2 = new zzfkg(applicationContext, z0Var);
                zza = zzfkgVar2;
                return zzfkgVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static z0 zzf(Context context) {
        try {
            return y0.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context}));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException | InstantiationException | ClassCastException e) {
            int i = o0.b;
            W5.p.d("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    private final G1 zzg() {
        z0 z0Var = this.zzc;
        if (z0Var != null) {
            try {
                return z0Var.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final W5.a zzb(int i, boolean z, int i2) {
        G1 zzg;
        R5.t.g();
        boolean j = F0.j(this.zzb);
        W5.a aVar = new W5.a(254715000, i2, true, j);
        return (((Boolean) zzbjf.zzc.zze()).booleanValue() && (zzg = zzg()) != null) ? new W5.a(254715000, zzg.zza(), true, j) : aVar;
    }

    public final void zzc(zzbtt zzbttVar) {
        zzbtt adapterCreator;
        if (!((Boolean) zzbjf.zza.zze()).booleanValue()) {
            Y.a(this.zzd, (Object) null, zzbttVar);
            return;
        }
        z0 z0Var = this.zzc;
        if (z0Var == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = z0Var.getAdapterCreator();
            } catch (RemoteException unused) {
            }
        }
        AtomicReference atomicReference = this.zzd;
        if (adapterCreator != null) {
            zzbttVar = adapterCreator;
        }
        Y.a(atomicReference, (Object) null, zzbttVar);
    }

    public final zzbtt zzd() {
        return (zzbtt) this.zzd.get();
    }

    public final String zze() {
        G1 zzg = zzg();
        if (zzg != null) {
            return zzg.zzb();
        }
        return null;
    }
}
