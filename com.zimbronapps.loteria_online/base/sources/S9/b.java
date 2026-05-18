package S9;

import Y9.a;
import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.k;
import da.l;
import da.m;
import da.n;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class b implements Y9.b, Z9.b {
    public final io.flutter.embedding.engine.a b;
    public final a.b c;
    public R9.e e;
    public c f;
    public Service i;
    public BroadcastReceiver k;
    public ContentProvider m;
    public final Map a = new HashMap();
    public final Map d = new HashMap();
    public boolean g = false;
    public final Map h = new HashMap();
    public final Map j = new HashMap();
    public final Map l = new HashMap();

    public static class b implements a.a {
        public final W9.f a;

        public /* synthetic */ b(W9.f fVar, a aVar) {
            this(fVar);
        }

        public String a(String str) {
            return this.a.m(str);
        }

        public b(W9.f fVar) {
            this.a = fVar;
        }
    }

    public static class c implements Z9.c {
        public final Activity a;
        public final HiddenLifecycleReference b;
        public final Set c = new HashSet();
        public final Set d = new HashSet();
        public final Set e = new HashSet();
        public final Set f = new HashSet();
        public final Set g = new HashSet();
        public final Set h = new HashSet();

        public c(Activity activity, k kVar) {
            this.a = activity;
            this.b = new HiddenLifecycleReference(kVar);
        }

        public void a(m mVar) {
            this.e.add(mVar);
        }

        public void b(n nVar) {
            this.c.remove(nVar);
        }

        public void c(n nVar) {
            this.c.add(nVar);
        }

        public void d(m mVar) {
            this.e.remove(mVar);
        }

        public void e(l lVar) {
            this.d.remove(lVar);
        }

        public void f(l lVar) {
            this.d.add(lVar);
        }

        public boolean g(int i, int i2, Intent intent) {
            Iterator it = new HashSet(this.d).iterator();
            while (true) {
                boolean z = false;
                while (it.hasNext()) {
                    if (((l) it.next()).onActivityResult(i, i2, intent) || z) {
                        z = true;
                    }
                }
                return z;
            }
        }

        public Activity getActivity() {
            return this.a;
        }

        public Object getLifecycle() {
            return this.b;
        }

        public void h(Intent intent) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((m) it.next()).c(intent);
            }
        }

        public boolean i(int i, String[] strArr, int[] iArr) {
            Iterator it = this.c.iterator();
            while (true) {
                boolean z = false;
                while (it.hasNext()) {
                    if (((n) it.next()).b(i, strArr, iArr) || z) {
                        z = true;
                    }
                }
                return z;
            }
        }

        public void j(Bundle bundle) {
            Iterator it = this.h.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }

        public void k(Bundle bundle) {
            Iterator it = this.h.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }

        public void l() {
            Iterator it = this.f.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
    }

    public b(Context context, io.flutter.embedding.engine.a aVar, W9.f fVar, io.flutter.embedding.engine.b bVar) {
        this.b = aVar;
        this.c = new a.b(context, aVar, aVar.k(), aVar.v(), aVar.q().X(), new b(fVar, null), bVar);
    }

    public Y9.a a(Class cls) {
        return (Y9.a) this.a.get(cls);
    }

    public boolean b(int i, String[] strArr, int[] iArr) {
        if (!s()) {
            Q9.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
        Aa.d g = Aa.d.g("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            boolean i2 = this.f.i(i, strArr, iArr);
            if (g != null) {
                g.close();
            }
            return i2;
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void c(Intent intent) {
        if (!s()) {
            Q9.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        Aa.d g = Aa.d.g("FlutterEngineConnectionRegistry#onNewIntent");
        try {
            this.f.h(intent);
            if (g != null) {
                g.close();
            }
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void d(Y9.a aVar) {
        Aa.d g = Aa.d.g("FlutterEngineConnectionRegistry#add " + aVar.getClass().getSimpleName());
        try {
            if (r(aVar.getClass())) {
                Q9.b.g("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.b + ").");
                if (g != null) {
                    g.close();
                    return;
                }
                return;
            }
            Q9.b.f("FlutterEngineCxnRegstry", "Adding plugin: " + aVar);
            this.a.put(aVar.getClass(), aVar);
            aVar.onAttachedToEngine(this.c);
            if (aVar instanceof Z9.a) {
                Z9.a aVar2 = (Z9.a) aVar;
                this.d.put(aVar.getClass(), aVar2);
                if (s()) {
                    aVar2.onAttachedToActivity(this.f);
                }
            }
            if (g != null) {
                g.close();
            }
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void e(R9.e eVar, k kVar) {
        Aa.d g = Aa.d.g("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            R9.e eVar2 = this.e;
            if (eVar2 != null) {
                eVar2.a();
            }
            n();
            this.e = eVar;
            k((Activity) eVar.b(), kVar);
            if (g != null) {
                g.close();
            }
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void f() {
        if (!s()) {
            Q9.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        Aa.d g = Aa.d.g("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = this.d.values().iterator();
            while (it.hasNext()) {
                ((Z9.a) it.next()).onDetachedFromActivity();
            }
            m();
            if (g != null) {
                g.close();
            }
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void g(Bundle bundle) {
        if (!s()) {
            Q9.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        Aa.d g = Aa.d.g("FlutterEngineConnectionRegistry#onRestoreInstanceState");
        try {
            this.f.j(bundle);
            if (g != null) {
                g.close();
            }
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void h(Bundle bundle) {
        if (!s()) {
            Q9.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        Aa.d g = Aa.d.g("FlutterEngineConnectionRegistry#onSaveInstanceState");
        try {
            this.f.k(bundle);
            if (g != null) {
                g.close();
            }
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void i() {
        if (!s()) {
            Q9.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        Aa.d g = Aa.d.g("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            this.f.l();
            if (g != null) {
                g.close();
            }
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void j() {
        if (!s()) {
            Q9.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        Aa.d g = Aa.d.g("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
        try {
            this.g = true;
            Iterator it = this.d.values().iterator();
            while (it.hasNext()) {
                ((Z9.a) it.next()).onDetachedFromActivityForConfigChanges();
            }
            m();
            if (g != null) {
                g.close();
            }
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final void k(Activity activity, k kVar) {
        this.f = new c(activity, kVar);
        this.b.q().v0(activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false);
        this.b.s().n(activity, this.b.v(), this.b.k());
        for (Z9.a aVar : this.d.values()) {
            if (this.g) {
                aVar.onReattachedToActivityForConfigChanges(this.f);
            } else {
                aVar.onAttachedToActivity(this.f);
            }
        }
        this.g = false;
    }

    public void l() {
        Q9.b.f("FlutterEngineCxnRegstry", "Destroying.");
        n();
        y();
    }

    public final void m() {
        this.b.q().O();
        this.b.r().r();
        this.e = null;
        this.f = null;
    }

    public final void n() {
        if (s()) {
            f();
            return;
        }
        if (v()) {
            q();
        } else if (t()) {
            o();
        } else if (u()) {
            p();
        }
    }

    public void o() {
        if (!t()) {
            Q9.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        Aa.d g = Aa.d.g("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
        try {
            Iterator it = this.j.values().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
            if (g != null) {
                g.close();
            }
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (!s()) {
            Q9.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        Aa.d g = Aa.d.g("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            boolean g2 = this.f.g(i, i2, intent);
            if (g != null) {
                g.close();
            }
            return g2;
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void p() {
        if (!u()) {
            Q9.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        Aa.d g = Aa.d.g("FlutterEngineConnectionRegistry#detachFromContentProvider");
        try {
            Iterator it = this.l.values().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
            if (g != null) {
                g.close();
            }
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void q() {
        if (!v()) {
            Q9.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        Aa.d g = Aa.d.g("FlutterEngineConnectionRegistry#detachFromService");
        try {
            Iterator it = this.h.values().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
            this.i = null;
            if (g != null) {
                g.close();
            }
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean r(Class cls) {
        return this.a.containsKey(cls);
    }

    public final boolean s() {
        return this.e != null;
    }

    public final boolean t() {
        return this.k != null;
    }

    public final boolean u() {
        return this.m != null;
    }

    public final boolean v() {
        return this.i != null;
    }

    public void w(Class cls) {
        Y9.a aVar = (Y9.a) this.a.get(cls);
        if (aVar == null) {
            return;
        }
        Aa.d g = Aa.d.g("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
        try {
            if (aVar instanceof Z9.a) {
                if (s()) {
                    ((Z9.a) aVar).onDetachedFromActivity();
                }
                this.d.remove(cls);
            }
            aVar.onDetachedFromEngine(this.c);
            this.a.remove(cls);
            if (g != null) {
                g.close();
            }
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void x(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            w((Class) it.next());
        }
    }

    public void y() {
        x(new HashSet(this.a.keySet()));
        this.a.clear();
    }
}
