package y1;

import B1.j;
import java.util.ArrayList;
import java.util.Collections;
import y1.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class e extends a implements z1.e {
    public final g m0;
    public final g.d n0;
    public ArrayList o0;
    public j p0;

    public e(g gVar, g.d dVar) {
        super(gVar);
        this.o0 = new ArrayList();
        this.m0 = gVar;
        this.n0 = dVar;
    }

    public B1.e a() {
        return u0();
    }

    public e s0(Object... objArr) {
        Collections.addAll(this.o0, objArr);
        return this;
    }

    public void t0() {
        super.apply();
    }

    public j u0() {
        return this.p0;
    }

    public g.d v0() {
        return this.n0;
    }

    public void apply() {
    }
}
