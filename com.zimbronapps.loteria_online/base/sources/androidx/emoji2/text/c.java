package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class c {
    public static final Object o = new Object();
    public static final Object p = new Object();
    public static volatile c q;
    public final Set b;
    public final b e;
    public final h f;
    public final j g;
    public final boolean h;
    public final boolean i;
    public final int[] j;
    public final boolean k;
    public final int l;
    public final int m;
    public final e n;
    public final ReadWriteLock a = new ReentrantReadWriteLock();
    public volatile int c = 3;
    public final Handler d = new Handler(Looper.getMainLooper());

    public static final class a extends b {
        public volatile androidx.emoji2.text.d b;
        public volatile androidx.emoji2.text.f c;

        public class a extends i {
            public a() {
            }

            public void a(Throwable th) {
                a.this.a.p(th);
            }

            public void b(androidx.emoji2.text.f fVar) {
                a.this.f(fVar);
            }
        }

        public a(c cVar) {
            super(cVar);
        }

        public int a(CharSequence charSequence, int i) {
            return this.b.b(charSequence, i);
        }

        public int b(CharSequence charSequence, int i) {
            return this.b.c(charSequence, i);
        }

        public void c() {
            try {
                this.a.f.a(new a());
            } catch (Throwable th) {
                this.a.p(th);
            }
        }

        public CharSequence d(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.b.j(charSequence, i, i2, i3, z);
        }

        public void e(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.a.h);
        }

        public void f(androidx.emoji2.text.f fVar) {
            if (fVar == null) {
                this.a.p(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.c = fVar;
            androidx.emoji2.text.f fVar2 = this.c;
            j a2 = c.a(this.a);
            e b = c.b(this.a);
            c cVar = this.a;
            this.b = new androidx.emoji2.text.d(fVar2, a2, b, cVar.i, cVar.j, t2.d.a());
            this.a.q();
        }
    }

    public static class b {
        public final c a;

        public b(c cVar) {
            this.a = cVar;
        }

        public abstract int a(CharSequence charSequence, int i);

        public abstract int b(CharSequence charSequence, int i);

        public abstract void c();

        public abstract CharSequence d(CharSequence charSequence, int i, int i2, int i3, boolean z);

        public abstract void e(EditorInfo editorInfo);
    }

    public static abstract class c {
        public final h a;
        public j b;
        public boolean c;
        public boolean d;
        public int[] e;
        public Set f;
        public boolean g;
        public int h = -16711936;
        public int i = 0;
        public e j = new androidx.emoji2.text.b();

        public c(h hVar) {
            S1.g.i(hVar, "metadataLoader cannot be null.");
            this.a = hVar;
        }

        public final h a() {
            return this.a;
        }

        public c b(int i) {
            this.i = i;
            return this;
        }
    }

    public static class d implements j {
        public t2.e a(t2.i iVar) {
            return new t2.j(iVar);
        }
    }

    public interface e {
        boolean a(CharSequence charSequence, int i, int i2, int i3);
    }

    public static abstract class f {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    public static class g implements Runnable {
        public final List a;
        public final Throwable b;
        public final int c;

        public g(f fVar, int i) {
            this(Arrays.asList(new f[]{(f) S1.g.i(fVar, "initCallback cannot be null")}), i, null);
        }

        public void run() {
            int size = this.a.size();
            int i = 0;
            if (this.c != 1) {
                while (i < size) {
                    ((f) this.a.get(i)).a(this.b);
                    i++;
                }
            } else {
                while (i < size) {
                    ((f) this.a.get(i)).b();
                    i++;
                }
            }
        }

        public g(Collection collection, int i) {
            this(collection, i, null);
        }

        public g(Collection collection, int i, Throwable th) {
            S1.g.i(collection, "initCallbacks cannot be null");
            this.a = new ArrayList(collection);
            this.c = i;
            this.b = th;
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(androidx.emoji2.text.f fVar);
    }

    public interface j {
        t2.e a(t2.i iVar);
    }

    public c(c cVar) {
        this.h = cVar.c;
        this.i = cVar.d;
        this.j = cVar.e;
        this.k = cVar.g;
        this.l = cVar.h;
        this.f = cVar.a;
        this.m = cVar.i;
        this.n = cVar.j;
        w.b bVar = new w.b();
        this.b = bVar;
        j jVar = cVar.b;
        this.g = jVar == null ? new d() : jVar;
        Set set = cVar.f;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f);
        }
        this.e = new a(this);
        o();
    }

    public static /* synthetic */ j a(c cVar) {
        return cVar.g;
    }

    public static /* synthetic */ e b(c cVar) {
        return cVar.n;
    }

    public static c c() {
        c cVar;
        synchronized (o) {
            cVar = q;
            S1.g.j(cVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return cVar;
    }

    public static boolean h(InputConnection inputConnection, Editable editable, int i2, int i3, boolean z) {
        return androidx.emoji2.text.d.d(inputConnection, editable, i2, i3, z);
    }

    public static boolean i(Editable editable, int i2, KeyEvent keyEvent) {
        return androidx.emoji2.text.d.e(editable, i2, keyEvent);
    }

    public static c j(c cVar) {
        c cVar2 = q;
        if (cVar2 == null) {
            synchronized (o) {
                try {
                    cVar2 = q;
                    if (cVar2 == null) {
                        cVar2 = new c(cVar);
                        q = cVar2;
                    }
                } finally {
                }
            }
        }
        return cVar2;
    }

    public static boolean k() {
        return q != null;
    }

    public int d(CharSequence charSequence, int i2) {
        S1.g.j(m(), "Not initialized yet");
        S1.g.i(charSequence, "charSequence cannot be null");
        return this.e.a(charSequence, i2);
    }

    public int e() {
        return this.l;
    }

    public int f(CharSequence charSequence, int i2) {
        S1.g.j(m(), "Not initialized yet");
        S1.g.i(charSequence, "charSequence cannot be null");
        return this.e.b(charSequence, i2);
    }

    public int g() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public boolean l() {
        return this.k;
    }

    public final boolean m() {
        return g() == 1;
    }

    public void n() {
        S1.g.j(this.m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (m()) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            this.e.c();
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void o() {
        this.a.writeLock().lock();
        try {
            if (this.m == 0) {
                this.c = 0;
            }
            this.a.writeLock().unlock();
            if (g() == 0) {
                this.e.c();
            }
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public void p(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new g(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public void q() {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new g((Collection) arrayList, this.c));
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence r(CharSequence charSequence) {
        return s(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence s(CharSequence charSequence, int i2, int i3) {
        return t(charSequence, i2, i3, Integer.MAX_VALUE);
    }

    public CharSequence t(CharSequence charSequence, int i2, int i3, int i4) {
        return u(charSequence, i2, i3, i4, 0);
    }

    public CharSequence u(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        boolean z;
        S1.g.j(m(), "Not initialized yet");
        S1.g.f(i2, "start cannot be negative");
        S1.g.f(i3, "end cannot be negative");
        S1.g.f(i4, "maxEmojiCount cannot be negative");
        S1.g.b(i2 <= i3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        S1.g.b(i2 <= charSequence.length(), "start should be < than charSequence length");
        S1.g.b(i3 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        if (i5 != 1) {
            z = i5 != 2 ? this.h : false;
        } else {
            z = true;
        }
        return this.e.d(charSequence, i2, i3, i4, z);
    }

    public void v(f fVar) {
        S1.g.i(fVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new g(fVar, this.c));
            } else {
                this.b.add(fVar);
            }
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public void w(f fVar) {
        S1.g.i(fVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            this.b.remove(fVar);
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public void x(EditorInfo editorInfo) {
        if (!m() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.e.e(editorInfo);
    }
}
