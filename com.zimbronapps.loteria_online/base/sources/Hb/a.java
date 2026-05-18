package hb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class a {
    public static final D a = new D("CLOSED");

    public static final /* synthetic */ D a() {
        return a;
    }

    public static final b b(b bVar) {
        while (true) {
            Object a2 = b.a(bVar);
            if (a2 == a()) {
                return bVar;
            }
            b bVar2 = (b) a2;
            if (bVar2 != null) {
                bVar = bVar2;
            } else if (bVar.m()) {
                return bVar;
            }
        }
    }

    public static final Object c(A a2, long j, Qa.p pVar) {
        while (true) {
            if (a2.c >= j && !a2.k()) {
                return B.a(a2);
            }
            Object a3 = b.a(a2);
            if (a3 == a()) {
                return B.a(a);
            }
            A a4 = (A) ((b) a3);
            if (a4 == null) {
                a4 = (A) pVar.invoke(Long.valueOf(a2.c + 1), a2);
                if (a2.o(a4)) {
                    if (a2.k()) {
                        a2.n();
                    }
                }
            }
            a2 = a4;
        }
    }
}
