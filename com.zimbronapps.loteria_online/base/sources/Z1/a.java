package z1;

import java.util.Iterator;
import y1.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a extends y1.e {
    public float q0;

    public a(y1.g gVar) {
        super(gVar, g.d.ALIGN_VERTICALLY);
        this.q0 = 0.5f;
    }

    public void apply() {
        Iterator it = this.o0.iterator();
        while (it.hasNext()) {
            y1.a d = this.m0.d(it.next());
            d.u();
            Object obj = this.O;
            if (obj != null) {
                d.i0(obj);
            } else {
                Object obj2 = this.P;
                if (obj2 != null) {
                    d.h0(obj2);
                } else {
                    d.i0(y1.g.k);
                }
            }
            Object obj3 = this.Q;
            if (obj3 != null) {
                d.A(obj3);
            } else {
                Object obj4 = this.R;
                if (obj4 != null) {
                    d.z(obj4);
                } else {
                    d.z(y1.g.k);
                }
            }
            float f = this.q0;
            if (f != 0.5f) {
                d.F(f);
            }
        }
    }
}
