package p6;

import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class j extends e {
    public final /* synthetic */ k a;

    public j(k kVar) {
        Objects.requireNonNull(kVar);
        this.a = kVar;
    }

    public final void V0(Status status) {
        this.a.setResult((com.google.android.gms.common.api.m) status);
    }
}
