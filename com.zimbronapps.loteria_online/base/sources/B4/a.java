package b4;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.l;
import Qa.p;
import android.content.Context;
import cb.O;
import cb.P;
import cb.Q;
import cb.e0;
import cb.i;
import d4.u;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static final b a = new b(null);

    public static final class a extends a {
        public final u b;

        public static final class a extends l implements p {
            public int a;
            public final /* synthetic */ d4.b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d4.b bVar, e eVar) {
                super(2, eVar);
                this.c = bVar;
            }

            public final e create(Object obj, e eVar) {
                return a.this.new a(this.c, eVar);
            }

            public final Object invoke(O o, e eVar) {
                return create(o, eVar).invokeSuspend(I.a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f = c.f();
                int i = this.a;
                if (i == 0) {
                    t.b(obj);
                    u c = a.c(a.this);
                    d4.b bVar = this.c;
                    this.a = 1;
                    obj = c.a(bVar, this);
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

        public a(u uVar) {
            kotlin.jvm.internal.t.g(uVar, "mTopicsManager");
            this.b = uVar;
        }

        public static final /* synthetic */ u c(a aVar) {
            return aVar.b;
        }

        public x7.e b(d4.b bVar) {
            kotlin.jvm.internal.t.g(bVar, "request");
            return Z3.b.c(i.b(P.a(e0.c()), (Ga.i) null, (Q) null, new a(bVar, null), 3, (Object) null), null, 1, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        public final a a(Context context) {
            kotlin.jvm.internal.t.g(context, "context");
            u a = u.a.a(context);
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

    public abstract x7.e b(d4.b bVar);
}
