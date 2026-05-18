package r7;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class b extends H {
    public final /* synthetic */ IBinder g;
    public final /* synthetic */ e h;

    public b(e eVar, IBinder iBinder) {
        this.h = eVar;
        this.g = iBinder;
    }

    public final void b() {
        f.n(this.h.a, (IInterface) f.g(this.h.a).a(this.g));
        f.r(this.h.a);
        f.m(this.h.a, false);
        Iterator it = f.i(this.h.a).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        f.i(this.h.a).clear();
    }
}
