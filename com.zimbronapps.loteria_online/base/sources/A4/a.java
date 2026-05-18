package a4;

import Ca.I;
import Ca.t;
import Ia.l;
import Qa.p;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import c4.m;
import c4.n;
import c4.o;
import cb.O;
import cb.P;
import cb.Q;
import cb.e0;
import cb.i;
import kotlin.jvm.internal.k;
import x7.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static final b a = new b(null);

    public static final class a extends a {
        public final c4.b b;

        public static final class a extends l implements p {
            public int a;

            public a(c4.a aVar, Ga.e eVar) {
                super(2, eVar);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return a.this.new a(null, eVar);
            }

            public final Object invoke(O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    t.b(obj);
                    c4.b e = a.e(a.this);
                    this.a = 1;
                    if (e.a(null, this) == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return I.a;
            }
        }

        public static final class b extends l implements p {
            public int a;

            public b(Ga.e eVar) {
                super(2, eVar);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return a.this.new b(eVar);
            }

            public final Object invoke(O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    t.b(obj);
                    c4.b e = a.e(a.this);
                    this.a = 1;
                    obj = e.b(this);
                    if (obj == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return obj;
            }
        }

        public static final class c extends l implements p {
            public int a;
            public final /* synthetic */ Uri c;
            public final /* synthetic */ InputEvent d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InputEvent inputEvent, Ga.e eVar) {
                super(2, eVar);
                this.c = uri;
                this.d = inputEvent;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return a.this.new c(this.c, this.d, eVar);
            }

            public final Object invoke(O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    t.b(obj);
                    c4.b e = a.e(a.this);
                    Uri uri = this.c;
                    InputEvent inputEvent = this.d;
                    this.a = 1;
                    if (e.c(uri, inputEvent, this) == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return I.a;
            }
        }

        public static final class d extends l implements p {
            public int a;

            public d(m mVar, Ga.e eVar) {
                super(2, eVar);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return a.this.new d(null, eVar);
            }

            public final Object invoke(O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    t.b(obj);
                    c4.b e = a.e(a.this);
                    this.a = 1;
                    if (e.d(null, this) == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return I.a;
            }
        }

        public static final class e extends l implements p {
            public int a;
            public final /* synthetic */ Uri c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Uri uri, Ga.e eVar) {
                super(2, eVar);
                this.c = uri;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return a.this.new e(this.c, eVar);
            }

            public final Object invoke(O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    t.b(obj);
                    c4.b e = a.e(a.this);
                    Uri uri = this.c;
                    this.a = 1;
                    if (e.e(uri, this) == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return I.a;
            }
        }

        public static final class f extends l implements p {
            public int a;

            public f(n nVar, Ga.e eVar) {
                super(2, eVar);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return a.this.new f(null, eVar);
            }

            public final Object invoke(O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    t.b(obj);
                    c4.b e = a.e(a.this);
                    this.a = 1;
                    if (e.f(null, this) == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return I.a;
            }
        }

        public static final class g extends l implements p {
            public int a;

            public g(o oVar, Ga.e eVar) {
                super(2, eVar);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return a.this.new g(null, eVar);
            }

            public final Object invoke(O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    t.b(obj);
                    c4.b e = a.e(a.this);
                    this.a = 1;
                    if (e.g(null, this) == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return I.a;
            }
        }

        public a(c4.b bVar) {
            kotlin.jvm.internal.t.g(bVar, "mMeasurementManager");
            this.b = bVar;
        }

        public static final /* synthetic */ c4.b e(a aVar) {
            return aVar.b;
        }

        public x7.e b() {
            return Z3.b.c(i.b(P.a(e0.a()), (Ga.i) null, (Q) null, new b(null), 3, (Object) null), null, 1, null);
        }

        public x7.e c(Uri uri, InputEvent inputEvent) {
            kotlin.jvm.internal.t.g(uri, "attributionSource");
            return Z3.b.c(i.b(P.a(e0.a()), (Ga.i) null, (Q) null, new c(uri, inputEvent, null), 3, (Object) null), null, 1, null);
        }

        public x7.e d(Uri uri) {
            kotlin.jvm.internal.t.g(uri, "trigger");
            return Z3.b.c(i.b(P.a(e0.a()), (Ga.i) null, (Q) null, new e(uri, null), 3, (Object) null), null, 1, null);
        }

        public x7.e f(c4.a aVar) {
            kotlin.jvm.internal.t.g(aVar, "deletionRequest");
            return Z3.b.c(i.b(P.a(e0.a()), (Ga.i) null, (Q) null, new a(aVar, null), 3, (Object) null), null, 1, null);
        }

        public x7.e g(m mVar) {
            kotlin.jvm.internal.t.g(mVar, "request");
            return Z3.b.c(i.b(P.a(e0.a()), (Ga.i) null, (Q) null, new d(mVar, null), 3, (Object) null), null, 1, null);
        }

        public x7.e h(n nVar) {
            kotlin.jvm.internal.t.g(nVar, "request");
            return Z3.b.c(i.b(P.a(e0.a()), (Ga.i) null, (Q) null, new f(nVar, null), 3, (Object) null), null, 1, null);
        }

        public x7.e i(o oVar) {
            kotlin.jvm.internal.t.g(oVar, "request");
            return Z3.b.c(i.b(P.a(e0.a()), (Ga.i) null, (Q) null, new g(oVar, null), 3, (Object) null), null, 1, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        public final a a(Context context) {
            kotlin.jvm.internal.t.g(context, "context");
            c4.b a = c4.b.a.a(context);
            if (a != null) {
                return new a(a);
            }
            return null;
        }

        public b() {
        }
    }

    public static final a a(Context context) {
        return a.a(context);
    }

    public abstract e b();

    public abstract e c(Uri uri, InputEvent inputEvent);

    public abstract e d(Uri uri);
}
