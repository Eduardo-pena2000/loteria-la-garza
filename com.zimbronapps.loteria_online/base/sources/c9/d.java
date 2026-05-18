package c9;

import Ca.I;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import da.c;
import da.j;
import java.util.HashMap;
import java.util.List;
import k9.g;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import l9.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class d implements f9.b {
    public static final a j = new a(null);
    public final Context a;
    public da.c b;
    public final e c;
    public da.c d;
    public final l9.b e;
    public k9.d f;
    public f9.a g;
    public boolean h;
    public final b i;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements ServiceConnection {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            t.g(componentName, "className");
            t.g(iBinder, "service");
        }

        public void onServiceDisconnected(ComponentName componentName) {
            t.g(componentName, "className");
        }
    }

    public d(Context context, String str, da.b bVar) {
        t.g(context, "context");
        t.g(str, "recorderId");
        t.g(bVar, "messenger");
        this.a = context;
        e eVar = new e();
        this.c = eVar;
        l9.b bVar2 = new l9.b();
        this.e = bVar2;
        da.c cVar = new da.c(bVar, "com.llfbandit.record/events/" + str);
        this.b = cVar;
        cVar.d(eVar);
        da.c cVar2 = new da.c(bVar, "com.llfbandit.record/eventsRecord/" + str);
        this.d = cVar2;
        cVar2.d(bVar2);
        this.i = new b();
    }

    public static /* synthetic */ I c(j.d dVar, String str) {
        return v(dVar, str);
    }

    public static /* synthetic */ I d(d dVar, e9.e eVar, j.d dVar2, String str) {
        return q(dVar, eVar, dVar2, str);
    }

    public static final I q(d dVar, e9.e eVar, j.d dVar2, String str) {
        dVar.o(eVar, dVar2);
        return I.a;
    }

    public static final I v(j.d dVar, String str) {
        dVar.a(str);
        return I.a;
    }

    public final void e(j.d dVar) {
        t.g(dVar, "result");
        try {
            k9.d dVar2 = this.f;
            if (dVar2 != null) {
                dVar2.cancel();
            }
            dVar.a((Object) null);
        } catch (Exception e) {
            dVar.b("record", e.getMessage(), e.getCause());
        }
        l();
    }

    public final k9.d f(e9.e eVar) {
        if (eVar.i()) {
            k(eVar);
        }
        return eVar.r() ? new g(this.a, this.c) : new k9.c(this.c, this.e, this.a);
    }

    public final void g() {
        try {
            k9.d dVar = this.f;
            if (dVar != null) {
                dVar.dispose();
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            l();
            w();
            this.f = null;
            throw th;
        }
        l();
        w();
        this.f = null;
        da.c cVar = this.b;
        if (cVar != null) {
            cVar.d((c.d) null);
        }
        this.b = null;
        da.c cVar2 = this.d;
        if (cVar2 != null) {
            cVar2.d((c.d) null);
        }
        this.d = null;
    }

    public final void h(j.d dVar) {
        t.g(dVar, "result");
        k9.d dVar2 = this.f;
        if (dVar2 == null) {
            dVar.a((Object) null);
            return;
        }
        t.d(dVar2);
        List b2 = dVar2.b();
        HashMap hashMap = new HashMap();
        hashMap.put("current", b2.get(0));
        hashMap.put("max", b2.get(1));
        dVar.a(hashMap);
    }

    public final void i(j.d dVar) {
        t.g(dVar, "result");
        k9.d dVar2 = this.f;
        dVar.a(Boolean.valueOf(dVar2 != null ? dVar2.c() : false));
    }

    public final void j(j.d dVar) {
        t.g(dVar, "result");
        k9.d dVar2 = this.f;
        dVar.a(Boolean.valueOf(dVar2 != null ? dVar2.f() : false));
    }

    public final void k(e9.e eVar) {
        if (eVar.f() != null && eVar.f().getType() != 7) {
            l();
            return;
        }
        if (this.g == null) {
            this.g = new f9.a(this.a);
        }
        f9.a aVar = this.g;
        t.d(aVar);
        if (aVar.c()) {
            return;
        }
        f9.a aVar2 = this.g;
        t.d(aVar2);
        aVar2.d();
        f9.a aVar3 = this.g;
        t.d(aVar3);
        aVar3.b(this);
    }

    public final void l() {
        f9.a aVar;
        f9.a aVar2 = this.g;
        if (aVar2 != null) {
            aVar2.e(this);
        }
        f9.a aVar3 = this.g;
        if ((aVar3 == null || !aVar3.c()) && (aVar = this.g) != null) {
            aVar.h();
        }
    }

    public final void m(j.d dVar) {
        t.g(dVar, "result");
        try {
            k9.d dVar2 = this.f;
            if (dVar2 != null) {
                dVar2.pause();
            }
            dVar.a((Object) null);
        } catch (Exception e) {
            dVar.b("record", e.getMessage(), e.getCause());
        }
    }

    public final void n(j.d dVar) {
        t.g(dVar, "result");
        try {
            k9.d dVar2 = this.f;
            if (dVar2 != null) {
                dVar2.resume();
            }
            dVar.a((Object) null);
        } catch (Exception e) {
            dVar.b("record", e.getMessage(), e.getCause());
        }
    }

    public final void o(e9.e eVar, j.d dVar) {
        k9.d dVar2 = this.f;
        t.d(dVar2);
        dVar2.d(eVar);
        dVar.a((Object) null);
    }

    public final void p(e9.e eVar, j.d dVar) {
        try {
            k9.d dVar2 = this.f;
            if (dVar2 == null) {
                this.f = f(eVar);
                o(eVar, dVar);
            } else {
                t.d(dVar2);
                if (dVar2.f()) {
                    k9.d dVar3 = this.f;
                    t.d(dVar3);
                    dVar3.e(new c9.b(this, eVar, dVar));
                } else {
                    o(eVar, dVar);
                }
            }
            t(eVar);
        } catch (Exception e) {
            dVar.b("record", e.getMessage(), e.getCause());
        }
    }

    public final void r(e9.e eVar, j.d dVar) {
        t.g(eVar, "config");
        t.g(dVar, "result");
        p(eVar, dVar);
    }

    public final void s(e9.e eVar, j.d dVar) {
        t.g(eVar, "config");
        t.g(dVar, "result");
        if (eVar.r()) {
            throw new Exception("Cannot stream audio while using the legacy recorder");
        }
        p(eVar, dVar);
    }

    public final void t(e9.e eVar) {
        if (eVar.o() != null) {
            Intent intent = new Intent(this.a, m9.a.class);
            intent.putExtra("title", eVar.o().b());
            intent.putExtra("content", eVar.o().a());
            this.a.startService(intent);
            this.h = this.a.bindService(new Intent(this.a, m9.a.class), this.i, 1);
        }
    }

    public final void u(j.d dVar) {
        t.g(dVar, "result");
        try {
            try {
                k9.d dVar2 = this.f;
                if (dVar2 == null) {
                    dVar.a((Object) null);
                } else if (dVar2 != null) {
                    dVar2.e(new c(dVar));
                }
            } catch (Exception e) {
                dVar.b("record", e.getMessage(), e.getCause());
            }
            w();
        } catch (Throwable th) {
            w();
            throw th;
        }
    }

    public final void w() {
        if (this.h) {
            this.a.unbindService(this.i);
            this.a.stopService(new Intent(this.a, m9.a.class));
            this.h = false;
        }
    }

    public void a() {
    }

    public void b() {
    }
}
