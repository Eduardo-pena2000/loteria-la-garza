package k0;

import b0.v1;
import java.util.Arrays;
import k0.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f implements z, v1 {
    public v a;
    public p b;
    public String c;
    public Object d;
    public Object[] e;
    public p.a f;
    public final Qa.a g = new e(this);

    public f(v vVar, p pVar, String str, Object obj, Object[] objArr) {
        this.a = vVar;
        this.b = pVar;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    public static /* synthetic */ Object b(f fVar) {
        return i(fVar);
    }

    private final void f() {
        p pVar = this.b;
        if (this.f == null) {
            if (pVar != null) {
                d.b(pVar, this.g.invoke());
                this.f = pVar.b(this.c, this.g);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.f + ") is not null").toString());
    }

    public static final Object i(f fVar) {
        v vVar = fVar.a;
        Object obj = fVar.d;
        if (obj != null) {
            return vVar.b(fVar, obj);
        }
        throw new IllegalArgumentException("Value should be initialized");
    }

    public boolean a(Object obj) {
        p pVar = this.b;
        return pVar == null || pVar.a(obj);
    }

    public void c() {
        f();
    }

    public final Object d(Object[] objArr) {
        if (Arrays.equals(objArr, this.e)) {
            return this.d;
        }
        return null;
    }

    public void e() {
        p.a aVar = this.f;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void g() {
        p.a aVar = this.f;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void h(v vVar, p pVar, String str, Object obj, Object[] objArr) {
        boolean z;
        boolean z2 = true;
        if (this.b != pVar) {
            this.b = pVar;
            z = true;
        } else {
            z = false;
        }
        if (kotlin.jvm.internal.t.c(this.c, str)) {
            z2 = z;
        } else {
            this.c = str;
        }
        this.a = vVar;
        this.d = obj;
        this.e = objArr;
        p.a aVar = this.f;
        if (aVar == null || !z2) {
            return;
        }
        if (aVar != null) {
            aVar.a();
        }
        this.f = null;
        f();
    }
}
