package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class k extends RecyclerView.l {
    public boolean g = true;

    public final void A(RecyclerView.B b) {
        I(b);
        h(b);
    }

    public final void B(RecyclerView.B b) {
        J(b);
    }

    public final void C(RecyclerView.B b, boolean z) {
        K(b, z);
        h(b);
    }

    public final void D(RecyclerView.B b, boolean z) {
        L(b, z);
    }

    public final void E(RecyclerView.B b) {
        M(b);
        h(b);
    }

    public final void F(RecyclerView.B b) {
        N(b);
    }

    public final void G(RecyclerView.B b) {
        O(b);
        h(b);
    }

    public final void H(RecyclerView.B b) {
        P(b);
    }

    public void I(RecyclerView.B b) {
    }

    public void J(RecyclerView.B b) {
    }

    public void K(RecyclerView.B b, boolean z) {
    }

    public void L(RecyclerView.B b, boolean z) {
    }

    public void M(RecyclerView.B b) {
    }

    public void N(RecyclerView.B b) {
    }

    public void O(RecyclerView.B b) {
    }

    public void P(RecyclerView.B b) {
    }

    public boolean a(RecyclerView.B b, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i;
        int i2;
        return (bVar == null || ((i = bVar.a) == (i2 = bVar2.a) && bVar.b == bVar2.b)) ? w(b) : y(b, i, bVar.b, i2, bVar2.b);
    }

    public boolean b(RecyclerView.B b, RecyclerView.B b2, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i;
        int i2;
        int i3 = bVar.a;
        int i4 = bVar.b;
        if (b2.shouldIgnore()) {
            int i5 = bVar.a;
            i2 = bVar.b;
            i = i5;
        } else {
            i = bVar2.a;
            i2 = bVar2.b;
        }
        return x(b, b2, i3, i4, i, i2);
    }

    public boolean c(RecyclerView.B b, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i = bVar.a;
        int i2 = bVar.b;
        View view = b.itemView;
        int left = bVar2 == null ? view.getLeft() : bVar2.a;
        int top = bVar2 == null ? view.getTop() : bVar2.b;
        if (b.isRemoved() || (i == left && i2 == top)) {
            return z(b);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(b, i, i2, left, top);
    }

    public boolean d(RecyclerView.B b, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i = bVar.a;
        int i2 = bVar2.a;
        if (i != i2 || bVar.b != bVar2.b) {
            return y(b, i, bVar.b, i2, bVar2.b);
        }
        E(b);
        return false;
    }

    public boolean f(RecyclerView.B b) {
        return !this.g || b.isInvalid();
    }

    public abstract boolean w(RecyclerView.B b);

    public abstract boolean x(RecyclerView.B b, RecyclerView.B b2, int i, int i2, int i3, int i4);

    public abstract boolean y(RecyclerView.B b, int i, int i2, int i3, int i4);

    public abstract boolean z(RecyclerView.B b);
}
