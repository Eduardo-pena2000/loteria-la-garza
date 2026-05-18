package da;

import da.b;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class c {
    public final da.b a;
    public final String b;
    public final k c;
    public final b.c d;

    public interface b {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    public final class c implements b.a {
        public final d a;
        public final AtomicReference b = new AtomicReference((Object) null);

        public c(d dVar) {
            this.a = dVar;
        }

        public static /* synthetic */ AtomicReference b(c cVar) {
            return cVar.b;
        }

        public void a(ByteBuffer byteBuffer, b.b bVar) {
            i a2 = c.a(c.this).a(byteBuffer);
            if (a2.a.equals("listen")) {
                d(a2.b, bVar);
            } else if (a2.a.equals("cancel")) {
                c(a2.b, bVar);
            } else {
                bVar.a(null);
            }
        }

        public final void c(Object obj, b.b bVar) {
            if (((b) this.b.getAndSet((Object) null)) == null) {
                bVar.a(c.a(c.this).f("error", "No active stream to cancel", null));
                return;
            }
            try {
                this.a.i(obj);
                bVar.a(c.a(c.this).c(null));
            } catch (RuntimeException e) {
                Q9.b.c("EventChannel#" + c.b(c.this), "Failed to close event stream", e);
                bVar.a(c.a(c.this).f("error", e.getMessage(), null));
            }
        }

        public final void d(Object obj, b.b bVar) {
            a aVar = new a(this, null);
            if (((b) this.b.getAndSet(aVar)) != null) {
                try {
                    this.a.i(null);
                } catch (RuntimeException e) {
                    Q9.b.c("EventChannel#" + c.b(c.this), "Failed to close existing event stream", e);
                }
            }
            try {
                this.a.k(obj, aVar);
                bVar.a(c.a(c.this).c(null));
            } catch (RuntimeException e2) {
                this.b.set((Object) null);
                Q9.b.c("EventChannel#" + c.b(c.this), "Failed to open event stream", e2);
                bVar.a(c.a(c.this).f("error", e2.getMessage(), null));
            }
        }

        public final class a implements b {
            public final AtomicBoolean a;

            public a() {
                this.a = new AtomicBoolean(false);
            }

            public void a(Object obj) {
                if (this.a.get() || c.b(c.this).get() != this) {
                    return;
                }
                c.c(c.this).g(c.b(c.this), c.a(c.this).c(obj));
            }

            public void b(String str, String str2, Object obj) {
                if (this.a.get() || c.b(c.this).get() != this) {
                    return;
                }
                c.c(c.this).g(c.b(c.this), c.a(c.this).f(str, str2, obj));
            }

            public void c() {
                if (this.a.getAndSet(true) || c.b(c.this).get() != this) {
                    return;
                }
                c.c(c.this).g(c.b(c.this), null);
            }

            public /* synthetic */ a(c cVar, a aVar) {
                this();
            }
        }
    }

    public interface d {
        void i(Object obj);

        void k(Object obj, b bVar);
    }

    public c(da.b bVar, String str) {
        this(bVar, str, p.b);
    }

    public static /* synthetic */ k a(c cVar) {
        return cVar.c;
    }

    public static /* synthetic */ String b(c cVar) {
        return cVar.b;
    }

    public static /* synthetic */ da.b c(c cVar) {
        return cVar.a;
    }

    public void d(d dVar) {
        if (this.d != null) {
            this.a.d(this.b, dVar != null ? new c(dVar) : null, this.d);
        } else {
            this.a.e(this.b, dVar != null ? new c(dVar) : null);
        }
    }

    public c(da.b bVar, String str, k kVar) {
        this(bVar, str, kVar, null);
    }

    public c(da.b bVar, String str, k kVar, b.c cVar) {
        this.a = bVar;
        this.b = str;
        this.c = kVar;
        this.d = cVar;
    }
}
