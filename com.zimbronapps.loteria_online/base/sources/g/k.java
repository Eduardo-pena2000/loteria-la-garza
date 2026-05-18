package G;

import Ca.I;
import I.J;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k extends I.n implements y {
    public final J a = new J();
    public List b;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ Object a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            super(1);
            this.a = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i) {
            return this.a;
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ Object a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj) {
            super(1);
            this.a = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        public final Object invoke(int i) {
            return this.a;
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.r {
        public final /* synthetic */ Qa.q a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Qa.q qVar) {
            super(4);
            this.a = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((G.c) obj, ((Number) obj2).intValue(), (b0.m) obj3, ((Number) obj4).intValue());
            return I.a;
        }

        public final void invoke(G.c cVar, int i, b0.m mVar, int i2) {
            if ((i2 & 6) == 0) {
                i2 |= mVar.U(cVar) ? 4 : 2;
            }
            if ((i2 & 131) == 130 && mVar.j()) {
                mVar.M();
                return;
            }
            if (b0.w.L()) {
                b0.w.U(-1010194746, i2, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)");
            }
            this.a.invoke(cVar, mVar, Integer.valueOf(i2 & 14));
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public k(Qa.l lVar) {
        lVar.invoke(this);
    }

    public void a(int i, Qa.l lVar, Qa.l lVar2, Qa.r rVar) {
        g().b(i, new j(lVar, lVar2, rVar));
    }

    public void b(Object obj, Object obj2, Qa.q qVar) {
        g().b(1, new j(obj != null ? new a(obj) : null, new b(obj2), j0.i.b(-1010194746, true, new c(qVar))));
    }

    public final List j() {
        List list = this.b;
        return list == null ? Da.v.n() : list;
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public J g() {
        return this.a;
    }
}
