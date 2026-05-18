package p6;

import I2.a;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class x implements a.a {
    public final /* synthetic */ SignInHubActivity a;

    public /* synthetic */ x(SignInHubActivity signInHubActivity, byte[] bArr) {
        Objects.requireNonNull(signInHubActivity);
        this.a = signInHubActivity;
    }

    public final J2.b b(int i, Bundle bundle) {
        return new g(this.a, com.google.android.gms.common.api.h.c());
    }

    public final /* bridge */ /* synthetic */ void c(J2.b bVar, Object obj) {
        SignInHubActivity signInHubActivity = this.a;
        signInHubActivity.setResult(signInHubActivity.m0(), signInHubActivity.n0());
        signInHubActivity.finish();
    }

    public final void a(J2.b bVar) {
    }
}
