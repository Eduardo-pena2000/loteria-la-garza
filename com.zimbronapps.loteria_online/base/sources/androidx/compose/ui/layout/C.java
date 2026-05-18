package androidx.compose.ui.layout;

import androidx.compose.ui.layout.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c extends v {
    public static final a b = new a(null);

    public static final class a {

        public static final class a extends kotlin.jvm.internal.u implements Qa.p {
            public final /* synthetic */ c[] a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c[] cVarArr) {
                super(2);
                this.a = cVarArr;
            }

            public final Float a(q.a aVar, float f) {
                return Float.valueOf(w.a(aVar, true, this.a, f));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((q.a) obj, ((Number) obj2).floatValue());
            }
        }

        public static final class b extends kotlin.jvm.internal.u implements Qa.p {
            public final /* synthetic */ c[] a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c[] cVarArr) {
                super(2);
                this.a = cVarArr;
            }

            public final Float a(q.a aVar, float f) {
                return Float.valueOf(w.a(aVar, false, this.a, f));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return a((q.a) obj, ((Number) obj2).floatValue());
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final c a(c... cVarArr) {
            return new c(new a(cVarArr), null);
        }

        public final c b(c... cVarArr) {
            return new c(new b(cVarArr), null);
        }

        public a() {
        }
    }

    public /* synthetic */ c(Qa.p pVar, kotlin.jvm.internal.k kVar) {
        this(pVar);
    }

    public float a(float f, M0.p pVar, M0.p pVar2) {
        return Float.intBitsToFloat((int) (pVar2.P(pVar, u0.f.e((Float.floatToRawIntBits(((int) (pVar.a() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L))) & 4294967295L));
    }

    public c(Qa.p pVar) {
        super(pVar, null);
    }

    public c() {
        this(null);
    }
}
