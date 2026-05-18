package b0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j extends Exception {
    public final w.V a;
    public final w.V b;
    public final w.m c;
    public final int d;

    public static final class a extends Ia.k implements Qa.p {
        public int a;
        public int b;
        public int c;
        public int d;
        public /* synthetic */ Object e;

        public a(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            a aVar = j.this.new a(eVar);
            aVar.e = obj;
            return aVar;
        }

        public final Object invoke(Ya.j jVar, Ga.e eVar) {
            return create(jVar, eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            int i;
            Ya.j jVar;
            int i2;
            int i3;
            String str;
            int i4;
            int i5;
            Object f = Ha.c.f();
            int i6 = this.d;
            if (i6 == 0) {
                Ca.t.b(obj);
                i = 0;
                jVar = (Ya.j) this.e;
                i2 = 0;
                i3 = 0;
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = this.c;
                int i8 = this.b;
                int i9 = this.a;
                jVar = (Ya.j) this.e;
                Ca.t.b(obj);
                i2 = i8;
                i3 = i7;
                i = i9;
            }
            while (i < Math.min(j.b(j.this), j.c(j.this).b)) {
                int i10 = i + 1;
                int b = j.c(j.this).b(i);
                switch (b) {
                    case 0:
                        str = "up";
                        break;
                    case 1:
                        int i11 = i2 + 1;
                        str = "down " + j.a(j.this).c(i2);
                        i2 = i11;
                        break;
                    case 2:
                        str = "remove " + j.c(j.this).b(i10) + ' ' + j.c(j.this).b(i + 2);
                        i10 = i + 3;
                        break;
                    case 3:
                        str = "move " + j.c(j.this).b(i10) + ' ' + j.c(j.this).b(i + 2) + ' ' + j.c(j.this).b(i + 3);
                        i10 = i + 4;
                        break;
                    case 4:
                        str = "clear";
                        break;
                    case 5:
                        i4 = i + 2;
                        i5 = i2 + 1;
                        str = "insertBottomUp " + j.c(j.this).b(i10) + ' ' + j.a(j.this).c(i2);
                        i10 = i4;
                        i2 = i5;
                        break;
                    case 6:
                        i4 = i + 2;
                        i5 = i2 + 1;
                        str = "insertTopDown " + j.c(j.this).b(i10) + ' ' + j.a(j.this).c(i2);
                        i10 = i4;
                        i2 = i5;
                        break;
                    case 7:
                        int i12 = i2 + 1;
                        Object c = j.a(j.this).c(i2);
                        kotlin.jvm.internal.t.e(c, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                        i2 += 2;
                        str = "apply " + ((Qa.p) kotlin.jvm.internal.V.e(c, 2)) + ' ' + j.a(j.this).c(i12);
                        break;
                    case 8:
                        str = "reuse " + j.d(j.this).c(i3);
                        i3++;
                        break;
                    default:
                        str = "unknown op: " + b;
                        break;
                }
                String str2 = i + ": " + str;
                this.e = jVar;
                this.a = i10;
                this.b = i2;
                this.c = i3;
                this.d = 1;
                if (jVar.a(str2, this) == f) {
                    return f;
                }
                i = i10;
            }
            return Ca.I.a;
        }
    }

    public j(w.V v, w.V v2, w.m mVar, int i, Throwable th) {
        super(th);
        this.a = v;
        this.b = v2;
        this.c = mVar;
        this.d = i;
    }

    public static final /* synthetic */ w.V a(j jVar) {
        return jVar.a;
    }

    public static final /* synthetic */ int b(j jVar) {
        return jVar.d;
    }

    public static final /* synthetic */ w.m c(j jVar) {
        return jVar.c;
    }

    public static final /* synthetic */ w.V d(j jVar) {
        return jVar.b;
    }

    public final Ya.h e() {
        return Ya.k.b(new a(null));
    }

    public String getMessage() {
        return Za.u.l("\n            |Exception while applying pausable composition. Last 10 operations:\n            |" + Da.D.n0(Da.D.E0(Ya.r.G(e()), 10), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Qa.l) null, 62, (Object) null) + "\n            ", (String) null, 1, (Object) null);
    }
}
