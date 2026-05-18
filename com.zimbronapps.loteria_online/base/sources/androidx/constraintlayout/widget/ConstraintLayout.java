package androidx.constraintlayout.widget;

import B1.d;
import B1.e;
import B1.f;
import B1.h;
import B1.k;
import C1.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static E1.e y;
    public SparseArray a;
    public ArrayList b;
    public f c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public d j;
    public E1.a k;
    public int l;
    public HashMap m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public SparseArray t;
    public c u;
    public int v;
    public int w;
    public ArrayList x;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.b.values().length];
            a = iArr;
            try {
                iArr[e.b.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.b.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.b.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.b.c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class c implements b.b {
        public ConstraintLayout a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public c(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        public final void a() {
            int childCount = this.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.a.getChildAt(i);
            }
            int size = ConstraintLayout.c(this.a).size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((androidx.constraintlayout.widget.c) ConstraintLayout.c(this.a).get(i2)).j(this.a);
                }
            }
        }

        public final void b(B1.e eVar, b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int i;
            int i2;
            int i3;
            if (eVar == null) {
                return;
            }
            if (eVar.X() == 8 && !eVar.l0()) {
                aVar.e = 0;
                aVar.f = 0;
                aVar.g = 0;
                return;
            }
            if (eVar.L() == null) {
                return;
            }
            ConstraintLayout.a(ConstraintLayout.this);
            e.b bVar = aVar.a;
            e.b bVar2 = aVar.b;
            int i4 = aVar.c;
            int i5 = aVar.d;
            int i6 = this.b + this.c;
            int i7 = this.d;
            View view = (View) eVar.s();
            int[] iArr = a.a;
            int i8 = iArr[bVar.ordinal()];
            if (i8 == 1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            } else if (i8 == 2) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
            } else if (i8 == 3) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7 + eVar.B(), -1);
            } else if (i8 != 4) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
                boolean z = eVar.w == 1;
                int i9 = aVar.j;
                if (i9 == b.a.l || i9 == b.a.m) {
                    boolean z2 = view.getMeasuredHeight() == eVar.x();
                    if (aVar.j == b.a.m || !z || ((z && z2) || eVar.p0())) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.Y(), 1073741824);
                    }
                }
            }
            int i10 = iArr[bVar2.ordinal()];
            if (i10 == 1) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
            } else if (i10 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
            } else if (i10 == 3) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6 + eVar.W(), -1);
            } else if (i10 != 4) {
                makeMeasureSpec2 = 0;
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
                boolean z3 = eVar.x == 1;
                int i11 = aVar.j;
                if (i11 == b.a.l || i11 == b.a.m) {
                    boolean z4 = view.getMeasuredWidth() == eVar.Y();
                    if (aVar.j == b.a.m || !z3 || ((z3 && z4) || eVar.q0())) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.x(), 1073741824);
                    }
                }
            }
            f fVar = (f) eVar.L();
            if (fVar != null && k.b(ConstraintLayout.b(ConstraintLayout.this), 256) && view.getMeasuredWidth() == eVar.Y() && view.getMeasuredWidth() < fVar.Y() && view.getMeasuredHeight() == eVar.x() && view.getMeasuredHeight() < fVar.x() && view.getBaseline() == eVar.p() && !eVar.o0() && d(eVar.C(), makeMeasureSpec, eVar.Y()) && d(eVar.D(), makeMeasureSpec2, eVar.x())) {
                aVar.e = eVar.Y();
                aVar.f = eVar.x();
                aVar.g = eVar.p();
                return;
            }
            e.b bVar3 = e.b.c;
            boolean z5 = bVar == bVar3;
            boolean z6 = bVar2 == bVar3;
            e.b bVar4 = e.b.d;
            boolean z7 = bVar2 == bVar4 || bVar2 == e.b.a;
            boolean z8 = bVar == bVar4 || bVar == e.b.a;
            boolean z9 = z5 && eVar.d0 > 0.0f;
            boolean z10 = z6 && eVar.d0 > 0.0f;
            if (view == null) {
                return;
            }
            b layoutParams = view.getLayoutParams();
            int i12 = aVar.j;
            if (i12 != b.a.l && i12 != b.a.m && z5 && eVar.w == 0 && z6 && eVar.x == 0) {
                i3 = -1;
                i2 = 0;
                baseline = 0;
                max = 0;
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                eVar.Y0(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i13 = eVar.z;
                max = i13 > 0 ? Math.max(i13, measuredWidth) : measuredWidth;
                int i14 = eVar.A;
                if (i14 > 0) {
                    max = Math.min(i14, max);
                }
                int i15 = eVar.C;
                if (i15 > 0) {
                    i2 = Math.max(i15, measuredHeight);
                    i = makeMeasureSpec;
                } else {
                    i = makeMeasureSpec;
                    i2 = measuredHeight;
                }
                int i16 = eVar.D;
                if (i16 > 0) {
                    i2 = Math.min(i16, i2);
                }
                int i17 = makeMeasureSpec2;
                if (!k.b(ConstraintLayout.b(ConstraintLayout.this), 1)) {
                    if (z9 && z7) {
                        max = (int) ((i2 * eVar.d0) + 0.5f);
                    } else if (z10 && z8) {
                        i2 = (int) ((max / eVar.d0) + 0.5f);
                    }
                }
                if (measuredWidth != max || measuredHeight != i2) {
                    int makeMeasureSpec3 = measuredWidth != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i;
                    int makeMeasureSpec4 = measuredHeight != i2 ? View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : i17;
                    view.measure(makeMeasureSpec3, makeMeasureSpec4);
                    eVar.Y0(makeMeasureSpec3, makeMeasureSpec4);
                    max = view.getMeasuredWidth();
                    i2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i3 = -1;
            }
            boolean z11 = baseline != i3;
            aVar.i = (max == aVar.c && i2 == aVar.d) ? false : true;
            if (layoutParams.g0) {
                z11 = true;
            }
            if (z11 && baseline != -1 && eVar.p() != baseline) {
                aVar.i = true;
            }
            aVar.e = max;
            aVar.f = i2;
            aVar.h = z11;
            aVar.g = baseline;
            ConstraintLayout.a(ConstraintLayout.this);
        }

        public void c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.b = i3;
            this.c = i4;
            this.d = i5;
            this.e = i6;
            this.f = i;
            this.g = i2;
        }

        public final boolean d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            return View.MeasureSpec.getMode(i2) == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0) && i3 == View.MeasureSpec.getSize(i2);
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new f();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = new SparseArray();
        this.u = new c(this);
        this.v = 0;
        this.w = 0;
        r(attributeSet, 0, 0);
    }

    public static /* synthetic */ u1.e a(ConstraintLayout constraintLayout) {
        constraintLayout.getClass();
        return null;
    }

    public static /* synthetic */ int b(ConstraintLayout constraintLayout) {
        return constraintLayout.i;
    }

    public static /* synthetic */ ArrayList c(ConstraintLayout constraintLayout) {
        return constraintLayout.b;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    public static E1.e getSharedValues() {
        if (y == null) {
            y = new E1.e();
        }
        return y;
    }

    public final void A(B1.e eVar, b bVar, SparseArray sparseArray, int i, d.a aVar) {
        View view = (View) this.a.get(i);
        B1.e eVar2 = (B1.e) sparseArray.get(i);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.g0 = true;
        d.a aVar2 = d.a.f;
        if (aVar == aVar2) {
            b layoutParams = view.getLayoutParams();
            layoutParams.g0 = true;
            layoutParams.v0.N0(true);
        }
        eVar.o(aVar2).b(eVar2.o(aVar), bVar.D, bVar.C, true);
        eVar.N0(true);
        eVar.o(d.a.c).q();
        eVar.o(d.a.e).q();
    }

    public final boolean B() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            x();
        }
        return z;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    public void d(boolean z, View view, B1.e eVar, b bVar, SparseArray sparseArray) {
        B1.e eVar2;
        B1.e eVar3;
        B1.e eVar4;
        B1.e eVar5;
        int i;
        bVar.a();
        bVar.w0 = false;
        eVar.m1(view.getVisibility());
        if (bVar.j0) {
            eVar.W0(true);
            eVar.m1(8);
        }
        eVar.E0(view);
        if (view instanceof androidx.constraintlayout.widget.c) {
            ((androidx.constraintlayout.widget.c) view).h(eVar, this.c.U1());
        }
        if (bVar.h0) {
            h hVar = (h) eVar;
            int i2 = bVar.s0;
            int i3 = bVar.t0;
            float f = bVar.u0;
            if (f != -1.0f) {
                hVar.C1(f);
                return;
            } else if (i2 != -1) {
                hVar.A1(i2);
                return;
            } else {
                if (i3 != -1) {
                    hVar.B1(i3);
                    return;
                }
                return;
            }
        }
        int i4 = bVar.l0;
        int i5 = bVar.m0;
        int i6 = bVar.n0;
        int i7 = bVar.o0;
        int i8 = bVar.p0;
        int i9 = bVar.q0;
        float f2 = bVar.r0;
        int i10 = bVar.p;
        if (i10 != -1) {
            B1.e eVar6 = (B1.e) sparseArray.get(i10);
            if (eVar6 != null) {
                eVar.l(eVar6, bVar.r, bVar.q);
            }
        } else {
            if (i4 != -1) {
                B1.e eVar7 = (B1.e) sparseArray.get(i4);
                if (eVar7 != null) {
                    d.a aVar = d.a.b;
                    eVar.g0(aVar, eVar7, aVar, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i8);
                }
            } else if (i5 != -1 && (eVar2 = (B1.e) sparseArray.get(i5)) != null) {
                eVar.g0(d.a.b, eVar2, d.a.d, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i8);
            }
            if (i6 != -1) {
                B1.e eVar8 = (B1.e) sparseArray.get(i6);
                if (eVar8 != null) {
                    eVar.g0(d.a.d, eVar8, d.a.b, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i9);
                }
            } else if (i7 != -1 && (eVar3 = (B1.e) sparseArray.get(i7)) != null) {
                d.a aVar2 = d.a.d;
                eVar.g0(aVar2, eVar3, aVar2, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i9);
            }
            int i11 = bVar.i;
            if (i11 != -1) {
                B1.e eVar9 = (B1.e) sparseArray.get(i11);
                if (eVar9 != null) {
                    d.a aVar3 = d.a.c;
                    eVar.g0(aVar3, eVar9, aVar3, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.x);
                }
            } else {
                int i12 = bVar.j;
                if (i12 != -1 && (eVar4 = (B1.e) sparseArray.get(i12)) != null) {
                    eVar.g0(d.a.c, eVar4, d.a.e, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.x);
                }
            }
            int i13 = bVar.k;
            if (i13 != -1) {
                B1.e eVar10 = (B1.e) sparseArray.get(i13);
                if (eVar10 != null) {
                    eVar.g0(d.a.e, eVar10, d.a.c, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.z);
                }
            } else {
                int i14 = bVar.l;
                if (i14 != -1 && (eVar5 = (B1.e) sparseArray.get(i14)) != null) {
                    d.a aVar4 = d.a.e;
                    eVar.g0(aVar4, eVar5, aVar4, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.z);
                }
            }
            int i15 = bVar.m;
            if (i15 != -1) {
                A(eVar, bVar, sparseArray, i15, d.a.f);
            } else {
                int i16 = bVar.n;
                if (i16 != -1) {
                    A(eVar, bVar, sparseArray, i16, d.a.c);
                } else {
                    int i17 = bVar.o;
                    if (i17 != -1) {
                        A(eVar, bVar, sparseArray, i17, d.a.e);
                    }
                }
            }
            if (f2 >= 0.0f) {
                eVar.P0(f2);
            }
            float f3 = bVar.H;
            if (f3 >= 0.0f) {
                eVar.g1(f3);
            }
        }
        if (z && ((i = bVar.X) != -1 || bVar.Y != -1)) {
            eVar.e1(i, bVar.Y);
        }
        if (bVar.e0) {
            eVar.S0(e.b.a);
            eVar.n1(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar.S0(e.b.b);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            if (bVar.a0) {
                eVar.S0(e.b.c);
            } else {
                eVar.S0(e.b.d);
            }
            eVar.o(d.a.b).g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            eVar.o(d.a.d).g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            eVar.S0(e.b.c);
            eVar.n1(0);
        }
        if (bVar.f0) {
            eVar.j1(e.b.a);
            eVar.O0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar.j1(e.b.b);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            if (bVar.b0) {
                eVar.j1(e.b.c);
            } else {
                eVar.j1(e.b.d);
            }
            eVar.o(d.a.c).g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            eVar.o(d.a.e).g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            eVar.j1(e.b.c);
            eVar.O0(0);
        }
        eVar.G0(bVar.I);
        eVar.U0(bVar.L);
        eVar.l1(bVar.M);
        eVar.Q0(bVar.N);
        eVar.h1(bVar.O);
        eVar.o1(bVar.d0);
        eVar.T0(bVar.P, bVar.R, bVar.T, bVar.V);
        eVar.k1(bVar.Q, bVar.S, bVar.U, bVar.W);
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((androidx.constraintlayout.widget.c) this.b.get(i)).k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public boolean e(int i, int i2) {
        if (this.x == null) {
            return false;
        }
        View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i2);
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            Iterator it2 = this.c.v1().iterator();
            if (it2.hasNext()) {
                View view = (View) ((B1.e) it2.next()).s();
                view.getId();
                view.getLayoutParams();
                throw null;
            }
        }
        return false;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    public void forceLayout() {
        t();
        super/*android.view.View*/.forceLayout();
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.O1();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.c.o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.c.o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.c.o = "parent";
            }
        }
        if (this.c.t() == null) {
            f fVar = this.c;
            fVar.F0(fVar.o);
            Log.v("ConstraintLayout", " setDebugName " + this.c.t());
        }
        Iterator it = this.c.v1().iterator();
        while (it.hasNext()) {
            B1.e eVar = (B1.e) it.next();
            View view = (View) eVar.s();
            if (view != null) {
                if (eVar.o == null && (id = view.getId()) != -1) {
                    eVar.o = getContext().getResources().getResourceEntryName(id);
                }
                if (eVar.t() == null) {
                    eVar.F0(eVar.o);
                    Log.v("ConstraintLayout", " setDebugName " + eVar.t());
                }
            }
        }
        this.c.P(sb);
        return sb.toString();
    }

    public Object h(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap hashMap = this.m;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.m.get(str);
    }

    public final B1.e l(int i) {
        if (i == 0) {
            return this.c;
        }
        View view = (View) this.a.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        return view.getLayoutParams().v0;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b layoutParams = childAt.getLayoutParams();
            B1.e eVar = layoutParams.v0;
            if ((childAt.getVisibility() != 8 || layoutParams.h0 || layoutParams.i0 || layoutParams.k0 || isInEditMode) && !layoutParams.j0) {
                int Z = eVar.Z();
                int a0 = eVar.a0();
                childAt.layout(Z, a0, eVar.Y() + Z, eVar.x() + a0);
            }
        }
        int size = this.b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((androidx.constraintlayout.widget.c) this.b.get(i6)).i(this);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        boolean e = this.h | e(i, i2);
        this.h = e;
        if (!e) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                if (getChildAt(i3).isLayoutRequested()) {
                    this.h = true;
                    break;
                }
                i3++;
            }
        }
        this.v = i;
        this.w = i2;
        this.c.d2(s());
        if (this.h) {
            this.h = false;
            if (B()) {
                this.c.f2();
            }
        }
        this.c.M1(null);
        w(this.c, this.i, i, i2);
        v(i, i2, this.c.Y(), this.c.x(), this.c.V1(), this.c.T1());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        B1.e q = q(view);
        if ((view instanceof e) && !(q instanceof h)) {
            b layoutParams = view.getLayoutParams();
            h hVar = new h();
            layoutParams.v0 = hVar;
            layoutParams.h0 = true;
            hVar.D1(layoutParams.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.m();
            view.getLayoutParams().i0 = true;
            if (!this.b.contains(cVar)) {
                this.b.add(cVar);
            }
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.x1(q(view));
        this.b.remove(view);
        this.h = true;
    }

    public View p(int i) {
        return (View) this.a.get(i);
    }

    public final B1.e q(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return view.getLayoutParams().v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return view.getLayoutParams().v0;
        }
        return null;
    }

    public final void r(AttributeSet attributeSet, int i, int i2) {
        this.c.E0(this);
        this.c.a2(this.u);
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, E1.d.V0, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == E1.d.Z0) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == E1.d.a1) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == E1.d.X0) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == E1.d.Y0) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == E1.d.n2) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == E1.d.i1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            u(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.k = null;
                        }
                    }
                } else if (index == E1.d.e1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.j = dVar;
                        dVar.h(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.c.b2(this.i);
    }

    public void requestLayout() {
        t();
        super/*android.view.View*/.requestLayout();
    }

    public boolean s() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void setConstraintSet(d dVar) {
        this.j = dVar;
    }

    public void setId(int i) {
        this.a.remove(getId());
        super/*android.view.View*/.setId(i);
        this.a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(E1.b bVar) {
        E1.a aVar = this.k;
        if (aVar != null) {
            aVar.c(bVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        this.c.b2(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t() {
        this.h = true;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
    }

    public void u(int i) {
        this.k = new E1.a(getContext(), this, i);
    }

    public void v(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        c cVar = this.u;
        int i5 = cVar.e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + cVar.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int min = Math.min(this.f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.g, resolveSizeAndState2);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.n = min;
        this.o = min2;
    }

    public void w(f fVar, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i4 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.u.c(i2, i3, max, max2, paddingWidth, i4);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? s() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        z(fVar, mode, i5, mode2, i6);
        fVar.W1(i, mode, i5, mode2, i6, this.n, this.o, max5, max);
    }

    public final void x() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            B1.e q = q(getChildAt(i));
            if (q != null) {
                q.v0();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    y(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    l(childAt.getId()).F0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.l != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).getId();
            }
        }
        d dVar = this.j;
        if (dVar != null) {
            dVar.c(this, true);
        }
        this.c.y1();
        int size = this.b.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                ((androidx.constraintlayout.widget.c) this.b.get(i4)).l(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5);
        }
        this.t.clear();
        this.t.put(0, this.c);
        this.t.put(getId(), this.c);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            this.t.put(childAt2.getId(), q(childAt2));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt3 = getChildAt(i7);
            B1.e q2 = q(childAt3);
            if (q2 != null) {
                b layoutParams = childAt3.getLayoutParams();
                this.c.a(q2);
                d(isInEditMode, childAt3, q2, layoutParams, this.t);
            }
        }
    }

    public void y(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.m == null) {
                this.m = new HashMap();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.m.put(str, num);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e A[PHI: r2
      0x003e: PHI (r2v4 B1.e$b) = (r2v3 B1.e$b), (r2v0 B1.e$b) binds: [B:21:0x004a, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z(B1.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.u
            int r1 = r0.e
            int r0 = r0.d
            B1.e$b r2 = B1.e.b.a
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = r6
            goto L38
        L1a:
            int r9 = r7.f
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            B1.e$b r9 = B1.e.b.b
            if (r3 != 0) goto L18
            int r10 = r7.d
            int r10 = java.lang.Math.max(r6, r10)
            goto L38
        L2e:
            B1.e$b r9 = B1.e.b.b
            if (r3 != 0) goto L38
            int r10 = r7.d
            int r10 = java.lang.Math.max(r6, r10)
        L38:
            if (r11 == r5) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = r6
            goto L5d
        L40:
            int r11 = r7.g
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            B1.e$b r2 = B1.e.b.b
            if (r3 != 0) goto L3e
            int r11 = r7.e
            int r12 = java.lang.Math.max(r6, r11)
            goto L5d
        L53:
            B1.e$b r2 = B1.e.b.b
            if (r3 != 0) goto L5d
            int r11 = r7.e
            int r12 = java.lang.Math.max(r6, r11)
        L5d:
            int r11 = r8.Y()
            if (r10 != r11) goto L69
            int r11 = r8.x()
            if (r12 == r11) goto L6c
        L69:
            r8.S1()
        L6c:
            r8.p1(r6)
            r8.q1(r6)
            int r11 = r7.f
            int r11 = r11 - r0
            r8.a1(r11)
            int r11 = r7.g
            int r11 = r11 - r1
            r8.Z0(r11)
            r8.d1(r6)
            r8.c1(r6)
            r8.S0(r9)
            r8.n1(r10)
            r8.j1(r2)
            r8.O0(r12)
            int r9 = r7.d
            int r9 = r9 - r0
            r8.d1(r9)
            int r9 = r7.e
            int r9 = r9 - r1
            r8.c1(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.z(B1.f, int, int, int, int):void");
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E;
        public boolean F;
        public float G;
        public float H;
        public String I;
        public float J;
        public int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public String c0;
        public boolean d;
        public int d0;
        public int e;
        public boolean e0;
        public int f;
        public boolean f0;
        public int g;
        public boolean g0;
        public int h;
        public boolean h0;
        public int i;
        public boolean i0;
        public int j;
        public boolean j0;
        public int k;
        public boolean k0;
        public int l;
        public int l0;
        public int m;
        public int m0;
        public int n;
        public int n0;
        public int o;
        public int o0;
        public int p;
        public int p0;
        public int q;
        public int q0;
        public float r;
        public float r0;
        public int s;
        public int s0;
        public int t;
        public int t0;
        public int u;
        public float u0;
        public int v;
        public B1.e v0;
        public int w;
        public boolean w0;
        public int x;
        public int y;
        public int z;

        public static class a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(E1.d.Y1, 64);
                sparseIntArray.append(E1.d.B1, 65);
                sparseIntArray.append(E1.d.K1, 8);
                sparseIntArray.append(E1.d.L1, 9);
                sparseIntArray.append(E1.d.N1, 10);
                sparseIntArray.append(E1.d.O1, 11);
                sparseIntArray.append(E1.d.U1, 12);
                sparseIntArray.append(E1.d.T1, 13);
                sparseIntArray.append(E1.d.r1, 14);
                sparseIntArray.append(E1.d.q1, 15);
                sparseIntArray.append(E1.d.m1, 16);
                sparseIntArray.append(E1.d.o1, 52);
                sparseIntArray.append(E1.d.n1, 53);
                sparseIntArray.append(E1.d.s1, 2);
                sparseIntArray.append(E1.d.u1, 3);
                sparseIntArray.append(E1.d.t1, 4);
                sparseIntArray.append(E1.d.d2, 49);
                sparseIntArray.append(E1.d.e2, 50);
                sparseIntArray.append(E1.d.y1, 5);
                sparseIntArray.append(E1.d.z1, 6);
                sparseIntArray.append(E1.d.A1, 7);
                sparseIntArray.append(E1.d.h1, 67);
                sparseIntArray.append(E1.d.W0, 1);
                sparseIntArray.append(E1.d.P1, 17);
                sparseIntArray.append(E1.d.Q1, 18);
                sparseIntArray.append(E1.d.x1, 19);
                sparseIntArray.append(E1.d.w1, 20);
                sparseIntArray.append(E1.d.i2, 21);
                sparseIntArray.append(E1.d.l2, 22);
                sparseIntArray.append(E1.d.j2, 23);
                sparseIntArray.append(E1.d.g2, 24);
                sparseIntArray.append(E1.d.k2, 25);
                sparseIntArray.append(E1.d.h2, 26);
                sparseIntArray.append(E1.d.f2, 55);
                sparseIntArray.append(E1.d.m2, 54);
                sparseIntArray.append(E1.d.G1, 29);
                sparseIntArray.append(E1.d.V1, 30);
                sparseIntArray.append(E1.d.v1, 44);
                sparseIntArray.append(E1.d.I1, 45);
                sparseIntArray.append(E1.d.X1, 46);
                sparseIntArray.append(E1.d.H1, 47);
                sparseIntArray.append(E1.d.W1, 48);
                sparseIntArray.append(E1.d.k1, 27);
                sparseIntArray.append(E1.d.j1, 28);
                sparseIntArray.append(E1.d.Z1, 31);
                sparseIntArray.append(E1.d.C1, 32);
                sparseIntArray.append(E1.d.b2, 33);
                sparseIntArray.append(E1.d.a2, 34);
                sparseIntArray.append(E1.d.c2, 35);
                sparseIntArray.append(E1.d.E1, 36);
                sparseIntArray.append(E1.d.D1, 37);
                sparseIntArray.append(E1.d.F1, 38);
                sparseIntArray.append(E1.d.J1, 39);
                sparseIntArray.append(E1.d.S1, 40);
                sparseIntArray.append(E1.d.M1, 41);
                sparseIntArray.append(E1.d.p1, 42);
                sparseIntArray.append(E1.d.l1, 43);
                sparseIntArray.append(E1.d.R1, 51);
                sparseIntArray.append(E1.d.o2, 66);
            }
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new B1.e();
            this.w0 = false;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof b) {
                b bVar = (b) layoutParams;
                this.a = bVar.a;
                this.b = bVar.b;
                this.c = bVar.c;
                this.d = bVar.d;
                this.e = bVar.e;
                this.f = bVar.f;
                this.g = bVar.g;
                this.h = bVar.h;
                this.i = bVar.i;
                this.j = bVar.j;
                this.k = bVar.k;
                this.l = bVar.l;
                this.m = bVar.m;
                this.n = bVar.n;
                this.o = bVar.o;
                this.p = bVar.p;
                this.q = bVar.q;
                this.r = bVar.r;
                this.s = bVar.s;
                this.t = bVar.t;
                this.u = bVar.u;
                this.v = bVar.v;
                this.w = bVar.w;
                this.x = bVar.x;
                this.y = bVar.y;
                this.z = bVar.z;
                this.A = bVar.A;
                this.B = bVar.B;
                this.C = bVar.C;
                this.D = bVar.D;
                this.G = bVar.G;
                this.H = bVar.H;
                this.I = bVar.I;
                this.J = bVar.J;
                this.K = bVar.K;
                this.L = bVar.L;
                this.M = bVar.M;
                this.N = bVar.N;
                this.O = bVar.O;
                this.a0 = bVar.a0;
                this.b0 = bVar.b0;
                this.P = bVar.P;
                this.Q = bVar.Q;
                this.R = bVar.R;
                this.T = bVar.T;
                this.S = bVar.S;
                this.U = bVar.U;
                this.V = bVar.V;
                this.W = bVar.W;
                this.X = bVar.X;
                this.Y = bVar.Y;
                this.Z = bVar.Z;
                this.e0 = bVar.e0;
                this.f0 = bVar.f0;
                this.g0 = bVar.g0;
                this.h0 = bVar.h0;
                this.l0 = bVar.l0;
                this.m0 = bVar.m0;
                this.n0 = bVar.n0;
                this.o0 = bVar.o0;
                this.p0 = bVar.p0;
                this.q0 = bVar.q0;
                this.r0 = bVar.r0;
                this.c0 = bVar.c0;
                this.d0 = bVar.d0;
                this.v0 = bVar.v0;
                this.E = bVar.E;
                this.F = bVar.F;
            }
        }

        public void a() {
            this.h0 = false;
            this.e0 = true;
            this.f0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.a0) {
                this.e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.b0) {
                this.f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.e0 = false;
                if (i == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.a0 = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f0 = false;
                if (i2 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.b0 = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.h0 = true;
            this.e0 = true;
            this.f0 = true;
            if (!(this.v0 instanceof h)) {
                this.v0 = new h();
            }
            ((h) this.v0).D1(this.Z);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new B1.e();
            this.w0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E1.d.V0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = a.a.get(index);
                switch (i2) {
                    case 1:
                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId;
                        if (resourceId == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.q = obtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                        this.r = f;
                        if (f < 0.0f) {
                            this.r = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId2;
                        if (resourceId2 == -1) {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId4;
                        if (resourceId4 == -1) {
                            this.g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId5;
                        if (resourceId5 == -1) {
                            this.h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 == -1) {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId7;
                        if (resourceId7 == -1) {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId8;
                        if (resourceId8 == -1) {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId9;
                        if (resourceId9 == -1) {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId10;
                        if (resourceId10 == -1) {
                            this.m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 == -1) {
                            this.t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId13;
                        if (resourceId13 == -1) {
                            this.u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.v);
                        this.v = resourceId14;
                        if (resourceId14 == -1) {
                            this.v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 22:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 23:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 24:
                        this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.a0 = obtainStyledAttributes.getBoolean(index, this.a0);
                        break;
                    case 28:
                        this.b0 = obtainStyledAttributes.getBoolean(index, this.b0);
                        break;
                    case 29:
                        this.G = obtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 30:
                        this.H = obtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 31:
                        int i3 = obtainStyledAttributes.getInt(index, 0);
                        this.P = i3;
                        if (i3 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.Q = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case 36:
                        try {
                            this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                d.m(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.L = obtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = obtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = obtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.c0 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.o);
                                this.o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        d.k(this, obtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        d.k(this, obtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.d0 = obtainStyledAttributes.getInt(index, this.d0);
                                        break;
                                    case 67:
                                        this.d = obtainStyledAttributes.getBoolean(index, this.d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public b(int i, int i2) {
            super(i, i2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new B1.e();
            this.w0 = false;
        }
    }
}
