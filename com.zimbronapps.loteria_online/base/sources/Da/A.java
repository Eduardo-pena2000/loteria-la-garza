package da;

import da.b;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class a {
    public final da.b a;
    public final String b;
    public final h c;
    public final b.c d;

    public final class b implements b.a {
        public final d a;

        public class a implements e {
            public final /* synthetic */ b.b a;

            public a(b.b bVar) {
                this.a = bVar;
            }

            public void a(Object obj) {
                this.a.a(a.a(a.this).a(obj));
            }
        }

        public /* synthetic */ b(a aVar, d dVar, a aVar2) {
            this(dVar);
        }

        public void a(ByteBuffer byteBuffer, b.b bVar) {
            try {
                this.a.a(a.a(a.this).b(byteBuffer), new a(bVar));
            } catch (RuntimeException e) {
                Q9.b.c("BasicMessageChannel#" + a.b(a.this), "Failed to handle message", e);
                bVar.a(null);
            }
        }

        public b(d dVar) {
            this.a = dVar;
        }
    }

    public final class c implements b.b {
        public final e a;

        public /* synthetic */ c(a aVar, e eVar, a aVar2) {
            this(eVar);
        }

        public void a(ByteBuffer byteBuffer) {
            try {
                this.a.a(a.a(a.this).b(byteBuffer));
            } catch (RuntimeException e) {
                Q9.b.c("BasicMessageChannel#" + a.b(a.this), "Failed to handle message reply", e);
            }
        }

        public c(e eVar) {
            this.a = eVar;
        }
    }

    public interface d {
        void a(Object obj, e eVar);
    }

    public interface e {
        void a(Object obj);
    }

    public a(da.b bVar, String str, h hVar) {
        this(bVar, str, hVar, null);
    }

    public static /* synthetic */ h a(a aVar) {
        return aVar.c;
    }

    public static /* synthetic */ String b(a aVar) {
        return aVar.b;
    }

    public void c(Object obj) {
        d(obj, null);
    }

    public void d(Object obj, e eVar) {
        this.a.c(this.b, this.c.a(obj), eVar != null ? new c(this, eVar, null) : null);
    }

    public void e(d dVar) {
        if (this.d != null) {
            this.a.d(this.b, dVar != null ? new b(this, dVar, null) : null, this.d);
        } else {
            this.a.e(this.b, dVar != null ? new b(this, dVar, null) : null);
        }
    }

    public a(da.b bVar, String str, h hVar, b.c cVar) {
        this.a = bVar;
        this.b = str;
        this.c = hVar;
        this.d = cVar;
    }
}
