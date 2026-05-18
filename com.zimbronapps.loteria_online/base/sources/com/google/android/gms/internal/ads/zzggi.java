package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzggi extends zzghb {
    private final Map zza;
    private final Context zzb;
    private final zzgcc zzc;
    private final long zzd;
    private final long zze;

    public zzggi(zzawg zzawgVar, zzgfx zzgfxVar, Map map, Context context, zzgcc zzgccVar, zzgbf zzgbfVar, zzgoe zzgoeVar) {
        super("Qx6fKcghp39v3hBS7aGRudr3CfsW9ttl9o6D5CM1a5VL5o9yAVkUDqNE55A7wfv7", "6qdYmVukMTFpVys4cpUndL5YDKVPIertd1vgaMgush0=", zzawgVar, zzgfxVar, zzgoeVar.zza(113));
        this.zzb = context;
        this.zza = map;
        this.zzc = zzgccVar;
        this.zzd = zzgbfVar.zzj();
        this.zze = zzgbfVar.zzk();
    }

    public final void zza(Method method, zzawg zzawgVar) throws IllegalAccessException, InvocationTargetException {
        zzaxg zzaxgVar;
        Object[] objArr = (Object[]) method.invoke("", new Object[]{this.zzb, Integer.valueOf(this.zzc.ordinal())});
        objArr.getClass();
        String str = "E";
        int i = 1;
        try {
            x7.e eVar = (x7.e) this.zza.get("gs");
            if (eVar != null && ((Build.VERSION.SDK_INT < 31 || eVar.isDone()) && (zzaxgVar = (zzaxg) eVar.get(this.zzd, TimeUnit.MILLISECONDS)) != null && zzaxgVar.zzb().length() > 1)) {
                str = zzaxgVar.zzb();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (str.equals("E")) {
            try {
                x7.e eVar2 = (x7.e) this.zza.get("ai");
                if (eVar2 != null) {
                    String str2 = (String) eVar2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgrt.zzc(str2)) {
                        str = str2;
                    }
                }
            } catch (InterruptedException | ExecutionException | ClassCastException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (zzawgVar) {
            try {
                zzawgVar.zzu(((Long) objArr[0]).longValue());
                zzawgVar.zzt((String) objArr[1]);
                zzawgVar.zzD((String) objArr[2]);
                zzawgVar.zzE((String) objArr[3]);
                zzgxa zzi = zzgxa.zzn().zzi();
                byte[] bArr = (byte[]) objArr[4];
                zzawgVar.zzp(zzi.zzj(bArr, 0, bArr.length));
                zzawgVar.zzo(str);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i = 2;
                    }
                    zzawgVar.zzai(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
