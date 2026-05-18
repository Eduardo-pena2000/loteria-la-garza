package T9;

import da.b;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class c implements da.b, T9.e {
    public final FlutterJNI a;
    public final Map b;
    public Map c;
    public final Object d;
    public final AtomicBoolean e;
    public final Map f;
    public int g;
    public final d h;
    public WeakHashMap i;
    public i j;

    public static class b {
        public final ByteBuffer a;
        public int b;
        public long c;

        public b(ByteBuffer byteBuffer, int i, long j) {
            this.a = byteBuffer;
            this.b = i;
            this.c = j;
        }
    }

    public static class c implements d {
        public final ExecutorService a;

        public c(ExecutorService executorService) {
            this.a = executorService;
        }

        public void a(Runnable runnable) {
            this.a.execute(runnable);
        }
    }

    public interface d {
        void a(Runnable runnable);
    }

    public static class e implements i {
        public ExecutorService a = Q9.a.e().b();

        public d a(b.d dVar) {
            return dVar.a() ? new h(this.a) : new c(this.a);
        }
    }

    public static class f {
        public final b.a a;
        public final d b;

        public f(b.a aVar, d dVar) {
            this.a = aVar;
            this.b = dVar;
        }
    }

    public static class g implements b.b {
        public final FlutterJNI a;
        public final int b;
        public final AtomicBoolean c = new AtomicBoolean(false);

        public g(FlutterJNI flutterJNI, int i) {
            this.a = flutterJNI;
            this.b = i;
        }

        public void a(ByteBuffer byteBuffer) {
            if (this.c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.a.invokePlatformMessageEmptyResponseCallback(this.b);
            } else {
                this.a.invokePlatformMessageResponseCallback(this.b, byteBuffer, byteBuffer.position());
            }
        }
    }

    public static class h implements d {
        public final ExecutorService a;
        public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
        public final AtomicBoolean c = new AtomicBoolean(false);

        public h(ExecutorService executorService) {
            this.a = executorService;
        }

        public static /* synthetic */ void b(h hVar) {
            hVar.c();
        }

        public void a(Runnable runnable) {
            this.b.add(runnable);
            this.a.execute(new T9.d(this));
        }

        public final void c() {
            if (this.c.compareAndSet(false, true)) {
                try {
                    Runnable runnable = (Runnable) this.b.poll();
                    if (runnable != null) {
                        runnable.run();
                    }
                } finally {
                    this.c.set(false);
                    if (!this.b.isEmpty()) {
                        this.a.execute(new T9.d(this));
                    }
                }
            }
        }
    }

    public interface i {
        d a(b.d dVar);
    }

    public static class j implements b.c {
        public j() {
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    public c(FlutterJNI flutterJNI, i iVar) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.e = new AtomicBoolean(false);
        this.f = new HashMap();
        this.g = 1;
        this.h = new T9.f();
        this.i = new WeakHashMap();
        this.a = flutterJNI;
        this.j = iVar;
    }

    public static /* synthetic */ void i(c cVar, String str, int i2, f fVar, ByteBuffer byteBuffer, long j2) {
        cVar.m(str, i2, fVar, byteBuffer, j2);
    }

    public static void k(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
    }

    public b.c a(b.d dVar) {
        d a2 = this.j.a(dVar);
        j jVar = new j(null);
        this.i.put(jVar, a2);
        return jVar;
    }

    public void c(String str, ByteBuffer byteBuffer, b.b bVar) {
        Aa.d g2 = Aa.d.g("DartMessenger#send on " + str);
        try {
            Q9.b.f("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i2 = this.g;
            this.g = i2 + 1;
            if (bVar != null) {
                this.f.put(Integer.valueOf(i2), bVar);
            }
            if (byteBuffer == null) {
                this.a.dispatchEmptyPlatformMessage(str, i2);
            } else {
                this.a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i2);
            }
            if (g2 != null) {
                g2.close();
            }
        } catch (Throwable th) {
            if (g2 != null) {
                try {
                    g2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void d(String str, b.a aVar, b.c cVar) {
        d dVar;
        if (aVar == null) {
            Q9.b.f("DartMessenger", "Removing handler for channel '" + str + "'");
            synchronized (this.d) {
                this.b.remove(str);
            }
            return;
        }
        if (cVar != null) {
            dVar = (d) this.i.get(cVar);
            if (dVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            dVar = null;
        }
        Q9.b.f("DartMessenger", "Setting handler for channel '" + str + "'");
        synchronized (this.d) {
            try {
                this.b.put(str, new f(aVar, dVar));
                List<b> list = (List) this.c.remove(str);
                if (list == null) {
                    return;
                }
                for (b bVar : list) {
                    j(str, (f) this.b.get(str), bVar.a, bVar.b, bVar.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(String str, b.a aVar) {
        d(str, aVar, null);
    }

    public void f(int i2, ByteBuffer byteBuffer) {
        Q9.b.f("DartMessenger", "Received message reply from Dart.");
        b.b bVar = (b.b) this.f.remove(Integer.valueOf(i2));
        if (bVar != null) {
            try {
                Q9.b.f("DartMessenger", "Invoking registered callback for reply from Dart.");
                bVar.a(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (Exception e2) {
                Q9.b.c("DartMessenger", "Uncaught exception in binary message reply handler", e2);
            } catch (Error e3) {
                k(e3);
            }
        }
    }

    public void g(String str, ByteBuffer byteBuffer) {
        Q9.b.f("DartMessenger", "Sending message over channel '" + str + "'");
        c(str, byteBuffer, null);
    }

    public void h(String str, ByteBuffer byteBuffer, int i2, long j2) {
        f fVar;
        boolean z;
        Q9.b.f("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.d) {
            try {
                fVar = (f) this.b.get(str);
                z = this.e.get() && fVar == null;
                if (z) {
                    if (!this.c.containsKey(str)) {
                        this.c.put(str, new LinkedList());
                    }
                    ((List) this.c.get(str)).add(new b(byteBuffer, i2, j2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        j(str, fVar, byteBuffer, i2, j2);
    }

    public final void j(String str, f fVar, ByteBuffer byteBuffer, int i2, long j2) {
        d dVar = fVar != null ? fVar.b : null;
        Aa.d.b("PlatformChannel ScheduleHandler on " + str, i2);
        T9.b bVar = new T9.b(this, str, i2, fVar, byteBuffer, j2);
        if (dVar == null) {
            dVar = this.h;
        }
        dVar.a(bVar);
    }

    public final void l(f fVar, ByteBuffer byteBuffer, int i2) {
        if (fVar == null) {
            Q9.b.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
            this.a.invokePlatformMessageEmptyResponseCallback(i2);
            return;
        }
        try {
            Q9.b.f("DartMessenger", "Deferring to registered handler to process message.");
            fVar.a.a(byteBuffer, new g(this.a, i2));
        } catch (Exception e2) {
            Q9.b.c("DartMessenger", "Uncaught exception in binary message listener", e2);
            this.a.invokePlatformMessageEmptyResponseCallback(i2);
        } catch (Error e3) {
            k(e3);
        }
    }

    public final /* synthetic */ void m(String str, int i2, f fVar, ByteBuffer byteBuffer, long j2) {
        Aa.d.f("PlatformChannel ScheduleHandler on " + str, i2);
        try {
            Aa.d g2 = Aa.d.g("DartMessenger#handleMessageFromDart on " + str);
            try {
                l(fVar, byteBuffer, i2);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
                if (g2 != null) {
                    g2.close();
                }
            } finally {
            }
        } finally {
            this.a.cleanupMessageData(j2);
        }
    }

    public c(FlutterJNI flutterJNI) {
        this(flutterJNI, new e());
    }
}
