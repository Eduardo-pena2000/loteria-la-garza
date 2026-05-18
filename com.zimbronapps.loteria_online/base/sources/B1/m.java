package B1;

import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class m extends e {
    public ArrayList L0;

    public m() {
        this.L0 = new ArrayList();
    }

    public void a(e eVar) {
        this.L0.add(eVar);
        if (eVar.L() != null) {
            ((m) eVar.L()).x1(eVar);
        }
        eVar.f1(this);
    }

    public void u1(e... eVarArr) {
        for (e eVar : eVarArr) {
            a(eVar);
        }
    }

    public void v0() {
        this.L0.clear();
        super.v0();
    }

    public ArrayList v1() {
        return this.L0;
    }

    public abstract void w1();

    public void x1(e eVar) {
        this.L0.remove(eVar);
        eVar.v0();
    }

    public void y0(u1.c cVar) {
        super.y0(cVar);
        int size = this.L0.size();
        for (int i = 0; i < size; i++) {
            ((e) this.L0.get(i)).y0(cVar);
        }
    }

    public void y1() {
        this.L0.clear();
    }

    public m(int i, int i2) {
        super(i, i2);
        this.L0 = new ArrayList();
    }
}
