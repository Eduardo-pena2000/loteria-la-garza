package io.flutter.plugin.platform;

import R9.N;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ca.l;
import ca.o;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.TextureRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class u implements o {
    public static Class[] x = {SurfaceView.class};
    public static boolean y = true;
    public static boolean z = true;
    public R9.c b;
    public Context c;
    public R9.B d;
    public TextureRegistry f;
    public io.flutter.plugin.editing.p g;
    public ca.o h;
    public FlutterJNI e = null;
    public int p = 0;
    public boolean q = false;
    public boolean r = true;
    public boolean v = false;
    public final o.e w = new a();
    public final l a = new l();
    public final HashMap j = new HashMap();
    public final io.flutter.plugin.platform.a i = new io.flutter.plugin.platform.a();
    public final HashMap k = new HashMap();
    public final SparseArray n = new SparseArray();
    public final HashSet s = new HashSet();
    public final HashSet t = new HashSet();
    public final SparseArray o = new SparseArray();
    public final SparseArray l = new SparseArray();
    public final SparseArray m = new SparseArray();
    public final R9.N u = R9.N.a();

    public class a implements o.e {
        public a() {
        }

        public static /* synthetic */ void f(a aVar, Z z, float f, o.b bVar) {
            aVar.h(z, f, bVar);
        }

        public void a(int i, int i2) {
            View view;
            if (!u.q(i2)) {
                throw new IllegalStateException("Trying to set unknown direction value: " + i2 + "(view id: " + i + ")");
            }
            if (u.this.k(i)) {
                view = ((Z) u.this.j.get(Integer.valueOf(i))).g();
            } else {
                i iVar = (i) u.B(u.this).get(i);
                if (iVar == null) {
                    Q9.b.b("PlatformViewsController", "Setting direction to an unknown view with id: " + i);
                    return;
                }
                view = iVar.getView();
            }
            if (view != null) {
                view.setLayoutDirection(i2);
                return;
            }
            Q9.b.b("PlatformViewsController", "Setting direction to a null view with id: " + i);
        }

        public void b(int i) {
            View view;
            ViewGroup parent;
            i iVar = (i) u.B(u.this).get(i);
            if (iVar == null) {
                Q9.b.b("PlatformViewsController", "Disposing unknown platform view with id: " + i);
                return;
            }
            if (iVar.getView() != null && (parent = (view = iVar.getView()).getParent()) != null) {
                parent.removeView(view);
            }
            u.B(u.this).remove(i);
            try {
                iVar.dispose();
            } catch (RuntimeException e) {
                Q9.b.c("PlatformViewsController", "Disposing platform view threw an exception", e);
            }
            if (u.this.k(i)) {
                Z z = (Z) u.this.j.get(Integer.valueOf(i));
                View g = z.g();
                if (g != null) {
                    u.this.k.remove(g.getContext());
                }
                z.d();
                u.this.j.remove(Integer.valueOf(i));
                return;
            }
            n nVar = (n) u.w(u.this).get(i);
            if (nVar != null) {
                nVar.removeAllViews();
                nVar.a();
                nVar.c();
                ViewGroup parent2 = nVar.getParent();
                if (parent2 != null) {
                    parent2.removeView(nVar);
                }
                u.w(u.this).remove(i);
                return;
            }
            X9.a aVar = (X9.a) u.i(u.this).get(i);
            if (aVar != null) {
                aVar.removeAllViews();
                aVar.b();
                ViewGroup parent3 = aVar.getParent();
                if (parent3 != null) {
                    parent3.removeView(aVar);
                }
                u.i(u.this).remove(i);
            }
        }

        public void c(ca.m mVar) {
            int i = mVar.a;
            float f = u.p(u.this).getResources().getDisplayMetrics().density;
            if (u.this.k(i)) {
                ((Z) u.this.j.get(Integer.valueOf(i))).c(u.this.z0(f, mVar, true));
                return;
            }
            i iVar = (i) u.B(u.this).get(i);
            if (iVar == null) {
                Q9.b.b("PlatformViewsController", "Sending touch to an unknown view with id: " + i);
                return;
            }
            View view = iVar.getView();
            if (view != null) {
                view.dispatchTouchEvent(u.this.z0(f, mVar, false));
                return;
            }
            Q9.b.b("PlatformViewsController", "Sending touch to a null view with id: " + i);
        }

        public void d(int i) {
            View view;
            if (u.this.k(i)) {
                view = ((Z) u.this.j.get(Integer.valueOf(i))).g();
            } else {
                i iVar = (i) u.B(u.this).get(i);
                if (iVar == null) {
                    Q9.b.b("PlatformViewsController", "Clearing focus on an unknown view with id: " + i);
                    return;
                }
                view = iVar.getView();
            }
            if (view != null) {
                view.clearFocus();
                return;
            }
            Q9.b.b("PlatformViewsController", "Clearing focus on a null view with id: " + i);
        }

        public void e(boolean z) {
            u.r(u.this, z);
        }

        public void g(ca.l lVar) {
            u.e(u.this, 19);
            u.g(u.this, lVar);
            u.u(u.this);
            u.v(u.this, u.this.M(lVar, false), lVar);
        }

        public final /* synthetic */ void h(Z z, float f, o.b bVar) {
            u.s(u.this, z);
            if (u.p(u.this) != null) {
                f = u.l(u.this);
            }
            bVar.a(new o.c(u.t(u.this, z.f(), f), u.t(u.this, z.e(), f)));
        }

        public void i(o.d dVar, o.b bVar) {
            int j = u.j(u.this, dVar.b);
            int j2 = u.j(u.this, dVar.c);
            int i = dVar.a;
            if (u.this.k(i)) {
                float l = u.l(u.this);
                Z z = (Z) u.this.j.get(Integer.valueOf(i));
                u.n(u.this, z);
                z.k(j, j2, new t(this, z, l, bVar));
                return;
            }
            i iVar = (i) u.B(u.this).get(i);
            n nVar = (n) u.w(u.this).get(i);
            if (iVar == null || nVar == null) {
                Q9.b.b("PlatformViewsController", "Resizing unknown platform view with id: " + i);
                return;
            }
            if (j > nVar.getRenderTargetWidth() || j2 > nVar.getRenderTargetHeight()) {
                nVar.b(j, j2);
            }
            ViewGroup.LayoutParams layoutParams = nVar.getLayoutParams();
            layoutParams.width = j;
            layoutParams.height = j2;
            nVar.setLayoutParams(layoutParams);
            View view = iVar.getView();
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = j;
                layoutParams2.height = j2;
                view.setLayoutParams(layoutParams2);
            }
            bVar.a(new o.c(u.o(u.this, nVar.getRenderTargetWidth()), u.o(u.this, nVar.getRenderTargetHeight())));
        }

        public void j(int i, double d, double d2) {
            if (u.this.k(i)) {
                return;
            }
            n nVar = (n) u.w(u.this).get(i);
            if (nVar == null) {
                Q9.b.b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i);
                return;
            }
            int j = u.j(u.this, d);
            int j2 = u.j(u.this, d2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) nVar.getLayoutParams();
            layoutParams.topMargin = j;
            layoutParams.leftMargin = j2;
            nVar.setLayoutParams(layoutParams);
        }

        public long l(ca.l lVar) {
            u.g(u.this, lVar);
            int i = lVar.a;
            if (u.w(u.this).get(i) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i);
            }
            u uVar = u.this;
            if (uVar.f == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i);
            }
            if (u.x(uVar) == null) {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i);
            }
            i M = u.this.M(lVar, true);
            View view = M.getView();
            if (view.getParent() != null) {
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            if (Aa.g.f(view, u.y())) {
                if (lVar.h == l.a.b) {
                    u.v(u.this, M, lVar);
                    return -2L;
                }
                if (!u.z(u.this)) {
                    return u.A(u.this, M, lVar);
                }
            }
            return u.this.I(M, lVar);
        }
    }

    public static /* synthetic */ long A(u uVar, i iVar, ca.l lVar) {
        return uVar.J(iVar, lVar);
    }

    public static /* synthetic */ SparseArray B(u uVar) {
        return uVar.l;
    }

    private static void B0(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    public static boolean D0(int i) {
        return i == 0 || i == 1;
    }

    private void R() {
        while (this.l.size() > 0) {
            this.w.b(this.l.keyAt(0));
        }
    }

    public static /* synthetic */ void a(u uVar, ca.l lVar, View view, boolean z2) {
        uVar.a0(lVar, view, z2);
    }

    public static /* synthetic */ void b(u uVar) {
        uVar.d0();
    }

    public static /* synthetic */ void c(u uVar, ca.l lVar, View view, boolean z2) {
        uVar.b0(lVar, view, z2);
    }

    public static /* synthetic */ void d(u uVar, int i, View view, boolean z2) {
        uVar.c0(i, view, z2);
    }

    public static /* synthetic */ void e(u uVar, int i) {
        uVar.S(i);
    }

    public static m f0(TextureRegistry textureRegistry) {
        int i;
        if (z && (i = Build.VERSION.SDK_INT) >= 29) {
            TextureRegistry.SurfaceProducer a2 = textureRegistry.a(i <= 34 ? TextureRegistry.c.b : TextureRegistry.c.a);
            Q9.b.e("PlatformViewsController", "PlatformView is using SurfaceProducer backend");
            return new W(a2);
        }
        if (!y || Build.VERSION.SDK_INT < 29) {
            TextureRegistry.SurfaceTextureEntry c = textureRegistry.c();
            Q9.b.e("PlatformViewsController", "PlatformView is using SurfaceTexture backend");
            return new Y(c);
        }
        TextureRegistry.ImageTextureEntry b = textureRegistry.b();
        Q9.b.e("PlatformViewsController", "PlatformView is using ImageReader backend");
        return new b(b);
    }

    public static /* synthetic */ void g(u uVar, ca.l lVar) {
        uVar.T(lVar);
    }

    private void g0(i iVar) {
        R9.B b = this.d;
        if (b == null) {
            Q9.b.e("PlatformViewsController", "null flutterView");
        } else {
            iVar.onFlutterViewAttached(b);
        }
    }

    public static /* synthetic */ SparseArray i(u uVar) {
        return uVar.m;
    }

    public static /* synthetic */ int j(u uVar, double d) {
        return uVar.A0(d);
    }

    public static /* synthetic */ float l(u uVar) {
        return uVar.V();
    }

    public static /* synthetic */ void n(u uVar, Z z2) {
        uVar.e0(z2);
    }

    public static /* synthetic */ int o(u uVar, double d) {
        return uVar.x0(d);
    }

    public static /* synthetic */ Context p(u uVar) {
        return uVar.c;
    }

    private static MotionEvent.PointerCoords p0(Object obj, float f) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        double d = f;
        pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d);
        pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d);
        pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d);
        pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d);
        pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d);
        pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d);
        return pointerCoords;
    }

    public static /* synthetic */ boolean q(int i) {
        return D0(i);
    }

    private static List q0(Object obj, float f) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(p0(it.next(), f));
        }
        return arrayList;
    }

    public static /* synthetic */ boolean r(u uVar, boolean z2) {
        uVar.r = z2;
        return z2;
    }

    private static MotionEvent.PointerProperties r0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    public static /* synthetic */ void s(u uVar, Z z2) {
        uVar.C0(z2);
    }

    private static List s0(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(r0(it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ int t(u uVar, double d, float f) {
        return uVar.y0(d, f);
    }

    public static /* synthetic */ void u(u uVar) {
        uVar.w0();
    }

    public static /* synthetic */ void v(u uVar, i iVar, ca.l lVar) {
        uVar.H(iVar, lVar);
    }

    public static /* synthetic */ SparseArray w(u uVar) {
        return uVar.o;
    }

    public static /* synthetic */ R9.B x(u uVar) {
        return uVar.d;
    }

    public static /* synthetic */ Class[] y() {
        return x;
    }

    public static /* synthetic */ boolean z(u uVar) {
        return uVar.v;
    }

    public final int A0(double d) {
        return (int) Math.round(d * V());
    }

    public void C(Context context, TextureRegistry textureRegistry, T9.a aVar) {
        if (this.c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.c = context;
        this.f = textureRegistry;
        this.h = new ca.o(aVar);
    }

    public final void C0(Z z2) {
        io.flutter.plugin.editing.p pVar = this.g;
        if (pVar == null) {
            return;
        }
        pVar.G();
        z2.i();
    }

    public void D(io.flutter.plugin.editing.p pVar) {
        this.g = pVar;
    }

    public void E(FlutterRenderer flutterRenderer) {
        this.b = new R9.c(flutterRenderer, true);
    }

    public void F(R9.B b) {
        this.d = b;
        for (int i = 0; i < this.o.size(); i++) {
            this.d.addView((n) this.o.valueAt(i));
        }
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            this.d.addView((X9.a) this.m.valueAt(i2));
        }
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            ((i) this.l.valueAt(i3)).onFlutterViewAttached(this.d);
        }
    }

    public boolean G(View view) {
        if (view == null || !this.k.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) this.k.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    public final void H(i iVar, ca.l lVar) {
        S(19);
        Q9.b.e("PlatformViewsController", "Using hybrid composition for platform view: " + lVar.a);
        w0();
    }

    public long I(i iVar, ca.l lVar) {
        n nVar;
        long j;
        S(23);
        Q9.b.e("PlatformViewsController", "Hosting view in view hierarchy for platform view: " + lVar.a);
        int A0 = A0(lVar.c);
        int A02 = A0(lVar.d);
        if (this.v) {
            nVar = new n(this.c);
            j = -1;
        } else {
            m f0 = f0(this.f);
            n nVar2 = new n(this.c, f0);
            long id = f0.getId();
            nVar = nVar2;
            j = id;
        }
        nVar.setTouchProcessor(this.b);
        nVar.b(A0, A02);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(A0, A02);
        int A03 = A0(lVar.e);
        int A04 = A0(lVar.f);
        layoutParams.topMargin = A03;
        layoutParams.leftMargin = A04;
        nVar.setLayoutParams(layoutParams);
        View view = iVar.getView();
        view.setLayoutParams(new FrameLayout.LayoutParams(A0, A02));
        view.setImportantForAccessibility(4);
        nVar.addView(view);
        nVar.setOnDescendantFocusChangeListener(new r(this, lVar));
        this.d.addView(nVar);
        this.o.append(lVar.a, nVar);
        g0(iVar);
        return j;
    }

    public final long J(i iVar, ca.l lVar) {
        S(20);
        Q9.b.e("PlatformViewsController", "Hosting view in a virtual display for platform view: " + lVar.a);
        m f0 = f0(this.f);
        Z b = Z.b(this.c, this.i, iVar, f0, A0(lVar.c), A0(lVar.d), lVar.a, null, new s(this, lVar));
        if (b != null) {
            this.j.put(Integer.valueOf(lVar.a), b);
            View view = iVar.getView();
            this.k.put(view.getContext(), view);
            return f0.getId();
        }
        throw new IllegalStateException("Failed creating virtual display for a " + lVar.b + " with id: " + lVar.a);
    }

    public FlutterOverlaySurface K() {
        return L(new c(this.d.getContext(), this.d.getWidth(), this.d.getHeight(), this.i));
    }

    public FlutterOverlaySurface L(c cVar) {
        int i = this.p;
        this.p = i + 1;
        this.n.put(i, cVar);
        return new FlutterOverlaySurface(i, cVar.getSurface());
    }

    public i M(ca.l lVar, boolean z2) {
        j b = this.a.b(lVar.b);
        if (b == null) {
            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + lVar.b);
        }
        i create = b.create(z2 ? new MutableContextWrapper(this.c) : this.c, lVar.a, lVar.i != null ? b.getCreateArgsCodec().b(lVar.i) : null);
        View view = create.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(lVar.g);
        this.l.put(lVar.a, create);
        g0(create);
        return create;
    }

    public void N() {
        for (int i = 0; i < this.n.size(); i++) {
            c cVar = (c) this.n.valueAt(i);
            cVar.b();
            cVar.f();
        }
    }

    public void O() {
        ca.o oVar = this.h;
        if (oVar != null) {
            oVar.e(null);
        }
        N();
        this.h = null;
        this.c = null;
        this.f = null;
    }

    public void P() {
        for (int i = 0; i < this.o.size(); i++) {
            this.d.removeView((n) this.o.valueAt(i));
        }
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            this.d.removeView((X9.a) this.m.valueAt(i2));
        }
        N();
        t0();
        this.d = null;
        this.q = false;
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            ((i) this.l.valueAt(i3)).onFlutterViewDetached();
        }
    }

    public void Q() {
        this.g = null;
    }

    public final void S(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= i) {
            return;
        }
        throw new IllegalStateException("Trying to use platform views with API " + i2 + ", required API level is: " + i);
    }

    public final void T(ca.l lVar) {
        if (D0(lVar.g)) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + lVar.g + "(view id: " + lVar.a + ")");
    }

    public final void U(boolean z2) {
        for (int i = 0; i < this.n.size(); i++) {
            int keyAt = this.n.keyAt(i);
            c cVar = (c) this.n.valueAt(i);
            if (this.s.contains(Integer.valueOf(keyAt))) {
                this.d.m(cVar);
                z2 &= cVar.d();
            } else {
                if (!this.q) {
                    cVar.b();
                }
                cVar.setVisibility(8);
                this.d.removeView(cVar);
            }
        }
        for (int i2 = 0; i2 < this.m.size(); i2++) {
            int keyAt2 = this.m.keyAt(i2);
            View view = (View) this.m.get(keyAt2);
            if (!this.t.contains(Integer.valueOf(keyAt2)) || (!z2 && this.r)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public final float V() {
        return this.c.getResources().getDisplayMetrics().density;
    }

    public ca.o W() {
        return this.h;
    }

    public k X() {
        return this.a;
    }

    public boolean Y(int i) {
        i iVar = (i) this.l.get(i);
        if (iVar == null) {
            return false;
        }
        if (this.m.get(i) != null) {
            return true;
        }
        View view = iVar.getView();
        if (view == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        Context context = this.c;
        X9.a aVar = new X9.a(context, context.getResources().getDisplayMetrics().density, this.b);
        aVar.setOnDescendantFocusChangeListener(new p(this, i));
        this.m.put(i, aVar);
        view.setImportantForAccessibility(4);
        aVar.addView(view);
        this.d.addView(aVar);
        return true;
    }

    public final void Z() {
        if (!this.r || this.q) {
            return;
        }
        this.d.p();
        this.q = true;
    }

    public final /* synthetic */ void a0(ca.l lVar, View view, boolean z2) {
        if (z2) {
            this.h.d(lVar.a);
            return;
        }
        io.flutter.plugin.editing.p pVar = this.g;
        if (pVar != null) {
            pVar.l(lVar.a);
        }
    }

    public final /* synthetic */ void b0(ca.l lVar, View view, boolean z2) {
        if (z2) {
            this.h.d(lVar.a);
        }
    }

    public final /* synthetic */ void c0(int i, View view, boolean z2) {
        if (z2) {
            this.h.d(i);
            return;
        }
        io.flutter.plugin.editing.p pVar = this.g;
        if (pVar != null) {
            pVar.l(i);
        }
    }

    public final /* synthetic */ void d0() {
        U(false);
    }

    public final void e0(Z z2) {
        io.flutter.plugin.editing.p pVar = this.g;
        if (pVar == null) {
            return;
        }
        pVar.u();
        z2.h();
    }

    public void f(io.flutter.view.j jVar) {
        this.i.c(jVar);
    }

    public View h(int i) {
        if (k(i)) {
            return ((Z) this.j.get(Integer.valueOf(i))).g();
        }
        i iVar = (i) this.l.get(i);
        if (iVar == null) {
            return null;
        }
        return iVar.getView();
    }

    public void h0() {
        this.s.clear();
        this.t.clear();
    }

    public void i0() {
        R();
    }

    public void j0(int i, int i2, int i3, int i4, int i5) {
        if (this.n.get(i) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i + ") doesn't exist");
        }
        Z();
        c cVar = (c) this.n.get(i);
        if (cVar.getParent() == null) {
            this.d.addView(cVar);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = i3;
        cVar.setLayoutParams(layoutParams);
        cVar.setVisibility(0);
        cVar.bringToFront();
        this.s.add(Integer.valueOf(i));
    }

    public boolean k(int i) {
        return this.j.containsKey(Integer.valueOf(i));
    }

    public void k0(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack) {
        Z();
        if (Y(i)) {
            X9.a aVar = (X9.a) this.m.get(i);
            aVar.a(flutterMutatorsStack, i2, i3, i4, i5);
            aVar.setVisibility(0);
            aVar.bringToFront();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
            View view = ((i) this.l.get(i)).getView();
            if (view != null) {
                view.setLayoutParams(layoutParams);
                view.bringToFront();
            }
            this.t.add(Integer.valueOf(i));
        }
    }

    public void l0() {
        boolean z2 = false;
        if (this.q && this.t.isEmpty()) {
            this.q = false;
            this.d.z(new q(this));
        } else {
            if (this.q && this.d.k()) {
                z2 = true;
            }
            U(z2);
        }
    }

    public void m() {
        this.i.c(null);
    }

    public void m0() {
        R();
    }

    public void n0() {
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            ((Z) it.next()).j();
        }
    }

    public void o0(int i) {
        if (i < 40) {
            return;
        }
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            ((Z) it.next()).a();
        }
    }

    public final void t0() {
        if (this.d == null) {
            Q9.b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i = 0; i < this.n.size(); i++) {
            this.d.removeView((View) this.n.valueAt(i));
        }
        this.n.clear();
    }

    public void u0(FlutterJNI flutterJNI) {
        this.e = flutterJNI;
    }

    public void v0(boolean z2) {
        this.v = z2;
    }

    public final void w0() {
        if (this.e.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
    }

    public final int x0(double d) {
        return y0(d, V());
    }

    public final int y0(double d, float f) {
        return (int) Math.round(d / f);
    }

    public MotionEvent z0(float f, ca.m mVar, boolean z2) {
        MotionEvent b = this.u.b(N.a.c(mVar.p));
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) q0(mVar.g, f).toArray(new MotionEvent.PointerCoords[mVar.e]);
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) s0(mVar.f).toArray(new MotionEvent.PointerProperties[mVar.e]);
        if (z2 || b == null) {
            return MotionEvent.obtain(mVar.b.longValue(), mVar.c.longValue(), mVar.d, mVar.e, pointerPropertiesArr, pointerCoordsArr, mVar.h, mVar.i, mVar.j, mVar.k, mVar.l, mVar.m, mVar.n, mVar.o);
        }
        if (b.getPointerCount() != mVar.e || b.getAction() != mVar.d) {
            return MotionEvent.obtain(b.getDownTime(), b.getEventTime(), mVar.d, mVar.e, pointerPropertiesArr, pointerCoordsArr, b.getMetaState(), b.getButtonState(), b.getXPrecision(), b.getYPrecision(), b.getDeviceId(), b.getEdgeFlags(), b.getSource(), b.getFlags());
        }
        B0(b, pointerCoordsArr);
        return b;
    }
}
