package J;

import Ca.I;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class q {

    public static final class a implements I.g {
        public final /* synthetic */ C a;

        public a(C c) {
            this.a = c;
        }

        public Object a(Qa.p pVar, Ga.e eVar) {
            Object f = C.y.f(this.a, null, pVar, eVar, 1, null);
            return f == Ha.c.f() ? f : I.a;
        }

        public int b() {
            return ((f) Da.D.p0(this.a.C().h())).getIndex();
        }

        public float c(int i) {
            Object obj;
            List h = this.a.C().h();
            int size = h.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    obj = null;
                    break;
                }
                obj = h.get(i2);
                if (((f) obj).getIndex() == i) {
                    break;
                }
                i2++;
            }
            return ((f) obj) == null ? ((i - this.a.v()) * f()) - (this.a.w() * this.a.H()) : r3.a();
        }

        public void d(C.u uVar, int i, int i2) {
            this.a.i0(i, i2 / this.a.H(), true);
        }

        public int e() {
            return this.a.y();
        }

        public final int f() {
            return this.a.G() + this.a.I();
        }
    }

    public static final I.g a(C c) {
        return new a(c);
    }
}
