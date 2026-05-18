package W;

import Da.A;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j extends ViewGroup {
    public final int a;
    public final List b;
    public final List c;
    public final l d;
    public int e;

    public j(Context context) {
        super(context);
        this.a = 5;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        this.d = new l();
        setClipChildren(false);
        n nVar = new n(context);
        addView(nVar);
        arrayList.add(nVar);
        arrayList2.add(nVar);
        this.e = 1;
        setTag(o0.l.J, Boolean.TRUE);
    }

    public final void a(k kVar) {
        kVar.W0();
        n b = this.d.b(kVar);
        if (b != null) {
            b.d();
            this.d.c(kVar);
            this.c.add(b);
        }
    }

    public final n b(k kVar) {
        n b = this.d.b(kVar);
        if (b != null) {
            return b;
        }
        n nVar = (n) A.K(this.c);
        if (nVar == null) {
            if (this.e > Da.v.p(this.b)) {
                nVar = new n(getContext());
                addView(nVar);
                this.b.add(nVar);
            } else {
                nVar = (n) this.b.get(this.e);
                k a = this.d.a(nVar);
                if (a != null) {
                    a.W0();
                    this.d.c(a);
                    nVar.d();
                }
            }
            int i = this.e;
            if (i < this.a - 1) {
                this.e = i + 1;
            } else {
                this.e = 0;
            }
        }
        this.d.d(kVar, nVar);
        return nVar;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void requestLayout() {
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
