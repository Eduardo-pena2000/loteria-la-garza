package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.applovin.internal.j;
import com.iab.omid.library.applovin.processor.a;
import com.iab.omid.library.applovin.utils.f;
import com.iab.omid.library.applovin.utils.h;
import com.iab.omid.library.applovin.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class TreeWalker implements a.a {
    private static TreeWalker i = new TreeWalker();
    private static Handler j = new Handler(Looper.getMainLooper());
    private static Handler k = null;
    private static final Runnable l = new b();
    private static final Runnable m = new c();
    private int b;
    private long h;
    private List a = new ArrayList();
    private boolean c = false;
    private final List d = new ArrayList();
    private com.iab.omid.library.applovin.walking.a f = new com.iab.omid.library.applovin.walking.a();
    private com.iab.omid.library.applovin.processor.b e = new com.iab.omid.library.applovin.processor.b();
    private com.iab.omid.library.applovin.walking.b g = new com.iab.omid.library.applovin.walking.b(new com.iab.omid.library.applovin.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            TreeWalker.a(TreeWalker.this).b();
        }
    }

    public class b implements Runnable {
        public void run() {
            TreeWalker.b(TreeWalker.getInstance());
        }
    }

    public class c implements Runnable {
        public void run() {
            if (TreeWalker.a() != null) {
                TreeWalker.a().post(TreeWalker.b());
                TreeWalker.a().postDelayed(TreeWalker.c(), 200L);
            }
        }
    }

    public static /* synthetic */ Handler a() {
        return k;
    }

    public static /* synthetic */ Runnable b() {
        return l;
    }

    public static /* synthetic */ Runnable c() {
        return m;
    }

    private void d() {
        a(f.b() - this.h);
    }

    private void e() {
        this.b = 0;
        this.d.clear();
        this.c = false;
        Iterator it = com.iab.omid.library.applovin.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((com.iab.omid.library.applovin.adsession.a) it.next()).g()) {
                this.c = true;
                break;
            }
        }
        this.h = f.b();
    }

    public static TreeWalker getInstance() {
        return i;
    }

    private void i() {
        if (k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            k = handler;
            handler.post(l);
            k.postDelayed(m, 200L);
        }
    }

    private void k() {
        Handler handler = k;
        if (handler != null) {
            handler.removeCallbacks(m);
            k = null;
        }
    }

    private void l() {
        e();
        f();
        d();
        j.b().a();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.a.add(treeWalkerTimeLogger);
    }

    public void f() {
        this.f.e();
        long b2 = f.b();
        com.iab.omid.library.applovin.processor.a a2 = this.e.a();
        if (this.f.b().size() > 0) {
            Iterator it = this.f.b().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject a3 = a2.a(null);
                a(str, this.f.a(str), a3);
                com.iab.omid.library.applovin.utils.c.b(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                this.g.a(a3, hashSet, b2);
            }
        }
        if (this.f.c().size() > 0) {
            JSONObject a4 = a2.a(null);
            a(null, a2, a4, com.iab.omid.library.applovin.walking.c.a, false);
            com.iab.omid.library.applovin.utils.c.b(a4);
            this.g.b(a4, this.f.c(), b2);
            if (this.c) {
                Iterator it2 = com.iab.omid.library.applovin.internal.c.c().a().iterator();
                while (it2.hasNext()) {
                    ((com.iab.omid.library.applovin.adsession.a) it2.next()).a(this.d);
                }
            }
        } else {
            this.g.b();
        }
        this.f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.a.clear();
        j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.a.contains(treeWalkerTimeLogger)) {
            this.a.remove(treeWalkerTimeLogger);
        }
    }

    public static /* synthetic */ com.iab.omid.library.applovin.walking.b a(TreeWalker treeWalker) {
        return treeWalker.g;
    }

    public static /* synthetic */ void b(TreeWalker treeWalker) {
        treeWalker.l();
    }

    private void a(long j2) {
        if (this.a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.a) {
                treeWalkerTimeLogger.onTreeProcessed(this.b, TimeUnit.NANOSECONDS.toMillis(j2));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.b, j2);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String c2 = this.f.c(view);
        if (c2 == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, c2);
        com.iab.omid.library.applovin.utils.c.a(jSONObject, Boolean.valueOf(this.f.e(view)));
        com.iab.omid.library.applovin.utils.c.b(jSONObject, Boolean.valueOf(this.f.c(c2)));
        this.f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.applovin.walking.c cVar, boolean z) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.applovin.walking.c.a, z);
    }

    public void a(View view, com.iab.omid.library.applovin.processor.a aVar, JSONObject jSONObject, boolean z) {
        com.iab.omid.library.applovin.walking.c d;
        if (h.f(view) && (d = this.f.d(view)) != com.iab.omid.library.applovin.walking.c.c) {
            JSONObject a2 = aVar.a(view);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, a2);
            if (!b(view, a2)) {
                boolean z2 = z || a(view, a2);
                if (this.c && d == com.iab.omid.library.applovin.walking.c.b && !z2) {
                    this.d.add(new com.iab.omid.library.applovin.weakreference.a(view));
                }
                a(view, aVar, a2, d, z2);
            }
            this.b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.applovin.processor.a b2 = this.e.b();
        String b3 = this.f.b(str);
        if (b3 != null) {
            JSONObject a2 = b2.a(view);
            com.iab.omid.library.applovin.utils.c.a(a2, str);
            com.iab.omid.library.applovin.utils.c.b(a2, b3);
            com.iab.omid.library.applovin.utils.c.a(jSONObject, a2);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.a b2 = this.f.b(view);
        if (b2 == null) {
            return false;
        }
        com.iab.omid.library.applovin.utils.c.a(jSONObject, b2);
        return true;
    }
}
