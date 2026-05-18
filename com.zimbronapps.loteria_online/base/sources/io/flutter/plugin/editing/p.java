package io.flutter.plugin.editing;

import R9.L;
import T1.A0;
import T1.Z;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import ca.s;
import ca.x;
import io.flutter.plugin.editing.ImeSyncDeferringInsetsCallback;
import io.flutter.plugin.editing.i;
import io.flutter.plugin.platform.N;
import io.flutter.plugin.platform.u;
import java.util.HashMap;
import p0.O;
import p0.P;
import p0.Q;
import p0.v;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class p implements i.b {
    public final View a;
    public final InputMethodManager b;
    public final AutofillManager c;
    public final s d;
    public final x e;
    public d f = new d(d.a.NO_TARGET, 0);
    public x.b g;
    public SparseArray h;
    public i i;
    public boolean j;
    public InputConnection k;
    public u l;
    public N m;
    public Rect n;
    public ImeSyncDeferringInsetsCallback o;
    public x.e p;
    public boolean q;

    public class a implements ImeSyncDeferringInsetsCallback.b {
        public a() {
        }

        public void a(boolean z) {
            if (z) {
                return;
            }
            p.c(p.this).restartInput(p.a(p.this));
        }
    }

    public class b implements x.f {
        public b() {
        }

        public void a() {
            if (p.d(p.this).a == d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                p.e(p.this);
            } else {
                p pVar = p.this;
                p.f(pVar, p.a(pVar));
            }
        }

        public void b(int i, x.b bVar) {
            p.this.D(i, bVar);
        }

        public void c(int i, boolean z) {
            p.i(p.this, i, z);
        }

        public void d() {
            p.g(p.this);
        }

        public void e(boolean z) {
            if (Build.VERSION.SDK_INT < 26 || p.h(p.this) == null) {
                return;
            }
            if (z) {
                O.a(p.h(p.this));
            } else {
                q.a(p.h(p.this));
            }
        }

        public void f() {
            p.this.m();
        }

        public void g(String str, Bundle bundle) {
            p.this.B(str, bundle);
        }

        public void h(x.e eVar) {
            p pVar = p.this;
            pVar.E(p.a(pVar), eVar);
        }

        public void i(double d, double d2, double[] dArr) {
            p.j(p.this, d, d2, dArr);
        }

        public void show() {
            p pVar = p.this;
            pVar.F(p.a(pVar));
        }
    }

    public class c implements e {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ double[] b;
        public final /* synthetic */ double[] c;

        public c(boolean z, double[] dArr, double[] dArr2) {
            this.a = z;
            this.b = dArr;
            this.c = dArr2;
        }

        public void a(double d, double d2) {
            double d3 = 1.0d;
            if (!this.a) {
                double[] dArr = this.b;
                d3 = 1.0d / (((dArr[3] * d) + (dArr[7] * d2)) + dArr[15]);
            }
            double[] dArr2 = this.b;
            double d4 = ((dArr2[0] * d) + (dArr2[4] * d2) + dArr2[12]) * d3;
            double d5 = ((dArr2[1] * d) + (dArr2[5] * d2) + dArr2[13]) * d3;
            double[] dArr3 = this.c;
            if (d4 < dArr3[0]) {
                dArr3[0] = d4;
            } else if (d4 > dArr3[1]) {
                dArr3[1] = d4;
            }
            if (d5 < dArr3[2]) {
                dArr3[2] = d5;
            } else if (d5 > dArr3[3]) {
                dArr3[3] = d5;
            }
        }
    }

    public static class d {
        public a a;
        public int b;

        public enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public d(a aVar, int i) {
            this.a = aVar;
            this.b = i;
        }
    }

    public interface e {
        void a(double d, double d2);
    }

    public p(View view, x xVar, s sVar, u uVar, N n) {
        this.a = view;
        this.i = new i(null, view);
        this.b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.c = p0.b.a(view.getContext().getSystemService(p0.a.a()));
        } else {
            this.c = null;
        }
        if (i >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.o = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
            this.o.setImeVisibilityListener(new a());
        }
        this.e = xVar;
        xVar.n(new b());
        xVar.k();
        this.d = sVar;
        this.l = uVar;
        uVar.D(this);
        this.m = n;
        n.i(this);
    }

    public static /* synthetic */ View a(p pVar) {
        return pVar.a;
    }

    public static /* synthetic */ InputMethodManager c(p pVar) {
        return pVar.b;
    }

    public static /* synthetic */ d d(p pVar) {
        return pVar.f;
    }

    public static /* synthetic */ void e(p pVar) {
        pVar.y();
    }

    public static /* synthetic */ void f(p pVar, View view) {
        pVar.s(view);
    }

    public static /* synthetic */ void g(p pVar) {
        pVar.x();
    }

    public static /* synthetic */ AutofillManager h(p pVar) {
        return pVar.c;
    }

    public static /* synthetic */ void i(p pVar, int i, boolean z) {
        pVar.C(i, z);
    }

    public static /* synthetic */ void j(p pVar, double d2, double d3, double[] dArr) {
        pVar.A(d2, d3, dArr);
    }

    public static boolean n(x.e eVar, x.e eVar2) {
        int i = eVar.e - eVar.d;
        if (i != eVar2.e - eVar2.d) {
            return true;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (eVar.a.charAt(eVar.d + i2) != eVar2.a.charAt(eVar2.d + i2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int t(ca.x.c r1, boolean r2, boolean r3, boolean r4, boolean r5, ca.x.d r6) {
        /*
            ca.x$g r5 = r1.a
            ca.x$g r0 = ca.x.g.c
            if (r5 != r0) goto L8
            r1 = 4
            return r1
        L8:
            ca.x$g r0 = ca.x.g.f
            if (r5 != r0) goto L1b
            boolean r2 = r1.b
            if (r2 == 0) goto L13
            r2 = 4098(0x1002, float:5.743E-42)
            goto L14
        L13:
            r2 = 2
        L14:
            boolean r1 = r1.c
            if (r1 == 0) goto L1a
            r2 = r2 | 8192(0x2000, float:1.148E-41)
        L1a:
            return r2
        L1b:
            ca.x$g r1 = ca.x.g.g
            if (r5 != r1) goto L21
            r1 = 3
            return r1
        L21:
            ca.x$g r1 = ca.x.g.l
            if (r5 != r1) goto L27
            r1 = 0
            return r1
        L27:
            ca.x$g r1 = ca.x.g.h
            if (r5 != r1) goto L2f
            r1 = 131073(0x20001, float:1.83672E-40)
            goto L5d
        L2f:
            ca.x$g r1 = ca.x.g.i
            if (r5 == r1) goto L5b
            ca.x$g r1 = ca.x.g.n
            if (r5 != r1) goto L38
            goto L5b
        L38:
            ca.x$g r1 = ca.x.g.j
            if (r5 == r1) goto L58
            ca.x$g r1 = ca.x.g.m
            if (r5 != r1) goto L41
            goto L58
        L41:
            ca.x$g r1 = ca.x.g.k
            if (r5 != r1) goto L48
            r1 = 145(0x91, float:2.03E-43)
            goto L5d
        L48:
            ca.x$g r1 = ca.x.g.d
            if (r5 != r1) goto L4f
            r1 = 97
            goto L5d
        L4f:
            ca.x$g r1 = ca.x.g.e
            if (r5 != r1) goto L56
            r1 = 113(0x71, float:1.58E-43)
            goto L5d
        L56:
            r1 = 1
            goto L5d
        L58:
            r1 = 17
            goto L5d
        L5b:
            r1 = 33
        L5d:
            if (r2 == 0) goto L64
            r2 = 524416(0x80080, float:7.34863E-40)
        L62:
            r1 = r1 | r2
            goto L70
        L64:
            if (r3 == 0) goto L6a
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
        L6a:
            if (r4 != 0) goto L70
            r2 = 524432(0x80090, float:7.34886E-40)
            goto L62
        L70:
            ca.x$d r2 = ca.x.d.b
            if (r6 != r2) goto L77
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            goto L84
        L77:
            ca.x$d r2 = ca.x.d.c
            if (r6 != r2) goto L7e
            r1 = r1 | 8192(0x2000, float:1.148E-41)
            goto L84
        L7e:
            ca.x$d r2 = ca.x.d.d
            if (r6 != r2) goto L84
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.p.t(ca.x$c, boolean, boolean, boolean, boolean, ca.x$d):int");
    }

    public final void A(double d2, double d3, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d4 = dArr[12];
        double d5 = dArr[15];
        double d6 = d4 / d5;
        dArr2[1] = d6;
        dArr2[0] = d6;
        double d7 = dArr[13] / d5;
        dArr2[3] = d7;
        dArr2[2] = d7;
        c cVar = new c(z, dArr, dArr2);
        cVar.a(d2, 0.0d);
        cVar.a(d2, d3);
        cVar.a(0.0d, d3);
        double d8 = this.a.getContext().getResources().getDisplayMetrics().density;
        this.n = new Rect((int) (dArr2[0] * d8), (int) (dArr2[2] * d8), (int) Math.ceil(dArr2[1] * d8), (int) Math.ceil(dArr2[3] * d8));
    }

    public void B(String str, Bundle bundle) {
        this.b.sendAppPrivateCommand(this.a, str, bundle);
    }

    public final void C(int i, boolean z) {
        if (!z) {
            this.f = new d(d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i);
            this.k = null;
        } else {
            this.a.requestFocus();
            this.f = new d(d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i);
            this.b.restartInput(this.a);
            this.j = false;
        }
    }

    public void D(int i, x.b bVar) {
        y();
        this.g = bVar;
        this.f = new d(d.a.FRAMEWORK_CLIENT, i);
        this.i.l(this);
        x.b.a aVar = bVar.j;
        this.i = new i(aVar != null ? aVar.c : null, this.a);
        H(bVar);
        this.j = true;
        G();
        this.n = null;
        this.i.a(this);
    }

    public void E(View view, x.e eVar) {
        x.e eVar2;
        if (!this.j && (eVar2 = this.p) != null && eVar2.b()) {
            boolean n = n(this.p, eVar);
            this.j = n;
            if (n) {
                Q9.b.e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.p = eVar;
        this.i.n(eVar);
        if (this.j) {
            this.b.restartInput(view);
            this.j = false;
        }
    }

    public void F(View view) {
        x.c cVar;
        x.b bVar = this.g;
        if (bVar != null && (cVar = bVar.g) != null && cVar.a == x.g.l) {
            s(view);
        } else {
            view.requestFocus();
            this.b.showSoftInput(view, 0);
        }
    }

    public void G() {
        if (this.f.a == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.q = false;
        }
    }

    public final void H(x.b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (bVar == null || bVar.j == null) {
            this.h = null;
            return;
        }
        x.b[] bVarArr = bVar.l;
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        if (bVarArr == null) {
            sparseArray.put(bVar.j.a.hashCode(), bVar);
            return;
        }
        for (x.b bVar2 : bVarArr) {
            x.b.a aVar = bVar2.j;
            if (aVar != null) {
                this.h.put(aVar.a.hashCode(), bVar2);
                P.a(this.c, this.a, aVar.a.hashCode(), p0.u.a(aVar.c.a));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r7 == r1.e) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto Lb
            io.flutter.plugin.editing.i r9 = r8.i
            java.lang.String r9 = r9.toString()
            r8.w(r9)
        Lb:
            io.flutter.plugin.editing.i r9 = r8.i
            int r9 = r9.i()
            io.flutter.plugin.editing.i r10 = r8.i
            int r10 = r10.h()
            io.flutter.plugin.editing.i r11 = r8.i
            int r11 = r11.g()
            io.flutter.plugin.editing.i r0 = r8.i
            int r7 = r0.f()
            io.flutter.plugin.editing.i r0 = r8.i
            java.util.ArrayList r0 = r0.e()
            ca.x$e r1 = r8.p
            if (r1 == 0) goto La7
            io.flutter.plugin.editing.i r1 = r8.i
            java.lang.String r1 = r1.toString()
            ca.x$e r2 = r8.p
            java.lang.String r2 = r2.a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L50
            ca.x$e r1 = r8.p
            int r2 = r1.b
            if (r9 != r2) goto L50
            int r2 = r1.c
            if (r10 != r2) goto L50
            int r2 = r1.d
            if (r11 != r2) goto L50
            int r1 = r1.e
            if (r7 != r1) goto L50
            goto La7
        L50:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send EditingState to flutter: "
            r1.append(r2)
            io.flutter.plugin.editing.i r2 = r8.i
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            Q9.b.f(r2, r1)
            ca.x$b r1 = r8.g
            boolean r1 = r1.e
            if (r1 == 0) goto L81
            ca.x r1 = r8.e
            io.flutter.plugin.editing.p$d r2 = r8.f
            int r2 = r2.b
            r1.q(r2, r0)
            io.flutter.plugin.editing.i r0 = r8.i
            r0.c()
            goto L94
        L81:
            ca.x r0 = r8.e
            io.flutter.plugin.editing.p$d r1 = r8.f
            int r1 = r1.b
            io.flutter.plugin.editing.i r2 = r8.i
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.p(r1, r2, r3, r4, r5, r6)
        L94:
            ca.x$e r6 = new ca.x$e
            io.flutter.plugin.editing.i r0 = r8.i
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.p = r6
            goto Lac
        La7:
            io.flutter.plugin.editing.i r9 = r8.i
            r9.c()
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.p.b(boolean, boolean, boolean):void");
    }

    public void k(SparseArray sparseArray) {
        x.b bVar;
        x.b.a aVar;
        x.b.a aVar2;
        if (Build.VERSION.SDK_INT < 26 || (bVar = this.g) == null || this.h == null || (aVar = bVar.j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < sparseArray.size(); i++) {
            x.b bVar2 = (x.b) this.h.get(sparseArray.keyAt(i));
            if (bVar2 != null && (aVar2 = bVar2.j) != null) {
                String charSequence = v.a(p0.e.a(sparseArray.valueAt(i))).toString();
                x.e eVar = new x.e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (aVar2.a.equals(aVar.a)) {
                    this.i.n(eVar);
                } else {
                    hashMap.put(aVar2.a, eVar);
                }
            }
        }
        this.e.r(this.f.b, hashMap);
    }

    public void l(int i) {
        d dVar = this.f;
        d.a aVar = dVar.a;
        if ((aVar == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW || aVar == d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) && dVar.b == i) {
            this.f = new d(d.a.NO_TARGET, 0);
            y();
            this.b.hideSoftInputFromWindow(this.a.getApplicationWindowToken(), 0);
            this.b.restartInput(this.a);
            this.j = false;
        }
    }

    public void m() {
        if (this.f.a == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.i.l(this);
        y();
        this.g = null;
        H(null);
        this.f = new d(d.a.NO_TARGET, 0);
        G();
        this.n = null;
        A0 x = Z.x(this.a);
        if (x == null || x.q(A0.l.d())) {
            return;
        }
        this.b.restartInput(this.a);
    }

    public InputConnection o(View view, L l, EditorInfo editorInfo) {
        d dVar = this.f;
        d.a aVar = dVar.a;
        if (aVar == d.a.NO_TARGET) {
            this.k = null;
            return null;
        }
        if (aVar == d.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (aVar == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.q) {
                return this.k;
            }
            InputConnection onCreateInputConnection = this.l.h(dVar.b).onCreateInputConnection(editorInfo);
            this.k = onCreateInputConnection;
            return onCreateInputConnection;
        }
        x.b bVar = this.g;
        int t = t(bVar.g, bVar.a, bVar.b, bVar.c, bVar.d, bVar.f);
        editorInfo.inputType = t;
        editorInfo.imeOptions = 33554432;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && !this.g.d) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        Integer num = this.g.h;
        int intValue = num == null ? (t & 131072) != 0 ? 1 : 6 : num.intValue();
        x.b bVar2 = this.g;
        String str = bVar2.i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        if (bVar2.m != null) {
            editorInfo.hintLocales = new LocaleList(this.g.m);
        }
        String[] strArr = this.g.k;
        if (strArr != null) {
            V1.c.d(editorInfo, strArr);
        }
        if (i >= 34) {
            V1.c.g(editorInfo, true);
        }
        h hVar = new h(view, this.f.b, this.e, this.d, l, this.i, editorInfo);
        editorInfo.initialSelStart = this.i.i();
        editorInfo.initialSelEnd = this.i.h();
        this.k = hVar;
        return hVar;
    }

    public void p() {
        this.l.Q();
        this.m.t();
        this.e.n(null);
        y();
        this.i.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.o;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager q() {
        return this.b;
    }

    public boolean r(KeyEvent keyEvent) {
        h hVar;
        if (!q().isAcceptingText() || (hVar = this.k) == null) {
            return false;
        }
        return hVar instanceof h ? hVar.g(keyEvent) : hVar.sendKeyEvent(keyEvent);
    }

    public final void s(View view) {
        y();
        this.b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    public void u() {
        if (this.f.a == d.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.q = true;
        }
    }

    public final boolean v() {
        return this.h != null;
    }

    public final void w(String str) {
        if (Build.VERSION.SDK_INT < 26 || this.c == null || !v()) {
            return;
        }
        P.a(this.c, this.a, this.g.j.a.hashCode(), p0.u.a(str));
    }

    public final void x() {
        if (Build.VERSION.SDK_INT < 26 || this.c == null || !v()) {
            return;
        }
        String str = this.g.j.a;
        int[] iArr = new int[2];
        this.a.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.n);
        rect.offset(iArr[0], iArr[1]);
        Q.a(this.c, this.a, str.hashCode(), rect);
    }

    public final void y() {
        x.b bVar;
        if (Build.VERSION.SDK_INT < 26 || this.c == null || (bVar = this.g) == null || bVar.j == null || !v()) {
            return;
        }
        p0.N.a(this.c, this.a, this.g.j.a.hashCode());
    }

    public void z(ViewStructure viewStructure, int i) {
        Rect rect;
        if (Build.VERSION.SDK_INT < 26 || !v()) {
            return;
        }
        String str = this.g.j.a;
        AutofillId a2 = o.a(viewStructure);
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            int keyAt = this.h.keyAt(i2);
            x.b.a aVar = ((x.b) this.h.valueAt(i2)).j;
            if (aVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i2);
                p0.l.a(newChild, a2, keyAt);
                String[] strArr = aVar.b;
                if (strArr.length > 0) {
                    p0.p.a(newChild, strArr);
                }
                p0.o.a(newChild, 1);
                newChild.setVisibility(0);
                String str2 = aVar.d;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = this.n) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    p0.m.a(newChild, p0.u.a(aVar.c.a));
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.n.height());
                    p0.m.a(newChild, p0.u.a(this.i));
                }
            }
        }
    }
}
