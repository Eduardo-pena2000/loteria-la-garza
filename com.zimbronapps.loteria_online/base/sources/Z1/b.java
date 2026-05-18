package z1;

import java.util.Iterator;
import y1.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class b extends y1.e {
    public float q0;

    public b(y1.g gVar) {
        super(gVar, g.d.ALIGN_VERTICALLY);
        this.q0 = 0.5f;
    }

    public void apply() {
        Iterator it = this.o0.iterator();
        while (it.hasNext()) {
            y1.a d = this.m0.d(it.next());
            d.v();
            Object obj = this.S;
            if (obj != null) {
                d.m0(obj);
            } else {
                Object obj2 = this.T;
                if (obj2 != null) {
                    d.l0(obj2);
                } else {
                    d.m0(y1.g.k);
                }
            }
            Object obj3 = this.V;
            if (obj3 != null) {
                d.q(obj3);
            } else {
                Object obj4 = this.W;
                if (obj4 != null) {
                    d.p(obj4);
                } else {
                    d.p(y1.g.k);
                }
            }
            float f = this.q0;
            if (f != 0.5f) {
                d.q0(f);
            }
        }
    }
}
