package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import i6.a;
import i6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzal implements b {
    private static final Status zza = new Status(13);

    public static /* bridge */ /* synthetic */ Status zza() {
        return zza;
    }

    public final i addWorkAccount(h hVar, String str) {
        return hVar.b(new zzae(this, a.a, hVar, str));
    }

    public final i removeWorkAccount(h hVar, Account account) {
        return hVar.b(new zzag(this, a.a, hVar, account));
    }

    public final void setWorkAuthenticatorEnabled(h hVar, boolean z) {
        setWorkAuthenticatorEnabledWithResult(hVar, z);
    }

    public final i setWorkAuthenticatorEnabledWithResult(h hVar, boolean z) {
        return hVar.b(new zzac(this, a.a, hVar, z));
    }
}
