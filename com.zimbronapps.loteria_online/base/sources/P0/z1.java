package P0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.k;
import fb.J;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class z1 {
    public static final Map a = new LinkedHashMap();

    public static final class b implements androidx.lifecycle.o {
        public final /* synthetic */ cb.O a;
        public final /* synthetic */ b0.P0 b;
        public final /* synthetic */ b0.o1 c;
        public final /* synthetic */ kotlin.jvm.internal.O d;
        public final /* synthetic */ View e;

        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[k.a.values().length];
                try {
                    iArr[k.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[k.a.ON_START.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[k.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[k.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[k.a.ON_PAUSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[k.a.ON_RESUME.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[k.a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                a = iArr;
            }
        }

        public static final class b extends Ia.l implements Qa.p {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ kotlin.jvm.internal.O c;
            public final /* synthetic */ b0.o1 d;
            public final /* synthetic */ androidx.lifecycle.r e;
            public final /* synthetic */ b f;
            public final /* synthetic */ View g;

            public static final class a extends Ia.l implements Qa.p {
                public int a;
                public final /* synthetic */ fb.N b;
                public final /* synthetic */ S0 c;

                public static final class a implements fb.f {
                    public final /* synthetic */ S0 a;

                    public a(S0 s0) {
                        this.a = s0;
                    }

                    public final Object a(float f, Ga.e eVar) {
                        this.a.c(f);
                        return Ca.I.a;
                    }

                    public /* bridge */ /* synthetic */ Object emit(Object obj, Ga.e eVar) {
                        return a(((Number) obj).floatValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(fb.N n, S0 s0, Ga.e eVar) {
                    super(2, eVar);
                    this.b = n;
                    this.c = s0;
                }

                public final Ga.e create(Object obj, Ga.e eVar) {
                    return new a(this.b, this.c, eVar);
                }

                public final Object invoke(cb.O o, Ga.e eVar) {
                    return create(o, eVar).invokeSuspend(Ca.I.a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f = Ha.c.f();
                    int i = this.a;
                    if (i == 0) {
                        Ca.t.b(obj);
                        fb.N n = this.b;
                        a aVar = new a(this.c);
                        this.a = 1;
                        if (n.collect(aVar, this) == f) {
                            return f;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Ca.t.b(obj);
                    }
                    throw new Ca.i();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(kotlin.jvm.internal.O o, b0.o1 o1Var, androidx.lifecycle.r rVar, b bVar, View view, Ga.e eVar) {
                super(2, eVar);
                this.c = o;
                this.d = o1Var;
                this.e = rVar;
                this.f = bVar;
                this.g = view;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                b bVar = new b(this.c, this.d, this.e, this.f, this.g, eVar);
                bVar.b = obj;
                return bVar;
            }

            public final Object invoke(cb.O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(Ca.I.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = Ha.c.f()
                    int r1 = r11.a
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r0 = r11.b
                    cb.B0 r0 = (cb.B0) r0
                    Ca.t.b(r12)     // Catch: java.lang.Throwable -> L14
                    goto L6a
                L14:
                    r12 = move-exception
                    goto L81
                L17:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L1f:
                    Ca.t.b(r12)
                    java.lang.Object r12 = r11.b
                    r4 = r12
                    cb.O r4 = (cb.O) r4
                    kotlin.jvm.internal.O r12 = r11.c     // Catch: java.lang.Throwable -> L58
                    java.lang.Object r12 = r12.a     // Catch: java.lang.Throwable -> L58
                    P0.S0 r12 = (P0.S0) r12     // Catch: java.lang.Throwable -> L58
                    if (r12 == 0) goto L5b
                    android.view.View r1 = r11.g     // Catch: java.lang.Throwable -> L58
                    android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L58
                    android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L58
                    fb.N r1 = P0.z1.a(r1)     // Catch: java.lang.Throwable -> L58
                    java.lang.Object r5 = r1.getValue()     // Catch: java.lang.Throwable -> L58
                    java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L58
                    float r5 = r5.floatValue()     // Catch: java.lang.Throwable -> L58
                    r12.c(r5)     // Catch: java.lang.Throwable -> L58
                    P0.z1$b$b$a r7 = new P0.z1$b$b$a     // Catch: java.lang.Throwable -> L58
                    r7.<init>(r1, r12, r3)     // Catch: java.lang.Throwable -> L58
                    r8 = 3
                    r9 = 0
                    r5 = 0
                    r6 = 0
                    cb.B0 r12 = cb.i.d(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L58
                    goto L5c
                L58:
                    r12 = move-exception
                    r0 = r3
                    goto L81
                L5b:
                    r12 = r3
                L5c:
                    b0.o1 r1 = r11.d     // Catch: java.lang.Throwable -> L7d
                    r11.b = r12     // Catch: java.lang.Throwable -> L7d
                    r11.a = r2     // Catch: java.lang.Throwable -> L7d
                    java.lang.Object r1 = r1.N0(r11)     // Catch: java.lang.Throwable -> L7d
                    if (r1 != r0) goto L69
                    return r0
                L69:
                    r0 = r12
                L6a:
                    if (r0 == 0) goto L6f
                    cb.B0.a.b(r0, r3, r2, r3)
                L6f:
                    androidx.lifecycle.r r12 = r11.e
                    androidx.lifecycle.k r12 = r12.getLifecycle()
                    P0.z1$b r0 = r11.f
                    r12.removeObserver(r0)
                    Ca.I r12 = Ca.I.a
                    return r12
                L7d:
                    r0 = move-exception
                    r10 = r0
                    r0 = r12
                    r12 = r10
                L81:
                    if (r0 == 0) goto L86
                    cb.B0.a.b(r0, r3, r2, r3)
                L86:
                    androidx.lifecycle.r r0 = r11.e
                    androidx.lifecycle.k r0 = r0.getLifecycle()
                    P0.z1$b r1 = r11.f
                    r0.removeObserver(r1)
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: P0.z1.b.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(cb.O o, b0.P0 p0, b0.o1 o1Var, kotlin.jvm.internal.O o2, View view) {
            this.a = o;
            this.b = p0;
            this.c = o1Var;
            this.d = o2;
            this.e = view;
        }

        public void onStateChanged(androidx.lifecycle.r rVar, k.a aVar) {
            switch (a.a[aVar.ordinal()]) {
                case 1:
                    cb.i.d(this.a, (Ga.i) null, cb.Q.d, new b(this.d, this.c, rVar, this, this.e, null), 1, (Object) null);
                    return;
                case 2:
                    b0.P0 p0 = this.b;
                    if (p0 != null) {
                        p0.e();
                    }
                    this.c.M0();
                    return;
                case 3:
                    this.c.w0();
                    return;
                case 4:
                    this.c.g0();
                    return;
                case 5:
                case 6:
                case 7:
                    return;
                default:
                    throw new Ca.o();
            }
        }
    }

    public static final class c extends Ia.l implements Qa.p {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ ContentResolver d;
        public final /* synthetic */ Uri e;
        public final /* synthetic */ d f;
        public final /* synthetic */ eb.g g;
        public final /* synthetic */ Context h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ContentResolver contentResolver, Uri uri, d dVar, eb.g gVar, Context context, Ga.e eVar) {
            super(2, eVar);
            this.d = contentResolver;
            this.e = uri;
            this.f = dVar;
            this.g = gVar;
            this.h = context;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            c cVar = new c(this.d, this.e, this.f, this.g, this.h, eVar);
            cVar.c = obj;
            return cVar;
        }

        public final Object invoke(fb.f fVar, Ga.e eVar) {
            return create(fVar, eVar).invokeSuspend(Ca.I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0054 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0060 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0016, B:9:0x0048, B:14:0x0058, B:16:0x0060, B:25:0x002d, B:27:0x0042), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007f -> B:8:0x0019). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = Ha.c.f()
                int r1 = r8.b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r8.a
                eb.i r1 = (eb.i) r1
                java.lang.Object r4 = r8.c
                fb.f r4 = (fb.f) r4
                Ca.t.b(r9)     // Catch: java.lang.Throwable -> L1b
            L19:
                r9 = r4
                goto L48
            L1b:
                r9 = move-exception
                goto L8c
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.a
                eb.i r1 = (eb.i) r1
                java.lang.Object r4 = r8.c
                fb.f r4 = (fb.f) r4
                Ca.t.b(r9)     // Catch: java.lang.Throwable -> L1b
                goto L58
            L31:
                Ca.t.b(r9)
                java.lang.Object r9 = r8.c
                fb.f r9 = (fb.f) r9
                android.content.ContentResolver r1 = r8.d
                android.net.Uri r4 = r8.e
                r5 = 0
                P0.z1$d r6 = r8.f
                r1.registerContentObserver(r4, r5, r6)
                eb.g r1 = r8.g     // Catch: java.lang.Throwable -> L1b
                eb.i r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
            L48:
                r8.c = r9     // Catch: java.lang.Throwable -> L1b
                r8.a = r1     // Catch: java.lang.Throwable -> L1b
                r8.b = r3     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r4 = r1.b(r8)     // Catch: java.lang.Throwable -> L1b
                if (r4 != r0) goto L55
                return r0
            L55:
                r7 = r4
                r4 = r9
                r9 = r7
            L58:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1b
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1b
                if (r9 == 0) goto L82
                r1.next()     // Catch: java.lang.Throwable -> L1b
                android.content.Context r9 = r8.h     // Catch: java.lang.Throwable -> L1b
                android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L1b
                java.lang.String r5 = "animator_duration_scale"
                r6 = 1065353216(0x3f800000, float:1.0)
                float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L1b
                java.lang.Float r9 = Ia.b.c(r9)     // Catch: java.lang.Throwable -> L1b
                r8.c = r4     // Catch: java.lang.Throwable -> L1b
                r8.a = r1     // Catch: java.lang.Throwable -> L1b
                r8.b = r2     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r9 = r4.emit(r9, r8)     // Catch: java.lang.Throwable -> L1b
                if (r9 != r0) goto L19
                return r0
            L82:
                android.content.ContentResolver r9 = r8.d
                P0.z1$d r0 = r8.f
                r9.unregisterContentObserver(r0)
                Ca.I r9 = Ca.I.a
                return r9
            L8c:
                android.content.ContentResolver r0 = r8.d
                P0.z1$d r1 = r8.f
                r0.unregisterContentObserver(r1)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: P0.z1.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d extends ContentObserver {
        public final /* synthetic */ eb.g a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(eb.g gVar, Handler handler) {
            super(handler);
            this.a = gVar;
        }

        public void onChange(boolean z, Uri uri) {
            this.a.i(Ca.I.a);
        }
    }

    public static final /* synthetic */ fb.N a(Context context) {
        return e(context);
    }

    public static final b0.o1 b(View view, Ga.i iVar, androidx.lifecycle.k kVar) {
        b0.P0 p0;
        if (iVar.get(Ga.f.D8) == null || iVar.get(b0.t0.M8) == null) {
            iVar = K.l.a().plus(iVar);
        }
        b0.t0 t0Var = (b0.t0) iVar.get(b0.t0.M8);
        if (t0Var != null) {
            b0.P0 p02 = new b0.P0(t0Var);
            p02.c();
            p0 = p02;
        } else {
            p0 = null;
        }
        kotlin.jvm.internal.O o = new kotlin.jvm.internal.O();
        Ga.i iVar2 = (o0.k) iVar.get(o0.k.U8);
        if (iVar2 == null) {
            iVar2 = new S0();
            o.a = iVar2;
        }
        Ga.i plus = iVar.plus(p0 != null ? p0 : Ga.j.a).plus(iVar2);
        b0.o1 o1Var = new b0.o1(plus);
        o1Var.w0();
        cb.O a2 = cb.P.a(plus);
        if (kVar == null) {
            androidx.lifecycle.r a3 = androidx.lifecycle.a0.a(view);
            kVar = a3 != null ? a3.getLifecycle() : null;
        }
        if (kVar != null) {
            view.addOnAttachStateChangeListener(new a(view, o1Var));
            kVar.addObserver(new b(a2, p0, o1Var, o, view));
            return o1Var;
        }
        L0.a.c("ViewTreeLifecycleOwner not found from " + view);
        throw new Ca.i();
    }

    public static /* synthetic */ b0.o1 c(View view, Ga.i iVar, androidx.lifecycle.k kVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = Ga.j.a;
        }
        if ((i & 2) != 0) {
            kVar = null;
        }
        return b(view, iVar, kVar);
    }

    public static final b0.y d(View view) {
        b0.y f = f(view);
        if (f != null) {
            return f;
        }
        ViewParent parent = view.getParent();
        while (f == null && (parent instanceof View)) {
            View view2 = (View) parent;
            f = f(view2);
            parent = view2.getParent();
        }
        return f;
    }

    public static final fb.N e(Context context) {
        fb.N n;
        Map map = a;
        synchronized (map) {
            try {
                Object obj = map.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    eb.g b2 = eb.j.b(-1, (eb.a) null, (Qa.l) null, 6, (Object) null);
                    obj = fb.g.H(fb.g.v(new c(contentResolver, uriFor, new d(b2, P1.i.a(Looper.getMainLooper())), b2, context, null)), cb.P.b(), J.a.b(fb.J.a, 0L, 0L, 3, (Object) null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, obj);
                }
                n = (fb.N) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n;
    }

    public static final b0.y f(View view) {
        Object tag = view.getTag(o0.l.G);
        if (tag instanceof b0.y) {
            return (b0.y) tag;
        }
        return null;
    }

    public static final View g(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final b0.o1 h(View view) {
        if (!view.isAttachedToWindow()) {
            L0.a.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View g = g(view);
        b0.y f = f(g);
        if (f == null) {
            return y1.a.a(g);
        }
        if (f instanceof b0.o1) {
            return (b0.o1) f;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    public static final void i(View view, b0.y yVar) {
        view.setTag(o0.l.G, yVar);
    }

    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ b0.o1 b;

        public a(View view, b0.o1 o1Var) {
            this.a = view;
            this.b = o1Var;
        }

        public void onViewDetachedFromWindow(View view) {
            this.a.removeOnAttachStateChangeListener(this);
            this.b.g0();
        }

        public void onViewAttachedToWindow(View view) {
        }
    }
}
