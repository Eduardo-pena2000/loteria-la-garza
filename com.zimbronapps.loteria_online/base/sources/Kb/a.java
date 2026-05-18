package kb;

import Ca.I;
import cb.Z;
import kotlin.jvm.internal.V;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class a {
    public final long a;

    public static final class a implements Runnable {
        public final /* synthetic */ j a;
        public final /* synthetic */ a b;

        public a(j jVar, a aVar) {
            this.a = jVar;
            this.b = aVar;
        }

        public final void run() {
            this.a.g(this.b, I.a);
        }
    }

    public /* synthetic */ class b extends q implements Qa.q {
        public static final b a = new b();

        public b() {
            super(3, a.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void b(a aVar, j jVar, Object obj) {
            a.a(aVar, jVar, obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((a) obj, (j) obj2, obj3);
            return I.a;
        }
    }

    public a(long j) {
        this.a = j;
    }

    public static final /* synthetic */ void a(a aVar, j jVar, Object obj) {
        aVar.c(jVar, obj);
    }

    public final d b() {
        b bVar = b.a;
        t.e(bVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new e(this, (Qa.q) V.e(bVar, 3), null, 4, null);
    }

    public final void c(j jVar, Object obj) {
        if (this.a <= 0) {
            jVar.e(I.a);
            return;
        }
        a aVar = new a(jVar, this);
        t.e(jVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        i iVar = (i) jVar;
        Ga.i context = iVar.getContext();
        iVar.f(Z.c(context).v(this.a, aVar, context));
    }
}
