package B7;

import L7.n;
import L7.w;
import M7.B;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.internal.t;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import z.Y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class g {
    public static final Object k = new Object();
    public static final Map l = new w.a();
    public final Context a;
    public final String b;
    public final p c;
    public final L7.n d;
    public final w g;
    public final l8.b h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final List i = new CopyOnWriteArrayList();
    public final List j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z);
    }

    public static class b implements c.a {
        public static AtomicReference a = new AtomicReference();

        public static /* synthetic */ void b(Context context) {
            c(context);
        }

        public static void c(Context context) {
            if (E6.q.a() && (context.getApplicationContext() instanceof Application)) {
                Application applicationContext = context.getApplicationContext();
                if (a.get() == null) {
                    b bVar = new b();
                    if (Y.a(a, (Object) null, bVar)) {
                        com.google.android.gms.common.api.internal.c.c(applicationContext);
                        com.google.android.gms.common.api.internal.c.b().a(bVar);
                    }
                }
            }
        }

        public void a(boolean z) {
            synchronized (g.c()) {
                try {
                    Iterator it = new ArrayList(g.l.values()).iterator();
                    while (it.hasNext()) {
                        g gVar = (g) it.next();
                        if (g.e(gVar).get()) {
                            g.f(gVar, z);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static class c extends BroadcastReceiver {
        public static AtomicReference b = new AtomicReference();
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        public static /* synthetic */ void a(Context context) {
            b(context);
        }

        public static void b(Context context) {
            if (b.get() == null) {
                c cVar = new c(context);
                if (Y.a(b, (Object) null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.a.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (g.c()) {
                try {
                    Iterator it = g.l.values().iterator();
                    while (it.hasNext()) {
                        g.d((g) it.next());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    public g(Context context, String str, p pVar) {
        this.a = (Context) t.l(context);
        this.b = t.f(str);
        this.c = (p) t.l(pVar);
        r b2 = FirebaseInitProvider.b();
        F8.c.b("Firebase");
        F8.c.b("ComponentDiscovery");
        Collection b3 = L7.f.c(context, ComponentDiscoveryService.class).b();
        F8.c.a();
        F8.c.b("Runtime");
        n.b g = L7.n.m(B.a).d(b3).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(L7.c.s(context, Context.class, new Class[0])).b(L7.c.s(this, g.class, new Class[0])).b(L7.c.s(pVar, p.class, new Class[0])).g(new F8.b());
        if (P1.p.a(context) && FirebaseInitProvider.c()) {
            g.b(L7.c.s(b2, r.class, new Class[0]));
        }
        L7.n e = g.e();
        this.d = e;
        F8.c.a();
        this.g = new w(new e(this, context));
        this.h = e.e(j8.f.class);
        g(new f(this));
        F8.c.a();
    }

    public static String B(String str) {
        return str.trim();
    }

    public static /* synthetic */ void a(g gVar, boolean z) {
        gVar.A(z);
    }

    public static /* synthetic */ q8.a b(g gVar, Context context) {
        return gVar.z(context);
    }

    public static /* synthetic */ Object c() {
        return k;
    }

    public static /* synthetic */ void d(g gVar) {
        gVar.t();
    }

    public static /* synthetic */ AtomicBoolean e(g gVar) {
        return gVar.e;
    }

    public static /* synthetic */ void f(g gVar, boolean z) {
        gVar.C(z);
    }

    public static List l() {
        ArrayList arrayList = new ArrayList();
        synchronized (k) {
            try {
                Iterator it = l.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((g) it.next()).q());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List n(Context context) {
        ArrayList arrayList;
        synchronized (k) {
            arrayList = new ArrayList(l.values());
        }
        return arrayList;
    }

    public static g o() {
        g gVar;
        synchronized (k) {
            try {
                gVar = (g) l.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + E6.t.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((j8.f) gVar.h.get()).l();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g p(String str) {
        g gVar;
        String str2;
        synchronized (k) {
            try {
                gVar = (g) l.get(B(str));
                if (gVar == null) {
                    List l2 = l();
                    if (l2.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", l2);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
                }
                ((j8.f) gVar.h.get()).l();
            } finally {
            }
        }
        return gVar;
    }

    public static g u(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return o();
                }
                p a2 = p.a(context);
                if (a2 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return v(context, a2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static g v(Context context, p pVar) {
        return w(context, pVar, "[DEFAULT]");
    }

    public static g w(Context context, p pVar, String str) {
        g gVar;
        b.b(context);
        String B = B(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            Map map = l;
            t.p(!map.containsKey(B), "FirebaseApp name " + B + " already exists!");
            t.m(context, "Application context cannot be null.");
            gVar = new g(context, B, pVar);
            map.put(B, gVar);
        }
        gVar.t();
        return gVar;
    }

    public final /* synthetic */ void A(boolean z) {
        if (z) {
            return;
        }
        ((j8.f) this.h.get()).l();
    }

    public final void C(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z);
        }
    }

    public final void D() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((h) it.next()).a(this.b, this.c);
        }
    }

    public void E(boolean z) {
        i();
        if (this.e.compareAndSet(!z, z)) {
            boolean d = com.google.android.gms.common.api.internal.c.b().d();
            if (z && d) {
                C(true);
            } else {
                if (z || !d) {
                    return;
                }
                C(false);
            }
        }
    }

    public void F(Boolean bool) {
        i();
        ((q8.a) this.g.get()).e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.b.equals(((g) obj).q());
        }
        return false;
    }

    public void g(a aVar) {
        i();
        if (this.e.get() && com.google.android.gms.common.api.internal.c.b().d()) {
            aVar.a(true);
        }
        this.i.add(aVar);
    }

    public void h(h hVar) {
        i();
        t.l(hVar);
        this.j.add(hVar);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public final void i() {
        t.p(!this.f.get(), "FirebaseApp was deleted");
    }

    public void j() {
        if (this.f.compareAndSet(false, true)) {
            synchronized (k) {
                l.remove(this.b);
            }
            D();
        }
    }

    public Object k(Class cls) {
        i();
        return this.d.a(cls);
    }

    public Context m() {
        i();
        return this.a;
    }

    public String q() {
        i();
        return this.b;
    }

    public p r() {
        i();
        return this.c;
    }

    public String s() {
        return E6.c.e(q().getBytes(Charset.defaultCharset())) + "+" + E6.c.e(r().c().getBytes(Charset.defaultCharset()));
    }

    public final void t() {
        if (!P1.p.a(this.a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + q());
            c.a(this.a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + q());
        this.d.p(y());
        ((j8.f) this.h.get()).l();
    }

    public String toString() {
        return com.google.android.gms.common.internal.r.d(this).a("name", this.b).a("options", this.c).toString();
    }

    public boolean x() {
        i();
        return ((q8.a) this.g.get()).b();
    }

    public boolean y() {
        return "[DEFAULT]".equals(q());
    }

    public final /* synthetic */ q8.a z(Context context) {
        return new q8.a(context, s(), (i8.c) this.d.a(i8.c.class));
    }
}
