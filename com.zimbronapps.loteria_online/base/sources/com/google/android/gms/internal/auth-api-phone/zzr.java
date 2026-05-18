package com.google.android.gms.internal.auth-api-phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzr extends g {
    private static final a.g zza;
    private static final a.a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzn zznVar = new zzn();
        zzb = zznVar;
        zzc = new a("SmsCodeAutofill.API", zznVar, gVar);
    }

    public zzr(Activity activity) {
        super(activity, zzc, a.d.Q8, g.a.c);
    }

    public final Task checkPermissionState() {
        return doRead(w.builder().d(zzac.zza).b(new zzk(this)).e(1564).a());
    }

    public final Task hasOngoingSmsRequest(String str) {
        t.l(str);
        t.b(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(w.builder().d(zzac.zza).b(new zzl(this, str)).e(1565).a());
    }

    public final Task startSmsCodeRetriever() {
        return doWrite(w.builder().d(zzac.zza).b(new zzm(this)).e(1563).a());
    }

    public zzr(Context context) {
        super(context, zzc, a.d.Q8, g.a.c);
    }
}
