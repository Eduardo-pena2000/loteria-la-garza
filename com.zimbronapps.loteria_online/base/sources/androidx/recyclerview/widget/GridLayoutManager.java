package androidx.recyclerview.widget;

import U1.v;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean G;
    public int H;
    public int[] I;
    public View[] J;
    public final SparseIntArray K;
    public final SparseIntArray L;
    public c M;
    public final Rect N;

    public static final class a extends c {
        public int c(int i, int i2) {
            return i % i2;
        }

        public int d(int i) {
            return 1;
        }
    }

    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();
        public boolean b = false;

        public int a(int i, int i2) {
            if (!this.b) {
                return c(i, i2);
            }
            int i3 = this.a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int c = c(i, i2);
            this.a.put(i, c);
            return c;
        }

        public int b(int i, int i2) {
            int d = d(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int d2 = d(i5);
                i3 += d2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = d2;
                }
            }
            return i3 + d > i2 ? i4 + 1 : i4;
        }

        public abstract int c(int i, int i2);

        public abstract int d(int i);

        public void e() {
            this.a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.G = false;
        this.H = -1;
        this.K = new SparseIntArray();
        this.L = new SparseIntArray();
        this.M = new a();
        this.N = new Rect();
        T2(RecyclerView.o.g0(context, attributeSet, i, i2).b);
    }

    public static int[] I2(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    public RecyclerView.p C() {
        return this.r == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    public RecyclerView.p D(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public RecyclerView.p E(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public boolean F1() {
        return this.C == null && !this.G;
    }

    public final void F2(RecyclerView.u uVar, RecyclerView.y yVar, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (z) {
            i5 = 1;
            i4 = i;
            i3 = 0;
        } else {
            i3 = i - 1;
            i4 = -1;
            i5 = -1;
        }
        while (i3 != i4) {
            View view = this.J[i3];
            b layoutParams = view.getLayoutParams();
            int P2 = P2(uVar, yVar, f0(view));
            layoutParams.f = P2;
            layoutParams.e = i6;
            i6 += P2;
            i3 += i5;
        }
    }

    public void G1(RecyclerView.y yVar, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i = this.H;
        for (int i2 = 0; i2 < this.H && cVar.c(yVar) && i > 0; i2++) {
            int i3 = cVar.d;
            cVar2.a(i3, Math.max(0, cVar.g));
            i -= this.M.d(i3);
            cVar.d += cVar.e;
        }
    }

    public final void G2() {
        int I = I();
        for (int i = 0; i < I; i++) {
            b layoutParams = H(i).getLayoutParams();
            int a2 = layoutParams.a();
            this.K.put(a2, layoutParams.f());
            this.L.put(a2, layoutParams.e());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d1, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View H0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.u r26, androidx.recyclerview.widget.RecyclerView.y r27) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.H0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    public final void H2(int i) {
        this.I = I2(this.I, this.H, i);
    }

    public final void J2() {
        this.K.clear();
        this.L.clear();
    }

    public final void K2(RecyclerView.u uVar, RecyclerView.y yVar, LinearLayoutManager.a aVar, int i) {
        boolean z = i == 1;
        int O2 = O2(uVar, yVar, aVar.b);
        if (z) {
            while (O2 > 0) {
                int i2 = aVar.b;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                aVar.b = i3;
                O2 = O2(uVar, yVar, i3);
            }
            return;
        }
        int b2 = yVar.b() - 1;
        int i4 = aVar.b;
        while (i4 < b2) {
            int i5 = i4 + 1;
            int O22 = O2(uVar, yVar, i5);
            if (O22 <= O2) {
                break;
            }
            i4 = i5;
            O2 = O22;
        }
        aVar.b = i4;
    }

    public final void L2() {
        View[] viewArr = this.J;
        if (viewArr == null || viewArr.length != this.H) {
            this.J = new View[this.H];
        }
    }

    public int M(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.r == 1) {
            return this.H;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return N2(uVar, yVar, yVar.b() - 1) + 1;
    }

    public int M2(int i, int i2) {
        if (this.r != 1 || !j2()) {
            int[] iArr = this.I;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.I;
        int i3 = this.H;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public void N0(RecyclerView.u uVar, RecyclerView.y yVar, View view, v vVar) {
        b layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.M0(view, vVar);
            return;
        }
        b bVar = layoutParams;
        int N2 = N2(uVar, yVar, bVar.a());
        if (this.r == 0) {
            vVar.j0(v.f.a(bVar.e(), bVar.f(), N2, 1, this.H > 1 && bVar.f() == this.H, false));
        } else {
            vVar.j0(v.f.a(N2, 1, bVar.e(), bVar.f(), this.H > 1 && bVar.f() == this.H, false));
        }
    }

    public final int N2(RecyclerView.u uVar, RecyclerView.y yVar, int i) {
        if (!yVar.e()) {
            return this.M.b(i, this.H);
        }
        int f = uVar.f(i);
        if (f != -1) {
            return this.M.b(f, this.H);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int O2(RecyclerView.u uVar, RecyclerView.y yVar, int i) {
        if (!yVar.e()) {
            return this.M.a(i, this.H);
        }
        int i2 = this.L.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = uVar.f(i);
        if (f != -1) {
            return this.M.a(f, this.H);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public void P0(RecyclerView recyclerView, int i, int i2) {
        this.M.e();
    }

    public final int P2(RecyclerView.u uVar, RecyclerView.y yVar, int i) {
        if (!yVar.e()) {
            return this.M.d(i);
        }
        int i2 = this.K.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = uVar.f(i);
        if (f != -1) {
            return this.M.d(f);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public void Q0(RecyclerView recyclerView) {
        this.M.e();
    }

    public final void Q2(float f, int i) {
        H2(Math.max(Math.round(f * this.H), i));
    }

    public void R0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.M.e();
    }

    public final void R2(View view, int i, boolean z) {
        int i2;
        int i3;
        b layoutParams = view.getLayoutParams();
        Rect rect = layoutParams.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int M2 = M2(layoutParams.e, layoutParams.f);
        if (this.r == 1) {
            i3 = RecyclerView.o.J(M2, i, i5, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            i2 = RecyclerView.o.J(this.t.n(), W(), i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int J = RecyclerView.o.J(M2, i, i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int J2 = RecyclerView.o.J(this.t.n(), n0(), i5, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            i2 = J;
            i3 = J2;
        }
        S2(view, i3, i2, z);
    }

    public void S0(RecyclerView recyclerView, int i, int i2) {
        this.M.e();
    }

    public final void S2(View view, int i, int i2, boolean z) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z ? D1(view, i, i2, pVar) : B1(view, i, i2, pVar)) {
            view.measure(i, i2);
        }
    }

    public void T2(int i) {
        if (i == this.H) {
            return;
        }
        this.G = true;
        if (i >= 1) {
            this.H = i;
            this.M.e();
            q1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    public void U0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.M.e();
    }

    public final void U2() {
        int V;
        int e0;
        if (i2() == 1) {
            V = m0() - d0();
            e0 = c0();
        } else {
            V = V() - b0();
            e0 = e0();
        }
        H2(V - e0);
    }

    public void V0(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (yVar.e()) {
            G2();
        }
        super.V0(uVar, yVar);
        J2();
    }

    public void W0(RecyclerView.y yVar) {
        super.W0(yVar);
        this.G = false;
    }

    public View a2(RecyclerView.u uVar, RecyclerView.y yVar, int i, int i2, int i3) {
        M1();
        int m = this.t.m();
        int i4 = this.t.i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View H = H(i);
            int f0 = f0(H);
            if (f0 >= 0 && f0 < i3 && O2(uVar, yVar, f0) == 0) {
                if (H.getLayoutParams().c()) {
                    if (view2 == null) {
                        view2 = H;
                    }
                } else {
                    if (this.t.g(H) < i4 && this.t.d(H) >= m) {
                        return H;
                    }
                    if (view == null) {
                        view = H;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    public int i0(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.r == 0) {
            return this.H;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return N2(uVar, yVar, yVar.b() - 1) + 1;
    }

    public void k2(RecyclerView.u uVar, RecyclerView.y yVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int f;
        int J;
        int i8;
        boolean z;
        View d;
        int l = this.t.l();
        boolean z2 = l != 1073741824;
        int i9 = I() > 0 ? this.I[this.H] : 0;
        if (z2) {
            U2();
        }
        boolean z3 = cVar.e == 1;
        int i10 = this.H;
        if (!z3) {
            i10 = O2(uVar, yVar, cVar.d) + P2(uVar, yVar, cVar.d);
        }
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.H && cVar.c(yVar) && i10 > 0) {
            int i13 = cVar.d;
            int P2 = P2(uVar, yVar, i13);
            if (P2 > this.H) {
                throw new IllegalArgumentException("Item at position " + i13 + " requires " + P2 + " spans but GridLayoutManager has only " + this.H + " spans.");
            }
            i10 -= P2;
            if (i10 < 0 || (d = cVar.d(uVar)) == null) {
                break;
            }
            i11 += P2;
            this.J[i12] = d;
            i12++;
        }
        if (i12 == 0) {
            bVar.b = true;
            return;
        }
        int i14 = i12;
        F2(uVar, yVar, i12, i11, z3);
        float f2 = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            View view = this.J[i16];
            if (cVar.k != null) {
                z = false;
                if (z3) {
                    a(view);
                } else {
                    b(view, 0);
                }
            } else if (z3) {
                c(view);
                z = false;
            } else {
                z = false;
                d(view, 0);
            }
            i(view, this.N);
            R2(view, l, z);
            int e = this.t.e(view);
            if (e > i15) {
                i15 = e;
            }
            float f3 = (this.t.f(view) * 1.0f) / view.getLayoutParams().f;
            if (f3 > f2) {
                f2 = f3;
            }
        }
        if (z2) {
            Q2(f2, i9);
            i15 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                View view2 = this.J[i17];
                R2(view2, 1073741824, true);
                int e2 = this.t.e(view2);
                if (e2 > i15) {
                    i15 = e2;
                }
            }
        }
        for (int i18 = 0; i18 < i14; i18++) {
            View view3 = this.J[i18];
            if (this.t.e(view3) != i15) {
                b layoutParams = view3.getLayoutParams();
                Rect rect = layoutParams.b;
                int i19 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                int i20 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int M2 = M2(layoutParams.e, layoutParams.f);
                if (this.r == 1) {
                    i8 = RecyclerView.o.J(M2, 1073741824, i20, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
                    J = View.MeasureSpec.makeMeasureSpec(i15 - i19, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i20, 1073741824);
                    J = RecyclerView.o.J(M2, 1073741824, i19, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
                    i8 = makeMeasureSpec;
                }
                S2(view3, i8, J, true);
            }
        }
        int i21 = 0;
        bVar.a = i15;
        if (this.r != 1) {
            if (cVar.f == -1) {
                int i22 = cVar.b;
                i2 = i22 - i15;
                i = i22;
            } else {
                int i23 = cVar.b;
                i = i23 + i15;
                i2 = i23;
            }
            i3 = 0;
            i4 = 0;
        } else if (cVar.f == -1) {
            int i24 = cVar.b;
            int i25 = i24 - i15;
            i2 = 0;
            i = 0;
            i4 = i25;
            i3 = i24;
        } else {
            i4 = cVar.b;
            i3 = i4 + i15;
            i2 = 0;
            i = 0;
        }
        while (i21 < i14) {
            View view4 = this.J[i21];
            b layoutParams2 = view4.getLayoutParams();
            if (this.r == 1) {
                if (j2()) {
                    int c0 = c0() + this.I[this.H - layoutParams2.e];
                    f = i3;
                    i7 = c0;
                    i6 = c0 - this.t.f(view4);
                } else {
                    int c02 = c0() + this.I[layoutParams2.e];
                    f = i3;
                    i6 = c02;
                    i7 = this.t.f(view4) + c02;
                }
                i5 = i4;
            } else {
                int e0 = e0() + this.I[layoutParams2.e];
                i5 = e0;
                i6 = i2;
                i7 = i;
                f = this.t.f(view4) + e0;
            }
            x0(view4, i6, i5, i7, f);
            if (layoutParams2.c() || layoutParams2.b()) {
                bVar.c = true;
            }
            bVar.d |= view4.hasFocusable();
            i21++;
            i3 = f;
            i2 = i6;
            i = i7;
            i4 = i5;
        }
        Arrays.fill(this.J, (Object) null);
    }

    public boolean l(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    public void m2(RecyclerView.u uVar, RecyclerView.y yVar, LinearLayoutManager.a aVar, int i) {
        super.m2(uVar, yVar, aVar, i);
        U2();
        if (yVar.b() > 0 && !yVar.e()) {
            K2(uVar, yVar, aVar, i);
        }
        L2();
    }

    public int t1(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        U2();
        L2();
        return super.t1(i, uVar, yVar);
    }

    public int u1(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        U2();
        L2();
        return super.u1(i, uVar, yVar);
    }

    public void w2(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.w2(false);
    }

    public void y1(Rect rect, int i, int i2) {
        int m;
        int m2;
        if (this.I == null) {
            super.y1(rect, i, i2);
        }
        int c0 = c0() + d0();
        int e0 = e0() + b0();
        if (this.r == 1) {
            m2 = RecyclerView.o.m(i2, rect.height() + e0, Z());
            int[] iArr = this.I;
            m = RecyclerView.o.m(i, iArr[iArr.length - 1] + c0, a0());
        } else {
            m = RecyclerView.o.m(i, rect.width() + c0, a0());
            int[] iArr2 = this.I;
            m2 = RecyclerView.o.m(i2, iArr2[iArr2.length - 1] + e0, Z());
        }
        x1(m, m2);
    }

    public static class b extends RecyclerView.p {
        public int e;
        public int f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = -1;
            this.f = 0;
        }

        public int e() {
            return this.e;
        }

        public int f() {
            return this.f;
        }

        public b(int i, int i2) {
            super(i, i2);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.e = -1;
            this.f = 0;
        }
    }
}
