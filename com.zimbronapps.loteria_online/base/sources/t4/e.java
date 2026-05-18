package T4;

import Ca.I;
import Ca.l;
import Da.D;
import T4.b;
import V4.d;
import Y4.a;
import Y4.b;
import Y4.c;
import Y4.e;
import Y4.f;
import Y4.j;
import Y4.k;
import Y4.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import b5.g;
import cb.B0;
import cb.L;
import cb.O;
import cb.P;
import cb.Q;
import cb.W;
import cb.W0;
import cb.e0;
import e5.h;
import e5.i;
import e5.p;
import j5.o;
import j5.r;
import j5.t;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.k;
import okhttp3.HttpUrl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e implements T4.d {
    public static final a o = new a(null);
    public final Context a;
    public final e5.c b;
    public final l c;
    public final l d;
    public final l e;
    public final b.c f;
    public final T4.a g;
    public final o h;
    public final O i = P.a(W0.b((B0) null, 1, (Object) null).plus(e0.c().E()).plus(new f(L.O8, this)));
    public final t j;
    public final p k;
    public final T4.a l;
    public final List m;
    public final AtomicBoolean n;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ h c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, Ga.e eVar) {
            super(2, eVar);
            this.c = hVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return e.this.new b(this.c, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                e eVar = e.this;
                h hVar = this.c;
                this.a = 1;
                obj = e.e(eVar, hVar, 0, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            e eVar2 = e.this;
            if (((i) obj) instanceof e5.f) {
                eVar2.h();
            }
            return obj;
        }
    }

    public static final class c extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ h c;
        public final /* synthetic */ e d;

        public static final class a extends Ia.l implements Qa.p {
            public int a;
            public final /* synthetic */ e b;
            public final /* synthetic */ h c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, h hVar, Ga.e eVar2) {
                super(2, eVar2);
                this.b = eVar;
                this.c = hVar;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return new a(this.b, this.c, eVar);
            }

            public final Object invoke(O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    e eVar = this.b;
                    h hVar = this.c;
                    this.a = 1;
                    obj = e.e(eVar, hVar, 1, this);
                    if (obj == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ca.t.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h hVar, e eVar, Ga.e eVar2) {
            super(2, eVar2);
            this.c = hVar;
            this.d = eVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            c cVar = new c(this.c, this.d, eVar);
            cVar.b = obj;
            return cVar;
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                W b = cb.i.b((O) this.b, e0.c().E(), (Q) null, new a(this.d, this.c, null), 2, (Object) null);
                this.c.M();
                this.a = 1;
                obj = b.await(this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return obj;
        }
    }

    public static final class d extends Ia.d {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        public d(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return e.e(e.this, null, 0, this);
        }
    }

    public static final class e extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ h b;
        public final /* synthetic */ e c;
        public final /* synthetic */ f5.h d;
        public final /* synthetic */ T4.b e;
        public final /* synthetic */ Bitmap f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h hVar, e eVar, f5.h hVar2, T4.b bVar, Bitmap bitmap, Ga.e eVar2) {
            super(2, eVar2);
            this.b = hVar;
            this.c = eVar;
            this.d = hVar2;
            this.e = bVar;
            this.f = bitmap;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new e(this.b, this.c, this.d, this.e, this.f, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                Z4.c cVar = new Z4.c(this.b, e.f(this.c), 0, this.b, this.d, this.e, this.f != null);
                h hVar = this.b;
                this.a = 1;
                obj = cVar.g(hVar, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return obj;
        }
    }

    public static final class f extends Ga.a implements L {
        public final /* synthetic */ e a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(L.b bVar, e eVar) {
            super(bVar);
            this.a = eVar;
        }

        public void handleException(Ga.i iVar, Throwable th) {
            this.a.h();
        }
    }

    public e(Context context, e5.c cVar, l lVar, l lVar2, l lVar3, b.c cVar2, T4.a aVar, o oVar, r rVar) {
        this.a = context;
        this.b = cVar;
        this.c = lVar;
        this.d = lVar2;
        this.e = lVar3;
        this.f = cVar2;
        this.g = aVar;
        this.h = oVar;
        t tVar = new t(this, context, oVar.d());
        this.j = tVar;
        p pVar = new p(this, tVar, null);
        this.k = pVar;
        this.l = aVar.h().e(new b5.c(), HttpUrl.class).e(new g(), String.class).e(new b5.b(), Uri.class).e(new b5.f(), Uri.class).e(new b5.e(), Integer.class).e(new b5.a(), byte[].class).d(new a5.c(), Uri.class).d(new a5.a(oVar.a()), File.class).b(new k.b(lVar3, lVar2, oVar.e()), Uri.class).b(new j.a(), File.class).b(new a.a(), Uri.class).b(new e.a(), Uri.class).b(new l.b(), Uri.class).b(new f.a(), Drawable.class).b(new b.a(), Bitmap.class).b(new c.a(), ByteBuffer.class).a(new d.c(oVar.c(), oVar.b())).f();
        this.m = D.w0(getComponents().c(), new Z4.a(this, pVar, null));
        this.n = new AtomicBoolean(false);
        tVar.c();
    }

    public static final /* synthetic */ Object e(e eVar, h hVar, int i, Ga.e eVar2) {
        return eVar.g(hVar, i, eVar2);
    }

    public static final /* synthetic */ List f(e eVar) {
        return eVar.m;
    }

    public e5.c a() {
        return this.b;
    }

    public Object b(h hVar, Ga.e eVar) {
        return P.e(new c(hVar, this, null), eVar);
    }

    public e5.e c(h hVar) {
        W b2 = cb.i.b(this.i, (Ga.i) null, (Q) null, new b(hVar, null), 3, (Object) null);
        hVar.M();
        return new e5.l(b2);
    }

    public c5.c d() {
        return (c5.c) this.c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0190 A[Catch: all -> 0x004b, TryCatch #5 {all -> 0x004b, blocks: (B:13:0x0046, B:14:0x018a, B:16:0x0190, B:20:0x019b, B:22:0x019f), top: B:12:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x019b A[Catch: all -> 0x004b, TryCatch #5 {all -> 0x004b, blocks: (B:13:0x0046, B:14:0x018a, B:16:0x0190, B:20:0x019b, B:22:0x019f), top: B:12:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b7 A[Catch: all -> 0x01c8, TRY_LEAVE, TryCatch #3 {all -> 0x01c8, blocks: (B:25:0x01b3, B:27:0x01b7, B:30:0x01ca, B:31:0x01cd), top: B:24:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ca A[Catch: all -> 0x01c8, TRY_ENTER, TryCatch #3 {all -> 0x01c8, blocks: (B:25:0x01b3, B:27:0x01b7, B:30:0x01ca, B:31:0x01cd), top: B:24:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0185 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0113 A[Catch: all -> 0x0103, TryCatch #2 {all -> 0x0103, blocks: (B:53:0x00f2, B:55:0x00f8, B:57:0x00fe, B:59:0x010b, B:61:0x0113, B:62:0x0125, B:64:0x012b, B:65:0x012e, B:67:0x0137, B:68:0x013a, B:73:0x0121), top: B:52:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b A[Catch: all -> 0x0103, TryCatch #2 {all -> 0x0103, blocks: (B:53:0x00f2, B:55:0x00f8, B:57:0x00fe, B:59:0x010b, B:61:0x0113, B:62:0x0125, B:64:0x012b, B:65:0x012e, B:67:0x0137, B:68:0x013a, B:73:0x0121), top: B:52:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0137 A[Catch: all -> 0x0103, TryCatch #2 {all -> 0x0103, blocks: (B:53:0x00f2, B:55:0x00f8, B:57:0x00fe, B:59:0x010b, B:61:0x0113, B:62:0x0125, B:64:0x012b, B:65:0x012e, B:67:0x0137, B:68:0x013a, B:73:0x0121), top: B:52:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0121 A[Catch: all -> 0x0103, TryCatch #2 {all -> 0x0103, blocks: (B:53:0x00f2, B:55:0x00f8, B:57:0x00fe, B:59:0x010b, B:61:0x0113, B:62:0x0125, B:64:0x012b, B:65:0x012e, B:67:0x0137, B:68:0x013a, B:73:0x0121), top: B:52:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(e5.h r21, int r22, Ga.e r23) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.e.g(e5.h, int, Ga.e):java.lang.Object");
    }

    public T4.a getComponents() {
        return this.l;
    }

    public final r h() {
        return null;
    }

    public final void i(h hVar, T4.b bVar) {
        bVar.b(hVar);
        h.b A = hVar.A();
        if (A != null) {
            A.b(hVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(e5.f r4, g5.a r5, T4.b r6) {
        /*
            r3 = this;
            e5.h r0 = r4.b()
            boolean r1 = r5 instanceof i5.d
            if (r1 != 0) goto Lb
            if (r5 == 0) goto L37
            goto L1e
        Lb:
            e5.h r1 = r4.b()
            i5.c$a r1 = r1.P()
            r2 = r5
            i5.d r2 = (i5.d) r2
            i5.c r1 = r1.a(r2, r4)
            boolean r2 = r1 instanceof i5.b
            if (r2 == 0) goto L26
        L1e:
            android.graphics.drawable.Drawable r1 = r4.a()
            r5.c(r1)
            goto L37
        L26:
            e5.h r5 = r4.b()
            r6.l(r5, r1)
            r1.a()
            e5.h r5 = r4.b()
            r6.n(r5, r1)
        L37:
            r6.a(r0, r4)
            e5.h$b r5 = r0.A()
            if (r5 == 0) goto L43
            r5.a(r0, r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.e.j(e5.f, g5.a, T4.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(e5.q r4, g5.a r5, T4.b r6) {
        /*
            r3 = this;
            e5.h r0 = r4.b()
            r4.c()
            boolean r1 = r5 instanceof i5.d
            if (r1 != 0) goto Le
            if (r5 == 0) goto L3a
            goto L21
        Le:
            e5.h r1 = r4.b()
            i5.c$a r1 = r1.P()
            r2 = r5
            i5.d r2 = (i5.d) r2
            i5.c r1 = r1.a(r2, r4)
            boolean r2 = r1 instanceof i5.b
            if (r2 == 0) goto L29
        L21:
            android.graphics.drawable.Drawable r1 = r4.a()
            r5.a(r1)
            goto L3a
        L29:
            e5.h r5 = r4.b()
            r6.l(r5, r1)
            r1.a()
            e5.h r5 = r4.b()
            r6.n(r5, r1)
        L3a:
            r6.d(r0, r4)
            e5.h$b r5 = r0.A()
            if (r5 == 0) goto L46
            r5.d(r0, r4)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.e.k(e5.q, g5.a, T4.b):void");
    }

    public final void l(int i) {
        c5.c cVar;
        Ca.l lVar = this.c;
        if (lVar == null || (cVar = (c5.c) lVar.getValue()) == null) {
            return;
        }
        cVar.a(i);
    }
}
