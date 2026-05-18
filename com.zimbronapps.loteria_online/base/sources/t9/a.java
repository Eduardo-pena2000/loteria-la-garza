package T9;

import android.content.res.AssetManager;
import da.b;
import da.q;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class a implements da.b {
    public final FlutterJNI a;
    public final AssetManager b;
    public final long c;
    public final T9.c d;
    public final da.b e;
    public boolean f;
    public String g;
    public final b.a h;

    public class a implements b.a {
        public a() {
        }

        public void a(ByteBuffer byteBuffer, b.b bVar) {
            a.f(a.this, q.b.c(byteBuffer));
            a.h(a.this);
        }
    }

    public static class b {
        public final AssetManager a;
        public final String b;
        public final FlutterCallbackInformation c;

        public b(AssetManager assetManager, String str, FlutterCallbackInformation flutterCallbackInformation) {
            this.a = assetManager;
            this.b = str;
            this.c = flutterCallbackInformation;
        }

        public String toString() {
            return "DartCallback( bundle path: " + this.b + ", library path: " + this.c.callbackLibraryPath + ", function: " + this.c.callbackName + " )";
        }
    }

    public static class d implements da.b {
        public final T9.c a;

        public /* synthetic */ d(T9.c cVar, a aVar) {
            this(cVar);
        }

        public b.c a(b.d dVar) {
            return this.a.a(dVar);
        }

        public void c(String str, ByteBuffer byteBuffer, b.b bVar) {
            this.a.c(str, byteBuffer, bVar);
        }

        public void d(String str, b.a aVar, b.c cVar) {
            this.a.d(str, aVar, cVar);
        }

        public void e(String str, b.a aVar) {
            this.a.e(str, aVar);
        }

        public void g(String str, ByteBuffer byteBuffer) {
            this.a.c(str, byteBuffer, null);
        }

        public d(T9.c cVar) {
            this.a = cVar;
        }
    }

    public interface e {
    }

    public a(FlutterJNI flutterJNI, AssetManager assetManager, long j) {
        this.f = false;
        a aVar = new a();
        this.h = aVar;
        this.a = flutterJNI;
        this.b = assetManager;
        this.c = j;
        T9.c cVar = new T9.c(flutterJNI);
        this.d = cVar;
        cVar.e("flutter/isolate", aVar);
        this.e = new d(cVar, null);
        if (flutterJNI.isAttached()) {
            this.f = true;
        }
    }

    public static /* synthetic */ String f(a aVar, String str) {
        aVar.g = str;
        return str;
    }

    public static /* synthetic */ e h(a aVar) {
        aVar.getClass();
        return null;
    }

    public b.c a(b.d dVar) {
        return this.e.a(dVar);
    }

    public void c(String str, ByteBuffer byteBuffer, b.b bVar) {
        this.e.c(str, byteBuffer, bVar);
    }

    public void d(String str, b.a aVar, b.c cVar) {
        this.e.d(str, aVar, cVar);
    }

    public void e(String str, b.a aVar) {
        this.e.e(str, aVar);
    }

    public void g(String str, ByteBuffer byteBuffer) {
        this.e.g(str, byteBuffer);
    }

    public void i(b bVar) {
        if (this.f) {
            Q9.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        Aa.d g = Aa.d.g("DartExecutor#executeDartCallback");
        try {
            Q9.b.f("DartExecutor", "Executing Dart callback: " + bVar);
            FlutterJNI flutterJNI = this.a;
            String str = bVar.b;
            FlutterCallbackInformation flutterCallbackInformation = bVar.c;
            flutterJNI.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, bVar.a, null, this.c);
            this.f = true;
            if (g != null) {
                g.close();
            }
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void j(c cVar, List list) {
        if (this.f) {
            Q9.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        Aa.d g = Aa.d.g("DartExecutor#executeDartEntrypoint");
        try {
            Q9.b.f("DartExecutor", "Executing Dart entrypoint: " + cVar);
            this.a.runBundleAndSnapshotFromLibrary(cVar.a, cVar.c, cVar.b, this.b, list, this.c);
            this.f = true;
            if (g != null) {
                g.close();
            }
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean k() {
        return this.f;
    }

    public void l() {
        if (this.a.isAttached()) {
            this.a.notifyLowMemoryWarning();
        }
    }

    public void m() {
        Q9.b.f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.a.setPlatformMessageHandler(this.d);
    }

    public void n() {
        Q9.b.f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.a.setPlatformMessageHandler(null);
    }

    public static class c {
        public final String a;
        public final String b;
        public final String c;

        public c(String str, String str2) {
            this.a = str;
            this.b = null;
            this.c = str2;
        }

        public static c a() {
            W9.f c = Q9.a.e().c();
            if (c.p()) {
                return new c(c.j(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (this.a.equals(cVar.a)) {
                return this.c.equals(cVar.c);
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.a + ", function: " + this.c + " )";
        }

        public c(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }
}
