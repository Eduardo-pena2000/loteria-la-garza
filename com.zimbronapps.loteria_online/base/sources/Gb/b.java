package gb;

import Ca.I;
import Ca.s;
import fb.N;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class b {
    public d[] a;
    public int b;
    public int c;
    public A d;

    public static final /* synthetic */ int d(b bVar) {
        return bVar.b;
    }

    public static final /* synthetic */ d[] g(b bVar) {
        return bVar.a;
    }

    public final N c() {
        A a;
        synchronized (this) {
            a = this.d;
            if (a == null) {
                a = new A(this.b);
                this.d = a;
            }
        }
        return a;
    }

    public final d h() {
        d dVar;
        A a;
        synchronized (this) {
            try {
                d[] dVarArr = this.a;
                if (dVarArr == null) {
                    dVarArr = j(2);
                    this.a = dVarArr;
                } else if (this.b >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
                    this.a = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i = this.c;
                do {
                    dVar = dVarArr[i];
                    if (dVar == null) {
                        dVar = i();
                        dVarArr[i] = dVar;
                    }
                    i++;
                    if (i >= dVarArr.length) {
                        i = 0;
                    }
                    kotlin.jvm.internal.t.e(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVar.a(this));
                this.c = i;
                this.b++;
                a = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (a != null) {
            a.Z(1);
        }
        return dVar;
    }

    public abstract d i();

    public abstract d[] j(int i);

    public final void k(d dVar) {
        A a;
        int i;
        Ga.e[] b;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                a = this.d;
                if (i2 == 0) {
                    this.c = 0;
                }
                kotlin.jvm.internal.t.e(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Ga.e eVar : b) {
            if (eVar != null) {
                s.a aVar = Ca.s.b;
                eVar.resumeWith(Ca.s.b(I.a));
            }
        }
        if (a != null) {
            a.Z(-1);
        }
    }

    public final int l() {
        return this.b;
    }

    public final d[] m() {
        return this.a;
    }
}
