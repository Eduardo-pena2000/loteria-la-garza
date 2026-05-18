package com.google.android.gms.internal.firebase-auth-api;

import B7.m;
import J7.O;
import com.google.firebase.auth.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzaga extends b.b {
    private final /* synthetic */ b.b zza;
    private final /* synthetic */ String zzb;

    public zzaga(b.b bVar, String str) {
        this.zza = bVar;
        this.zzb = str;
    }

    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzagb.zza(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    public final void onCodeSent(String str, b.a aVar) {
        this.zza.onCodeSent(str, aVar);
    }

    public final void onVerificationCompleted(O o) {
        zzagb.zza(this.zzb);
        this.zza.onVerificationCompleted(o);
    }

    public final void onVerificationFailed(m mVar) {
        zzagb.zza(this.zzb);
        this.zza.onVerificationFailed(mVar);
    }
}
