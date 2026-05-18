package com.google.android.gms.internal.firebase-auth-api;

import E6.i;
import android.app.Activity;
import com.google.firebase.auth.b;
import java.util.Map;
import java.util.concurrent.Executor;
import w.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzagb {
    private static final Map zza = new a();

    public static b.b zza(String str, b.b bVar, zzaff zzaffVar) {
        zza(str, zzaffVar);
        return new zzaga(bVar, str);
    }

    public static /* synthetic */ void zza(String str) {
        zza.remove(str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzaff zzaffVar) {
        zza.put(str, new zzagd(zzaffVar, i.c().a()));
    }

    public static boolean zza(String str, b.b bVar, Activity activity, Executor executor) {
        Map map = zza;
        if (map.containsKey(str)) {
            zzagd zzagdVar = (zzagd) map.get(str);
            if (i.c().a() - zzagdVar.zzb < 120000) {
                zzaff zzaffVar = zzagdVar.zza;
                if (zzaffVar == null) {
                    return true;
                }
                zzaffVar.zza(bVar, activity, executor, str);
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}
