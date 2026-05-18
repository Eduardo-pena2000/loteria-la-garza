package com.google.android.recaptcha.internal;

import cb.B0;
import cb.W;
import cb.x;
import cb.z;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbx {
    public static final W zza(Task task) {
        x b = z.b((B0) null, 1, (Object) null);
        task.addOnCompleteListener(zzbv.zza, new zzbu(b));
        return new zzbw(b);
    }
}
