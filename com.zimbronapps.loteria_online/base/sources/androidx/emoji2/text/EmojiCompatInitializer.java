package androidx.emoji2.text;

import P1.o;
import android.content.Context;
import androidx.emoji2.text.c;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.k;
import androidx.lifecycle.r;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class EmojiCompatInitializer implements o4.b {

    public class a implements DefaultLifecycleObserver {
        public final /* synthetic */ k a;

        public a(k kVar) {
            this.a = kVar;
        }

        public void onResume(r rVar) {
            EmojiCompatInitializer.this.c();
            this.a.removeObserver(this);
        }
    }

    public static class b extends c.c {
        public b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    public static class c implements c.h {
        public final Context a;

        public class a extends c.i {
            public final /* synthetic */ c.i a;
            public final /* synthetic */ ThreadPoolExecutor b;

            public a(c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.a = iVar;
                this.b = threadPoolExecutor;
            }

            public void a(Throwable th) {
                try {
                    this.a.a(th);
                } finally {
                    this.b.shutdown();
                }
            }

            public void b(f fVar) {
                try {
                    this.a.b(fVar);
                } finally {
                    this.b.shutdown();
                }
            }
        }

        public c(Context context) {
            this.a = context.getApplicationContext();
        }

        public static /* synthetic */ void b(c cVar, c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            cVar.d(iVar, threadPoolExecutor);
        }

        public void a(c.i iVar) {
            ThreadPoolExecutor b = t2.b.b("EmojiCompatInitializer");
            b.execute(new t2.c(this, iVar, b));
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(c.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                e a2 = androidx.emoji2.text.a.a(this.a);
                if (a2 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                a2.c(threadPoolExecutor);
                a2.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th) {
                iVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    public static class d implements Runnable {
        public void run() {
            try {
                o.a("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.c.k()) {
                    androidx.emoji2.text.c.c().n();
                }
            } finally {
                o.b();
            }
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean create(Context context) {
        androidx.emoji2.text.c.j(new b(context));
        b(context);
        return Boolean.TRUE;
    }

    public void b(Context context) {
        k lifecycle = ((r) o4.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.addObserver(new a(lifecycle));
    }

    public void c() {
        t2.b.d().postDelayed(new d(), 500L);
    }

    public List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
