package j4;

import Ca.q;
import Ca.x;
import Da.D;
import Da.S;
import android.os.Bundle;
import androidx.lifecycle.k;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import j4.f;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements o {
    public static final a b = new a(null);
    public final i a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements f.b {
        public final Set a;

        public b(f fVar) {
            t.g(fVar, "registry");
            this.a = new LinkedHashSet();
            fVar.c("androidx.savedstate.Restarter", this);
        }

        public Bundle a() {
            q[] qVarArr;
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
            Bundle a = P1.d.a((q[]) Arrays.copyOf(qVarArr, qVarArr.length));
            j.d(j.a(a), "classes_to_restore", D.L0(this.a));
            return a;
        }

        public final void b(String str) {
            t.g(str, "className");
            this.a.add(str);
        }
    }

    public b(i iVar) {
        t.g(iVar, "owner");
        this.a = iVar;
    }

    public final void b(String str) {
        try {
            Class asSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(f.a.class);
            t.d(asSubclass);
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor((Class[]) null);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance((Object[]) null);
                    t.d(newInstance);
                    ((f.a) newInstance).a(this.a);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    public void onStateChanged(r rVar, k.a aVar) {
        t.g(rVar, "source");
        t.g(aVar, "event");
        if (aVar != k.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        rVar.getLifecycle().removeObserver(this);
        Bundle a2 = this.a.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (a2 == null) {
            return;
        }
        List e = c.e(c.a(a2), "classes_to_restore");
        if (e == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator it = e.iterator();
        while (it.hasNext()) {
            b((String) it.next());
        }
    }
}
