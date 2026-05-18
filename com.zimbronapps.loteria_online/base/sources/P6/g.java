package p6;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class g extends J2.a implements com.google.android.gms.common.api.internal.s {
    public final Semaphore o;
    public final Set p;

    public g(Context context, Set set) {
        super(context);
        this.o = new Semaphore(0);
        this.p = set;
    }

    public final /* bridge */ /* synthetic */ Object C() {
        Iterator it = this.p.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((com.google.android.gms.common.api.h) it.next()).h(this)) {
                i++;
            }
        }
        try {
            this.o.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public final void p() {
        this.o.drainPermits();
        h();
    }
}
