package tb;

import java.util.List;
import kotlin.jvm.internal.P;
import qb.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class r {

    public static final class a implements qb.e {
        public final Ca.l a;

        public a(Qa.a aVar) {
            this.a = Ca.m.b(aVar);
        }

        public final qb.e a() {
            return (qb.e) this.a.getValue();
        }

        public boolean b() {
            return e.a.c(this);
        }

        public int c(String name) {
            kotlin.jvm.internal.t.g(name, "name");
            return a().c(name);
        }

        public int d() {
            return a().d();
        }

        public String e(int i) {
            return a().e(i);
        }

        public List f(int i) {
            return a().f(i);
        }

        public qb.e g(int i) {
            return a().g(i);
        }

        public List getAnnotations() {
            return e.a.a(this);
        }

        public qb.l getKind() {
            return a().getKind();
        }

        public String h() {
            return a().h();
        }

        public boolean i(int i) {
            return a().i(i);
        }

        public boolean isInline() {
            return e.a.b(this);
        }
    }

    public static final /* synthetic */ qb.e a(Qa.a aVar) {
        return f(aVar);
    }

    public static final /* synthetic */ void b(rb.e eVar) {
        g(eVar);
    }

    public static final /* synthetic */ void c(rb.f fVar) {
        h(fVar);
    }

    public static final h d(rb.e eVar) {
        kotlin.jvm.internal.t.g(eVar, "<this>");
        h hVar = eVar instanceof h ? (h) eVar : null;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + P.b(eVar.getClass()));
    }

    public static final s e(rb.f fVar) {
        kotlin.jvm.internal.t.g(fVar, "<this>");
        s sVar = fVar instanceof s ? (s) fVar : null;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + P.b(fVar.getClass()));
    }

    public static final qb.e f(Qa.a aVar) {
        return new a(aVar);
    }

    public static final void g(rb.e eVar) {
        d(eVar);
    }

    public static final void h(rb.f fVar) {
        e(fVar);
    }
}
