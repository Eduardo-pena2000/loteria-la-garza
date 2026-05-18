package Yb;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class m implements Wb.c {
    public final String a;
    public volatile Wb.c b;
    public Boolean c;
    public Method d;
    public Xb.a e;
    public final Queue f;
    public final boolean g;

    public m(String str, Queue queue, boolean z) {
        this.a = str;
        this.f = queue;
        this.g = z;
    }

    public boolean A() {
        return this.b instanceof f;
    }

    public boolean B() {
        return this.b == null;
    }

    public void C(Xb.c cVar) {
        if (z()) {
            try {
                this.d.invoke(this.b, new Object[]{cVar});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public void D(Wb.c cVar) {
        this.b = cVar;
    }

    public boolean a() {
        return m().a();
    }

    public void b(String str, Object obj, Object obj2) {
        m().b(str, obj, obj2);
    }

    public boolean c() {
        return m().c();
    }

    public void d(String str, Object obj, Object obj2) {
        m().d(str, obj, obj2);
    }

    public void debug(String str) {
        m().debug(str);
    }

    public void e(String str, Object... objArr) {
        m().e(str, objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a.equals(((m) obj).a);
    }

    public void error(String str, Throwable th) {
        m().error(str, th);
    }

    public boolean f() {
        return m().f();
    }

    public void g(String str, Object obj, Object obj2) {
        m().g(str, obj, obj2);
    }

    public String getName() {
        return this.a;
    }

    public boolean h() {
        return m().h();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void i(String str, Object... objArr) {
        m().i(str, objArr);
    }

    public void info(String str) {
        m().info(str);
    }

    public void j(String str, Object... objArr) {
        m().j(str, objArr);
    }

    public void k(String str, Throwable th) {
        m().k(str, th);
    }

    public boolean l(Xb.b bVar) {
        return m().l(bVar);
    }

    public Wb.c m() {
        return this.b != null ? this.b : this.g ? f.a : y();
    }

    public void n(String str, Object obj, Object obj2) {
        m().n(str, obj, obj2);
    }

    public void o(String str, Object obj) {
        m().o(str, obj);
    }

    public void p(String str, Object obj) {
        m().p(str, obj);
    }

    public void q(String str, Object obj) {
        m().q(str, obj);
    }

    public boolean r() {
        return m().r();
    }

    public void s(String str, Object obj, Object obj2) {
        m().s(str, obj, obj2);
    }

    public void t(String str, Object obj) {
        m().t(str, obj);
    }

    public void u(String str, Object obj) {
        m().u(str, obj);
    }

    public void v(String str, Throwable th) {
        m().v(str, th);
    }

    public void w(String str) {
        m().w(str);
    }

    public void x(String str) {
        m().x(str);
    }

    public final Wb.c y() {
        if (this.e == null) {
            this.e = new Xb.a(this, this.f);
        }
        return this.e;
    }

    public boolean z() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.d = this.b.getClass().getMethod("log", new Class[]{Xb.c.class});
            this.c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.c = Boolean.FALSE;
        }
        return this.c.booleanValue();
    }
}
