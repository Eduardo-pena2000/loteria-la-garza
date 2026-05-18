package N;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f {
    public static final f a = new f();
    public static Qa.q b = j0.i.b(671295101, false, a.a);

    public static final class a extends kotlin.jvm.internal.u implements Qa.q {
        public static final a a = new a();

        public a() {
            super(3);
        }

        public final void a(Qa.p pVar, b0.m mVar, int i) {
            if ((i & 6) == 0) {
                i |= mVar.E(pVar) ? 4 : 2;
            }
            if ((i & 19) == 18 && mVar.j()) {
                mVar.M();
                return;
            }
            if (b0.w.L()) {
                b0.w.U(671295101, i, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:219)");
            }
            pVar.invoke(mVar, Integer.valueOf(i & 14));
            if (b0.w.L()) {
                b0.w.T();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((Qa.p) obj, (b0.m) obj2, ((Number) obj3).intValue());
            return Ca.I.a;
        }
    }

    public final Qa.q a() {
        return b;
    }
}
