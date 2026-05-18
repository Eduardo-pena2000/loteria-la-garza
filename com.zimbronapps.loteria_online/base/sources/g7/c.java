package G7;

import android.os.Bundle;
import j7.a;
import java.util.Objects;
import k7.b4;
import t7.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class c implements a.a {
    public final /* synthetic */ d a;

    public c(d dVar) {
        Objects.requireNonNull(dVar);
        this.a = dVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j) {
        d dVar = this.a;
        if (dVar.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            t tVar = b.a;
            String a = b4.a(str2);
            if (a != null) {
                str2 = a;
            }
            bundle2.putString("events", str2);
            dVar.a().a(2, bundle2);
        }
    }
}
