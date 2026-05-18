package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.tasks.OnFailureListener;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzage implements OnFailureListener {
    public zzage(zzagc zzagcVar) {
        Objects.requireNonNull(zzagcVar);
    }

    public final void onFailure(Exception exc) {
        zzagc.zza().c("SmsRetrieverClient failed to start: " + exc.getMessage(), new Object[0]);
    }
}
