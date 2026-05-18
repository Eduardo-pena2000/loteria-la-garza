package androidx.emoji2.text;

import K1.n;
import P1.o;
import Q1.l;
import S1.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.c;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class e extends c.c {
    public static final a k = new a();

    public static class a {
        public Typeface a(Context context, l.b bVar) {
            return l.a(context, null, new l.b[]{bVar});
        }

        public l.a b(Context context, Q1.e eVar) {
            return l.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    public static class b implements c.h {
        public final Context a;
        public final Q1.e b;
        public final a c;
        public final Object d = new Object();
        public Handler e;
        public Executor f;
        public ThreadPoolExecutor g;
        public c.i h;
        public ContentObserver i;
        public Runnable j;

        public b(Context context, Q1.e eVar, a aVar) {
            g.i(context, "Context cannot be null");
            g.i(eVar, "FontRequest cannot be null");
            this.a = context.getApplicationContext();
            this.b = eVar;
            this.c = aVar;
        }

        public void a(c.i iVar) {
            g.i(iVar, "LoaderCallback cannot be null");
            synchronized (this.d) {
                this.h = iVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.d) {
                try {
                    this.h = null;
                    ContentObserver contentObserver = this.i;
                    if (contentObserver != null) {
                        this.c.c(this.a, contentObserver);
                        this.i = null;
                    }
                    Handler handler = this.e;
                    if (handler != null) {
                        handler.removeCallbacks(this.j);
                    }
                    this.e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f = null;
                    this.g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void c() {
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    try {
                        l.b e = e();
                        int b = e.b();
                        if (b == 2) {
                            synchronized (this.d) {
                            }
                        }
                        if (b != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + b + ")");
                        }
                        try {
                            o.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface a = this.c.a(this.a, e);
                            ByteBuffer f = n.f(this.a, null, e.d());
                            if (f == null || a == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            f b2 = f.b(a, f);
                            o.b();
                            synchronized (this.d) {
                                try {
                                    c.i iVar = this.h;
                                    if (iVar != null) {
                                        iVar.b(b2);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            o.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.d) {
                            try {
                                c.i iVar2 = this.h;
                                if (iVar2 != null) {
                                    iVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void d() {
            synchronized (this.d) {
                try {
                    if (this.h == null) {
                        return;
                    }
                    if (this.f == null) {
                        ThreadPoolExecutor b = t2.b.b("emojiCompat");
                        this.g = b;
                        this.f = b;
                    }
                    this.f.execute(new t2.f(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final l.b e() {
            try {
                l.a b = this.c.b(this.a, this.b);
                if (b.e() == 0) {
                    l.b[] c = b.c();
                    if (c == null || c.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return c[0];
                }
                throw new RuntimeException("fetchFonts failed (" + b.e() + ")");
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("provider not found", e);
            }
        }

        public void f(Executor executor) {
            synchronized (this.d) {
                this.f = executor;
            }
        }
    }

    public e(Context context, Q1.e eVar) {
        super(new b(context, eVar, k));
    }

    public e c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
