package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class LinearLayoutManager extends RecyclerView.o {
    public boolean B;
    public c s;
    public h t;
    public boolean u;
    public int r = 1;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;
    public boolean y = true;
    public int z = -1;
    public int A = Integer.MIN_VALUE;
    public d C = null;
    public final a D = new a();
    public final b E = new b();
    public int F = 2;

    public static class a {
        public h a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            e();
        }

        public void a() {
            this.c = this.d ? this.a.i() : this.a.m();
        }

        public void b(View view, int i) {
            if (this.d) {
                this.c = this.a.d(view) + this.a.o();
            } else {
                this.c = this.a.g(view);
            }
            this.b = i;
        }

        public void c(View view, int i) {
            int o = this.a.o();
            if (o >= 0) {
                b(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int i2 = (this.a.i() - o) - this.a.d(view);
                this.c = this.a.i() - i2;
                if (i2 > 0) {
                    int e = this.c - this.a.e(view);
                    int m = this.a.m();
                    int min = e - (m + Math.min(this.a.g(view) - m, 0));
                    if (min < 0) {
                        this.c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.a.g(view);
            int m2 = g - this.a.m();
            this.c = g;
            if (m2 > 0) {
                int i3 = (this.a.i() - Math.min(0, (this.a.i() - o) - this.a.d(view))) - (g + this.a.e(view));
                if (i3 < 0) {
                    this.c -= Math.min(m2, -i3);
                }
            }
        }

        public boolean d(View view, RecyclerView.y yVar) {
            RecyclerView.p layoutParams = view.getLayoutParams();
            return !layoutParams.c() && layoutParams.a() >= 0 && layoutParams.a() < yVar.b();
        }

        public void e() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
        }
    }

    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        public void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    public static class c {
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int j;
        public boolean l;
        public boolean a = true;
        public int h = 0;
        public boolean i = false;
        public List k = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f = f(view);
            if (f == null) {
                this.d = -1;
            } else {
                this.d = f.getLayoutParams().a();
            }
        }

        public boolean c(RecyclerView.y yVar) {
            int i = this.d;
            return i >= 0 && i < yVar.b();
        }

        public View d(RecyclerView.u uVar) {
            if (this.k != null) {
                return e();
            }
            View o = uVar.o(this.d);
            this.d += this.e;
            return o;
        }

        public final View e() {
            int size = this.k.size();
            for (int i = 0; i < size; i++) {
                View view = ((RecyclerView.B) this.k.get(i)).itemView;
                RecyclerView.p layoutParams = view.getLayoutParams();
                if (!layoutParams.c() && this.d == layoutParams.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View f(View view) {
            int a;
            int size = this.k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((RecyclerView.B) this.k.get(i2)).itemView;
                RecyclerView.p layoutParams = view3.getLayoutParams();
                if (view3 != view && !layoutParams.c() && (a = (layoutParams.a() - this.d) * this.e) >= 0 && a < i) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i = a;
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator CREATOR = new a();
        public int a;
        public int b;
        public boolean c;

        public static class a implements Parcelable.Creator {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        public boolean b() {
            return this.a >= 0;
        }

        public void c() {
            this.a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.c = dVar.c;
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.o.d g0 = RecyclerView.o.g0(context, attributeSet, i, i2);
        u2(g0.a);
        v2(g0.c);
        w2(g0.d);
    }

    public final void A2(int i, int i2, boolean z, RecyclerView.y yVar) {
        int m;
        this.s.l = r2();
        this.s.h = h2(yVar);
        c cVar = this.s;
        cVar.f = i;
        if (i == 1) {
            cVar.h += this.t.j();
            View f2 = f2();
            c cVar2 = this.s;
            cVar2.e = this.w ? -1 : 1;
            int f0 = f0(f2);
            c cVar3 = this.s;
            cVar2.d = f0 + cVar3.e;
            cVar3.b = this.t.d(f2);
            m = this.t.d(f2) - this.t.i();
        } else {
            View g2 = g2();
            this.s.h += this.t.m();
            c cVar4 = this.s;
            cVar4.e = this.w ? 1 : -1;
            int f02 = f0(g2);
            c cVar5 = this.s;
            cVar4.d = f02 + cVar5.e;
            cVar5.b = this.t.g(g2);
            m = (-this.t.g(g2)) + this.t.m();
        }
        c cVar6 = this.s;
        cVar6.c = i2;
        if (z) {
            cVar6.c = i2 - m;
        }
        cVar6.g = m;
    }

    public View B(int i) {
        int I = I();
        if (I == 0) {
            return null;
        }
        int f0 = i - f0(H(0));
        if (f0 >= 0 && f0 < I) {
            View H = H(f0);
            if (f0(H) == i) {
                return H;
            }
        }
        return super.B(i);
    }

    public final void B2(int i, int i2) {
        this.s.c = this.t.i() - i2;
        c cVar = this.s;
        cVar.e = this.w ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    public RecyclerView.p C() {
        return new RecyclerView.p(-2, -2);
    }

    public boolean C1() {
        return (W() == 1073741824 || n0() == 1073741824 || !o0()) ? false : true;
    }

    public final void C2(a aVar) {
        B2(aVar.b, aVar.c);
    }

    public final void D2(int i, int i2) {
        this.s.c = i2 - this.t.m();
        c cVar = this.s;
        cVar.d = i;
        cVar.e = this.w ? 1 : -1;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    public final void E2(a aVar) {
        D2(aVar.b, aVar.c);
    }

    public boolean F1() {
        return this.C == null && this.u == this.x;
    }

    public void G0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.G0(recyclerView, uVar);
        if (this.B) {
            h1(uVar);
            uVar.c();
        }
    }

    public void G1(RecyclerView.y yVar, c cVar, RecyclerView.o.c cVar2) {
        int i = cVar.d;
        if (i < 0 || i >= yVar.b()) {
            return;
        }
        cVar2.a(i, Math.max(0, cVar.g));
    }

    public View H0(View view, int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        int K1;
        s2();
        if (I() == 0 || (K1 = K1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        M1();
        M1();
        A2(K1, (int) (this.t.n() * 0.33333334f), false, yVar);
        c cVar = this.s;
        cVar.g = Integer.MIN_VALUE;
        cVar.a = false;
        N1(uVar, cVar, yVar, true);
        View Z1 = K1 == -1 ? Z1(uVar, yVar) : Y1(uVar, yVar);
        View g2 = K1 == -1 ? g2() : f2();
        if (!g2.hasFocusable()) {
            return Z1;
        }
        if (Z1 == null) {
            return null;
        }
        return g2;
    }

    public final int H1(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        M1();
        return j.a(yVar, this.t, R1(!this.y, true), Q1(!this.y, true), this, this.y);
    }

    public void I0(AccessibilityEvent accessibilityEvent) {
        super.I0(accessibilityEvent);
        if (I() > 0) {
            accessibilityEvent.setFromIndex(S1());
            accessibilityEvent.setToIndex(V1());
        }
    }

    public final int I1(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        M1();
        return j.b(yVar, this.t, R1(!this.y, true), Q1(!this.y, true), this, this.y, this.w);
    }

    public final int J1(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        M1();
        return j.c(yVar, this.t, R1(!this.y, true), Q1(!this.y, true), this, this.y);
    }

    public int K1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.r == 1) ? 1 : Integer.MIN_VALUE : this.r == 0 ? 1 : Integer.MIN_VALUE : this.r == 1 ? -1 : Integer.MIN_VALUE : this.r == 0 ? -1 : Integer.MIN_VALUE : (this.r != 1 && j2()) ? -1 : 1 : (this.r != 1 && j2()) ? 1 : -1;
    }

    public c L1() {
        return new c();
    }

    public void M1() {
        if (this.s == null) {
            this.s = L1();
        }
    }

    public int N1(RecyclerView.u uVar, c cVar, RecyclerView.y yVar, boolean z) {
        int i = cVar.c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            n2(uVar, cVar);
        }
        int i3 = cVar.c + cVar.h;
        b bVar = this.E;
        while (true) {
            if ((!cVar.l && i3 <= 0) || !cVar.c(yVar)) {
                break;
            }
            bVar.a();
            k2(uVar, yVar, cVar, bVar);
            if (!bVar.b) {
                cVar.b += bVar.a * cVar.f;
                if (!bVar.c || this.s.k != null || !yVar.e()) {
                    int i4 = cVar.c;
                    int i5 = bVar.a;
                    cVar.c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.a;
                    cVar.g = i7;
                    int i8 = cVar.c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    n2(uVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    public final View O1(RecyclerView.u uVar, RecyclerView.y yVar) {
        return W1(0, I());
    }

    public final View P1(RecyclerView.u uVar, RecyclerView.y yVar) {
        return a2(uVar, yVar, 0, I(), yVar.b());
    }

    public final View Q1(boolean z, boolean z2) {
        return this.w ? X1(0, I(), z, z2) : X1(I() - 1, -1, z, z2);
    }

    public final View R1(boolean z, boolean z2) {
        return this.w ? X1(I() - 1, -1, z, z2) : X1(0, I(), z, z2);
    }

    public int S1() {
        View X1 = X1(0, I(), false, true);
        if (X1 == null) {
            return -1;
        }
        return f0(X1);
    }

    public final View T1(RecyclerView.u uVar, RecyclerView.y yVar) {
        return W1(I() - 1, -1);
    }

    public final View U1(RecyclerView.u uVar, RecyclerView.y yVar) {
        return a2(uVar, yVar, I() - 1, -1, yVar.b());
    }

    public void V0(RecyclerView.u uVar, RecyclerView.y yVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int d2;
        int i6;
        View B;
        int g;
        int i7;
        int i8 = -1;
        if (!(this.C == null && this.z == -1) && yVar.b() == 0) {
            h1(uVar);
            return;
        }
        d dVar = this.C;
        if (dVar != null && dVar.b()) {
            this.z = this.C.a;
        }
        M1();
        this.s.a = false;
        s2();
        View U = U();
        a aVar = this.D;
        if (!aVar.e || this.z != -1 || this.C != null) {
            aVar.e();
            a aVar2 = this.D;
            aVar2.d = this.w ^ this.x;
            z2(uVar, yVar, aVar2);
            this.D.e = true;
        } else if (U != null && (this.t.g(U) >= this.t.i() || this.t.d(U) <= this.t.m())) {
            this.D.c(U, f0(U));
        }
        int h2 = h2(yVar);
        if (this.s.j >= 0) {
            i = h2;
            h2 = 0;
        } else {
            i = 0;
        }
        int m = h2 + this.t.m();
        int j = i + this.t.j();
        if (yVar.e() && (i6 = this.z) != -1 && this.A != Integer.MIN_VALUE && (B = B(i6)) != null) {
            if (this.w) {
                i7 = this.t.i() - this.t.d(B);
                g = this.A;
            } else {
                g = this.t.g(B) - this.t.m();
                i7 = this.A;
            }
            int i9 = i7 - g;
            if (i9 > 0) {
                m += i9;
            } else {
                j -= i9;
            }
        }
        a aVar3 = this.D;
        if (!aVar3.d ? !this.w : this.w) {
            i8 = 1;
        }
        m2(uVar, yVar, aVar3, i8);
        v(uVar);
        this.s.l = r2();
        this.s.i = yVar.e();
        a aVar4 = this.D;
        if (aVar4.d) {
            E2(aVar4);
            c cVar = this.s;
            cVar.h = m;
            N1(uVar, cVar, yVar, false);
            c cVar2 = this.s;
            i3 = cVar2.b;
            int i10 = cVar2.d;
            int i11 = cVar2.c;
            if (i11 > 0) {
                j += i11;
            }
            C2(this.D);
            c cVar3 = this.s;
            cVar3.h = j;
            cVar3.d += cVar3.e;
            N1(uVar, cVar3, yVar, false);
            c cVar4 = this.s;
            i2 = cVar4.b;
            int i12 = cVar4.c;
            if (i12 > 0) {
                D2(i10, i3);
                c cVar5 = this.s;
                cVar5.h = i12;
                N1(uVar, cVar5, yVar, false);
                i3 = this.s.b;
            }
        } else {
            C2(aVar4);
            c cVar6 = this.s;
            cVar6.h = j;
            N1(uVar, cVar6, yVar, false);
            c cVar7 = this.s;
            i2 = cVar7.b;
            int i13 = cVar7.d;
            int i14 = cVar7.c;
            if (i14 > 0) {
                m += i14;
            }
            E2(this.D);
            c cVar8 = this.s;
            cVar8.h = m;
            cVar8.d += cVar8.e;
            N1(uVar, cVar8, yVar, false);
            c cVar9 = this.s;
            i3 = cVar9.b;
            int i15 = cVar9.c;
            if (i15 > 0) {
                B2(i13, i2);
                c cVar10 = this.s;
                cVar10.h = i15;
                N1(uVar, cVar10, yVar, false);
                i2 = this.s.b;
            }
        }
        if (I() > 0) {
            if (this.w ^ this.x) {
                int d22 = d2(i2, uVar, yVar, true);
                i4 = i3 + d22;
                i5 = i2 + d22;
                d2 = e2(i4, uVar, yVar, false);
            } else {
                int e2 = e2(i3, uVar, yVar, true);
                i4 = i3 + e2;
                i5 = i2 + e2;
                d2 = d2(i5, uVar, yVar, false);
            }
            i3 = i4 + d2;
            i2 = i5 + d2;
        }
        l2(uVar, yVar, i3, i2);
        if (yVar.e()) {
            this.D.e();
        } else {
            this.t.s();
        }
        this.u = this.x;
    }

    public int V1() {
        View X1 = X1(I() - 1, -1, false, true);
        if (X1 == null) {
            return -1;
        }
        return f0(X1);
    }

    public void W0(RecyclerView.y yVar) {
        super.W0(yVar);
        this.C = null;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.D.e();
    }

    public View W1(int i, int i2) {
        int i3;
        int i4;
        M1();
        if (i2 <= i && i2 >= i) {
            return H(i);
        }
        if (this.t.g(H(i)) < this.t.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.r == 0 ? this.e.a(i, i2, i3, i4) : this.f.a(i, i2, i3, i4);
    }

    public View X1(int i, int i2, boolean z, boolean z2) {
        M1();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.r == 0 ? this.e.a(i, i2, i3, i4) : this.f.a(i, i2, i3, i4);
    }

    public final View Y1(RecyclerView.u uVar, RecyclerView.y yVar) {
        return this.w ? O1(uVar, yVar) : T1(uVar, yVar);
    }

    public final View Z1(RecyclerView.u uVar, RecyclerView.y yVar) {
        return this.w ? T1(uVar, yVar) : O1(uVar, yVar);
    }

    public void a1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.C = (d) parcelable;
            q1();
        }
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
            if (f0 >= 0 && f0 < i3) {
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

    public Parcelable b1() {
        if (this.C != null) {
            return new d(this.C);
        }
        d dVar = new d();
        if (I() > 0) {
            M1();
            boolean z = this.u ^ this.w;
            dVar.c = z;
            if (z) {
                View f2 = f2();
                dVar.b = this.t.i() - this.t.d(f2);
                dVar.a = f0(f2);
            } else {
                View g2 = g2();
                dVar.a = f0(g2);
                dVar.b = this.t.g(g2) - this.t.m();
            }
        } else {
            dVar.c();
        }
        return dVar;
    }

    public final View b2(RecyclerView.u uVar, RecyclerView.y yVar) {
        return this.w ? P1(uVar, yVar) : U1(uVar, yVar);
    }

    public final View c2(RecyclerView.u uVar, RecyclerView.y yVar) {
        return this.w ? U1(uVar, yVar) : P1(uVar, yVar);
    }

    public final int d2(int i, RecyclerView.u uVar, RecyclerView.y yVar, boolean z) {
        int i2;
        int i3 = this.t.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -t2(-i3, uVar, yVar);
        int i5 = i + i4;
        if (!z || (i2 = this.t.i() - i5) <= 0) {
            return i4;
        }
        this.t.r(i2);
        return i2 + i4;
    }

    public final int e2(int i, RecyclerView.u uVar, RecyclerView.y yVar, boolean z) {
        int m;
        int m2 = i - this.t.m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -t2(m2, uVar, yVar);
        int i3 = i + i2;
        if (!z || (m = i3 - this.t.m()) <= 0) {
            return i2;
        }
        this.t.r(-m);
        return i2 - m;
    }

    public void f(String str) {
        if (this.C == null) {
            super.f(str);
        }
    }

    public final View f2() {
        return H(this.w ? 0 : I() - 1);
    }

    public final View g2() {
        return H(this.w ? I() - 1 : 0);
    }

    public int h2(RecyclerView.y yVar) {
        if (yVar.d()) {
            return this.t.n();
        }
        return 0;
    }

    public int i2() {
        return this.r;
    }

    public boolean j() {
        return this.r == 0;
    }

    public boolean j2() {
        return X() == 1;
    }

    public boolean k() {
        return this.r == 1;
    }

    public void k2(RecyclerView.u uVar, RecyclerView.y yVar, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int f;
        View d2 = cVar.d(uVar);
        if (d2 == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.p layoutParams = d2.getLayoutParams();
        if (cVar.k == null) {
            if (this.w == (cVar.f == -1)) {
                c(d2);
            } else {
                d(d2, 0);
            }
        } else {
            if (this.w == (cVar.f == -1)) {
                a(d2);
            } else {
                b(d2, 0);
            }
        }
        y0(d2, 0, 0);
        bVar.a = this.t.e(d2);
        if (this.r == 1) {
            if (j2()) {
                f = m0() - d0();
                i4 = f - this.t.f(d2);
            } else {
                i4 = c0();
                f = this.t.f(d2) + i4;
            }
            if (cVar.f == -1) {
                int i5 = cVar.b;
                i3 = i5;
                i2 = f;
                i = i5 - bVar.a;
            } else {
                int i6 = cVar.b;
                i = i6;
                i2 = f;
                i3 = bVar.a + i6;
            }
        } else {
            int e0 = e0();
            int f2 = this.t.f(d2) + e0;
            if (cVar.f == -1) {
                int i7 = cVar.b;
                i2 = i7;
                i = e0;
                i3 = f2;
                i4 = i7 - bVar.a;
            } else {
                int i8 = cVar.b;
                i = e0;
                i2 = bVar.a + i8;
                i3 = f2;
                i4 = i8;
            }
        }
        x0(d2, i4, i, i2, i3);
        if (layoutParams.c() || layoutParams.b()) {
            bVar.c = true;
        }
        bVar.d = d2.hasFocusable();
    }

    public final void l2(RecyclerView.u uVar, RecyclerView.y yVar, int i, int i2) {
        if (!yVar.g() || I() == 0 || yVar.e() || !F1()) {
            return;
        }
        List k = uVar.k();
        int size = k.size();
        int f0 = f0(H(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.B b2 = (RecyclerView.B) k.get(i5);
            if (!b2.isRemoved()) {
                if ((b2.getLayoutPosition() < f0) != this.w) {
                    i3 += this.t.e(b2.itemView);
                } else {
                    i4 += this.t.e(b2.itemView);
                }
            }
        }
        this.s.k = k;
        if (i3 > 0) {
            D2(f0(g2()), i);
            c cVar = this.s;
            cVar.h = i3;
            cVar.c = 0;
            cVar.a();
            N1(uVar, this.s, yVar, false);
        }
        if (i4 > 0) {
            B2(f0(f2()), i2);
            c cVar2 = this.s;
            cVar2.h = i4;
            cVar2.c = 0;
            cVar2.a();
            N1(uVar, this.s, yVar, false);
        }
        this.s.k = null;
    }

    public void m2(RecyclerView.u uVar, RecyclerView.y yVar, a aVar, int i) {
    }

    public void n(int i, int i2, RecyclerView.y yVar, RecyclerView.o.c cVar) {
        if (this.r != 0) {
            i = i2;
        }
        if (I() == 0 || i == 0) {
            return;
        }
        M1();
        A2(i > 0 ? 1 : -1, Math.abs(i), true, yVar);
        G1(yVar, this.s, cVar);
    }

    public final void n2(RecyclerView.u uVar, c cVar) {
        if (!cVar.a || cVar.l) {
            return;
        }
        if (cVar.f == -1) {
            p2(uVar, cVar.g);
        } else {
            q2(uVar, cVar.g);
        }
    }

    public void o(int i, RecyclerView.o.c cVar) {
        boolean z;
        int i2;
        d dVar = this.C;
        if (dVar == null || !dVar.b()) {
            s2();
            z = this.w;
            i2 = this.z;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            d dVar2 = this.C;
            z = dVar2.c;
            i2 = dVar2.a;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.F && i2 >= 0 && i2 < i; i4++) {
            cVar.a(i2, 0);
            i2 += i3;
        }
    }

    public final void o2(RecyclerView.u uVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                k1(i, uVar);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                k1(i3, uVar);
            }
        }
    }

    public int p(RecyclerView.y yVar) {
        return H1(yVar);
    }

    public final void p2(RecyclerView.u uVar, int i) {
        int I = I();
        if (i < 0) {
            return;
        }
        int h = this.t.h() - i;
        if (this.w) {
            for (int i2 = 0; i2 < I; i2++) {
                View H = H(i2);
                if (this.t.g(H) < h || this.t.q(H) < h) {
                    o2(uVar, 0, i2);
                    return;
                }
            }
            return;
        }
        int i3 = I - 1;
        for (int i4 = i3; i4 >= 0; i4--) {
            View H2 = H(i4);
            if (this.t.g(H2) < h || this.t.q(H2) < h) {
                o2(uVar, i3, i4);
                return;
            }
        }
    }

    public int q(RecyclerView.y yVar) {
        return I1(yVar);
    }

    public boolean q0() {
        return true;
    }

    public final void q2(RecyclerView.u uVar, int i) {
        if (i < 0) {
            return;
        }
        int I = I();
        if (!this.w) {
            for (int i2 = 0; i2 < I; i2++) {
                View H = H(i2);
                if (this.t.d(H) > i || this.t.p(H) > i) {
                    o2(uVar, 0, i2);
                    return;
                }
            }
            return;
        }
        int i3 = I - 1;
        for (int i4 = i3; i4 >= 0; i4--) {
            View H2 = H(i4);
            if (this.t.d(H2) > i || this.t.p(H2) > i) {
                o2(uVar, i3, i4);
                return;
            }
        }
    }

    public int r(RecyclerView.y yVar) {
        return J1(yVar);
    }

    public boolean r2() {
        return this.t.k() == 0 && this.t.h() == 0;
    }

    public int s(RecyclerView.y yVar) {
        return H1(yVar);
    }

    public final void s2() {
        if (this.r == 1 || !j2()) {
            this.w = this.v;
        } else {
            this.w = !this.v;
        }
    }

    public int t(RecyclerView.y yVar) {
        return I1(yVar);
    }

    public int t1(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.r == 1) {
            return 0;
        }
        return t2(i, uVar, yVar);
    }

    public int t2(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (I() == 0 || i == 0) {
            return 0;
        }
        this.s.a = true;
        M1();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        A2(i2, abs, true, yVar);
        c cVar = this.s;
        int N1 = cVar.g + N1(uVar, cVar, yVar, false);
        if (N1 < 0) {
            return 0;
        }
        if (abs > N1) {
            i = i2 * N1;
        }
        this.t.r(-i);
        this.s.j = i;
        return i;
    }

    public int u(RecyclerView.y yVar) {
        return J1(yVar);
    }

    public int u1(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.r == 0) {
            return 0;
        }
        return t2(i, uVar, yVar);
    }

    public void u2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        f(null);
        if (i != this.r || this.t == null) {
            h b2 = h.b(this, i);
            this.t = b2;
            this.D.a = b2;
            this.r = i;
            q1();
        }
    }

    public void v2(boolean z) {
        f(null);
        if (z == this.v) {
            return;
        }
        this.v = z;
        q1();
    }

    public void w2(boolean z) {
        f(null);
        if (this.x == z) {
            return;
        }
        this.x = z;
        q1();
    }

    public final boolean x2(RecyclerView.u uVar, RecyclerView.y yVar, a aVar) {
        if (I() == 0) {
            return false;
        }
        View U = U();
        if (U != null && aVar.d(U, yVar)) {
            aVar.c(U, f0(U));
            return true;
        }
        if (this.u != this.x) {
            return false;
        }
        View b2 = aVar.d ? b2(uVar, yVar) : c2(uVar, yVar);
        if (b2 == null) {
            return false;
        }
        aVar.b(b2, f0(b2));
        if (!yVar.e() && F1() && (this.t.g(b2) >= this.t.i() || this.t.d(b2) < this.t.m())) {
            aVar.c = aVar.d ? this.t.i() : this.t.m();
        }
        return true;
    }

    public final boolean y2(RecyclerView.y yVar, a aVar) {
        int i;
        if (!yVar.e() && (i = this.z) != -1) {
            if (i >= 0 && i < yVar.b()) {
                aVar.b = this.z;
                d dVar = this.C;
                if (dVar != null && dVar.b()) {
                    boolean z = this.C.c;
                    aVar.d = z;
                    if (z) {
                        aVar.c = this.t.i() - this.C.b;
                    } else {
                        aVar.c = this.t.m() + this.C.b;
                    }
                    return true;
                }
                if (this.A != Integer.MIN_VALUE) {
                    boolean z2 = this.w;
                    aVar.d = z2;
                    if (z2) {
                        aVar.c = this.t.i() - this.A;
                    } else {
                        aVar.c = this.t.m() + this.A;
                    }
                    return true;
                }
                View B = B(this.z);
                if (B == null) {
                    if (I() > 0) {
                        aVar.d = (this.z < f0(H(0))) == this.w;
                    }
                    aVar.a();
                } else {
                    if (this.t.e(B) > this.t.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.t.g(B) - this.t.m() < 0) {
                        aVar.c = this.t.m();
                        aVar.d = false;
                        return true;
                    }
                    if (this.t.i() - this.t.d(B) < 0) {
                        aVar.c = this.t.i();
                        aVar.d = true;
                        return true;
                    }
                    aVar.c = aVar.d ? this.t.d(B) + this.t.o() : this.t.g(B);
                }
                return true;
            }
            this.z = -1;
            this.A = Integer.MIN_VALUE;
        }
        return false;
    }

    public final void z2(RecyclerView.u uVar, RecyclerView.y yVar, a aVar) {
        if (y2(yVar, aVar) || x2(uVar, yVar, aVar)) {
            return;
        }
        aVar.a();
        aVar.b = this.x ? yVar.b() - 1 : 0;
    }
}
