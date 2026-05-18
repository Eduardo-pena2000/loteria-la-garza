package I;

import b0.B1;
import b0.g1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class q {

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ r a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar, int i, Object obj) {
            super(2);
            this.a = rVar;
            this.b = i;
            this.c = obj;
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
                b0.w.U(980966366, i, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:135)");
            }
            this.a.g(this.b, this.c, mVar, 0);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ r a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ int c;
        public final /* synthetic */ Object d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r rVar, Object obj, int i, Object obj2, int i2) {
            super(2);
            this.a = rVar;
            this.b = obj;
            this.c = i;
            this.d = obj2;
            this.e = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            q.b(this.a, this.b, this.c, this.d, mVar, g1.a(this.e | 1));
        }
    }

    public static final void a(r rVar, Object obj, int i, Object obj2, b0.m mVar, int i2) {
        int i3;
        b0.m i4 = mVar.i(1439843069);
        if ((i2 & 6) == 0) {
            i3 = (i4.U(rVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= i4.U(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= i4.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= i4.U(obj2) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && i4.j()) {
            i4.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(1439843069, i3, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:133)");
            }
            ((k0.g) obj).d(obj2, j0.i.d(980966366, true, new a(rVar, i, obj2), i4, 54), i4, 48);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l = i4.l();
        if (l != null) {
            l.a(new b(rVar, obj, i, obj2, i2));
        }
    }

    public static final /* synthetic */ void b(r rVar, Object obj, int i, Object obj2, b0.m mVar, int i2) {
        a(rVar, obj, i, obj2, mVar, i2);
    }
}
