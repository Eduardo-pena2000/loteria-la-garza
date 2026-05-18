package d1;

import Ca.s;
import android.content.Context;
import android.graphics.Typeface;
import d1.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e implements U {
    public final Context a;
    public final Object b;

    public static final class a extends Ia.d {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return e.this.c(null, this);
        }
    }

    public e(Context context) {
        this.a = context.getApplicationContext();
    }

    public Object a() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(d1.t r6, Ga.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof d1.e.a
            if (r0 == 0) goto L13
            r0 = r7
            d1.e$a r0 = (d1.e.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            d1.e$a r0 = new d1.e$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.a
            d1.t r6 = (d1.t) r6
            Ca.t.b(r7)
            goto L69
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            Ca.t.b(r7)
            goto L54
        L3c:
            Ca.t.b(r7)
            boolean r7 = r6 instanceof d1.c
            if (r7 == 0) goto L55
            d1.c r6 = (d1.c) r6
            d1.c$a r7 = r6.d()
            android.content.Context r2 = r5.a
            r0.d = r4
            java.lang.Object r7 = r7.a(r2, r6, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            return r7
        L55:
            boolean r7 = r6 instanceof d1.f0
            if (r7 == 0) goto L78
            r7 = r6
            d1.f0 r7 = (d1.f0) r7
            android.content.Context r2 = r5.a
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = d1.f.b(r7, r2, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            d1.f0 r6 = (d1.f0) r6
            d1.K$d r6 = r6.e()
            android.content.Context r0 = r5.a
            android.graphics.Typeface r6 = d1.e0.c(r7, r6, r0)
            return r6
        L78:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.e.c(d1.t, Ga.e):java.lang.Object");
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Typeface b(t tVar) {
        Object b;
        Typeface typeface;
        if (tVar instanceof c) {
            c cVar = (c) tVar;
            return cVar.d().b(this.a, cVar);
        }
        if (!(tVar instanceof f0)) {
            return null;
        }
        f0 f0Var = (f0) tVar;
        int a2 = f0Var.a();
        F.a aVar = F.a;
        if (F.e(a2, aVar.b())) {
            typeface = f.a(f0Var, this.a);
        } else {
            if (!F.e(a2, aVar.c())) {
                if (F.e(a2, aVar.a())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + F.g(f0Var.a()));
            }
            try {
                s.a aVar2 = Ca.s.b;
                b = Ca.s.b(f.a((f0) tVar, this.a));
            } catch (Throwable th) {
                s.a aVar3 = Ca.s.b;
                b = Ca.s.b(Ca.t.a(th));
            }
            typeface = (Typeface) (Ca.s.g(b) ? null : b);
        }
        return e0.c(typeface, f0Var.e(), this.a);
    }
}
