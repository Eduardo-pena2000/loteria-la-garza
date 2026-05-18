package z;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class w0 {

    public static final class a implements s {
        public final List a;

        public a(q qVar, float f, float f2) {
            Wa.i w = Wa.n.w(0, qVar.b());
            ArrayList arrayList = new ArrayList(Da.w.y(w, 10));
            Da.M it = w.iterator();
            while (it.hasNext()) {
                arrayList.add(new J(f, f2, qVar.a(it.a())));
            }
            this.a = arrayList;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public J get(int i) {
            return (J) this.a.get(i);
        }
    }

    public static final class b implements s {
        public final J a;

        public b(float f, float f2) {
            this.a = new J(f, f2, 0.0f, 4, null);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public J get(int i) {
            return this.a;
        }
    }

    public static final /* synthetic */ s a(q qVar, float f, float f2) {
        return c(qVar, f, f2);
    }

    public static final long b(y0 y0Var, long j) {
        return Wa.n.o(j - y0Var.d(), 0L, y0Var.f());
    }

    public static final s c(q qVar, float f, float f2) {
        return qVar != null ? new a(qVar, f, f2) : new b(f, f2);
    }

    public static final q d(v0 v0Var, long j, q qVar, q qVar2, q qVar3) {
        return v0Var.c(j * 1000000, qVar, qVar2, qVar3);
    }
}
