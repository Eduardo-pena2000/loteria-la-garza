package b8;

import Ca.I;
import Ca.t;
import Da.S;
import Da.u;
import Ga.e;
import Ia.l;
import Qa.p;
import Xa.j;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import cb.O;
import fb.g;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.P;
import o2.i;
import s2.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class c {
    public static final /* synthetic */ j[] f = {P.h(new H(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    public final Context a;
    public final String b;
    public final ThreadLocal c;
    public final Ta.b d;
    public final i e;

    public static final class a extends l implements p {
        public int a;
        public final /* synthetic */ Qa.l c;

        public static final class a extends l implements p {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ Qa.l c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Qa.l lVar, e eVar) {
                super(2, eVar);
                this.c = lVar;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(s2.c cVar, e eVar) {
                return create(cVar, eVar).invokeSuspend(I.a);
            }

            public final e create(Object obj, e eVar) {
                a aVar = new a(this.c, eVar);
                aVar.b = obj;
                return aVar;
            }

            public final Object invokeSuspend(Object obj) {
                Ha.c.f();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                this.c.invoke((s2.c) this.b);
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Qa.l lVar, e eVar) {
            super(2, eVar);
            this.c = lVar;
        }

        public final e create(Object obj, e eVar) {
            return c.this.new a(this.c, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            try {
                if (i == 0) {
                    t.b(obj);
                    if (kotlin.jvm.internal.t.c(c.d(c.this).get(), Ia.b.a(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    c.d(c.this).set(Ia.b.a(true));
                    i c = c.c(c.this);
                    a aVar = new a(this.c, null);
                    this.a = 1;
                    obj = s2.j.a(c, aVar, this);
                    if (obj == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return (f) obj;
            } finally {
                c.d(c.this).set(Ia.b.a(false));
            }
        }
    }

    public static final class b extends l implements p {
        public int a;

        public b(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return c.this.new b(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Map a;
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                t.b(obj);
                fb.e data = c.c(c.this).getData();
                this.a = 1;
                obj = g.u(data, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (a = fVar.a()) == null) ? S.h() : a;
        }
    }

    public static final class c extends l implements p {
        public int a;
        public final /* synthetic */ f.a c;
        public final /* synthetic */ Object d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f.a aVar, Object obj, e eVar) {
            super(2, eVar);
            this.c = aVar;
            this.d = obj;
        }

        public final e create(Object obj, e eVar) {
            return c.this.new c(this.c, this.d, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object b;
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                t.b(obj);
                fb.e data = c.c(c.this).getData();
                this.a = 1;
                obj = g.u(data, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            f fVar = (f) obj;
            return (fVar == null || (b = fVar.b(this.c)) == null) ? this.d : b;
        }
    }

    public static final class d extends l implements p {
        public int a;
        public final /* synthetic */ f.a c;
        public final /* synthetic */ Object d;

        public static final class a extends l implements p {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ f.a c;
            public final /* synthetic */ Object d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f.a aVar, Object obj, e eVar) {
                super(2, eVar);
                this.c = aVar;
                this.d = obj;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(s2.c cVar, e eVar) {
                return create(cVar, eVar).invokeSuspend(I.a);
            }

            public final e create(Object obj, e eVar) {
                a aVar = new a(this.c, this.d, eVar);
                aVar.b = obj;
                return aVar;
            }

            public final Object invokeSuspend(Object obj) {
                Ha.c.f();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                ((s2.c) this.b).j(this.c, this.d);
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.a aVar, Object obj, e eVar) {
            super(2, eVar);
            this.c = aVar;
            this.d = obj;
        }

        public final e create(Object obj, e eVar) {
            return c.this.new d(this.c, this.d, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                t.b(obj);
                i c = c.c(c.this);
                a aVar = new a(this.c, this.d, null);
                this.a = 1;
                obj = s2.j.a(c, aVar, this);
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

    public c(Context context, String str) {
        kotlin.jvm.internal.t.g(context, "context");
        kotlin.jvm.internal.t.g(str, "name");
        this.a = context;
        this.b = str;
        this.c = new ThreadLocal();
        this.d = r2.a.b(str, new p2.b(new b8.a(this)), new b8.b(this), (O) null, 8, (Object) null);
        this.e = i(context);
    }

    public static /* synthetic */ List a(c cVar, Context context) {
        return f(cVar, context);
    }

    public static /* synthetic */ f b(c cVar, o2.d dVar) {
        return e(cVar, dVar);
    }

    public static final /* synthetic */ i c(c cVar) {
        return cVar.e;
    }

    public static final /* synthetic */ ThreadLocal d(c cVar) {
        return cVar.c;
    }

    public static final f e(c cVar, o2.d dVar) {
        kotlin.jvm.internal.t.g(dVar, "ex");
        Log.w(P.b(c.class).e(), "CorruptionException in " + cVar.b + " DataStore running in process " + Process.myPid(), dVar);
        return s2.g.a();
    }

    public static final List f(c cVar, Context context) {
        kotlin.jvm.internal.t.g(context, "it");
        return u.e(r2.i.b(context, cVar.b, (Set) null, 4, (Object) null));
    }

    public final f g(Qa.l lVar) {
        kotlin.jvm.internal.t.g(lVar, "transform");
        return (f) cb.i.f((Ga.i) null, new a(lVar, null), 1, (Object) null);
    }

    public final Map h() {
        return (Map) cb.i.f((Ga.i) null, new b(null), 1, (Object) null);
    }

    public final i i(Context context) {
        return (i) this.d.a(context, f[0]);
    }

    public final Object j(f.a aVar, Object obj) {
        kotlin.jvm.internal.t.g(aVar, "key");
        return cb.i.f((Ga.i) null, new c(aVar, obj, null), 1, (Object) null);
    }

    public final f k(f.a aVar, Object obj) {
        kotlin.jvm.internal.t.g(aVar, "key");
        return (f) cb.i.f((Ga.i) null, new d(aVar, obj, null), 1, (Object) null);
    }
}
