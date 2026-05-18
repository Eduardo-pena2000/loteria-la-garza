package androidx.compose.ui.platform;

import Ca.I;
import E0.a;
import I0.G;
import I0.P;
import I0.X;
import I0.z;
import O0.J;
import O0.W;
import O0.n0;
import O0.o0;
import O0.p0;
import O0.r0;
import O0.v0;
import O0.y0;
import P0.B;
import P0.C;
import P0.E0;
import P0.P0;
import P0.R0;
import P0.T;
import P0.T0;
import P0.g0;
import P0.g1;
import P0.h0;
import P0.j0;
import P0.j1;
import P0.r1;
import P0.s0;
import P0.t1;
import P0.u1;
import P0.w0;
import T1.Z;
import T1.c0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.c;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.a0;
import b0.C0;
import b0.U1;
import b0.h2;
import d1.A;
import d1.t;
import d1.u;
import f1.M;
import f1.Y;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.V;
import p0.H;
import p0.S;
import u0.f;
import v0.K;
import v0.Z0;
import v0.k0;
import v0.s1;
import w.F;
import w.L;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class AndroidComposeView extends ViewGroup implements p0, t0.u, androidx.compose.ui.platform.k, I0.h, DefaultLifecycleObserver, n0 {
    public static Class R0;
    public static Method S0;
    public static Method T0;
    public static Runnable V0;
    public final P0.d A;
    public MotionEvent A0;
    public final Z0 B;
    public long B0;
    public final H C;
    public final t1 C0;
    public final List D;
    public final L D0;
    public List E;
    public float E0;
    public boolean F;
    public float F0;
    public boolean G;
    public final t G0;
    public final I0.i H;
    public final Runnable H0;
    public final G I;
    public boolean I0;
    public Qa.l J;
    public final Qa.a J0;
    public final p0.d K;
    public final g0 K0;
    public final p0.f L;
    public boolean L0;
    public boolean M;
    public final V0.k M0;
    public final P0.f N;
    public View N0;
    public final P0.e O;
    public final z O0;
    public final r0 P;
    public boolean Q;
    public T R;
    public w0 S;
    public n1.b T;
    public boolean U;
    public final W V;
    public long W;
    public long a;
    public final int[] a0;
    public boolean b;
    public final float[] b0;
    public final O0.L c;
    public final float[] c0;
    public final C0 d;
    public final float[] d0;
    public View e;
    public long e0;
    public final boolean f;
    public boolean f0;
    public final W0.d g;
    public long g0;
    public final EmptySemanticsElement h;
    public boolean h0;
    public final AndroidComposeView$bringIntoViewNode$1 i;
    public final C0 i0;
    public final t0.k j;
    public final h2 j0;
    public Ga.i k;
    public Qa.l k0;
    public final AndroidDragAndDropManager l;
    public final ViewTreeObserver.OnGlobalLayoutListener l0;
    public final R0 m;
    public final ViewTreeObserver.OnScrollChangedListener m0;
    public boolean n;
    public final ViewTreeObserver.OnTouchModeChangeListener n0;
    public final androidx.compose.ui.e o;
    public final Y o0;
    public final androidx.compose.ui.e p;
    public final f1.W p0;
    public final k0 q;
    public final AtomicReference q0;
    public final r1 r;
    public final g1 r0;
    public final androidx.compose.ui.layout.f s;
    public final t.a s0;
    public final J t;
    public final C0 t0;
    public final F u;
    public int u0;
    public final X0.b v;
    public final C0 v0;
    public final y0 w;
    public final D0.a w0;
    public final W0.w x;
    public final E0.c x0;
    public final androidx.compose.ui.platform.g y;
    public final N0.f y0;
    public q0.b z;
    public final j1 z0;
    public static final a P0 = new a(null);
    public static final int Q0 = 8;
    public static final L U0 = new L(0, 1, null);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ void a() {
            f();
        }

        public static final /* synthetic */ void b(a aVar, AndroidComposeView androidComposeView) {
            aVar.e(androidComposeView);
        }

        public static final /* synthetic */ boolean c(a aVar) {
            return aVar.g();
        }

        public static final /* synthetic */ void d(a aVar, AndroidComposeView androidComposeView) {
            aVar.h(androidComposeView);
        }

        public static final void f() {
            synchronized (AndroidComposeView.V()) {
                try {
                    int i = 0;
                    if (Build.VERSION.SDK_INT < 30) {
                        L V = AndroidComposeView.V();
                        Object[] objArr = V.a;
                        int i2 = V.b;
                        while (i < i2) {
                            AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i];
                            boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                            androidComposeView.setShowLayoutBounds(AndroidComposeView.P0.g());
                            if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                                androidComposeView.B0();
                            }
                            i++;
                        }
                    } else {
                        L V2 = AndroidComposeView.V();
                        Object[] objArr2 = V2.a;
                        int i3 = V2.b;
                        while (i < i3) {
                            ((AndroidComposeView) objArr2[i]).B0();
                            i++;
                        }
                    }
                    I i4 = I.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void e(AndroidComposeView androidComposeView) {
            if (Build.VERSION.SDK_INT > 28) {
                if (AndroidComposeView.a0() == null) {
                    P0.n nVar = new P0.n();
                    AndroidComposeView.h0(nVar);
                    StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                    try {
                        try {
                            if (AndroidComposeView.b0() == null) {
                                AndroidComposeView.i0(Class.forName("android.os.SystemProperties"));
                            }
                            if (AndroidComposeView.T() == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class b0 = AndroidComposeView.b0();
                                AndroidComposeView.e0(b0 != null ? b0.getDeclaredMethod("addChangeCallback", new Class[]{Runnable.class}) : null);
                            }
                            Method T = AndroidComposeView.T();
                            if (T != null) {
                                T.invoke((Object) null, new Object[]{nVar});
                            }
                        } catch (Throwable unused) {
                            I i = I.a;
                        }
                    } finally {
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                }
                synchronized (AndroidComposeView.V()) {
                    AndroidComposeView.V().k(androidComposeView);
                    I i2 = I.a;
                }
            }
        }

        public final boolean g() {
            try {
                if (AndroidComposeView.b0() == null) {
                    AndroidComposeView.i0(Class.forName("android.os.SystemProperties"));
                }
                if (AndroidComposeView.W() == null) {
                    Class b0 = AndroidComposeView.b0();
                    AndroidComposeView.f0(b0 != null ? b0.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE}) : null);
                }
                Method W = AndroidComposeView.W();
                Object invoke = W != null ? W.invoke((Object) null, new Object[]{"debug.layout", Boolean.FALSE}) : null;
                return kotlin.jvm.internal.t.c(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
            } catch (Exception unused) {
                return false;
            }
        }

        public final void h(AndroidComposeView androidComposeView) {
            if (Build.VERSION.SDK_INT > 28) {
                synchronized (AndroidComposeView.V()) {
                    AndroidComposeView.V().q(androidComposeView);
                    I i = I.a;
                }
            }
        }

        public a() {
        }
    }

    public static final class b {
        public final androidx.lifecycle.r a;
        public final j4.i b;

        public b(androidx.lifecycle.r rVar, j4.i iVar) {
            this.a = rVar;
            this.b = iVar;
        }

        public final androidx.lifecycle.r a() {
            return this.a;
        }

        public final j4.i b() {
            return this.b;
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public c() {
            super(1);
        }

        public final Boolean a(int i) {
            a.a aVar = E0.a.b;
            return Boolean.valueOf(E0.a.f(i, aVar.b()) ? AndroidComposeView.this.isInTouchMode() : E0.a.f(i, aVar.a()) ? AndroidComposeView.this.isInTouchMode() ? AndroidComposeView.this.requestFocusFromTouch() : true : false);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((E0.a) obj).i());
        }
    }

    public static final class d extends T1.a {
        public final /* synthetic */ J e;
        public final /* synthetic */ AndroidComposeView f;

        public d(J j, AndroidComposeView androidComposeView) {
            this.e = j;
            this.f = androidComposeView;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0054  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void g(android.view.View r5, U1.v r6) {
            /*
                r4 = this;
                super.g(r5, r6)
                androidx.compose.ui.platform.AndroidComposeView r5 = androidx.compose.ui.platform.AndroidComposeView.this
                androidx.compose.ui.platform.g r5 = androidx.compose.ui.platform.AndroidComposeView.U(r5)
                boolean r5 = r5.p0()
                if (r5 == 0) goto L13
                r5 = 0
                r6.R0(r5)
            L13:
                O0.J r5 = r4.e
                O0.J r5 = r5.z0()
            L19:
                r0 = 0
                if (r5 == 0) goto L32
                O0.c0 r1 = r5.s0()
                r2 = 8
                int r2 = O0.g0.a(r2)
                boolean r1 = r1.p(r2)
                if (r1 == 0) goto L2d
                goto L33
            L2d:
                O0.J r5 = r5.z0()
                goto L19
            L32:
                r5 = r0
            L33:
                if (r5 == 0) goto L3d
                int r5 = r5.y()
                java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            L3d:
                r5 = -1
                if (r0 == 0) goto L54
                androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                W0.w r1 = r1.getSemanticsOwner()
                W0.t r1 = r1.d()
                int r1 = r1.q()
                int r2 = r0.intValue()
                if (r2 != r1) goto L58
            L54:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            L58:
                androidx.compose.ui.platform.AndroidComposeView r1 = r4.f
                int r0 = r0.intValue()
                r6.B0(r1, r0)
                O0.J r0 = r4.e
                int r0 = r0.y()
                androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                androidx.compose.ui.platform.g r1 = androidx.compose.ui.platform.AndroidComposeView.U(r1)
                w.D r1 = r1.h0()
                int r1 = r1.e(r0, r5)
                if (r1 == r5) goto L9f
                androidx.compose.ui.platform.AndroidComposeView r2 = androidx.compose.ui.platform.AndroidComposeView.this
                P0.T r2 = r2.getAndroidViewsHandler$ui_release()
                android.view.View r2 = P0.e1.d(r2, r1)
                if (r2 == 0) goto L87
                r6.O0(r2)
                goto L8c
            L87:
                androidx.compose.ui.platform.AndroidComposeView r2 = r4.f
                r6.P0(r2, r1)
            L8c:
                androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                android.view.accessibility.AccessibilityNodeInfo r2 = r6.S0()
                androidx.compose.ui.platform.AndroidComposeView r3 = androidx.compose.ui.platform.AndroidComposeView.this
                androidx.compose.ui.platform.g r3 = androidx.compose.ui.platform.AndroidComposeView.U(r3)
                java.lang.String r3 = r3.f0()
                androidx.compose.ui.platform.AndroidComposeView.P(r1, r0, r2, r3)
            L9f:
                androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                androidx.compose.ui.platform.g r1 = androidx.compose.ui.platform.AndroidComposeView.U(r1)
                w.D r1 = r1.g0()
                int r1 = r1.e(r0, r5)
                if (r1 == r5) goto Ld7
                androidx.compose.ui.platform.AndroidComposeView r5 = androidx.compose.ui.platform.AndroidComposeView.this
                P0.T r5 = r5.getAndroidViewsHandler$ui_release()
                android.view.View r5 = P0.e1.d(r5, r1)
                if (r5 == 0) goto Lbf
                r6.M0(r5)
                goto Lc4
            Lbf:
                androidx.compose.ui.platform.AndroidComposeView r5 = r4.f
                r6.N0(r5, r1)
            Lc4:
                androidx.compose.ui.platform.AndroidComposeView r5 = androidx.compose.ui.platform.AndroidComposeView.this
                android.view.accessibility.AccessibilityNodeInfo r6 = r6.S0()
                androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                androidx.compose.ui.platform.g r1 = androidx.compose.ui.platform.AndroidComposeView.U(r1)
                java.lang.String r1 = r1.e0()
                androidx.compose.ui.platform.AndroidComposeView.P(r5, r0, r6, r1)
            Ld7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.d.g(android.view.View, U1.v):void");
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.l {
        public static final e a = new e();

        public e() {
            super(1);
        }

        public final void a(Configuration configuration) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Configuration) obj);
            return I.a;
        }
    }

    public /* synthetic */ class f extends kotlin.jvm.internal.q implements Qa.a {
        public f(Object obj) {
            super(0, obj, P0.G.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final S0.d invoke() {
            return P0.G.b((View) ((kotlin.jvm.internal.f) this).receiver);
        }
    }

    public static final class g extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ MotionEvent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MotionEvent motionEvent) {
            super(0);
            this.b = motionEvent;
        }

        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.Q(AndroidComposeView.this, this.b));
        }
    }

    public static final class h extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ KeyEvent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(KeyEvent keyEvent) {
            super(0);
            this.b = keyEvent;
        }

        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.R(AndroidComposeView.this, this.b));
        }
    }

    public /* synthetic */ class i extends kotlin.jvm.internal.q implements Qa.q {
        public i(Object obj) {
            super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
        }

        public final Boolean b(r0.g gVar, long j, Qa.l lVar) {
            return Boolean.valueOf(AndroidComposeView.j0((AndroidComposeView) ((kotlin.jvm.internal.f) this).receiver, gVar, j, lVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            android.support.v4.media.session.b.a(obj);
            return b(null, ((u0.l) obj2).m(), (Qa.l) obj3);
        }
    }

    public static final class j extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ O a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(O o) {
            super(1);
            this.a = o;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.a.a = focusTargetNode;
            return Boolean.TRUE;
        }
    }

    public static final class k extends kotlin.jvm.internal.u implements Qa.l {
        public static final k a = new k();

        public k() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.TRUE;
        }
    }

    public static final class l extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ MotionEvent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(MotionEvent motionEvent) {
            super(0);
            this.b = motionEvent;
        }

        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.Q(AndroidComposeView.this, this.b));
        }
    }

    public static final class m extends kotlin.jvm.internal.u implements Qa.l {

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ androidx.compose.ui.focus.c a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.compose.ui.focus.c cVar) {
                super(1);
                this.a = cVar;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.q(this.a.o()));
            }
        }

        public static final class b extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ androidx.compose.ui.focus.c a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(androidx.compose.ui.focus.c cVar) {
                super(1);
                this.a = cVar;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.q(this.a.o()));
            }
        }

        public m() {
            super(1);
        }

        public final Boolean a(KeyEvent keyEvent) {
            androidx.compose.ui.focus.c e = androidx.compose.ui.focus.e.e(keyEvent);
            if (e == null || !G0.c.e(G0.d.b(keyEvent), G0.c.a.a())) {
                return Boolean.FALSE;
            }
            Integer c = androidx.compose.ui.focus.e.c(e.o());
            if (o0.h.d && AndroidComposeView.this.hasFocus() && c != null && AndroidComposeView.this.e(e.o())) {
                return Boolean.TRUE;
            }
            u0.h embeddedViewFocusRect = AndroidComposeView.this.getEmbeddedViewFocusRect();
            Boolean d = AndroidComposeView.this.getFocusOwner().d(e.o(), embeddedViewFocusRect, new b(e));
            if (d != null ? d.booleanValue() : true) {
                return Boolean.TRUE;
            }
            if (!androidx.compose.ui.focus.g.a(e.o())) {
                return Boolean.FALSE;
            }
            if (c != null) {
                View S = AndroidComposeView.S(AndroidComposeView.this, c.intValue());
                if (kotlin.jvm.internal.t.c(S, AndroidComposeView.this)) {
                    S = null;
                }
                if (S != null) {
                    Rect b2 = embeddedViewFocusRect != null ? s1.b(embeddedViewFocusRect) : null;
                    if (b2 == null) {
                        throw new IllegalStateException("Invalid rect");
                    }
                    ViewGroup rootView = AndroidComposeView.this.getRootView();
                    kotlin.jvm.internal.t.e(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup = rootView;
                    viewGroup.offsetDescendantRectToMyCoords(AndroidComposeView.this, b2);
                    viewGroup.offsetRectIntoDescendantCoords(S, b2);
                    if (androidx.compose.ui.focus.e.b(S, c, b2)) {
                        return Boolean.TRUE;
                    }
                }
            }
            if (!AndroidComposeView.this.getFocusOwner().m(false, true, false, e.o())) {
                return Boolean.TRUE;
            }
            Boolean d2 = AndroidComposeView.this.getFocusOwner().d(e.o(), null, new a(e));
            return Boolean.valueOf(d2 != null ? d2.booleanValue() : true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((G0.b) obj).f());
        }
    }

    public static final class n extends kotlin.jvm.internal.u implements Qa.a {
        public n() {
            super(0);
        }

        public final long a() {
            return P0.W.d(AndroidComposeView.this);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return n1.r.b(a());
        }
    }

    public static final class o implements z {
        public I0.x a = I0.x.a.a();
        public I0.x b;

        public o() {
        }

        public void a(I0.x xVar) {
            if (xVar == null) {
                xVar = I0.x.a.a();
            }
            this.a = xVar;
            C.a.a(AndroidComposeView.this, xVar);
        }

        public I0.x b() {
            return this.b;
        }
    }

    public static final class p extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(int i) {
            super(1);
            this.a = i;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.q(this.a));
        }
    }

    public static final class q extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(int i) {
            super(1);
            this.a = i;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.q(this.a));
        }
    }

    public static final class r extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ kotlin.jvm.internal.J a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(kotlin.jvm.internal.J j, int i) {
            super(1);
            this.a = j;
            this.b = i;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            this.a.a = true;
            return Boolean.valueOf(focusTargetNode.q(this.b));
        }
    }

    public static final class s extends kotlin.jvm.internal.u implements Qa.a {
        public s() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            MotionEvent X = AndroidComposeView.X(AndroidComposeView.this);
            if (X != null) {
                int actionMasked = X.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    AndroidComposeView.g0(AndroidComposeView.this, SystemClock.uptimeMillis());
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.post(AndroidComposeView.Z(androidComposeView));
                }
            }
        }
    }

    public static final class t implements Runnable {
        public t() {
        }

        public void run() {
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent X = AndroidComposeView.X(AndroidComposeView.this);
            if (X != null) {
                boolean z = X.getToolType(0) == 3;
                int actionMasked = X.getActionMasked();
                if (z) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i = 2;
                }
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                AndroidComposeView.d0(androidComposeView, X, i, AndroidComposeView.Y(androidComposeView), false);
            }
        }
    }

    public static final class u extends kotlin.jvm.internal.u implements Qa.l {
        public static final u a = new u();

        public u() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(K0.c cVar) {
            return Boolean.FALSE;
        }
    }

    public static final class v extends kotlin.jvm.internal.u implements Qa.l {
        public v() {
            super(1);
        }

        public static /* synthetic */ void a(Qa.a aVar) {
            c(aVar);
        }

        public static final void c(Qa.a aVar) {
            aVar.invoke();
        }

        public final void b(Qa.a aVar) {
            Handler handler = AndroidComposeView.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                aVar.invoke();
                return;
            }
            Handler handler2 = AndroidComposeView.this.getHandler();
            if (handler2 != null) {
                handler2.post(new P0.o(aVar));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Qa.a) obj);
            return I.a;
        }
    }

    public static final class w extends Ia.d {
        public /* synthetic */ Object a;
        public int c;

        public w(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return AndroidComposeView.this.s(null, this);
        }
    }

    public static final class x extends kotlin.jvm.internal.u implements Qa.l {
        public x() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P0.I invoke(cb.O o) {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            return new P0.I(androidComposeView, androidComposeView.getTextInputService(), o);
        }
    }

    public static final class y extends kotlin.jvm.internal.u implements Qa.a {
        public y() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke() {
            return AndroidComposeView.c0(AndroidComposeView.this);
        }
    }

    public AndroidComposeView(Context context, Ga.i iVar) {
        p0.f fVar;
        super(context);
        f.a aVar = u0.f.b;
        this.a = aVar.b();
        this.b = true;
        this.c = new O0.L(null, 1, null);
        this.d = U1.h(n1.a.a(context), U1.n());
        boolean z = o0.h.j && Build.VERSION.SDK_INT >= 35;
        this.f = z;
        W0.d dVar = new W0.d();
        this.g = dVar;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dVar);
        this.h = emptySemanticsElement;
        AndroidComposeView$bringIntoViewNode$1 androidComposeView$bringIntoViewNode$1 = new AndroidComposeView$bringIntoViewNode$1(this);
        this.i = androidComposeView$bringIntoViewNode$1;
        this.j = new FocusOwnerImpl(this, this);
        this.k = iVar;
        this.l = new AndroidDragAndDropManager(new i(this));
        this.m = new R0();
        androidx.compose.ui.e eVar = androidx.compose.ui.e.a;
        androidx.compose.ui.e a2 = androidx.compose.ui.input.key.a.a(eVar, new m());
        this.o = a2;
        androidx.compose.ui.e a3 = androidx.compose.ui.input.rotary.a.a(eVar, u.a);
        this.p = a3;
        this.q = new k0();
        this.r = new P0.O(ViewConfiguration.get(context));
        androidx.compose.ui.layout.f fVar2 = new androidx.compose.ui.layout.f(this);
        this.s = fVar2;
        J j2 = new J(false, 0, 3, null);
        j2.e(androidx.compose.ui.layout.u.b);
        j2.b(getDensity());
        j2.k(getViewConfiguration());
        j2.m((o0.h.e ? E.e(eVar, fVar2) : eVar).then(emptySemanticsElement).then(a3).then(a2).then(getFocusOwner().i()).then(getDragAndDropManager().d()).then(androidComposeView$bringIntoViewNode$1));
        this.t = j2;
        this.u = w.p.c();
        this.v = new X0.b(getLayoutNodes());
        this.w = this;
        this.x = new W0.w(getRoot(), dVar, getLayoutNodes());
        androidx.compose.ui.platform.g gVar = new androidx.compose.ui.platform.g(this);
        this.y = gVar;
        this.z = new q0.b(this, new f(this));
        this.A = new P0.d(context);
        this.B = K.a(this);
        this.C = new H();
        this.D = new ArrayList();
        this.H = new I0.i();
        this.I = new G(getRoot());
        this.J = e.a;
        this.K = m0() ? new p0.d(this, getAutofillTree()) : null;
        if (m0()) {
            AutofillManager a4 = p0.b.a(context.getSystemService(p0.a.a()));
            if (a4 == null) {
                L0.a.c("Autofill service could not be located.");
                throw new Ca.i();
            }
            fVar = new p0.f(new S(a4), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            fVar = null;
        }
        this.L = fVar;
        this.N = new P0.f(context);
        this.O = new P0.e(getClipboardManager());
        this.P = new r0(new v());
        this.V = new W(getRoot());
        long j3 = Integer.MAX_VALUE;
        this.W = n1.n.f((j3 & 4294967295L) | (j3 << 32));
        this.a0 = new int[]{0, 0};
        float[] c2 = v0.g1.c(null, 1, null);
        this.b0 = c2;
        this.c0 = v0.g1.c(null, 1, null);
        this.d0 = v0.g1.c(null, 1, null);
        this.e0 = -1L;
        this.g0 = aVar.a();
        this.h0 = true;
        this.i0 = U1.i(null, null, 2, null);
        this.j0 = U1.c(new y());
        this.l0 = new P0.i(this);
        this.m0 = new P0.j(this);
        this.n0 = new P0.k(this);
        Y y2 = new Y(getView(), this);
        this.o0 = y2;
        this.p0 = new f1.W((M) P0.G.h().invoke(y2));
        this.q0 = o0.o.a();
        this.r0 = new s0(getTextInputService());
        this.s0 = new P0.H(context);
        this.t0 = U1.h(A.a(context), U1.n());
        this.u0 = w0(context.getResources().getConfiguration());
        n1.t f2 = androidx.compose.ui.focus.e.f(context.getResources().getConfiguration().getLayoutDirection());
        this.v0 = U1.i(f2 == null ? n1.t.a : f2, null, 2, null);
        this.w0 = new D0.c(this);
        this.x0 = new E0.c(isInTouchMode() ? E0.a.b.b() : E0.a.b.a(), new c(), null);
        this.y0 = new N0.f(this);
        this.z0 = new P0.J(this);
        this.C0 = new t1();
        this.D0 = new L(0, 1, null);
        this.G0 = new t();
        this.H0 = new P0.l(this);
        this.J0 = new s();
        int i2 = Build.VERSION.SDK_INT;
        this.K0 = i2 < 29 ? new h0(c2, null) : new j0();
        addOnAttachStateChangeListener(this.z);
        setWillNotDraw(false);
        setFocusable(true);
        if (i2 >= 26) {
            P0.F.a.a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        Z.U(this, gVar);
        Qa.l a5 = androidx.compose.ui.platform.k.I8.a();
        if (a5 != null) {
            a5.invoke(this);
        }
        setOnDragListener(getDragAndDropManager());
        getRoot().A(this);
        if (i2 >= 29) {
            P0.v.a.a(this);
        }
        if (z) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(o0.l.J, Boolean.TRUE);
            this.e = view;
            addView(view);
        }
        this.M0 = i2 >= 31 ? new V0.k() : null;
        this.O0 = new o();
    }

    public static /* synthetic */ void K(AndroidComposeView androidComposeView, boolean z) {
        a1(androidComposeView, z);
    }

    public static /* synthetic */ void L(Qa.a aVar) {
        R0(aVar);
    }

    public static /* synthetic */ void M(AndroidComposeView androidComposeView) {
        V0(androidComposeView);
    }

    public static /* synthetic */ void N(AndroidComposeView androidComposeView) {
        U0(androidComposeView);
    }

    public static /* synthetic */ void O(AndroidComposeView androidComposeView) {
        x0(androidComposeView);
    }

    public static final /* synthetic */ void P(AndroidComposeView androidComposeView, int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        androidComposeView.l0(i2, accessibilityNodeInfo, str);
    }

    public static final /* synthetic */ boolean Q(AndroidComposeView androidComposeView, MotionEvent motionEvent) {
        return super/*android.view.View*/.dispatchGenericMotionEvent(motionEvent);
    }

    public static final /* synthetic */ boolean R(AndroidComposeView androidComposeView, KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public static final void R0(Qa.a aVar) {
        Trace.beginSection("AndroidOwner:outOfFrameExecutor");
        try {
            aVar.invoke();
        } finally {
            Trace.endSection();
        }
    }

    public static final /* synthetic */ View S(AndroidComposeView androidComposeView, int i2) {
        return androidComposeView.u0(i2);
    }

    public static final /* synthetic */ Method T() {
        return T0;
    }

    public static /* synthetic */ void T0(AndroidComposeView androidComposeView, J j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = null;
        }
        androidComposeView.S0(j2);
    }

    public static final /* synthetic */ androidx.compose.ui.platform.g U(AndroidComposeView androidComposeView) {
        return androidComposeView.y;
    }

    public static final void U0(AndroidComposeView androidComposeView) {
        androidComposeView.b1();
    }

    public static final /* synthetic */ L V() {
        return U0;
    }

    public static final void V0(AndroidComposeView androidComposeView) {
        androidComposeView.I0 = false;
        MotionEvent motionEvent = androidComposeView.A0;
        kotlin.jvm.internal.t.d(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        androidComposeView.W0(motionEvent);
    }

    public static final /* synthetic */ Method W() {
        return S0;
    }

    public static final /* synthetic */ MotionEvent X(AndroidComposeView androidComposeView) {
        return androidComposeView.A0;
    }

    public static final /* synthetic */ long Y(AndroidComposeView androidComposeView) {
        return androidComposeView.B0;
    }

    public static /* synthetic */ void Y0(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i2, long j2, boolean z, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            z = true;
        }
        androidComposeView.X0(motionEvent, i2, j2, z);
    }

    public static final /* synthetic */ t Z(AndroidComposeView androidComposeView) {
        return androidComposeView.G0;
    }

    public static final /* synthetic */ Runnable a0() {
        return V0;
    }

    public static final void a1(AndroidComposeView androidComposeView, boolean z) {
        androidComposeView.x0.b(z ? E0.a.b.b() : E0.a.b.a());
    }

    public static final /* synthetic */ Class b0() {
        return R0;
    }

    public static final /* synthetic */ b c0(AndroidComposeView androidComposeView) {
        return androidComposeView.get_viewTreeOwners();
    }

    public static final /* synthetic */ void d0(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i2, long j2, boolean z) {
        androidComposeView.X0(motionEvent, i2, j2, z);
    }

    public static final /* synthetic */ void e0(Method method) {
        T0 = method;
    }

    public static final /* synthetic */ void f0(Method method) {
        S0 = method;
    }

    public static final /* synthetic */ void g0(AndroidComposeView androidComposeView, long j2) {
        androidComposeView.B0 = j2;
    }

    @Ca.e
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @Ca.e
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    private final b get_viewTreeOwners() {
        return (b) this.i0.getValue();
    }

    public static final /* synthetic */ void h0(Runnable runnable) {
        V0 = runnable;
    }

    public static final /* synthetic */ void i0(Class cls) {
        R0 = cls;
    }

    public static final /* synthetic */ boolean j0(AndroidComposeView androidComposeView, r0.g gVar, long j2, Qa.l lVar) {
        return androidComposeView.Z0(gVar, j2, lVar);
    }

    private void setDensity(n1.d dVar) {
        this.d.setValue(dVar);
    }

    private void setFontFamilyResolver(u.b bVar) {
        this.t0.setValue(bVar);
    }

    private void setLayoutDirection(n1.t tVar) {
        this.v0.setValue(tVar);
    }

    private final void set_viewTreeOwners(b bVar) {
        this.i0.setValue(bVar);
    }

    public static final void x0(AndroidComposeView androidComposeView) {
        androidComposeView.b1();
    }

    public void A(float f2) {
        if (this.f) {
            if (f2 > 0.0f) {
                if (Float.isNaN(this.E0) || f2 > this.E0) {
                    this.E0 = f2;
                    return;
                }
                return;
            }
            if (f2 < 0.0f) {
                if (Float.isNaN(this.F0) || f2 < this.F0) {
                    this.F0 = f2;
                }
            }
        }
    }

    public final boolean A0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    public long B(long j2) {
        L0();
        long f2 = v0.g1.f(this.c0, j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (f2 >> 32)) + Float.intBitsToFloat((int) (this.g0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (f2 & 4294967295L)) + Float.intBitsToFloat((int) (this.g0 & 4294967295L));
        return u0.f.e((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public void B0() {
        C0(getRoot());
    }

    public void C(J j2, int i2) {
        getLayoutNodes().p(i2);
        getLayoutNodes().s(j2.y(), j2);
    }

    public final void C0(J j2) {
        j2.P0();
        d0.c H0 = j2.H0();
        Object[] objArr = H0.a;
        int m2 = H0.m();
        for (int i2 = 0; i2 < m2; i2++) {
            C0((J) objArr[i2]);
        }
    }

    public void D(J j2) {
        p0.f fVar;
        if (o0.h.b) {
            getRectManager().n(j2);
        }
        if (m0() && o0.h.c && (fVar = this.L) != null) {
            fVar.g(j2);
        }
    }

    public final void D0(J j2) {
        W.J(this.V, j2, false, 2, null);
        d0.c H0 = j2.H0();
        Object[] objArr = H0.a;
        int m2 = H0.m();
        for (int i2 = 0; i2 < m2; i2++) {
            D0((J) objArr[i2]);
        }
    }

    public void E(J j2, boolean z, boolean z2, boolean z3) {
        if (z) {
            if (this.V.F(j2, z2) && z3) {
                S0(j2);
                return;
            }
            return;
        }
        if (this.V.I(j2, z2) && z3) {
            S0(j2);
        }
    }

    public final boolean E0() {
        return this.f;
    }

    public void F(J j2, boolean z, boolean z2) {
        if (z) {
            if (this.V.E(j2, z2)) {
                T0(this, null, 1, null);
            }
        } else if (this.V.H(j2, z2)) {
            T0(this, null, 1, null);
        }
    }

    public final boolean F0(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i2 = 1; i2 < pointerCount; i2++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i2)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i2)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !T0.a.a(motionEvent, i2));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    public void G() {
        p0.f fVar;
        if (this.M) {
            getSnapshotObserver().b();
            this.M = false;
        }
        T t2 = this.R;
        if (t2 != null) {
            q0(t2);
        }
        if (m0() && o0.h.c && (fVar = this.L) != null) {
            fVar.f();
        }
        while (this.D0.g() && this.D0.c(0) != null) {
            int d2 = this.D0.d();
            for (int i2 = 0; i2 < d2; i2++) {
                Qa.a aVar = (Qa.a) this.D0.c(i2);
                this.D0.u(i2, null);
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.D0.s(0, d2);
        }
    }

    public final boolean G0(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    public void H() {
        this.y.u0();
        this.z.v();
    }

    public final boolean H0(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        return 0.0f <= x2 && x2 <= ((float) getWidth()) && 0.0f <= y2 && y2 <= ((float) getHeight());
    }

    public void I(J j2, long j3) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.V.w(j2, j3);
            if (!this.V.p()) {
                W.f(this.V, false, 1, null);
                s0();
            }
            if (o0.h.b) {
                getRectManager().c();
            }
            I i2 = I.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean I0(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.A0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public void J(J j2, boolean z) {
        this.V.k(j2, z);
    }

    public final void J0(o0 o0Var, boolean z) {
        if (!z) {
            if (this.F) {
                return;
            }
            this.D.remove(o0Var);
            List list = this.E;
            if (list != null) {
                list.remove(o0Var);
                return;
            }
            return;
        }
        if (!this.F) {
            this.D.add(o0Var);
            return;
        }
        ArrayList arrayList = this.E;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.E = arrayList;
        }
        arrayList.add(o0Var);
    }

    public final long K0(int i2, int i3) {
        return Ca.C.b(Ca.C.b(i3) | Ca.C.b(Ca.C.b(i2) << 32));
    }

    public final void L0() {
        if (this.f0) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.e0) {
            this.e0 = currentAnimationTimeMillis;
            N0();
            ViewParent parent = getParent();
            AndroidComposeView androidComposeView = this;
            while (parent instanceof ViewGroup) {
                androidComposeView = (View) parent;
                parent = androidComposeView.getParent();
            }
            androidComposeView.getLocationOnScreen(this.a0);
            int[] iArr = this.a0;
            float f2 = iArr[0];
            float f3 = iArr[1];
            androidComposeView.getLocationInWindow(iArr);
            float f4 = this.a0[0];
            float f5 = f3 - r0[1];
            this.g0 = u0.f.e((Float.floatToRawIntBits(f2 - f4) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
        }
    }

    public final void M0(MotionEvent motionEvent) {
        this.e0 = AnimationUtils.currentAnimationTimeMillis();
        N0();
        float[] fArr = this.c0;
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        long f2 = v0.g1.f(fArr, u0.f.e((Float.floatToRawIntBits(y2) & 4294967295L) | (Float.floatToRawIntBits(x2) << 32)));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (f2 >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (f2 & 4294967295L));
        this.g0 = u0.f.e((Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L));
    }

    public final void N0() {
        this.K0.a(this, this.c0);
        P0.a(this.c0, this.d0);
    }

    public final boolean O0(o0 o0Var) {
        this.C0.c(o0Var);
        this.D.remove(o0Var);
        return true;
    }

    public final void P0(q1.b bVar) {
        getAndroidViewsHandler$ui_release().removeViewInLayout(bVar);
        HashMap layoutNodeToHolder = getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
        V.d(layoutNodeToHolder).remove(getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(bVar));
        bVar.setImportantForAccessibility(0);
    }

    public final void Q0() {
        this.M = true;
    }

    public final void S0(J j2) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (j2 != null) {
            while (j2 != null && j2.o0() == J.g.a && p0(j2)) {
                j2 = j2.z0();
            }
            if (j2 == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final int W0(MotionEvent motionEvent) {
        Object obj;
        if (this.L0) {
            this.L0 = false;
            this.m.c(P.b(motionEvent.getMetaState()));
        }
        I0.E c2 = this.H.c(motionEvent, this);
        if (c2 == null) {
            this.I.c();
            return I0.H.a(false, false, false);
        }
        List b2 = c2.b();
        int size = b2.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                obj = b2.get(size);
                if (((I0.F) obj).b()) {
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                size = i2;
            }
            obj = null;
        } else {
            obj = null;
        }
        I0.F f2 = (I0.F) obj;
        if (f2 != null) {
            this.a = f2.f();
        }
        int b3 = this.I.b(c2, this, H0(motionEvent));
        c2.c(null);
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (b3 & 1) != 0) {
            return b3;
        }
        this.H.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return b3;
    }

    public final void X0(MotionEvent motionEvent, int i2, long j2, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i3 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i3 = motionEvent.getActionIndex();
            }
        } else if (i2 != 9 && i2 != 10) {
            i3 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i3 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerPropertiesArr[i4] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i5 = 0; i5 < pointerCount; i5++) {
            pointerCoordsArr[i5] = new MotionEvent.PointerCoords();
        }
        int i6 = 0;
        while (i6 < pointerCount) {
            int i7 = ((i3 < 0 || i6 < i3) ? 0 : 1) + i6;
            motionEvent.getPointerProperties(i7, pointerPropertiesArr[i6]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i6];
            motionEvent.getPointerCoords(i7, pointerCoords);
            float f2 = pointerCoords.x;
            long B = B(u0.f.e((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32)));
            pointerCoords.x = Float.intBitsToFloat((int) (B >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (B & 4294967295L));
            i6++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j2 : motionEvent.getDownTime(), j2, i2, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        I0.E c2 = this.H.c(obtain, this);
        kotlin.jvm.internal.t.d(c2);
        this.I.b(c2, this, true);
        obtain.recycle();
    }

    public final boolean Z0(r0.g gVar, long j2, Qa.l lVar) {
        Resources resources = getContext().getResources();
        return P0.w.a.a(this, gVar, new r0.a(n1.f.a(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j2, lVar, null));
    }

    public void addView(View view) {
        addView(view, -1);
    }

    public void autofill(SparseArray sparseArray) {
        p0.f fVar;
        if (m0()) {
            if (o0.h.c && (fVar = this.L) != null) {
                fVar.j(sparseArray);
            }
            p0.d dVar = this.K;
            if (dVar != null) {
                p0.h.a(dVar, sparseArray);
            }
        }
    }

    public void b() {
        if (isFocused() || (!o0.h.d && hasFocus())) {
            super.clearFocus();
        } else if (hasFocus()) {
            View findFocus = findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            super.clearFocus();
        }
    }

    public final void b1() {
        getLocationOnScreen(this.a0);
        long j2 = this.W;
        int k2 = n1.n.k(j2);
        int l2 = n1.n.l(j2);
        int[] iArr = this.a0;
        boolean z = false;
        int i2 = iArr[0];
        if (k2 != i2 || l2 != iArr[1] || this.e0 < 0) {
            this.W = n1.n.f((i2 << 32) | (iArr[1] & 4294967295L));
            if (k2 != Integer.MAX_VALUE && l2 != Integer.MAX_VALUE) {
                getRoot().d0().v().d2();
                z = true;
            }
        }
        L0();
        View view = this.N0;
        if (view == null) {
            view = getRootView();
            this.N0 = view;
        }
        getRectManager().q(this.W, n1.o.d(this.g0), this.c0, view.getWidth(), view.getHeight());
        this.V.e(z);
        if (o0.h.b) {
            getRectManager().c();
        }
    }

    public boolean c(androidx.compose.ui.focus.c cVar, u0.h hVar) {
        Integer c2;
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus((cVar == null || (c2 = androidx.compose.ui.focus.e.c(cVar.o())) == null) ? 130 : c2.intValue(), hVar != null ? s1.b(hVar) : null);
    }

    public final void c1() {
        C0 b2 = R0.b(this.m);
        if (b2 != null) {
            b2.setValue(n1.r.b(P0.W.d(this)));
        }
    }

    public boolean canScrollHorizontally(int i2) {
        return this.y.Q(false, i2, this.a);
    }

    public boolean canScrollVertically(int i2) {
        return this.y.Q(true, i2, this.a);
    }

    public void d(boolean z) {
        Qa.a aVar;
        if (this.V.p() || this.V.q()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    aVar = this.J0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                aVar = null;
            }
            if (this.V.v(aVar)) {
                requestLayout();
            }
            W.f(this.V, false, 1, null);
            s0();
            I i2 = I.a;
            Trace.endSection();
        }
    }

    public void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            C0(getRoot());
        }
        View view = null;
        p0.p(this, false, 1, null);
        l0.l.e.f();
        this.F = true;
        k0 k0Var = this.q;
        Canvas a2 = k0Var.a().a();
        k0Var.a().y(canvas);
        getRoot().I(k0Var.a(), null);
        k0Var.a().y(a2);
        if (!this.D.isEmpty()) {
            int size = this.D.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((o0) this.D.get(i2)).k();
            }
        }
        if (androidx.compose.ui.platform.j.b.a()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.D.clear();
        this.F = false;
        List list = this.E;
        if (list != null) {
            kotlin.jvm.internal.t.d(list);
            this.D.addAll(list);
            list.clear();
        }
        if (this.f) {
            P0.Z.a(this, this.E0);
            View view2 = this.e;
            if (view2 == null) {
                kotlin.jvm.internal.t.v("frameRateCategoryView");
                view2 = null;
            }
            P0.Z.a(view2, this.F0);
            if (!Float.isNaN(this.F0)) {
                View view3 = this.e;
                if (view3 == null) {
                    kotlin.jvm.internal.t.v("frameRateCategoryView");
                    view3 = null;
                }
                view3.invalidate();
                View view4 = this.e;
                if (view4 == null) {
                    kotlin.jvm.internal.t.v("frameRateCategoryView");
                } else {
                    view = view4;
                }
                drawChild(canvas, view, getDrawingTime());
            }
            this.E0 = Float.NaN;
            this.F0 = Float.NaN;
        }
        if (o0.h.b) {
            getRectManager().c();
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.I0) {
            removeCallbacks(this.H0);
            if (motionEvent.getActionMasked() == 8) {
                this.I0 = false;
            } else {
                this.H0.run();
            }
        }
        if (F0(motionEvent) || !isAttachedToWindow()) {
            return super/*android.view.View*/.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 8) {
            return motionEvent.isFromSource(4194304) ? z0(motionEvent) : (y0(motionEvent) & 1) != 0;
        }
        if (!motionEvent.isFromSource(2)) {
            if (getFocusOwner().j(new F0.a(u0.f.e((Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX()) << 32)), motionEvent.getEventTime(), F0.b.a(motionEvent.getActionMasked()), motionEvent, null), new g(motionEvent))) {
                return true;
            }
        }
        return super/*android.view.View*/.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.I0) {
            removeCallbacks(this.H0);
            this.H0.run();
        }
        if (F0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.y.Y(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && H0(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.A0;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.A0 = MotionEvent.obtainNoHistory(motionEvent);
                this.I0 = true;
                postDelayed(this.H0, 8L);
                return false;
            }
        } else if (!I0(motionEvent)) {
            return false;
        }
        return (y0(motionEvent) & 1) != 0;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().n(G0.b.b(keyEvent), new h(keyEvent));
        }
        this.m.c(P.b(keyEvent.getMetaState()));
        return t0.k.l(getFocusOwner(), G0.b.b(keyEvent), null, 2, null) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().e(G0.b.b(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent);
    }

    public void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            P0.t.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.I0) {
            removeCallbacks(this.H0);
            MotionEvent motionEvent2 = this.A0;
            kotlin.jvm.internal.t.d(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || A0(motionEvent, motionEvent2)) {
                this.H0.run();
            } else {
                this.I0 = false;
            }
        }
        if (F0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !I0(motionEvent)) {
            return false;
        }
        int y0 = y0(motionEvent);
        if ((y0 & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (y0 & 1) != 0;
    }

    public boolean e(int i2) {
        T t2;
        if (!o0.h.d) {
            c.a aVar = androidx.compose.ui.focus.c.b;
            if (androidx.compose.ui.focus.c.l(i2, aVar.b()) || androidx.compose.ui.focus.c.l(i2, aVar.c())) {
                return false;
            }
            Integer c2 = androidx.compose.ui.focus.e.c(i2);
            if (c2 == null) {
                throw new IllegalStateException("Invalid focus direction");
            }
            int intValue = c2.intValue();
            u0.h embeddedViewFocusRect = getEmbeddedViewFocusRect();
            r2 = embeddedViewFocusRect != null ? s1.b(embeddedViewFocusRect) : null;
            androidx.compose.ui.platform.h a2 = androidx.compose.ui.platform.h.f.a();
            View d2 = r2 == null ? a2.d(this, findFocus(), intValue) : a2.f(this, r2, intValue);
            if (d2 != null) {
                return androidx.compose.ui.focus.e.b(d2, Integer.valueOf(intValue), r2);
            }
            return false;
        }
        c.a aVar2 = androidx.compose.ui.focus.c.b;
        if (androidx.compose.ui.focus.c.l(i2, aVar2.b()) || androidx.compose.ui.focus.c.l(i2, aVar2.c()) || !hasFocus() || (t2 = this.R) == null) {
            return false;
        }
        Integer c3 = androidx.compose.ui.focus.e.c(i2);
        if (c3 == null) {
            throw new IllegalStateException("Invalid focus direction");
        }
        int intValue2 = c3.intValue();
        ViewGroup rootView = getRootView();
        kotlin.jvm.internal.t.e(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = rootView;
        View findFocus = viewGroup.findFocus();
        if (findFocus == null) {
            throw new IllegalStateException("view hasFocus but root can't find it");
        }
        View d3 = androidx.compose.ui.platform.h.f.a().d(viewGroup, findFocus, intValue2);
        if (!androidx.compose.ui.focus.g.a(i2) || !t2.hasFocus()) {
            u0.h embeddedViewFocusRect2 = getEmbeddedViewFocusRect();
            r2 = embeddedViewFocusRect2 != null ? s1.b(embeddedViewFocusRect2) : null;
            if (d3 != null && r2 != null) {
                viewGroup.offsetDescendantRectToMyCoords(this, r2);
                viewGroup.offsetRectIntoDescendantCoords(d3, r2);
            }
        }
        if (d3 == null || d3 == findFocus) {
            return false;
        }
        ViewParent focusedChild = t2.getFocusedChild();
        ViewParent parent = d3.getParent();
        while (parent != null && parent != focusedChild) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return false;
        }
        return androidx.compose.ui.focus.e.b(d3, Integer.valueOf(intValue2), r2);
    }

    public final View findViewByAccessibilityIdTraversal(int i2) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, new Object[]{Integer.valueOf(i2)});
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = v0(i2, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (androidx.compose.ui.focus.s.m(androidx.compose.ui.focus.p.d((androidx.compose.ui.focus.FocusTargetNode) r3.a), androidx.compose.ui.focus.e.a(r0, r6), r1, r2) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View focusSearch(android.view.View r7, int r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L7c
            O0.W r0 = r6.V
            boolean r0 = r0.o()
            if (r0 == 0) goto Lc
            goto L7c
        Lc:
            androidx.compose.ui.platform.h$b r0 = androidx.compose.ui.platform.h.f
            androidx.compose.ui.platform.h r0 = r0.a()
            android.view.View r0 = r0.d(r6, r7, r8)
            if (r7 != r6) goto L27
            t0.k r1 = r6.getFocusOwner()
            u0.h r1 = r1.q()
            if (r1 != 0) goto L2b
            u0.h r1 = androidx.compose.ui.focus.e.a(r7, r6)
            goto L2b
        L27:
            u0.h r1 = androidx.compose.ui.focus.e.a(r7, r6)
        L2b:
            androidx.compose.ui.focus.c r2 = androidx.compose.ui.focus.e.d(r8)
            if (r2 == 0) goto L36
            int r2 = r2.o()
            goto L3c
        L36:
            androidx.compose.ui.focus.c$a r2 = androidx.compose.ui.focus.c.b
            int r2 = r2.a()
        L3c:
            kotlin.jvm.internal.O r3 = new kotlin.jvm.internal.O
            r3.<init>()
            t0.k r4 = r6.getFocusOwner()
            androidx.compose.ui.platform.AndroidComposeView$j r5 = new androidx.compose.ui.platform.AndroidComposeView$j
            r5.<init>(r3)
            java.lang.Boolean r4 = r4.d(r2, r1, r5)
            if (r4 != 0) goto L51
            goto L7b
        L51:
            java.lang.Object r4 = r3.a
            if (r4 != 0) goto L58
            if (r0 != 0) goto L7a
            goto L7b
        L58:
            if (r0 != 0) goto L5c
        L5a:
            r7 = r6
            goto L7b
        L5c:
            boolean r4 = androidx.compose.ui.focus.g.a(r2)
            if (r4 == 0) goto L67
            android.view.View r7 = super.focusSearch(r7, r8)
            goto L7b
        L67:
            java.lang.Object r7 = r3.a
            androidx.compose.ui.focus.FocusTargetNode r7 = (androidx.compose.ui.focus.FocusTargetNode) r7
            u0.h r7 = androidx.compose.ui.focus.p.d(r7)
            u0.h r8 = androidx.compose.ui.focus.e.a(r0, r6)
            boolean r7 = androidx.compose.ui.focus.s.m(r7, r8, r1, r2)
            if (r7 == 0) goto L7a
            goto L5a
        L7a:
            r7 = r0
        L7b:
            return r7
        L7c:
            android.view.View r7 = super.focusSearch(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.focusSearch(android.view.View, int):android.view.View");
    }

    public long g(long j2) {
        L0();
        return v0.g1.f(this.c0, j2);
    }

    public final T getAndroidViewsHandler$ui_release() {
        if (this.R == null) {
            T t2 = new T(getContext());
            this.R = t2;
            addView(t2);
            requestLayout();
        }
        T t3 = this.R;
        kotlin.jvm.internal.t.d(t3);
        return t3;
    }

    public p0.k getAutofill() {
        return this.K;
    }

    public p0.G getAutofillManager() {
        return this.L;
    }

    public H getAutofillTree() {
        return this.C;
    }

    public final Qa.l getConfigurationChangeObserver() {
        return this.J;
    }

    public final q0.b getContentCaptureManager$ui_release() {
        return this.z;
    }

    public Ga.i getCoroutineContext() {
        return this.k;
    }

    public n1.d getDensity() {
        return (n1.d) this.d.getValue();
    }

    public u0.h getEmbeddedViewFocusRect() {
        if (isFocused()) {
            return getFocusOwner().q();
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return androidx.compose.ui.focus.e.a(findFocus, this);
        }
        return null;
    }

    public t0.k getFocusOwner() {
        return this.j;
    }

    public void getFocusedRect(Rect rect) {
        u0.h embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.i());
            rect.top = Math.round(embeddedViewFocusRect.l());
            rect.right = Math.round(embeddedViewFocusRect.j());
            rect.bottom = Math.round(embeddedViewFocusRect.e());
            return;
        }
        if (kotlin.jvm.internal.t.c(getFocusOwner().d(androidx.compose.ui.focus.c.b.a(), null, k.a), Boolean.TRUE)) {
            super/*android.view.View*/.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public u.b getFontFamilyResolver() {
        return (u.b) this.t0.getValue();
    }

    public t.a getFontLoader() {
        return this.s0;
    }

    public Z0 getGraphicsContext() {
        return this.B;
    }

    public D0.a getHapticFeedBack() {
        return this.w0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.V.p();
    }

    public int getImportantForAutofill() {
        return 1;
    }

    public E0.b getInputModeManager() {
        return this.x0;
    }

    public final androidx.compose.ui.layout.f getInsetsListener() {
        return this.s;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.e0;
    }

    public n1.t getLayoutDirection() {
        return (n1.t) this.v0.getValue();
    }

    public long getMeasureIteration() {
        return this.V.s();
    }

    public N0.f getModifierLocalManager() {
        return this.y0;
    }

    public q.a getPlacementScope() {
        return androidx.compose.ui.layout.r.b(this);
    }

    public z getPointerIconService() {
        return this.O0;
    }

    public X0.b getRectManager() {
        return this.v;
    }

    public J getRoot() {
        return this.t;
    }

    public y0 getRootForTest() {
        return this.w;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        V0.k kVar;
        if (Build.VERSION.SDK_INT < 31 || (kVar = this.M0) == null) {
            return false;
        }
        return kVar.c();
    }

    public W0.w getSemanticsOwner() {
        return this.x;
    }

    public O0.L getSharedDrawScope() {
        return this.c;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? P0.Y.a.a(this) : this.Q;
    }

    public r0 getSnapshotObserver() {
        return this.P;
    }

    public g1 getSoftwareKeyboardController() {
        return this.r0;
    }

    public f1.W getTextInputService() {
        return this.p0;
    }

    public j1 getTextToolbar() {
        return this.z0;
    }

    public final y0.a getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    public View getView() {
        return this;
    }

    public r1 getViewConfiguration() {
        return this.r;
    }

    public final b getViewTreeOwners() {
        return (b) this.j0.getValue();
    }

    public u1 getWindowInfo() {
        return this.m;
    }

    public final p0.f get_autofillManager$ui_release() {
        return this.L;
    }

    public void h(View view) {
        this.G = true;
    }

    public void i(Qa.a aVar) {
        if (this.D0.a(aVar)) {
            return;
        }
        this.D0.k(aVar);
    }

    public void k(J j2, int i2) {
        p0.f fVar;
        if (m0() && o0.h.c && (fVar = this.L) != null) {
            fVar.i(j2, i2);
        }
        getRectManager().k(j2, true);
    }

    public final void k0(q1.b bVar, J j2) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(bVar, j2);
        getAndroidViewsHandler$ui_release().addView(bVar);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(j2, bVar);
        bVar.setImportantForAccessibility(1);
        Z.U(bVar, new d(j2, this));
    }

    public final void l0(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int e2;
        if (kotlin.jvm.internal.t.c(str, this.y.f0())) {
            int e3 = this.y.h0().e(i2, -1);
            if (e3 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, e3);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.t.c(str, this.y.e0()) || (e2 = this.y.g0().e(i2, -1)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, e2);
    }

    public final boolean m0() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public void n(float[] fArr) {
        L0();
        v0.g1.l(fArr, this.c0);
        P0.G.d(fArr, Float.intBitsToFloat((int) (this.g0 >> 32)), Float.intBitsToFloat((int) (this.g0 & 4294967295L)), this.b0);
    }

    public final Object n0(Ga.e eVar) {
        Object P = this.y.P(eVar);
        return P == Ha.c.f() ? P : I.a;
    }

    public o0 o(Qa.p pVar, Qa.a aVar, y0.c cVar) {
        if (cVar != null) {
            return new E0(cVar, null, this, pVar, aVar);
        }
        o0 o0Var = (o0) this.C0.b();
        if (o0Var == null) {
            return new E0(getGraphicsContext().b(), getGraphicsContext(), this, pVar, aVar);
        }
        o0Var.f(pVar, aVar);
        return o0Var;
    }

    public final Object o0(Ga.e eVar) {
        Object e2 = this.z.e(eVar);
        return e2 == Ha.c.f() ? e2 : I.a;
    }

    public void onAttachedToWindow() {
        androidx.lifecycle.r a2;
        androidx.lifecycle.k lifecycle;
        androidx.lifecycle.r a3;
        p0.d dVar;
        super.onAttachedToWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            setShowLayoutBounds(a.c(P0));
        }
        if (o0.h.e) {
            this.s.onViewAttachedToWindow(this);
        }
        a.b(P0, this);
        this.m.e(hasWindowFocus());
        this.m.d(new n());
        c1();
        D0(getRoot());
        C0(getRoot());
        getSnapshotObserver().k();
        if (m0() && (dVar = this.K) != null) {
            p0.F.a.a(dVar);
        }
        androidx.lifecycle.r a4 = a0.a(this);
        j4.i a5 = j4.m.a(this);
        b viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.k kVar = null;
        if (viewTreeOwners == null || (a4 != null && a5 != null && (a4 != viewTreeOwners.a() || a5 != viewTreeOwners.a()))) {
            if (a4 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (a5 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (a2 = viewTreeOwners.a()) != null && (lifecycle = a2.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            a4.getLifecycle().addObserver(this);
            b bVar = new b(a4, a5);
            set_viewTreeOwners(bVar);
            Qa.l lVar = this.k0;
            if (lVar != null) {
                lVar.invoke(bVar);
            }
            this.k0 = null;
        }
        this.x0.b(isInTouchMode() ? E0.a.b.b() : E0.a.b.a());
        b viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (a3 = viewTreeOwners2.a()) != null) {
            kVar = a3.getLifecycle();
        }
        if (kVar == null) {
            L0.a.c("No lifecycle owner exists");
            throw new Ca.i();
        }
        kVar.addObserver(this);
        kVar.addObserver(this.z);
        getViewTreeObserver().addOnGlobalLayoutListener(this.l0);
        getViewTreeObserver().addOnScrollChangedListener(this.m0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.n0);
        if (i2 >= 31) {
            B.a.b(this);
        }
        p0.f fVar = this.L;
        if (fVar != null) {
            getFocusOwner().u().k(fVar);
            getSemanticsOwner().b().k(fVar);
        }
    }

    public boolean onCheckIsTextEditor() {
        P0.I i2 = (P0.I) o0.o.c(this.q0);
        return i2 == null ? this.o0.r() : i2.e();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
        setDensity(n1.a.a(getContext()));
        c1();
        if (w0(configuration) != this.u0) {
            this.u0 = w0(configuration);
            setFontFamilyResolver(A.a(getContext()));
        }
        this.J.invoke(configuration);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        P0.I i2 = (P0.I) o0.o.c(this.q0);
        return i2 == null ? this.o0.o(editorInfo) : i2.d(editorInfo);
    }

    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        this.z.s(jArr, iArr, consumer);
    }

    public void onDetachedFromWindow() {
        p0.d dVar;
        androidx.lifecycle.r a2;
        super.onDetachedFromWindow();
        if (o0.h.e) {
            this.s.onViewDetachedFromWindow(this);
        }
        androidx.lifecycle.k kVar = null;
        if (this.f) {
            View view = this.e;
            if (view == null) {
                kotlin.jvm.internal.t.v("frameRateCategoryView");
                view = null;
            }
            removeView(view);
        }
        a.d(P0, this);
        getSnapshotObserver().l();
        this.m.d(null);
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (a2 = viewTreeOwners.a()) != null) {
            kVar = a2.getLifecycle();
        }
        if (kVar == null) {
            L0.a.c("No lifecycle owner exists");
            throw new Ca.i();
        }
        kVar.removeObserver(this.z);
        kVar.removeObserver(this);
        if (m0() && (dVar = this.K) != null) {
            p0.F.a.b(dVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.l0);
        getViewTreeObserver().removeOnScrollChangedListener(this.m0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.n0);
        if (Build.VERSION.SDK_INT >= 31) {
            B.a.a(this);
        }
        p0.f fVar = this.L;
        if (fVar != null) {
            getSemanticsOwner().b().q(fVar);
            getFocusOwner().u().q(fVar);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super/*android.view.View*/.onFocusChanged(z, i2, rect);
        if (z || hasFocus()) {
            return;
        }
        getFocusOwner().s();
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        this.e0 = 0L;
        this.V.v(this.J0);
        this.T = null;
        b1();
        if (this.R != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    public void onMeasure(int i2, int i3) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                D0(getRoot());
            }
            long r0 = r0(i2);
            int b2 = (int) Ca.C.b(r0 >>> 32);
            int b3 = (int) Ca.C.b(r0 & 4294967295L);
            long r02 = r0(i3);
            long a2 = n1.b.b.a(b2, b3, (int) Ca.C.b(r02 >>> 32), (int) Ca.C.b(4294967295L & r02));
            n1.b bVar = this.T;
            boolean z = false;
            if (bVar == null) {
                this.T = n1.b.a(a2);
                this.U = false;
            } else {
                if (bVar != null) {
                    z = n1.b.f(bVar.r(), a2);
                }
                if (!z) {
                    this.U = true;
                }
            }
            this.V.L(a2);
            this.V.x();
            setMeasuredDimension(getRoot().E0(), getRoot().W());
            if (this.R != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().E0(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().W(), 1073741824));
            }
            I i4 = I.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        p0.f fVar;
        if (!m0() || viewStructure == null) {
            return;
        }
        if (o0.h.c && (fVar = this.L) != null) {
            fVar.k(viewStructure);
        }
        p0.d dVar = this.K;
        if (dVar != null) {
            p0.h.b(dVar, viewStructure);
        }
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        I0.x b2;
        int toolType = motionEvent.getToolType(i2);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (b2 = getPointerIconService().b()) == null) ? super.onResolvePointerIcon(motionEvent, i2) : C.a.b(getContext(), b2);
    }

    public void onResume(androidx.lifecycle.r rVar) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(a.c(P0));
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        if (this.b) {
            n1.t f2 = androidx.compose.ui.focus.e.f(i2);
            if (f2 == null) {
                f2 = n1.t.a;
            }
            setLayoutDirection(f2);
        }
    }

    public void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        V0.k kVar;
        if (Build.VERSION.SDK_INT < 31 || (kVar = this.M0) == null) {
            return;
        }
        kVar.d(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    public void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        q0.b bVar = this.z;
        bVar.y(bVar, longSparseArray);
    }

    public void onWindowFocusChanged(boolean z) {
        boolean c2;
        this.m.e(z);
        this.L0 = true;
        super/*android.view.View*/.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (c2 = a.c(P0))) {
            return;
        }
        setShowLayoutBounds(c2);
        B0();
    }

    public final boolean p0(J j2) {
        J z0;
        return this.U || !((z0 = j2.z0()) == null || z0.V());
    }

    public long q(long j2) {
        L0();
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (this.g0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (this.g0 & 4294967295L));
        return v0.g1.f(this.d0, u0.f.e((Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2))));
    }

    public final void q0(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            AndroidComposeView childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof AndroidComposeView) {
                childAt.G();
            } else if (childAt instanceof ViewGroup) {
                q0(childAt);
            }
        }
    }

    public void r(J j2) {
        p0.f fVar;
        getLayoutNodes().p(j2.y());
        this.V.z(j2);
        Q0();
        if (o0.h.b) {
            getRectManager().n(j2);
        }
        if (m0() && o0.h.c && (fVar = this.L) != null) {
            fVar.e(j2);
        }
    }

    public final long r0(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return K0(0, size);
        }
        if (mode == 0) {
            return K0(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return K0(size, size);
        }
        throw new IllegalStateException();
    }

    public boolean requestFocus(int i2, Rect rect) {
        View u0;
        if (!o0.h.d) {
            if (isFocused()) {
                return true;
            }
            if (getFocusOwner().o().b()) {
                return super.requestFocus(i2, rect);
            }
            androidx.compose.ui.focus.c d2 = androidx.compose.ui.focus.e.d(i2);
            int o2 = d2 != null ? d2.o() : androidx.compose.ui.focus.c.b.b();
            return kotlin.jvm.internal.t.c(getFocusOwner().d(o2, rect != null ? s1.e(rect) : null, new p(o2)), Boolean.TRUE);
        }
        if (isFocused()) {
            return true;
        }
        if (this.n) {
            return false;
        }
        androidx.compose.ui.focus.c d3 = androidx.compose.ui.focus.e.d(i2);
        int o3 = d3 != null ? d3.o() : androidx.compose.ui.focus.c.b.b();
        if (hasFocus() && e(o3)) {
            return true;
        }
        kotlin.jvm.internal.J j2 = new kotlin.jvm.internal.J();
        Boolean d4 = getFocusOwner().d(o3, rect != null ? s1.e(rect) : null, new r(j2, o3));
        if (d4 == null) {
            return false;
        }
        if (d4.booleanValue()) {
            return true;
        }
        if (j2.a) {
            return false;
        }
        if ((rect != null && !hasFocus() && kotlin.jvm.internal.t.c(getFocusOwner().d(o3, null, new q(o3)), Boolean.TRUE)) || (u0 = u0(i2)) == null || u0 == this) {
            return true;
        }
        this.n = true;
        boolean requestFocus = u0.requestFocus(i2);
        this.n = false;
        return requestFocus;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object s(Qa.p r5, Ga.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.AndroidComposeView.w
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.AndroidComposeView$w r0 = (androidx.compose.ui.platform.AndroidComposeView.w) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidComposeView$w r0 = new androidx.compose.ui.platform.AndroidComposeView$w
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            Ca.t.b(r6)
            goto L44
        L31:
            Ca.t.b(r6)
            java.util.concurrent.atomic.AtomicReference r6 = r4.q0
            androidx.compose.ui.platform.AndroidComposeView$x r2 = new androidx.compose.ui.platform.AndroidComposeView$x
            r2.<init>()
            r0.c = r3
            java.lang.Object r5 = o0.o.d(r6, r2, r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            Ca.i r5 = new Ca.i
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.s(Qa.p, Ga.e):java.lang.Object");
    }

    public final void s0() {
        if (this.G) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.G = false;
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j2) {
        this.y.R0(j2);
    }

    public final void setConfigurationChangeObserver(Qa.l lVar) {
        this.J = lVar;
    }

    public final void setContentCaptureManager$ui_release(q0.b bVar) {
        this.z = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public void setCoroutineContext(Ga.i iVar) {
        this.k = iVar;
        O0.j k2 = getRoot().s0().k();
        if (k2 instanceof X) {
            ((X) k2).D0();
        }
        int a2 = O0.g0.a(16);
        if (!k2.getNode().isAttached()) {
            L0.a.b("visitSubtreeIf called on an unattached node");
        }
        d0.c cVar = new d0.c(new e.c[16], 0);
        e.c child$ui_release = k2.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            O0.k.a(cVar, k2.getNode(), false);
        } else {
            cVar.b(child$ui_release);
        }
        while (cVar.m() != 0) {
            e.c cVar2 = (e.c) cVar.u(cVar.m() - 1);
            if ((cVar2.getAggregateChildKindSet$ui_release() & a2) != 0) {
                for (e.c cVar3 = cVar2; cVar3 != null; cVar3 = cVar3.getChild$ui_release()) {
                    if ((cVar3.getKindSet$ui_release() & a2) != 0) {
                        O0.m mVar = cVar3;
                        ?? r8 = 0;
                        while (mVar != 0) {
                            if (mVar instanceof v0) {
                                v0 v0Var = (v0) mVar;
                                if (v0Var instanceof X) {
                                    ((X) v0Var).D0();
                                }
                            } else if ((mVar.getKindSet$ui_release() & a2) != 0 && (mVar instanceof O0.m)) {
                                e.c F1 = mVar.F1();
                                int i2 = 0;
                                mVar = mVar;
                                r8 = r8;
                                while (F1 != null) {
                                    if ((F1.getKindSet$ui_release() & a2) != 0) {
                                        i2++;
                                        r8 = r8;
                                        if (i2 == 1) {
                                            mVar = F1;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new d0.c(new e.c[16], 0);
                                            }
                                            if (mVar != 0) {
                                                r8.b(mVar);
                                                mVar = 0;
                                            }
                                            r8.b(F1);
                                        }
                                    }
                                    F1 = F1.getChild$ui_release();
                                    mVar = mVar;
                                    r8 = r8;
                                }
                                if (i2 == 1) {
                                }
                            }
                            mVar = O0.k.b(r8);
                        }
                    }
                }
            }
            O0.k.a(cVar, cVar2, false);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j2) {
        this.e0 = j2;
    }

    public final void setOnViewTreeOwnersAvailable(Qa.l lVar) {
        b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.k0 = lVar;
    }

    public void setShowLayoutBounds(boolean z) {
        this.Q = z;
    }

    public void setUncaughtExceptionHandler(y0.a aVar) {
        this.V.K(aVar);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(J j2) {
        this.V.G(j2);
        T0(this, null, 1, null);
    }

    public final void t0(q1.b bVar, Canvas canvas) {
        getAndroidViewsHandler$ui_release().a(bVar, canvas);
    }

    public void u(Qa.a aVar) {
        Handler handler = getHandler();
        if (handler == null) {
            throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
        }
        handler.postAtFrontOfQueue(new P0.m(aVar));
    }

    public final View u0(int i2) {
        androidx.compose.ui.platform.h a2 = androidx.compose.ui.platform.h.f.a();
        AndroidComposeView androidComposeView = this;
        while (androidComposeView != null) {
            View rootView = getRootView();
            kotlin.jvm.internal.t.e(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            androidComposeView = a2.d((ViewGroup) rootView, androidComposeView, i2);
            if (androidComposeView != null && !P0.G.a(this, androidComposeView)) {
                return androidComposeView;
            }
        }
        return null;
    }

    public void v(J j2) {
        getLayoutNodes().s(j2.y(), j2);
    }

    public final View v0(int i2, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", (Class[]) null);
            declaredMethod.setAccessible(true);
            if (kotlin.jvm.internal.t.c(declaredMethod.invoke(view, (Object[]) null), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View v0 = v0(i2, viewGroup.getChildAt(i3));
                    if (v0 != null) {
                        return v0;
                    }
                }
            }
        }
        return null;
    }

    public void w(J j2) {
        this.y.t0(j2);
        this.z.u();
    }

    public final int w0(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return P0.h.a(configuration);
        }
        return 0;
    }

    public long y(long j2) {
        L0();
        return v0.g1.f(this.d0, j2);
    }

    public final int y0(MotionEvent motionEvent) {
        int i2;
        int i3;
        removeCallbacks(this.G0);
        try {
            M0(motionEvent);
            this.f0 = true;
            d(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.A0;
                boolean z = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 == null || !A0(motionEvent, motionEvent2)) {
                    i2 = 10;
                } else {
                    if (G0(motionEvent2)) {
                        this.I.c();
                    } else if (motionEvent2.getActionMasked() != 10 && z) {
                        i2 = 10;
                        Y0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                    i2 = 10;
                }
                boolean z2 = motionEvent.getToolType(0) == 3;
                if (z || !z2 || actionMasked == 3 || actionMasked == 9 || !H0(motionEvent)) {
                    i3 = 9;
                } else {
                    i3 = 9;
                    Y0(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.A0;
                if (motionEvent3 != null && motionEvent3.getAction() == i2) {
                    MotionEvent motionEvent4 = this.A0;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    if (motionEvent.getAction() == i3 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            this.H.e(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.A0;
                        float x2 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.A0;
                        boolean z3 = (x2 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = this.A0;
                        boolean z4 = (motionEvent7 != null ? motionEvent7.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z3 || z4) {
                            if (pointerId >= 0) {
                                this.H.e(pointerId);
                            }
                            this.I.a();
                        }
                    }
                }
                this.A0 = MotionEvent.obtainNoHistory(motionEvent);
                int W0 = W0(motionEvent);
                Trace.endSection();
                return W0;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } finally {
            this.f0 = false;
        }
    }

    public void z(J j2) {
        p0.f fVar;
        if (m0() && o0.h.c && (fVar = this.L) != null) {
            fVar.h(j2);
        }
    }

    public final boolean z0(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f2 = -motionEvent.getAxisValue(26);
        return getFocusOwner().p(new K0.c(f2 * c0.j(viewConfiguration, getContext()), f2 * c0.f(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()), new l(motionEvent));
    }

    public void addView(View view, int i2) {
        kotlin.jvm.internal.t.d(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i2, layoutParams);
    }

    public P0.d getAccessibilityManager() {
        return this.A;
    }

    public P0.e getClipboard() {
        return this.O;
    }

    public P0.f getClipboardManager() {
        return this.N;
    }

    public AndroidDragAndDropManager getDragAndDropManager() {
        return this.l;
    }

    public F getLayoutNodes() {
        return this.u;
    }

    public AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public void addView(View view, int i2, int i3) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i2;
        generateDefaultLayoutParams.height = i3;
        I i4 = I.a;
        addView(view, -1, generateDefaultLayoutParams);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i2, layoutParams, true);
    }

    public final void setUncaughtExceptionHandler$ui_release(y0.a aVar) {
    }
}
