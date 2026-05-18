package n0;

import Ga.i;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h implements f, c0.f, i.b {
    public static final a b = new a(null);
    public static final int c = 8;
    public final b0.s a;

    public static final class a implements i.c {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public String toString() {
            return "CompositionErrorContext";
        }

        public a() {
        }
    }

    public h(b0.s sVar) {
        this.a = sVar;
    }

    public static /* synthetic */ List g(h hVar, Object obj) {
        return i(hVar, obj);
    }

    public static final List i(h hVar, Object obj) {
        return hVar.a.u1(obj);
    }

    public boolean c(Throwable th, Object obj) {
        return d.c(th, new g(this, obj));
    }

    public List e(Integer num) {
        return this.a.a1();
    }

    public Object fold(Object obj, Qa.p pVar) {
        return i.b.a.a(this, obj, pVar);
    }

    public i.b get(i.c cVar) {
        return i.b.a.b(this, cVar);
    }

    public i.c getKey() {
        return b;
    }

    public Ga.i minusKey(i.c cVar) {
        return i.b.a.c(this, cVar);
    }

    public Ga.i plus(Ga.i iVar) {
        return i.b.a.d(this, iVar);
    }
}
