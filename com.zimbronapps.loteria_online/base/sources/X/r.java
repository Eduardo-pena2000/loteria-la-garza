package X;

import Z.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r {
    public static final r a = new r();
    public static Qa.p b = j0.i.b(-505750804, false, a.a);

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public static final a a = new a();

        public a() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (b0.w.L()) {
                b0.w.U(-505750804, i, -1, "androidx.compose.material3.ComposableSingletons$SnackbarKt.lambda-1.<anonymous> (Snackbar.kt:231)");
            }
            B0.d a2 = V.b.a(U.a.a);
            g.a aVar = Z.g.a;
            C.b(a2, Z.h.a(Z.g.a(M.b), mVar, 0), null, 0L, mVar, 0, 12);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public final Qa.p a() {
        return b;
    }
}
