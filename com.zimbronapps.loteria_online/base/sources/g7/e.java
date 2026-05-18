package G7;

import android.os.Bundle;
import j7.a;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class e implements a.a {
    public final /* synthetic */ f a;

    public e(f fVar) {
        Objects.requireNonNull(fVar);
        this.a = fVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j) {
        if (str == null || !b.c(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        this.a.a().a(3, bundle2);
    }
}
