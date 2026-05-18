package da;

import da.b;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class j {
    public final da.b a;
    public final String b;
    public final k c;
    public final b.c d;

    public final class a implements b.a {
        public final c a;

        public class a implements d {
            public final /* synthetic */ b.b a;

            public a(b.b bVar) {
                this.a = bVar;
            }

            public void a(Object obj) {
                this.a.a(j.a(j.this).c(obj));
            }

            public void b(String str, String str2, Object obj) {
                this.a.a(j.a(j.this).f(str, str2, obj));
            }

            public void c() {
                this.a.a(null);
            }
        }

        public a(c cVar) {
            this.a = cVar;
        }

        public void a(ByteBuffer byteBuffer, b.b bVar) {
            try {
                this.a.onMethodCall(j.a(j.this).a(byteBuffer), new a(bVar));
            } catch (RuntimeException e) {
                Q9.b.c("MethodChannel#" + j.b(j.this), "Failed to handle method call", e);
                bVar.a(j.a(j.this).e("error", e.getMessage(), null, Q9.b.d(e)));
            }
        }
    }

    public final class b implements b.b {
        public final d a;

        public b(d dVar) {
            this.a = dVar;
        }

        public void a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.a.c();
                } else {
                    try {
                        this.a.a(j.a(j.this).d(byteBuffer));
                    } catch (da.d e) {
                        this.a.b(e.a, e.getMessage(), e.b);
                    }
                }
            } catch (RuntimeException e2) {
                Q9.b.c("MethodChannel#" + j.b(j.this), "Failed to handle method call result", e2);
            }
        }
    }

    public interface c {
        void onMethodCall(i iVar, d dVar);
    }

    public interface d {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    public j(da.b bVar, String str) {
        this(bVar, str, p.b);
    }

    public static /* synthetic */ k a(j jVar) {
        return jVar.c;
    }

    public static /* synthetic */ String b(j jVar) {
        return jVar.b;
    }

    public void c(String str, Object obj) {
        d(str, obj, null);
    }

    public void d(String str, Object obj, d dVar) {
        this.a.c(this.b, this.c.b(new i(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        if (this.d != null) {
            this.a.d(this.b, cVar != null ? new a(cVar) : null, this.d);
        } else {
            this.a.e(this.b, cVar != null ? new a(cVar) : null);
        }
    }

    public j(da.b bVar, String str, k kVar) {
        this(bVar, str, kVar, null);
    }

    public j(da.b bVar, String str, k kVar, b.c cVar) {
        this.a = bVar;
        this.b = str;
        this.c = kVar;
        this.d = cVar;
    }
}
