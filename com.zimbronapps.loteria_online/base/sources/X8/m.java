package x8;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class m {
    public final Set a;
    public final com.google.firebase.remoteconfig.internal.d b;
    public final com.google.firebase.remoteconfig.internal.c c;
    public final B7.g d;
    public final m8.h e;
    public final e f;
    public final Context g;
    public final String h;
    public final com.google.firebase.remoteconfig.internal.e i;
    public final ScheduledExecutorService j;

    public class a implements w8.d {
        public final w8.c a;

        public a(w8.c cVar) {
            this.a = cVar;
        }

        public void remove() {
            m.a(m.this, this.a);
        }
    }

    public m(B7.g gVar, m8.h hVar, com.google.firebase.remoteconfig.internal.c cVar, e eVar, Context context, String str, com.google.firebase.remoteconfig.internal.e eVar2, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.a = linkedHashSet;
        this.b = new com.google.firebase.remoteconfig.internal.d(gVar, hVar, cVar, eVar, context, str, linkedHashSet, eVar2, scheduledExecutorService);
        this.d = gVar;
        this.c = cVar;
        this.e = hVar;
        this.f = eVar;
        this.g = context;
        this.h = str;
        this.i = eVar2;
        this.j = scheduledExecutorService;
    }

    public static /* synthetic */ void a(m mVar, w8.c cVar) {
        mVar.d(cVar);
    }

    public synchronized w8.d b(w8.c cVar) {
        this.a.add(cVar);
        c();
        return new a(cVar);
    }

    public final synchronized void c() {
        if (!this.a.isEmpty()) {
            this.b.E();
        }
    }

    public final synchronized void d(w8.c cVar) {
        this.a.remove(cVar);
    }

    public synchronized void e(boolean z) {
        this.b.B(z);
        if (!z) {
            c();
        }
    }
}
