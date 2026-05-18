package O9;

import da.i;
import da.j;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class a implements j.c {
    public final d a;
    public final dev.fluttercommunity.plus.share.a b;

    public a(d share, dev.fluttercommunity.plus.share.a manager) {
        t.g(share, "share");
        t.g(manager, "manager");
        this.a = share;
        this.b = manager;
    }

    public final void a(i iVar) {
        if (!(iVar.b instanceof Map)) {
            throw new IllegalArgumentException("Map arguments expected");
        }
    }

    public final void b(boolean z, j.d dVar) {
        if (z) {
            return;
        }
        dVar.a("dev.fluttercommunity.plus/share/unavailable");
    }

    public void onMethodCall(i call, j.d result) {
        t.g(call, "call");
        t.g(result, "result");
        a(call);
        this.b.c(result);
        try {
            if (t.c(call.a, "share")) {
                d dVar = this.a;
                Object b = call.b();
                t.d(b);
                dVar.p((Map) b, true);
                b(true, result);
            } else {
                result.c();
            }
        } catch (Throwable th) {
            this.b.a();
            result.b("Share failed", th.getMessage(), th);
        }
    }
}
