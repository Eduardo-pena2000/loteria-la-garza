package p6;

import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class l extends e {
    public final /* synthetic */ m a;

    public l(m mVar) {
        Objects.requireNonNull(mVar);
        this.a = mVar;
    }

    public final void c1(Status status) {
        this.a.setResult((com.google.android.gms.common.api.m) status);
    }
}
