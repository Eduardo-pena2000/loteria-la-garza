package A;

import E.o;
import androidx.compose.ui.e;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s implements Q {
    public static final s a = new s();

    public static final class a extends e.c implements O0.t {
        public final E.k a;
        public boolean b;
        public boolean c;
        public boolean d;

        public static final class a extends Ia.l implements Qa.p {
            public int a;

            public static final class a implements fb.f {
                public final /* synthetic */ kotlin.jvm.internal.M a;
                public final /* synthetic */ kotlin.jvm.internal.M b;
                public final /* synthetic */ kotlin.jvm.internal.M c;
                public final /* synthetic */ a d;

                public a(kotlin.jvm.internal.M m, kotlin.jvm.internal.M m2, kotlin.jvm.internal.M m3, a aVar) {
                    this.a = m;
                    this.b = m2;
                    this.c = m3;
                    this.d = aVar;
                }

                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(E.j jVar, Ga.e eVar) {
                    boolean z = true;
                    if (jVar instanceof o.b) {
                        this.a.a++;
                    } else if (jVar instanceof o.c) {
                        kotlin.jvm.internal.M m = this.a;
                        m.a--;
                    } else if (jVar instanceof o.a) {
                        kotlin.jvm.internal.M m2 = this.a;
                        m2.a--;
                    } else if (jVar instanceof E.g) {
                        this.b.a++;
                    } else if (jVar instanceof E.h) {
                        kotlin.jvm.internal.M m3 = this.b;
                        m3.a--;
                    } else if (jVar instanceof E.d) {
                        this.c.a++;
                    } else if (jVar instanceof E.e) {
                        kotlin.jvm.internal.M m4 = this.c;
                        m4.a--;
                    }
                    boolean z2 = false;
                    boolean z3 = this.a.a > 0;
                    boolean z4 = this.b.a > 0;
                    boolean z5 = this.c.a > 0;
                    if (a.H1(this.d) != z3) {
                        a.K1(this.d, z3);
                        z2 = true;
                    }
                    if (a.G1(this.d) != z4) {
                        a.J1(this.d, z4);
                        z2 = true;
                    }
                    if (a.F1(this.d) != z5) {
                        a.I1(this.d, z5);
                    } else {
                        z = z2;
                    }
                    if (z) {
                        O0.u.a(this.d);
                    }
                    return Ca.I.a;
                }
            }

            public a(Ga.e eVar) {
                super(2, eVar);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return a.this.new a(eVar);
            }

            public final Object invoke(cb.O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(Ca.I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    kotlin.jvm.internal.M m = new kotlin.jvm.internal.M();
                    kotlin.jvm.internal.M m2 = new kotlin.jvm.internal.M();
                    kotlin.jvm.internal.M m3 = new kotlin.jvm.internal.M();
                    fb.e b = a.E1(a.this).b();
                    a aVar = new a(m, m2, m3, a.this);
                    this.a = 1;
                    if (b.collect(aVar, this) == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ca.t.b(obj);
                }
                return Ca.I.a;
            }
        }

        public a(E.k kVar) {
            this.a = kVar;
        }

        public static final /* synthetic */ E.k E1(a aVar) {
            return aVar.a;
        }

        public static final /* synthetic */ boolean F1(a aVar) {
            return aVar.d;
        }

        public static final /* synthetic */ boolean G1(a aVar) {
            return aVar.c;
        }

        public static final /* synthetic */ boolean H1(a aVar) {
            return aVar.b;
        }

        public static final /* synthetic */ void I1(a aVar, boolean z) {
            aVar.d = z;
        }

        public static final /* synthetic */ void J1(a aVar, boolean z) {
            aVar.c = z;
        }

        public static final /* synthetic */ void K1(a aVar, boolean z) {
            aVar.b = z;
        }

        public void draw(x0.c cVar) {
            cVar.B1();
            if (this.b) {
                x0.f.s1(cVar, r0.q(r0.b.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, cVar.e(), 0.0f, null, null, 0, 122, null);
            } else if (this.c || this.d) {
                x0.f.s1(cVar, r0.q(r0.b.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, cVar.e(), 0.0f, null, null, 0, 122, null);
            }
        }

        public void onAttach() {
            cb.i.d(getCoroutineScope(), (Ga.i) null, (cb.Q) null, new a(null), 3, (Object) null);
        }
    }

    public O0.j a(E.k kVar) {
        return new a(kVar);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return -1;
    }
}
