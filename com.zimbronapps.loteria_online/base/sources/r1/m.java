package r1;

import Ca.I;
import P0.s1;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import b0.B1;
import b0.C0;
import b0.U1;
import b0.g1;
import b0.h2;
import b0.w;
import b0.y;
import java.util.UUID;
import kotlin.jvm.internal.N;
import l0.L;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m extends P0.a implements s1 {
    public static final c u = new c(null);
    public static final int v = 8;
    public static final Qa.l w = b.a;
    public Qa.a a;
    public t b;
    public String c;
    public final View d;
    public final o e;
    public final WindowManager f;
    public final WindowManager.LayoutParams g;
    public s h;
    public n1.t i;
    public final C0 j;
    public final C0 k;
    public n1.p l;
    public final h2 m;
    public final float n;
    public final Rect o;
    public final L p;
    public Object q;
    public final C0 r;
    public boolean s;
    public final int[] t;

    public static final class a extends ViewOutlineProvider {
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(m mVar) {
            if (mVar.isAttachedToWindow()) {
                mVar.s();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((m) obj);
            return I.a;
        }
    }

    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.k kVar) {
            this();
        }

        public c() {
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(2);
            this.b = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            m.this.Content(mVar, g1.a(this.b | 1));
        }
    }

    public /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[n1.t.values().length];
            try {
                iArr[n1.t.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n1.t.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class f extends kotlin.jvm.internal.u implements Qa.a {
        public f() {
            super(0);
        }

        public final Boolean invoke() {
            M0.p g = m.g(m.this);
            if (g == null || !g.g()) {
                g = null;
            }
            return Boolean.valueOf((g == null || m.this.getPopupContentSize-bOM6tXw() == null) ? false : true);
        }
    }

    public static final class g extends kotlin.jvm.internal.u implements Qa.l {
        public g() {
            super(1);
        }

        public static /* synthetic */ void a(Qa.a aVar) {
            c(aVar);
        }

        private static final void c(Qa.a aVar) {
            aVar.invoke();
        }

        public final void b(Qa.a aVar) {
            Handler handler = m.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar.invoke();
                return;
            }
            Handler handler2 = m.this.getHandler();
            if (handler2 != null) {
                handler2.post(new n(aVar));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Qa.a) obj);
            return I.a;
        }
    }

    public static final class h extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ N a;
        public final /* synthetic */ m b;
        public final /* synthetic */ n1.p c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(N n, m mVar, n1.p pVar, long j, long j2) {
            super(0);
            this.a = n;
            this.b = mVar;
            this.c = pVar;
            this.d = j;
            this.e = j2;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.a.a = this.b.getPositionProvider().a(this.c, this.d, this.b.getParentLayoutDirection(), this.e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ m(Qa.a aVar, t tVar, String str, View view, n1.d dVar, s sVar, UUID uuid, o oVar, int i, kotlin.jvm.internal.k kVar) {
        o oVar2;
        if ((i & 128) != 0) {
            oVar2 = Build.VERSION.SDK_INT >= 29 ? new q() : new r();
        } else {
            oVar2 = oVar;
        }
        this(aVar, tVar, str, view, dVar, sVar, uuid, oVar2);
    }

    public static final /* synthetic */ M0.p g(m mVar) {
        return mVar.getParentLayoutCoordinates();
    }

    private final Qa.p getContent() {
        return (Qa.p) this.r.getValue();
    }

    private final M0.p getParentLayoutCoordinates() {
        return (M0.p) this.k.getValue();
    }

    private final n1.p getVisibleDisplayBounds() {
        Rect rect = this.o;
        this.e.a(this.d, rect);
        return r1.b.f(rect);
    }

    private final void setContent(Qa.p pVar) {
        this.r.setValue(pVar);
    }

    private final void setParentLayoutCoordinates(M0.p pVar) {
        this.k.setValue(pVar);
    }

    public void Content(b0.m mVar, int i) {
        int i2;
        b0.m i3 = mVar.i(-857613600);
        if ((i & 6) == 0) {
            i2 = (i3.E(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (i3.o((i2 & 3) != 2, i2 & 1)) {
            if (w.L()) {
                w.U(-857613600, i2, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
            }
            getContent().invoke(i3, 0);
            if (w.L()) {
                w.T();
            }
        } else {
            i3.M();
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new d(i));
        }
    }

    public final void dismiss() {
        a0.b(this, null);
        this.f.removeViewImmediate(this);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.b.a()) {
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Qa.a aVar = this.a;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.g;
    }

    public final n1.t getParentLayoutDirection() {
        return this.i;
    }

    public final n1.r getPopupContentSize-bOM6tXw() {
        return (n1.r) this.j.getValue();
    }

    public final s getPositionProvider() {
        return this.h;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.s;
    }

    public final String getTestTag() {
        return this.c;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    public final WindowManager.LayoutParams h() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = r1.b.e(this.b, r1.b.i(this.d));
        layoutParams.type = 1002;
        layoutParams.token = this.d.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.d.getContext().getResources().getString(o0.m.c));
        return layoutParams;
    }

    public final void i() {
        if (!this.b.a() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.q == null) {
            this.q = r1.g.b(this.a);
        }
        r1.g.d(this, this.q);
    }

    public void internalOnLayout$ui_release(boolean z, int i, int i2, int i3, int i4) {
        View childAt;
        super.internalOnLayout$ui_release(z, i, i2, i3, i4);
        if (this.b.f() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.g.width = childAt.getMeasuredWidth();
        this.g.height = childAt.getMeasuredHeight();
        this.e.b(this.f, this, this.g);
    }

    public void internalOnMeasure$ui_release(int i, int i2) {
        if (this.b.f()) {
            super.internalOnMeasure$ui_release(i, i2);
        } else {
            n1.p visibleDisplayBounds = getVisibleDisplayBounds();
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.j(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.e(), Integer.MIN_VALUE));
        }
    }

    public final void j() {
        if (Build.VERSION.SDK_INT >= 33) {
            r1.g.e(this, this.q);
        }
        this.q = null;
    }

    public final void k() {
        int[] iArr = this.t;
        int i = iArr[0];
        int i2 = iArr[1];
        this.d.getLocationOnScreen(iArr);
        int[] iArr2 = this.t;
        if (i == iArr2[0] && i2 == iArr2[1]) {
            return;
        }
        p();
    }

    public final void l(y yVar, Qa.p pVar) {
        setParentCompositionContext(yVar);
        setContent(pVar);
        this.s = true;
    }

    public final void m() {
        this.f.addView(this, this.g);
    }

    public final void n(n1.t tVar) {
        int i = e.a[tVar.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new Ca.o();
        }
        super/*android.view.View*/.setLayoutDirection(i2);
    }

    public final void o(Qa.a aVar, t tVar, String str, n1.t tVar2) {
        this.a = aVar;
        this.c = str;
        r(tVar);
        n(tVar2);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p.q();
        i();
    }

    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.p.r();
        this.p.f();
        j();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b.b()) {
            return super/*android.view.View*/.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Qa.a aVar = this.a;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super/*android.view.View*/.onTouchEvent(motionEvent);
        }
        Qa.a aVar2 = this.a;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    public final void p() {
        M0.p parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.g()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long a2 = parentLayoutCoordinates.a();
            long f2 = M0.q.f(parentLayoutCoordinates);
            n1.p a3 = n1.q.a(n1.n.f((Math.round(Float.intBitsToFloat((int) (f2 >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (f2 & 4294967295L))))), a2);
            if (kotlin.jvm.internal.t.c(a3, this.l)) {
                return;
            }
            this.l = a3;
            s();
        }
    }

    public final void q(M0.p pVar) {
        setParentLayoutCoordinates(pVar);
        p();
    }

    public final void r(t tVar) {
        if (kotlin.jvm.internal.t.c(this.b, tVar)) {
            return;
        }
        if (tVar.f() && !this.b.f()) {
            WindowManager.LayoutParams layoutParams = this.g;
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        this.b = tVar;
        this.g.flags = r1.b.e(tVar, r1.b.i(this.d));
        this.e.b(this.f, this, this.g);
    }

    public final void s() {
        n1.r rVar;
        n1.p pVar = this.l;
        if (pVar == null || (rVar = getPopupContentSize-bOM6tXw()) == null) {
            return;
        }
        long j = rVar.j();
        n1.p visibleDisplayBounds = getVisibleDisplayBounds();
        long c2 = n1.r.c((visibleDisplayBounds.j() << 32) | (visibleDisplayBounds.e() & 4294967295L));
        N n = new N();
        n.a = n1.n.b.b();
        this.p.k(this, w, new h(n, this, pVar, c2, j));
        this.g.x = n1.n.k(n.a);
        this.g.y = n1.n.l(n.a);
        if (this.b.c()) {
            this.e.c(this, (int) (c2 >> 32), (int) (4294967295L & c2));
        }
        this.e.b(this.f, this, this.g);
    }

    public final void setParentLayoutDirection(n1.t tVar) {
        this.i = tVar;
    }

    public final void setPopupContentSize-fhxjrPA(n1.r rVar) {
        this.j.setValue(rVar);
    }

    public final void setPositionProvider(s sVar) {
        this.h = sVar;
    }

    public final void setTestTag(String str) {
        this.c = str;
    }

    public m(Qa.a aVar, t tVar, String str, View view, n1.d dVar, s sVar, UUID uuid, o oVar) {
        super(view.getContext(), null, 0, 6, null);
        this.a = aVar;
        this.b = tVar;
        this.c = str;
        this.d = view;
        this.e = oVar;
        Object systemService = view.getContext().getSystemService("window");
        kotlin.jvm.internal.t.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f = (WindowManager) systemService;
        this.g = h();
        this.h = sVar;
        this.i = n1.t.a;
        this.j = U1.i(null, null, 2, null);
        this.k = U1.i(null, null, 2, null);
        this.m = U1.c(new f());
        float g2 = n1.h.g(8);
        this.n = g2;
        this.o = new Rect();
        this.p = new L(new g());
        setId(16908290);
        a0.b(this, a0.a(view));
        b0.b(this, b0.a(view));
        j4.m.b(this, j4.m.a(view));
        setTag(o0.l.H, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.j1(g2));
        setOutlineProvider(new a());
        this.r = U1.i(i.a.a(), null, 2, null);
        this.t = new int[2];
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public P0.a getSubCompositionView() {
        return this;
    }

    public void setLayoutDirection(int i) {
    }
}
