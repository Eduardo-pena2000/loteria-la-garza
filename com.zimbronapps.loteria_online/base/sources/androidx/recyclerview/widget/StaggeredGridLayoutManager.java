package androidx.recyclerview.widget;

import U1.v;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o {
    public BitSet A;
    public boolean F;
    public boolean G;
    public e H;
    public int I;
    public int[] N;
    public f[] s;
    public h t;
    public h u;
    public int v;
    public int w;
    public final androidx.recyclerview.widget.f x;
    public int r = -1;
    public boolean y = false;
    public boolean z = false;
    public int B = -1;
    public int C = Integer.MIN_VALUE;
    public d D = new d();
    public int E = 2;
    public final Rect J = new Rect();
    public final b K = new b();
    public boolean L = false;
    public boolean M = true;
    public final Runnable O = new a();

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.M1();
        }
    }

    public class b {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;

        public b() {
            c();
        }

        public void a() {
            this.b = this.c ? StaggeredGridLayoutManager.this.t.i() : StaggeredGridLayoutManager.this.t.m();
        }

        public void b(int i) {
            if (this.c) {
                this.b = StaggeredGridLayoutManager.this.t.i() - i;
            } else {
                this.b = StaggeredGridLayoutManager.this.t.m() + i;
            }
        }

        public void c() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f;
            if (iArr == null || iArr.length < length) {
                this.f = new int[StaggeredGridLayoutManager.this.s.length];
            }
            for (int i = 0; i < length; i++) {
                this.f[i] = fVarArr[i].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.p {
        public f e;
        public boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            f fVar = this.e;
            if (fVar == null) {
                return -1;
            }
            return fVar.e;
        }

        public boolean f() {
            return this.f;
        }

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator CREATOR = new a();
        public int a;
        public int b;
        public int c;
        public int[] d;
        public int e;
        public int[] f;
        public List g;
        public boolean h;
        public boolean i;
        public boolean j;

        public static class a implements Parcelable.Creator {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e() {
        }

        public void b() {
            this.d = null;
            this.c = 0;
            this.e = 0;
            this.f = null;
            this.g = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }

        public e(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            int readInt = parcel.readInt();
            this.c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.h = parcel.readInt() == 1;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.c = eVar.c;
            this.a = eVar.a;
            this.b = eVar.b;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.g = eVar.g;
        }
    }

    public class f {
        public ArrayList a = new ArrayList();
        public int b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;
        public int d = 0;
        public final int e;

        public f(int i) {
            this.e = i;
        }

        public void a(View view) {
            c n = n(view);
            n.e = this;
            this.a.add(view);
            this.c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.d += StaggeredGridLayoutManager.this.t.e(view);
            }
        }

        public void b(boolean z, int i) {
            int l = z ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (l == Integer.MIN_VALUE) {
                return;
            }
            if (!z || l >= StaggeredGridLayoutManager.this.t.i()) {
                if (z || l <= StaggeredGridLayoutManager.this.t.m()) {
                    if (i != Integer.MIN_VALUE) {
                        l += i;
                    }
                    this.c = l;
                    this.b = l;
                }
            }
        }

        public void c() {
            d.a f;
            ArrayList arrayList = this.a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c n = n(view);
            this.c = StaggeredGridLayoutManager.this.t.d(view);
            if (n.f && (f = StaggeredGridLayoutManager.this.D.f(n.a())) != null && f.b == 1) {
                this.c += f.b(this.e);
            }
        }

        public void d() {
            d.a f;
            View view = (View) this.a.get(0);
            c n = n(view);
            this.b = StaggeredGridLayoutManager.this.t.g(view);
            if (n.f && (f = StaggeredGridLayoutManager.this.D.f(n.a())) != null && f.b == -1) {
                this.b -= f.b(this.e);
            }
        }

        public void e() {
            this.a.clear();
            q();
            this.d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.y ? i(this.a.size() - 1, -1, true) : i(0, this.a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.y ? i(0, this.a.size(), true) : i(this.a.size() - 1, -1, true);
        }

        public int h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.t.m();
            int i3 = StaggeredGridLayoutManager.this.t.i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.a.get(i);
                int g = StaggeredGridLayoutManager.this.t.g(view);
                int d = StaggeredGridLayoutManager.this.t.d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g >= i3 : g > i3;
                if (!z3 ? d > m : d >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (g >= m && d <= i3) {
                            return StaggeredGridLayoutManager.this.f0(view);
                        }
                    } else {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.f0(view);
                        }
                        if (g < m || d > i3) {
                            return StaggeredGridLayoutManager.this.f0(view);
                        }
                    }
                }
                i += i4;
            }
            return -1;
        }

        public int i(int i, int i2, boolean z) {
            return h(i, i2, false, false, z);
        }

        public int j() {
            return this.d;
        }

        public int k() {
            int i = this.c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            c();
            return this.c;
        }

        public int l(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            c();
            return this.c;
        }

        public View m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.y && staggeredGridLayoutManager.f0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.y && staggeredGridLayoutManager2.f0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.y && staggeredGridLayoutManager3.f0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.y && staggeredGridLayoutManager4.f0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        public c n(View view) {
            return view.getLayoutParams();
        }

        public int o() {
            int i = this.b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            d();
            return this.b;
        }

        public int p(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            d();
            return this.b;
        }

        public void q() {
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
        }

        public void r(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2 + i;
            }
            int i3 = this.c;
            if (i3 != Integer.MIN_VALUE) {
                this.c = i3 + i;
            }
        }

        public void s() {
            int size = this.a.size();
            View view = (View) this.a.remove(size - 1);
            c n = n(view);
            n.e = null;
            if (n.c() || n.b()) {
                this.d -= StaggeredGridLayoutManager.this.t.e(view);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        public void t() {
            View view = (View) this.a.remove(0);
            c n = n(view);
            n.e = null;
            if (this.a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.d -= StaggeredGridLayoutManager.this.t.e(view);
            }
            this.b = Integer.MIN_VALUE;
        }

        public void u(View view) {
            c n = n(view);
            n.e = this;
            this.a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.d += StaggeredGridLayoutManager.this.t.e(view);
            }
        }

        public void v(int i) {
            this.b = i;
            this.c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.o.d g0 = RecyclerView.o.g0(context, attributeSet, i, i2);
        B2(g0.a);
        D2(g0.b);
        C2(g0.c);
        this.x = new androidx.recyclerview.widget.f();
        U1();
    }

    private int O1(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        return j.a(yVar, this.t, Y1(!this.M), X1(!this.M), this, this.M);
    }

    private int P1(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        return j.b(yVar, this.t, Y1(!this.M), X1(!this.M), this, this.M, this.z);
    }

    private int Q1(RecyclerView.y yVar) {
        if (I() == 0) {
            return 0;
        }
        return j.c(yVar, this.t, Y1(!this.M), X1(!this.M), this, this.M);
    }

    private int R1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.v == 1) ? 1 : Integer.MIN_VALUE : this.v == 0 ? 1 : Integer.MIN_VALUE : this.v == 1 ? -1 : Integer.MIN_VALUE : this.v == 0 ? -1 : Integer.MIN_VALUE : (this.v != 1 && n2()) ? -1 : 1 : (this.v != 1 && n2()) ? 1 : -1;
    }

    private void o2(View view, int i, int i2, boolean z) {
        i(view, this.J);
        c layoutParams = view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.J;
        int L2 = L2(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.J;
        int L22 = L2(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (z ? D1(view, L2, L22, layoutParams) : B1(view, L2, L22, layoutParams)) {
            view.measure(L2, L22);
        }
    }

    private void y2() {
        if (this.v == 1 || !n2()) {
            this.z = this.y;
        } else {
            this.z = !this.y;
        }
    }

    public void A0(int i) {
        super.A0(i);
        for (int i2 = 0; i2 < this.r; i2++) {
            this.s[i2].r(i);
        }
    }

    public final void A2(int i) {
        androidx.recyclerview.widget.f fVar = this.x;
        fVar.e = i;
        fVar.d = this.z != (i == -1) ? -1 : 1;
    }

    public void B0(int i) {
        super.B0(i);
        for (int i2 = 0; i2 < this.r; i2++) {
            this.s[i2].r(i);
        }
    }

    public void B2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        f(null);
        if (i == this.v) {
            return;
        }
        this.v = i;
        h hVar = this.t;
        this.t = this.u;
        this.u = hVar;
        q1();
    }

    public RecyclerView.p C() {
        return this.v == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public void C2(boolean z) {
        f(null);
        e eVar = this.H;
        if (eVar != null && eVar.h != z) {
            eVar.h = z;
        }
        this.y = z;
        q1();
    }

    public RecyclerView.p D(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public void D2(int i) {
        f(null);
        if (i != this.r) {
            m2();
            this.r = i;
            this.A = new BitSet(this.r);
            this.s = new f[this.r];
            for (int i2 = 0; i2 < this.r; i2++) {
                this.s[i2] = new f(i2);
            }
            q1();
        }
    }

    public RecyclerView.p E(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public final void E2(int i, int i2) {
        for (int i3 = 0; i3 < this.r; i3++) {
            if (!this.s[i3].a.isEmpty()) {
                K2(this.s[i3], i, i2);
            }
        }
    }

    public boolean F1() {
        return this.H == null;
    }

    public final boolean F2(RecyclerView.y yVar, b bVar) {
        bVar.a = this.F ? a2(yVar.b()) : W1(yVar.b());
        bVar.b = Integer.MIN_VALUE;
        return true;
    }

    public void G0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.G0(recyclerView, uVar);
        l1(this.O);
        for (int i = 0; i < this.r; i++) {
            this.s[i].e();
        }
        recyclerView.requestLayout();
    }

    public final void G1(View view) {
        for (int i = this.r - 1; i >= 0; i--) {
            this.s[i].a(view);
        }
    }

    public boolean G2(RecyclerView.y yVar, b bVar) {
        int i;
        if (!yVar.e() && (i = this.B) != -1) {
            if (i >= 0 && i < yVar.b()) {
                e eVar = this.H;
                if (eVar == null || eVar.a == -1 || eVar.c < 1) {
                    View B = B(this.B);
                    if (B != null) {
                        bVar.a = this.z ? e2() : d2();
                        if (this.C != Integer.MIN_VALUE) {
                            if (bVar.c) {
                                bVar.b = (this.t.i() - this.C) - this.t.d(B);
                            } else {
                                bVar.b = (this.t.m() + this.C) - this.t.g(B);
                            }
                            return true;
                        }
                        if (this.t.e(B) > this.t.n()) {
                            bVar.b = bVar.c ? this.t.i() : this.t.m();
                            return true;
                        }
                        int g = this.t.g(B) - this.t.m();
                        if (g < 0) {
                            bVar.b = -g;
                            return true;
                        }
                        int i2 = this.t.i() - this.t.d(B);
                        if (i2 < 0) {
                            bVar.b = i2;
                            return true;
                        }
                        bVar.b = Integer.MIN_VALUE;
                    } else {
                        int i3 = this.B;
                        bVar.a = i3;
                        int i4 = this.C;
                        if (i4 == Integer.MIN_VALUE) {
                            bVar.c = L1(i3) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i4);
                        }
                        bVar.d = true;
                    }
                } else {
                    bVar.b = Integer.MIN_VALUE;
                    bVar.a = this.B;
                }
                return true;
            }
            this.B = -1;
            this.C = Integer.MIN_VALUE;
        }
        return false;
    }

    public View H0(View view, int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        View A;
        View m;
        if (I() == 0 || (A = A(view)) == null) {
            return null;
        }
        y2();
        int R1 = R1(i);
        if (R1 == Integer.MIN_VALUE) {
            return null;
        }
        c layoutParams = A.getLayoutParams();
        boolean z = layoutParams.f;
        f fVar = layoutParams.e;
        int e2 = R1 == 1 ? e2() : d2();
        I2(e2, yVar);
        A2(R1);
        androidx.recyclerview.widget.f fVar2 = this.x;
        fVar2.c = fVar2.d + e2;
        fVar2.b = (int) (this.t.n() * 0.33333334f);
        androidx.recyclerview.widget.f fVar3 = this.x;
        fVar3.h = true;
        fVar3.a = false;
        V1(uVar, fVar3, yVar);
        this.F = this.z;
        if (!z && (m = fVar.m(e2, R1)) != null && m != A) {
            return m;
        }
        if (r2(R1)) {
            for (int i2 = this.r - 1; i2 >= 0; i2--) {
                View m2 = this.s[i2].m(e2, R1);
                if (m2 != null && m2 != A) {
                    return m2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.r; i3++) {
                View m3 = this.s[i3].m(e2, R1);
                if (m3 != null && m3 != A) {
                    return m3;
                }
            }
        }
        boolean z2 = (this.y ^ true) == (R1 == -1);
        if (!z) {
            View B = B(z2 ? fVar.f() : fVar.g());
            if (B != null && B != A) {
                return B;
            }
        }
        if (r2(R1)) {
            for (int i4 = this.r - 1; i4 >= 0; i4--) {
                if (i4 != fVar.e) {
                    View B2 = B(z2 ? this.s[i4].f() : this.s[i4].g());
                    if (B2 != null && B2 != A) {
                        return B2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.r; i5++) {
                View B3 = B(z2 ? this.s[i5].f() : this.s[i5].g());
                if (B3 != null && B3 != A) {
                    return B3;
                }
            }
        }
        return null;
    }

    public final void H1(b bVar) {
        e eVar = this.H;
        int i = eVar.c;
        if (i > 0) {
            if (i == this.r) {
                for (int i2 = 0; i2 < this.r; i2++) {
                    this.s[i2].e();
                    e eVar2 = this.H;
                    int i3 = eVar2.d[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += eVar2.i ? this.t.i() : this.t.m();
                    }
                    this.s[i2].v(i3);
                }
            } else {
                eVar.b();
                e eVar3 = this.H;
                eVar3.a = eVar3.b;
            }
        }
        e eVar4 = this.H;
        this.G = eVar4.j;
        C2(eVar4.h);
        y2();
        e eVar5 = this.H;
        int i4 = eVar5.a;
        if (i4 != -1) {
            this.B = i4;
            bVar.c = eVar5.i;
        } else {
            bVar.c = this.z;
        }
        if (eVar5.e > 1) {
            d dVar = this.D;
            dVar.a = eVar5.f;
            dVar.b = eVar5.g;
        }
    }

    public void H2(RecyclerView.y yVar, b bVar) {
        if (G2(yVar, bVar) || F2(yVar, bVar)) {
            return;
        }
        bVar.a();
        bVar.a = 0;
    }

    public void I0(AccessibilityEvent accessibilityEvent) {
        super.I0(accessibilityEvent);
        if (I() > 0) {
            View Y1 = Y1(false);
            View X1 = X1(false);
            if (Y1 == null || X1 == null) {
                return;
            }
            int f0 = f0(Y1);
            int f02 = f0(X1);
            if (f0 < f02) {
                accessibilityEvent.setFromIndex(f0);
                accessibilityEvent.setToIndex(f02);
            } else {
                accessibilityEvent.setFromIndex(f02);
                accessibilityEvent.setToIndex(f0);
            }
        }
    }

    public boolean I1() {
        int l = this.s[0].l(Integer.MIN_VALUE);
        for (int i = 1; i < this.r; i++) {
            if (this.s[i].l(Integer.MIN_VALUE) != l) {
                return false;
            }
        }
        return true;
    }

    public final void I2(int i, RecyclerView.y yVar) {
        int i2;
        int i3;
        int c2;
        androidx.recyclerview.widget.f fVar = this.x;
        boolean z = false;
        fVar.b = 0;
        fVar.c = i;
        if (!v0() || (c2 = yVar.c()) == -1) {
            i2 = 0;
            i3 = 0;
        } else {
            if (this.z == (c2 < i)) {
                i2 = this.t.n();
                i3 = 0;
            } else {
                i3 = this.t.n();
                i2 = 0;
            }
        }
        if (L()) {
            this.x.f = this.t.m() - i3;
            this.x.g = this.t.i() + i2;
        } else {
            this.x.g = this.t.h() + i2;
            this.x.f = -i3;
        }
        androidx.recyclerview.widget.f fVar2 = this.x;
        fVar2.h = false;
        fVar2.a = true;
        if (this.t.k() == 0 && this.t.h() == 0) {
            z = true;
        }
        fVar2.i = z;
    }

    public boolean J1() {
        int p = this.s[0].p(Integer.MIN_VALUE);
        for (int i = 1; i < this.r; i++) {
            if (this.s[i].p(Integer.MIN_VALUE) != p) {
                return false;
            }
        }
        return true;
    }

    public void J2(int i) {
        this.w = i / this.r;
        this.I = View.MeasureSpec.makeMeasureSpec(i, this.u.k());
    }

    public final void K1(View view, c cVar, androidx.recyclerview.widget.f fVar) {
        if (fVar.e == 1) {
            if (cVar.f) {
                G1(view);
                return;
            } else {
                cVar.e.a(view);
                return;
            }
        }
        if (cVar.f) {
            t2(view);
        } else {
            cVar.e.u(view);
        }
    }

    public final void K2(f fVar, int i, int i2) {
        int j = fVar.j();
        if (i == -1) {
            if (fVar.o() + j <= i2) {
                this.A.set(fVar.e, false);
            }
        } else if (fVar.k() - j >= i2) {
            this.A.set(fVar.e, false);
        }
    }

    public final int L1(int i) {
        if (I() == 0) {
            return this.z ? 1 : -1;
        }
        return (i < d2()) != this.z ? -1 : 1;
    }

    public final int L2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public int M(RecyclerView.u uVar, RecyclerView.y yVar) {
        return this.v == 1 ? this.r : super.M(uVar, yVar);
    }

    public boolean M1() {
        int d2;
        int e2;
        if (I() == 0 || this.E == 0 || !p0()) {
            return false;
        }
        if (this.z) {
            d2 = e2();
            e2 = d2();
        } else {
            d2 = d2();
            e2 = e2();
        }
        if (d2 == 0 && l2() != null) {
            this.D.b();
            r1();
            q1();
            return true;
        }
        if (!this.L) {
            return false;
        }
        int i = this.z ? -1 : 1;
        int i2 = e2 + 1;
        d.a e3 = this.D.e(d2, i2, i, true);
        if (e3 == null) {
            this.L = false;
            this.D.d(i2);
            return false;
        }
        d.a e4 = this.D.e(d2, e3.a, i * (-1), true);
        if (e4 == null) {
            this.D.d(e3.a);
        } else {
            this.D.d(e4.a + 1);
        }
        r1();
        q1();
        return true;
    }

    public void N0(RecyclerView.u uVar, RecyclerView.y yVar, View view, v vVar) {
        c layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.M0(view, vVar);
            return;
        }
        c cVar = layoutParams;
        if (this.v == 0) {
            int e2 = cVar.e();
            boolean z = cVar.f;
            vVar.j0(v.f.a(e2, z ? this.r : 1, -1, -1, z, false));
        } else {
            int e3 = cVar.e();
            boolean z2 = cVar.f;
            vVar.j0(v.f.a(-1, -1, e3, z2 ? this.r : 1, z2, false));
        }
    }

    public final boolean N1(f fVar) {
        if (this.z) {
            if (fVar.k() < this.t.i()) {
                ArrayList arrayList = fVar.a;
                return !fVar.n((View) arrayList.get(arrayList.size() - 1)).f;
            }
        } else if (fVar.o() > this.t.m()) {
            return !fVar.n((View) fVar.a.get(0)).f;
        }
        return false;
    }

    public void P0(RecyclerView recyclerView, int i, int i2) {
        k2(i, i2, 1);
    }

    public void Q0(RecyclerView recyclerView) {
        this.D.b();
        q1();
    }

    public void R0(RecyclerView recyclerView, int i, int i2, int i3) {
        k2(i, i2, 8);
    }

    public void S0(RecyclerView recyclerView, int i, int i2) {
        k2(i, i2, 2);
    }

    public final d.a S1(int i) {
        d.a aVar = new d.a();
        aVar.c = new int[this.r];
        for (int i2 = 0; i2 < this.r; i2++) {
            aVar.c[i2] = i - this.s[i2].l(i);
        }
        return aVar;
    }

    public final d.a T1(int i) {
        d.a aVar = new d.a();
        aVar.c = new int[this.r];
        for (int i2 = 0; i2 < this.r; i2++) {
            aVar.c[i2] = this.s[i2].p(i) - i;
        }
        return aVar;
    }

    public void U0(RecyclerView recyclerView, int i, int i2, Object obj) {
        k2(i, i2, 4);
    }

    public final void U1() {
        this.t = h.b(this, this.v);
        this.u = h.b(this, 1 - this.v);
    }

    public void V0(RecyclerView.u uVar, RecyclerView.y yVar) {
        q2(uVar, yVar, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final int V1(RecyclerView.u uVar, androidx.recyclerview.widget.f fVar, RecyclerView.y yVar) {
        f fVar2;
        int e2;
        int i;
        int i2;
        int e3;
        boolean z;
        ?? r9 = 0;
        this.A.set(0, this.r, true);
        int i3 = this.x.i ? fVar.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : fVar.e == 1 ? fVar.g + fVar.b : fVar.f - fVar.b;
        E2(fVar.e, i3);
        int i4 = this.z ? this.t.i() : this.t.m();
        boolean z2 = false;
        while (fVar.a(yVar) && (this.x.i || !this.A.isEmpty())) {
            View b2 = fVar.b(uVar);
            c layoutParams = b2.getLayoutParams();
            int a2 = layoutParams.a();
            int g = this.D.g(a2);
            boolean z3 = g == -1 ? true : r9;
            if (z3) {
                fVar2 = layoutParams.f ? this.s[r9] : j2(fVar);
                this.D.n(a2, fVar2);
            } else {
                fVar2 = this.s[g];
            }
            f fVar3 = fVar2;
            layoutParams.e = fVar3;
            if (fVar.e == 1) {
                c(b2);
            } else {
                d(b2, r9);
            }
            p2(b2, layoutParams, r9);
            if (fVar.e == 1) {
                int f2 = layoutParams.f ? f2(i4) : fVar3.l(i4);
                int e4 = this.t.e(b2) + f2;
                if (z3 && layoutParams.f) {
                    d.a S1 = S1(f2);
                    S1.b = -1;
                    S1.a = a2;
                    this.D.a(S1);
                }
                i = e4;
                e2 = f2;
            } else {
                int i22 = layoutParams.f ? i2(i4) : fVar3.p(i4);
                e2 = i22 - this.t.e(b2);
                if (z3 && layoutParams.f) {
                    d.a T1 = T1(i22);
                    T1.b = 1;
                    T1.a = a2;
                    this.D.a(T1);
                }
                i = i22;
            }
            if (layoutParams.f && fVar.d == -1) {
                if (z3) {
                    this.L = true;
                } else {
                    if (!(fVar.e == 1 ? I1() : J1())) {
                        d.a f3 = this.D.f(a2);
                        if (f3 != null) {
                            f3.d = true;
                        }
                        this.L = true;
                    }
                }
            }
            K1(b2, layoutParams, fVar);
            if (n2() && this.v == 1) {
                int i5 = layoutParams.f ? this.u.i() : this.u.i() - (((this.r - 1) - fVar3.e) * this.w);
                e3 = i5;
                i2 = i5 - this.u.e(b2);
            } else {
                int m = layoutParams.f ? this.u.m() : (fVar3.e * this.w) + this.u.m();
                i2 = m;
                e3 = this.u.e(b2) + m;
            }
            if (this.v == 1) {
                x0(b2, i2, e2, e3, i);
            } else {
                x0(b2, e2, i2, i, e3);
            }
            if (layoutParams.f) {
                E2(this.x.e, i3);
            } else {
                K2(fVar3, this.x.e, i3);
            }
            u2(uVar, this.x);
            if (!this.x.h || !b2.hasFocusable()) {
                z = false;
            } else if (layoutParams.f) {
                this.A.clear();
                z = false;
            } else {
                z = false;
                this.A.set(fVar3.e, false);
            }
            r9 = z;
            z2 = true;
        }
        int i6 = r9;
        if (!z2) {
            u2(uVar, this.x);
        }
        int m2 = this.x.e == -1 ? this.t.m() - i2(this.t.m()) : f2(this.t.i()) - this.t.i();
        return m2 > 0 ? Math.min(fVar.b, m2) : i6;
    }

    public void W0(RecyclerView.y yVar) {
        super.W0(yVar);
        this.B = -1;
        this.C = Integer.MIN_VALUE;
        this.H = null;
        this.K.c();
    }

    public final int W1(int i) {
        int I = I();
        for (int i2 = 0; i2 < I; i2++) {
            int f0 = f0(H(i2));
            if (f0 >= 0 && f0 < i) {
                return f0;
            }
        }
        return 0;
    }

    public View X1(boolean z) {
        int m = this.t.m();
        int i = this.t.i();
        View view = null;
        for (int I = I() - 1; I >= 0; I--) {
            View H = H(I);
            int g = this.t.g(H);
            int d2 = this.t.d(H);
            if (d2 > m && g < i) {
                if (d2 <= i || !z) {
                    return H;
                }
                if (view == null) {
                    view = H;
                }
            }
        }
        return view;
    }

    public View Y1(boolean z) {
        int m = this.t.m();
        int i = this.t.i();
        int I = I();
        View view = null;
        for (int i2 = 0; i2 < I; i2++) {
            View H = H(i2);
            int g = this.t.g(H);
            if (this.t.d(H) > m && g < i) {
                if (g >= m || !z) {
                    return H;
                }
                if (view == null) {
                    view = H;
                }
            }
        }
        return view;
    }

    public int Z1() {
        View X1 = this.z ? X1(true) : Y1(true);
        if (X1 == null) {
            return -1;
        }
        return f0(X1);
    }

    public void a1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.H = (e) parcelable;
            q1();
        }
    }

    public final int a2(int i) {
        for (int I = I() - 1; I >= 0; I--) {
            int f0 = f0(H(I));
            if (f0 >= 0 && f0 < i) {
                return f0;
            }
        }
        return 0;
    }

    public Parcelable b1() {
        int p;
        int m;
        int[] iArr;
        if (this.H != null) {
            return new e(this.H);
        }
        e eVar = new e();
        eVar.h = this.y;
        eVar.i = this.F;
        eVar.j = this.G;
        d dVar = this.D;
        if (dVar == null || (iArr = dVar.a) == null) {
            eVar.e = 0;
        } else {
            eVar.f = iArr;
            eVar.e = iArr.length;
            eVar.g = dVar.b;
        }
        if (I() > 0) {
            eVar.a = this.F ? e2() : d2();
            eVar.b = Z1();
            int i = this.r;
            eVar.c = i;
            eVar.d = new int[i];
            for (int i2 = 0; i2 < this.r; i2++) {
                if (this.F) {
                    p = this.s[i2].l(Integer.MIN_VALUE);
                    if (p != Integer.MIN_VALUE) {
                        m = this.t.i();
                        p -= m;
                    }
                } else {
                    p = this.s[i2].p(Integer.MIN_VALUE);
                    if (p != Integer.MIN_VALUE) {
                        m = this.t.m();
                        p -= m;
                    }
                }
                eVar.d[i2] = p;
            }
        } else {
            eVar.a = -1;
            eVar.b = -1;
            eVar.c = 0;
        }
        return eVar;
    }

    public final void b2(RecyclerView.u uVar, RecyclerView.y yVar, boolean z) {
        int i;
        int f2 = f2(Integer.MIN_VALUE);
        if (f2 != Integer.MIN_VALUE && (i = this.t.i() - f2) > 0) {
            int i2 = i - (-z2(-i, uVar, yVar));
            if (!z || i2 <= 0) {
                return;
            }
            this.t.r(i2);
        }
    }

    public void c1(int i) {
        if (i == 0) {
            M1();
        }
    }

    public final void c2(RecyclerView.u uVar, RecyclerView.y yVar, boolean z) {
        int m;
        int i2 = i2(Integer.MAX_VALUE);
        if (i2 != Integer.MAX_VALUE && (m = i2 - this.t.m()) > 0) {
            int z2 = m - z2(m, uVar, yVar);
            if (!z || z2 <= 0) {
                return;
            }
            this.t.r(-z2);
        }
    }

    public int d2() {
        if (I() == 0) {
            return 0;
        }
        return f0(H(0));
    }

    public int e2() {
        int I = I();
        if (I == 0) {
            return 0;
        }
        return f0(H(I - 1));
    }

    public void f(String str) {
        if (this.H == null) {
            super.f(str);
        }
    }

    public final int f2(int i) {
        int l = this.s[0].l(i);
        for (int i2 = 1; i2 < this.r; i2++) {
            int l2 = this.s[i2].l(i);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    public final int g2(int i) {
        int p = this.s[0].p(i);
        for (int i2 = 1; i2 < this.r; i2++) {
            int p2 = this.s[i2].p(i);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    public final int h2(int i) {
        int l = this.s[0].l(i);
        for (int i2 = 1; i2 < this.r; i2++) {
            int l2 = this.s[i2].l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    public int i0(RecyclerView.u uVar, RecyclerView.y yVar) {
        return this.v == 0 ? this.r : super.i0(uVar, yVar);
    }

    public final int i2(int i) {
        int p = this.s[0].p(i);
        for (int i2 = 1; i2 < this.r; i2++) {
            int p2 = this.s[i2].p(i);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    public boolean j() {
        return this.v == 0;
    }

    public final f j2(androidx.recyclerview.widget.f fVar) {
        int i;
        int i2;
        int i3;
        if (r2(fVar.e)) {
            i2 = this.r - 1;
            i = -1;
            i3 = -1;
        } else {
            i = this.r;
            i2 = 0;
            i3 = 1;
        }
        f fVar2 = null;
        if (fVar.e == 1) {
            int m = this.t.m();
            int i4 = Integer.MAX_VALUE;
            while (i2 != i) {
                f fVar3 = this.s[i2];
                int l = fVar3.l(m);
                if (l < i4) {
                    fVar2 = fVar3;
                    i4 = l;
                }
                i2 += i3;
            }
            return fVar2;
        }
        int i5 = this.t.i();
        int i6 = Integer.MIN_VALUE;
        while (i2 != i) {
            f fVar4 = this.s[i2];
            int p = fVar4.p(i5);
            if (p > i6) {
                fVar2 = fVar4;
                i6 = p;
            }
            i2 += i3;
        }
        return fVar2;
    }

    public boolean k() {
        return this.v == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.z
            if (r0 == 0) goto L9
            int r0 = r6.e2()
            goto Ld
        L9:
            int r0 = r6.d2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.D
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.D
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.D
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.D
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.D
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            return
        L45:
            boolean r7 = r6.z
            if (r7 == 0) goto L4e
            int r7 = r6.d2()
            goto L52
        L4e:
            int r7 = r6.e2()
        L52:
            if (r3 > r7) goto L57
            r6.q1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.k2(int, int, int):void");
    }

    public boolean l(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View l2() {
        /*
            r12 = this;
            int r0 = r12.I()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.r
            r2.<init>(r3)
            int r3 = r12.r
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.v
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.n2()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.z
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.H(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            int r9 = r9.e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            boolean r9 = r12.N1(r9)
            if (r9 == 0) goto L4b
            return r7
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            int r9 = r9.e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.H(r9)
            boolean r10 = r12.z
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.h r10 = r12.t
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.h r11 = r12.t
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            return r7
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.h r10 = r12.t
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.h r11 = r12.t
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            return r7
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.e
            int r8 = r8.e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.e
            int r9 = r9.e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.l2():android.view.View");
    }

    public void m2() {
        this.D.b();
        q1();
    }

    public void n(int i, int i2, RecyclerView.y yVar, RecyclerView.o.c cVar) {
        int l;
        int i3;
        if (this.v != 0) {
            i = i2;
        }
        if (I() == 0 || i == 0) {
            return;
        }
        s2(i, yVar);
        int[] iArr = this.N;
        if (iArr == null || iArr.length < this.r) {
            this.N = new int[this.r];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.r; i5++) {
            androidx.recyclerview.widget.f fVar = this.x;
            if (fVar.d == -1) {
                l = fVar.f;
                i3 = this.s[i5].p(l);
            } else {
                l = this.s[i5].l(fVar.g);
                i3 = this.x.g;
            }
            int i6 = l - i3;
            if (i6 >= 0) {
                this.N[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.N, 0, i4);
        for (int i7 = 0; i7 < i4 && this.x.a(yVar); i7++) {
            cVar.a(this.x.c, this.N[i7]);
            androidx.recyclerview.widget.f fVar2 = this.x;
            fVar2.c += fVar2.d;
        }
    }

    public boolean n2() {
        return X() == 1;
    }

    public int p(RecyclerView.y yVar) {
        return O1(yVar);
    }

    public final void p2(View view, c cVar, boolean z) {
        if (cVar.f) {
            if (this.v == 1) {
                o2(view, this.I, RecyclerView.o.J(V(), W(), e0() + b0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
                return;
            } else {
                o2(view, RecyclerView.o.J(m0(), n0(), c0() + d0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.I, z);
                return;
            }
        }
        if (this.v == 1) {
            o2(view, RecyclerView.o.J(this.w, n0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.o.J(V(), W(), e0() + b0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
        } else {
            o2(view, RecyclerView.o.J(m0(), n0(), c0() + d0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.o.J(this.w, W(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z);
        }
    }

    public int q(RecyclerView.y yVar) {
        return P1(yVar);
    }

    public boolean q0() {
        return this.E != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q2(androidx.recyclerview.widget.RecyclerView.u r9, androidx.recyclerview.widget.RecyclerView.y r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.q2(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y, boolean):void");
    }

    public int r(RecyclerView.y yVar) {
        return Q1(yVar);
    }

    public final boolean r2(int i) {
        if (this.v == 0) {
            return (i == -1) != this.z;
        }
        return ((i == -1) == this.z) == n2();
    }

    public int s(RecyclerView.y yVar) {
        return O1(yVar);
    }

    public void s2(int i, RecyclerView.y yVar) {
        int d2;
        int i2;
        if (i > 0) {
            d2 = e2();
            i2 = 1;
        } else {
            d2 = d2();
            i2 = -1;
        }
        this.x.a = true;
        I2(d2, yVar);
        A2(i2);
        androidx.recyclerview.widget.f fVar = this.x;
        fVar.c = d2 + fVar.d;
        fVar.b = Math.abs(i);
    }

    public int t(RecyclerView.y yVar) {
        return P1(yVar);
    }

    public int t1(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        return z2(i, uVar, yVar);
    }

    public final void t2(View view) {
        for (int i = this.r - 1; i >= 0; i--) {
            this.s[i].u(view);
        }
    }

    public int u(RecyclerView.y yVar) {
        return Q1(yVar);
    }

    public int u1(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        return z2(i, uVar, yVar);
    }

    public final void u2(RecyclerView.u uVar, androidx.recyclerview.widget.f fVar) {
        if (!fVar.a || fVar.i) {
            return;
        }
        if (fVar.b == 0) {
            if (fVar.e == -1) {
                v2(uVar, fVar.g);
                return;
            } else {
                w2(uVar, fVar.f);
                return;
            }
        }
        if (fVar.e != -1) {
            int h2 = h2(fVar.g) - fVar.g;
            w2(uVar, h2 < 0 ? fVar.f : Math.min(h2, fVar.b) + fVar.f);
        } else {
            int i = fVar.f;
            int g2 = i - g2(i);
            v2(uVar, g2 < 0 ? fVar.g : fVar.g - Math.min(g2, fVar.b));
        }
    }

    public final void v2(RecyclerView.u uVar, int i) {
        for (int I = I() - 1; I >= 0; I--) {
            View H = H(I);
            if (this.t.g(H) < i || this.t.q(H) < i) {
                return;
            }
            c layoutParams = H.getLayoutParams();
            if (layoutParams.f) {
                for (int i2 = 0; i2 < this.r; i2++) {
                    if (this.s[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.r; i3++) {
                    this.s[i3].s();
                }
            } else if (layoutParams.e.a.size() == 1) {
                return;
            } else {
                layoutParams.e.s();
            }
            j1(H, uVar);
        }
    }

    public final void w2(RecyclerView.u uVar, int i) {
        while (I() > 0) {
            View H = H(0);
            if (this.t.d(H) > i || this.t.p(H) > i) {
                return;
            }
            c layoutParams = H.getLayoutParams();
            if (layoutParams.f) {
                for (int i2 = 0; i2 < this.r; i2++) {
                    if (this.s[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.r; i3++) {
                    this.s[i3].t();
                }
            } else if (layoutParams.e.a.size() == 1) {
                return;
            } else {
                layoutParams.e.t();
            }
            j1(H, uVar);
        }
    }

    public final void x2() {
        if (this.u.k() == 1073741824) {
            return;
        }
        int I = I();
        float f2 = 0.0f;
        for (int i = 0; i < I; i++) {
            View H = H(i);
            float e2 = this.u.e(H);
            if (e2 >= f2) {
                if (H.getLayoutParams().f()) {
                    e2 = (e2 * 1.0f) / this.r;
                }
                f2 = Math.max(f2, e2);
            }
        }
        int i2 = this.w;
        int round = Math.round(f2 * this.r);
        if (this.u.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.u.n());
        }
        J2(round);
        if (this.w == i2) {
            return;
        }
        for (int i3 = 0; i3 < I; i3++) {
            View H2 = H(i3);
            c layoutParams = H2.getLayoutParams();
            if (!layoutParams.f) {
                if (n2() && this.v == 1) {
                    int i4 = this.r;
                    int i5 = layoutParams.e.e;
                    H2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.w) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = layoutParams.e.e;
                    int i7 = this.w * i6;
                    int i8 = i6 * i2;
                    if (this.v == 1) {
                        H2.offsetLeftAndRight(i7 - i8);
                    } else {
                        H2.offsetTopAndBottom(i7 - i8);
                    }
                }
            }
        }
    }

    public void y1(Rect rect, int i, int i2) {
        int m;
        int m2;
        int c0 = c0() + d0();
        int e0 = e0() + b0();
        if (this.v == 1) {
            m2 = RecyclerView.o.m(i2, rect.height() + e0, Z());
            m = RecyclerView.o.m(i, (this.w * this.r) + c0, a0());
        } else {
            m = RecyclerView.o.m(i, rect.width() + c0, a0());
            m2 = RecyclerView.o.m(i2, (this.w * this.r) + e0, Z());
        }
        x1(m, m2);
    }

    public int z2(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (I() == 0 || i == 0) {
            return 0;
        }
        s2(i, yVar);
        int V1 = V1(uVar, this.x, yVar);
        if (this.x.b >= V1) {
            i = i < 0 ? -V1 : V1;
        }
        this.t.r(-i);
        this.F = this.z;
        androidx.recyclerview.widget.f fVar = this.x;
        fVar.b = 0;
        u2(uVar, fVar);
        return i;
    }

    public static class d {
        public int[] a;
        public List b;

        public void a(a aVar) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                a aVar2 = (a) this.b.get(i);
                if (aVar2.a == aVar.a) {
                    this.b.remove(i);
                }
                if (aVar2.a >= aVar.a) {
                    this.b.add(i, aVar);
                    return;
                }
            }
            this.b.add(aVar);
        }

        public void b() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public void c(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[o(i)];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i) {
            List list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.b.get(size)).a >= i) {
                        this.b.remove(size);
                    }
                }
            }
            return h(i);
        }

        public a e(int i, int i2, int i3, boolean z) {
            List list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = (a) this.b.get(i4);
                int i5 = aVar.a;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.b == i3 || (z && aVar.d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i) {
            List list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.b.get(size);
                if (aVar.a == i) {
                    return aVar;
                }
            }
            return null;
        }

        public int g(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        public int h(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = i(i);
            if (i2 == -1) {
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.a.length;
            }
            int i3 = i2 + 1;
            Arrays.fill(this.a, i, i3, -1);
            return i3;
        }

        public final int i(int i) {
            if (this.b == null) {
                return -1;
            }
            a f = f(i);
            if (f != null) {
                this.b.remove(f);
            }
            int size = this.b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                if (((a) this.b.get(i2)).a >= i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return -1;
            }
            a aVar = (a) this.b.get(i2);
            this.b.remove(i2);
            return aVar.a;
        }

        public void j(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.a, i, i3, -1);
            l(i, i2);
        }

        public void k(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m(i, i2);
        }

        public final void l(int i, int i2) {
            List list = this.b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.b.get(size);
                int i3 = aVar.a;
                if (i3 >= i) {
                    aVar.a = i3 + i2;
                }
            }
        }

        public final void m(int i, int i2) {
            List list = this.b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.b.get(size);
                int i4 = aVar.a;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.b.remove(size);
                    } else {
                        aVar.a = i4 - i2;
                    }
                }
            }
        }

        public void n(int i, f fVar) {
            c(i);
            this.a[i] = fVar.e;
        }

        public int o(int i) {
            int length = this.a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        public static class a implements Parcelable {
            public static final Parcelable.Creator CREATOR = new a();
            public int a;
            public int b;
            public int[] c;
            public boolean d;

            public static class a implements Parcelable.Creator {
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i) {
                    return new a[i];
                }
            }

            public a(Parcel parcel) {
                this.a = parcel.readInt();
                this.b = parcel.readInt();
                this.d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int b(int i) {
                int[] iArr = this.c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.c) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.a);
                parcel.writeInt(this.b);
                parcel.writeInt(this.d ? 1 : 0);
                int[] iArr = this.c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.c);
                }
            }

            public a() {
            }
        }
    }
}
