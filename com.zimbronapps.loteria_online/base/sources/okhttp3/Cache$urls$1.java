package okhttp3;

import Na.c;
import Ra.a;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.t;
import okhttp3.internal.cache.DiskLruCache;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Cache$urls$1 implements Iterator, a {
    public final Iterator a;
    public String b;
    public boolean c;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.b;
        t.d(str);
        this.b = null;
        this.c = true;
        return str;
    }

    public boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        this.c = false;
        while (this.a.hasNext()) {
            try {
                Closeable closeable = (Closeable) this.a.next();
                try {
                    continue;
                    this.b = x.d(((DiskLruCache.Snapshot) closeable).b(0)).readUtf8LineStrict();
                    c.a(closeable, null);
                    return true;
                } finally {
                    try {
                        continue;
                    } catch (Throwable th) {
                    }
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public void remove() {
        if (!this.c) {
            throw new IllegalStateException("remove() before next()");
        }
        this.a.remove();
    }
}
