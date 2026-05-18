package com.pairip.licensecheck;

import android.os.Handler;
import com.pairip.licensecheck.LicenseClient;

/* compiled from: D8$$SyntheticClass */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes2.dex */
public final /* synthetic */ class LicenseClient$$ExternalSyntheticLambda3 implements LicenseClient.ImmediateTaskExecutor {
    public final /* synthetic */ Handler f$0;

    public /* synthetic */ LicenseClient$$ExternalSyntheticLambda3(Handler handler) {
        this.f$0 = handler;
    }

    public final void run(Runnable runnable) {
        this.f$0.post(runnable);
    }
}
