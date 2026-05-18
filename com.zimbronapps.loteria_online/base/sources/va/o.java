package va;

import Y9.a;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import va.m;
import va.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class o implements Y9.a, Z9.a, r.f {
    public a.b a;
    public b b;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[r.m.values().length];
            b = iArr;
            try {
                iArr[r.m.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[r.m.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[r.k.values().length];
            a = iArr2;
            try {
                iArr2[r.k.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[r.k.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class b {
        public Application a;
        public Activity b;
        public m c;
        public c d;
        public Z9.c e;
        public da.b f;
        public androidx.lifecycle.k g;

        public b(Application application, Activity activity, da.b bVar, r.f fVar, Z9.c cVar) {
            this.a = application;
            this.b = activity;
            this.e = cVar;
            this.f = bVar;
            this.c = o.this.p(activity);
            r.f.d(bVar, fVar);
            this.d = o.this.new c(activity);
            cVar.f(this.c);
            cVar.c(this.c);
            androidx.lifecycle.k a = aa.a.a(cVar);
            this.g = a;
            a.addObserver(this.d);
        }

        public Activity a() {
            return this.b;
        }

        public m b() {
            return this.c;
        }

        public void c() {
            Z9.c cVar = this.e;
            if (cVar != null) {
                cVar.e(this.c);
                this.e.b(this.c);
                this.e = null;
            }
            androidx.lifecycle.k kVar = this.g;
            if (kVar != null) {
                kVar.removeObserver(this.d);
                this.g = null;
            }
            r.f.d(this.f, null);
            Application application = this.a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this.d);
                this.a = null;
            }
            this.b = null;
            this.d = null;
            this.c = null;
        }
    }

    private void s(da.b bVar, Application application, Activity activity, Z9.c cVar) {
        this.b = new b(application, activity, bVar, this, cVar);
    }

    private void t() {
        b bVar = this.b;
        if (bVar != null) {
            bVar.c();
            this.b = null;
        }
    }

    public void c(r.l lVar, r.n nVar, r.e eVar, r.j jVar) {
        m q = q();
        if (q == null) {
            jVar.b(new r.d("no_activity", "image_picker plugin requires a foreground activity.", null));
            return;
        }
        r(q, lVar);
        if (eVar.b().booleanValue()) {
            q.n(nVar, eVar.d().booleanValue(), p.a(eVar), jVar);
            return;
        }
        int i = a.b[lVar.c().ordinal()];
        if (i == 1) {
            q.o(nVar, eVar.d().booleanValue(), jVar);
        } else {
            if (i != 2) {
                return;
            }
            q.e0(nVar, jVar);
        }
    }

    public void j(r.h hVar, r.e eVar, r.j jVar) {
        m q = q();
        if (q == null) {
            jVar.b(new r.d("no_activity", "image_picker plugin requires a foreground activity.", null));
        } else {
            q.l(hVar, eVar, jVar);
        }
    }

    public void k(r.l lVar, r.g gVar, r.e eVar, r.j jVar) {
        m q = q();
        if (q == null) {
            jVar.b(new r.d("no_activity", "image_picker plugin requires a foreground activity.", null));
            return;
        }
        r(q, lVar);
        if (eVar.b().booleanValue()) {
            q.m(gVar, eVar.d().booleanValue(), p.a(eVar), jVar);
            return;
        }
        int i = a.b[lVar.c().ordinal()];
        if (i == 1) {
            q.k(gVar, eVar.d().booleanValue(), jVar);
        } else {
            if (i != 2) {
                return;
            }
            q.d0(gVar, jVar);
        }
    }

    public r.b n() {
        m q = q();
        if (q != null) {
            return q.Z();
        }
        throw new r.d("no_activity", "image_picker plugin requires a foreground activity.", null);
    }

    public void onAttachedToActivity(Z9.c cVar) {
        s(this.a.b(), (Application) this.a.a(), cVar.getActivity(), cVar);
    }

    public void onAttachedToEngine(a.b bVar) {
        this.a = bVar;
    }

    public void onDetachedFromActivity() {
        t();
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.a = null;
    }

    public void onReattachedToActivityForConfigChanges(Z9.c cVar) {
        onAttachedToActivity(cVar);
    }

    public final m p(Activity activity) {
        return new m(activity, new q(activity, new va.a()), new va.c(activity));
    }

    public final m q() {
        b bVar = this.b;
        if (bVar == null || bVar.a() == null) {
            return null;
        }
        return this.b.b();
    }

    public final void r(m mVar, r.l lVar) {
        r.k b2 = lVar.b();
        if (b2 != null) {
            mVar.b0(a.a[b2.ordinal()] != 1 ? m.c.REAR : m.c.FRONT);
        }
    }

    public class c implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {
        public final Activity a;

        public c(Activity activity) {
            this.a = activity;
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.a != activity || activity.getApplicationContext() == null) {
                return;
            }
            activity.getApplicationContext().unregisterActivityLifecycleCallbacks(this);
        }

        public void onActivityStopped(Activity activity) {
            if (this.a == activity) {
                o.this.b.b().a0();
            }
        }

        public void onDestroy(androidx.lifecycle.r rVar) {
            onActivityDestroyed(this.a);
        }

        public void onStop(androidx.lifecycle.r rVar) {
            onActivityStopped(this.a);
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onCreate(androidx.lifecycle.r rVar) {
        }

        public void onPause(androidx.lifecycle.r rVar) {
        }

        public void onResume(androidx.lifecycle.r rVar) {
        }

        public void onStart(androidx.lifecycle.r rVar) {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
