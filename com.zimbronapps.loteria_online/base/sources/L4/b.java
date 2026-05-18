package l4;

import Ca.I;
import Ca.q;
import Ca.x;
import Da.S;
import P1.d;
import android.os.Bundle;
import androidx.lifecycle.k;
import androidx.lifecycle.r;
import j4.f;
import j4.i;
import j4.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public static final a i = new a(null);
    public final i a;
    public final Qa.a b;
    public final c c;
    public final Map d;
    public boolean e;
    public Bundle f;
    public boolean g;
    public boolean h;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
        }
    }

    public b(i iVar, Qa.a aVar) {
        t.g(iVar, "owner");
        t.g(aVar, "onAttach");
        this.a = iVar;
        this.b = aVar;
        this.c = new c();
        this.d = new LinkedHashMap();
        this.h = true;
    }

    public static /* synthetic */ void a(b bVar, r rVar, k.a aVar) {
        g(bVar, rVar, aVar);
    }

    public static final /* synthetic */ Map b(b bVar) {
        return bVar.d;
    }

    public static final void g(b bVar, r rVar, k.a aVar) {
        t.g(rVar, "<unused var>");
        t.g(aVar, "event");
        if (aVar == k.a.ON_START) {
            bVar.h = true;
        } else if (aVar == k.a.ON_STOP) {
            bVar.h = false;
        }
    }

    public final Bundle c(String str) {
        t.g(str, "key");
        if (!this.g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.f;
        if (bundle == null) {
            return null;
        }
        Bundle a2 = j4.c.a(bundle);
        Bundle c = j4.c.b(a2, str) ? j4.c.c(a2, str) : null;
        j.e(j.a(bundle), str);
        if (j4.c.f(j4.c.a(bundle))) {
            this.f = null;
        }
        return c;
    }

    public final f.b d(String str) {
        f.b bVar;
        t.g(str, "key");
        synchronized (this.c) {
            Iterator it = b(this).entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                f.b bVar2 = (f.b) entry.getValue();
                if (t.c(str2, str)) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    public final boolean e() {
        return this.h;
    }

    public final void f() {
        if (this.a.getLifecycle().getCurrentState() != k.b.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.b.invoke();
        this.a.getLifecycle().addObserver(new l4.a(this));
        this.e = true;
    }

    public final void h(Bundle bundle) {
        if (!this.e) {
            f();
        }
        if (this.a.getLifecycle().getCurrentState().b(k.b.d)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + this.a.getLifecycle().getCurrentState()).toString());
        }
        if (this.g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundle2 = null;
        if (bundle != null) {
            Bundle a2 = j4.c.a(bundle);
            if (j4.c.b(a2, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundle2 = j4.c.c(a2, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.f = bundle2;
        this.g = true;
    }

    public final void i(Bundle bundle) {
        q[] qVarArr;
        t.g(bundle, "outBundle");
        Map h = S.h();
        if (h.isEmpty()) {
            qVarArr = new q[0];
        } else {
            ArrayList arrayList = new ArrayList(h.size());
            for (Map.Entry entry : h.entrySet()) {
                arrayList.add(x.a((String) entry.getKey(), entry.getValue()));
            }
            qVarArr = (q[]) arrayList.toArray(new q[0]);
        }
        Bundle a2 = d.a((q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        Bundle a3 = j.a(a2);
        Bundle bundle2 = this.f;
        if (bundle2 != null) {
            j.b(a3, bundle2);
        }
        synchronized (this.c) {
            try {
                for (Map.Entry entry2 : b(this).entrySet()) {
                    j.c(a3, (String) entry2.getKey(), ((f.b) entry2.getValue()).a());
                }
                I i2 = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j4.c.f(j4.c.a(a2))) {
            return;
        }
        j.c(j.a(bundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", a2);
    }

    public final void j(String str, f.b bVar) {
        t.g(str, "key");
        t.g(bVar, "provider");
        synchronized (this.c) {
            if (b(this).containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            b(this).put(str, bVar);
            I i2 = I.a;
        }
    }

    public final void k(String str) {
        t.g(str, "key");
        synchronized (this.c) {
        }
    }
}
