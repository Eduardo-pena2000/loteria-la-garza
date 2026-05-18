package com.google.android.recaptcha.internal;

import Ca.q;
import Ca.x;
import Da.S;
import android.os.Build;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzjb {
    public static final Map zza() {
        Map o = S.o(new q[]{x.a(-4, zzba.zzo), x.a(-12, zzba.zzp), x.a(-6, zzba.zzk), x.a(-11, zzba.zzm), x.a(-13, zzba.zzq), x.a(-14, zzba.zzr), x.a(-2, zzba.zzl), x.a(-7, zzba.zzs), x.a(-5, zzba.zzt), x.a(-9, zzba.zzu), x.a(-8, zzba.zzE), x.a(-15, zzba.zzn), x.a(-1, zzba.zzv), x.a(-3, zzba.zzx), x.a(-10, zzba.zzy)});
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            o.put(-16, zzba.zzw);
        }
        if (i >= 27) {
            o.put(1, zzba.zzA);
            o.put(2, zzba.zzB);
            o.put(0, zzba.zzC);
            o.put(3, zzba.zzD);
        }
        if (i >= 29) {
            o.put(4, zzba.zzz);
        }
        return o;
    }
}
