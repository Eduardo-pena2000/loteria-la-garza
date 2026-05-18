package da;

import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface b {

    public interface a {
        void a(ByteBuffer byteBuffer, b bVar);
    }

    public interface b {
        void a(ByteBuffer byteBuffer);
    }

    public interface c {
    }

    public static class d {
        public boolean a = true;

        public boolean a() {
            return this.a;
        }
    }

    c a(d dVar);

    default c b() {
        return a(new d());
    }

    void c(String str, ByteBuffer byteBuffer, b bVar);

    void d(String str, a aVar, c cVar);

    void e(String str, a aVar);

    void g(String str, ByteBuffer byteBuffer);
}
