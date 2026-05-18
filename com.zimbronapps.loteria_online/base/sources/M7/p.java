package M7;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class p extends s1.a implements ScheduledFuture {
    public final ScheduledFuture h;

    public class a implements b {
        public a() {
        }

        public void a(Throwable th) {
            p.t(p.this, th);
        }

        public void set(Object obj) {
            p.s(p.this, obj);
        }
    }

    public interface b {
        void a(Throwable th);

        void set(Object obj);
    }

    public interface c {
        ScheduledFuture a(b bVar);
    }

    public p(c cVar) {
        this.h = cVar.a(new a());
    }

    public static /* synthetic */ boolean s(p pVar, Object obj) {
        return pVar.o(obj);
    }

    public static /* synthetic */ boolean t(p pVar, Throwable th) {
        return pVar.p(th);
    }

    public void b() {
        this.h.cancel(r());
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.h.getDelay(timeUnit);
    }

    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.h.compareTo(delayed);
    }
}
