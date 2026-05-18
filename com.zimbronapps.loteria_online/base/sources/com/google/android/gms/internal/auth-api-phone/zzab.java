package com.google.android.gms.internal.auth-api-phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.tasks.Task;
import m6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzab extends b {
    public zzab(Activity activity) {
        super(activity);
    }

    public final Task startSmsRetriever() {
        return doWrite(w.builder().b(new zzx(this)).d(zzac.zzc).e(1567).a());
    }

    public final Task startSmsUserConsent(String str) {
        return doWrite(w.builder().b(new zzy(this, str)).d(zzac.zzd).e(1568).a());
    }

    public zzab(Context context) {
        super(context);
    }
}
