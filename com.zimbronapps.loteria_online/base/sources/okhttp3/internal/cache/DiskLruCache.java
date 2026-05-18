package okhttp3.internal.cache;

import Ca.I;
import Ca.i;
import Na.c;
import Za.B;
import Za.E;
import Za.o;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import xb.J;
import xb.L;
import xb.f;
import xb.g;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DiskLruCache implements Closeable, Flushable {
    public final FileSystem a;
    public final File b;
    public final int c;
    public final int d;
    public long e;
    public final File f;
    public final File g;
    public final File h;
    public long i;
    public f j;
    public final LinkedHashMap k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public long s;
    public final TaskQueue t;
    public final DiskLruCache$cleanupTask$1 u;
    public static final Companion v = new Companion(null);
    public static final String w = "journal";
    public static final String x = "journal.tmp";
    public static final String y = "journal.bkp";
    public static final String z = "libcore.io.DiskLruCache";
    public static final String A = "1";
    public static final long B = -1;
    public static final o C = new o("[a-z0-9_-]{1,120}");
    public static final String D = "CLEAN";
    public static final String E = "DIRTY";
    public static final String F = "REMOVE";
    public static final String G = "READ";

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public final class Editor {
        public final Entry a;
        public final boolean[] b;
        public boolean c;
        public final /* synthetic */ DiskLruCache d;

        public Editor(DiskLruCache this$0, Entry entry) {
            t.g(this$0, "this$0");
            t.g(entry, "entry");
            this.d = this$0;
            this.a = entry;
            this.b = entry.g() ? null : new boolean[this$0.A()];
        }

        public final void a() {
            DiskLruCache diskLruCache = this.d;
            synchronized (diskLruCache) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (t.c(d().b(), this)) {
                        diskLruCache.o(this, false);
                    }
                    this.c = true;
                    I i = I.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            DiskLruCache diskLruCache = this.d;
            synchronized (diskLruCache) {
                try {
                    if (this.c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (t.c(d().b(), this)) {
                        diskLruCache.o(this, true);
                    }
                    this.c = true;
                    I i = I.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            if (t.c(this.a.b(), this)) {
                if (DiskLruCache.a(this.d)) {
                    this.d.o(this, false);
                } else {
                    this.a.q(true);
                }
            }
        }

        public final Entry d() {
            return this.a;
        }

        public final boolean[] e() {
            return this.b;
        }

        public final J f(int i) {
            DiskLruCache diskLruCache = this.d;
            synchronized (diskLruCache) {
                if (this.c) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!t.c(d().b(), this)) {
                    return x.b();
                }
                if (!d().g()) {
                    boolean[] e = e();
                    t.d(e);
                    e[i] = true;
                }
                try {
                    return new FaultHidingSink(diskLruCache.y().sink((File) d().c().get(i)), new DiskLruCache$Editor$newSink$1$1(diskLruCache, this));
                } catch (FileNotFoundException unused) {
                    return x.b();
                }
            }
        }
    }

    public final class Entry {
        public final String a;
        public final long[] b;
        public final List c;
        public final List d;
        public boolean e;
        public boolean f;
        public Editor g;
        public int h;
        public long i;
        public final /* synthetic */ DiskLruCache j;

        public Entry(DiskLruCache this$0, String key) {
            t.g(this$0, "this$0");
            t.g(key, "key");
            this.j = this$0;
            this.a = key;
            this.b = new long[this$0.A()];
            this.c = new ArrayList();
            this.d = new ArrayList();
            StringBuilder sb = new StringBuilder(key);
            sb.append('.');
            int length = sb.length();
            int A = this$0.A();
            for (int i = 0; i < A; i++) {
                sb.append(i);
                this.c.add(new File(this.j.x(), sb.toString()));
                sb.append(".tmp");
                this.d.add(new File(this.j.x(), sb.toString()));
                sb.setLength(length);
            }
        }

        public final List a() {
            return this.c;
        }

        public final Editor b() {
            return this.g;
        }

        public final List c() {
            return this.d;
        }

        public final String d() {
            return this.a;
        }

        public final long[] e() {
            return this.b;
        }

        public final int f() {
            return this.h;
        }

        public final boolean g() {
            return this.e;
        }

        public final long h() {
            return this.i;
        }

        public final boolean i() {
            return this.f;
        }

        public final Void j(List list) {
            throw new IOException(t.o("unexpected journal line: ", list));
        }

        public final L k(int i) {
            L source = this.j.y().source((File) this.c.get(i));
            if (DiskLruCache.a(this.j)) {
                return source;
            }
            this.h++;
            return new DiskLruCache$Entry$newSource$1(source, this.j, this);
        }

        public final void l(Editor editor) {
            this.g = editor;
        }

        public final void m(List strings) {
            t.g(strings, "strings");
            if (strings.size() != this.j.A()) {
                j(strings);
                throw new i();
            }
            try {
                int size = strings.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    this.b[i] = Long.parseLong((String) strings.get(i));
                    i = i2;
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new i();
            }
        }

        public final void n(int i) {
            this.h = i;
        }

        public final void o(boolean z) {
            this.e = z;
        }

        public final void p(long j) {
            this.i = j;
        }

        public final void q(boolean z) {
            this.f = z;
        }

        public final Snapshot r() {
            DiskLruCache diskLruCache = this.j;
            if (Util.h && !Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
            }
            if (!this.e) {
                return null;
            }
            if (!DiskLruCache.a(this.j) && (this.g != null || this.f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.b.clone();
            try {
                int A = this.j.A();
                for (int i = 0; i < A; i++) {
                    arrayList.add(k(i));
                }
                return new Snapshot(this.j, this.a, this.i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Util.m((L) it.next());
                }
                try {
                    this.j.O(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(f writer) {
            t.g(writer, "writer");
            long[] jArr = this.b;
            int length = jArr.length;
            int i = 0;
            while (i < length) {
                long j = jArr[i];
                i++;
                writer.writeByte(32).writeDecimalLong(j);
            }
        }
    }

    public final class Snapshot implements Closeable {
        public final String a;
        public final long b;
        public final List c;
        public final long[] d;
        public final /* synthetic */ DiskLruCache e;

        public Snapshot(DiskLruCache this$0, String key, long j, List sources, long[] lengths) {
            t.g(this$0, "this$0");
            t.g(key, "key");
            t.g(sources, "sources");
            t.g(lengths, "lengths");
            this.e = this$0;
            this.a = key;
            this.b = j;
            this.c = sources;
            this.d = lengths;
        }

        public final Editor a() {
            return this.e.s(this.a, this.b);
        }

        public final L b(int i) {
            return (L) this.c.get(i);
        }

        public final String c() {
            return this.a;
        }

        public void close() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                Util.m((L) it.next());
            }
        }
    }

    public static final /* synthetic */ boolean a(DiskLruCache diskLruCache) {
        return diskLruCache.n;
    }

    public static final /* synthetic */ boolean b(DiskLruCache diskLruCache) {
        return diskLruCache.o;
    }

    public static final /* synthetic */ boolean c(DiskLruCache diskLruCache) {
        return diskLruCache.C();
    }

    public static final /* synthetic */ void d(DiskLruCache diskLruCache, boolean z2) {
        diskLruCache.m = z2;
    }

    public static final /* synthetic */ void f(DiskLruCache diskLruCache, f fVar) {
        diskLruCache.j = fVar;
    }

    public static final /* synthetic */ void g(DiskLruCache diskLruCache, boolean z2) {
        diskLruCache.r = z2;
    }

    public static final /* synthetic */ void h(DiskLruCache diskLruCache, boolean z2) {
        diskLruCache.q = z2;
    }

    public static final /* synthetic */ void k(DiskLruCache diskLruCache, int i) {
        diskLruCache.l = i;
    }

    public static /* synthetic */ Editor t(DiskLruCache diskLruCache, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = B;
        }
        return diskLruCache.s(str, j);
    }

    public final int A() {
        return this.d;
    }

    public final synchronized void B() {
        try {
            if (Util.h && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.o) {
                return;
            }
            if (this.a.exists(this.h)) {
                if (this.a.exists(this.f)) {
                    this.a.delete(this.h);
                } else {
                    this.a.rename(this.h, this.f);
                }
            }
            this.n = Util.F(this.a, this.h);
            if (this.a.exists(this.f)) {
                try {
                    J();
                    G();
                    this.o = true;
                    return;
                } catch (IOException e) {
                    Platform.a.g().k("DiskLruCache " + this.b + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                    try {
                        r();
                        this.p = false;
                    } catch (Throwable th) {
                        this.p = false;
                        throw th;
                    }
                }
            }
            M();
            this.o = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean C() {
        int i = this.l;
        return i >= 2000 && i >= this.k.size();
    }

    public final f E() {
        return x.c(new FaultHidingSink(this.a.appendingSink(this.f), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    public final void G() {
        this.a.delete(this.g);
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            t.f(next, "i.next()");
            Entry entry = (Entry) next;
            int i = 0;
            if (entry.b() == null) {
                int i2 = this.d;
                while (i < i2) {
                    this.i += entry.e()[i];
                    i++;
                }
            } else {
                entry.l(null);
                int i3 = this.d;
                while (i < i3) {
                    this.a.delete((File) entry.a().get(i));
                    this.a.delete((File) entry.c().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void J() {
        g d = x.d(this.a.source(this.f));
        try {
            String readUtf8LineStrict = d.readUtf8LineStrict();
            String readUtf8LineStrict2 = d.readUtf8LineStrict();
            String readUtf8LineStrict3 = d.readUtf8LineStrict();
            String readUtf8LineStrict4 = d.readUtf8LineStrict();
            String readUtf8LineStrict5 = d.readUtf8LineStrict();
            if (!t.c(z, readUtf8LineStrict) || !t.c(A, readUtf8LineStrict2) || !t.c(String.valueOf(this.c), readUtf8LineStrict3) || !t.c(String.valueOf(A()), readUtf8LineStrict4) || readUtf8LineStrict5.length() > 0) {
                throw new IOException("unexpected journal header: [" + readUtf8LineStrict + ", " + readUtf8LineStrict2 + ", " + readUtf8LineStrict4 + ", " + readUtf8LineStrict5 + ']');
            }
            int i = 0;
            while (true) {
                try {
                    L(d.readUtf8LineStrict());
                    i++;
                } catch (EOFException unused) {
                    this.l = i - z().size();
                    if (d.exhausted()) {
                        this.j = E();
                    } else {
                        M();
                    }
                    I i2 = I.a;
                    c.a(d, null);
                    return;
                }
            }
        } finally {
        }
    }

    public final void L(String str) {
        String substring;
        int e0 = E.e0(str, ' ', 0, false, 6, null);
        if (e0 == -1) {
            throw new IOException(t.o("unexpected journal line: ", str));
        }
        int i = e0 + 1;
        int e02 = E.e0(str, ' ', i, false, 4, null);
        if (e02 == -1) {
            substring = str.substring(i);
            t.f(substring, "this as java.lang.String).substring(startIndex)");
            String str2 = F;
            if (e0 == str2.length() && B.N(str, str2, false, 2, null)) {
                this.k.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, e02);
            t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Entry entry = (Entry) this.k.get(substring);
        if (entry == null) {
            entry = new Entry(this, substring);
            this.k.put(substring, entry);
        }
        if (e02 != -1) {
            String str3 = D;
            if (e0 == str3.length() && B.N(str, str3, false, 2, null)) {
                String substring2 = str.substring(e02 + 1);
                t.f(substring2, "this as java.lang.String).substring(startIndex)");
                List L0 = E.L0(substring2, new char[]{' '}, false, 0, 6, null);
                entry.o(true);
                entry.l(null);
                entry.m(L0);
                return;
            }
        }
        if (e02 == -1) {
            String str4 = E;
            if (e0 == str4.length() && B.N(str, str4, false, 2, null)) {
                entry.l(new Editor(this, entry));
                return;
            }
        }
        if (e02 == -1) {
            String str5 = G;
            if (e0 == str5.length() && B.N(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException(t.o("unexpected journal line: ", str));
    }

    public final synchronized void M() {
        try {
            f fVar = this.j;
            if (fVar != null) {
                fVar.close();
            }
            f c = x.c(this.a.sink(this.g));
            try {
                c.writeUtf8(z).writeByte(10);
                c.writeUtf8(A).writeByte(10);
                c.writeDecimalLong(this.c).writeByte(10);
                c.writeDecimalLong(A()).writeByte(10);
                c.writeByte(10);
                for (Entry entry : z().values()) {
                    if (entry.b() != null) {
                        c.writeUtf8(E).writeByte(32);
                        c.writeUtf8(entry.d());
                        c.writeByte(10);
                    } else {
                        c.writeUtf8(D).writeByte(32);
                        c.writeUtf8(entry.d());
                        entry.s(c);
                        c.writeByte(10);
                    }
                }
                I i = I.a;
                c.a(c, null);
                if (this.a.exists(this.f)) {
                    this.a.rename(this.f, this.h);
                }
                this.a.rename(this.g, this.f);
                this.a.delete(this.h);
                this.j = E();
                this.m = false;
                this.r = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean N(String key) {
        t.g(key, "key");
        B();
        m();
        T(key);
        Entry entry = (Entry) this.k.get(key);
        if (entry == null) {
            return false;
        }
        boolean O = O(entry);
        if (O && this.i <= this.e) {
            this.q = false;
        }
        return O;
    }

    public final boolean O(Entry entry) {
        f fVar;
        t.g(entry, "entry");
        if (!this.n) {
            if (entry.f() > 0 && (fVar = this.j) != null) {
                fVar.writeUtf8(E);
                fVar.writeByte(32);
                fVar.writeUtf8(entry.d());
                fVar.writeByte(10);
                fVar.flush();
            }
            if (entry.f() > 0 || entry.b() != null) {
                entry.q(true);
                return true;
            }
        }
        Editor b = entry.b();
        if (b != null) {
            b.c();
        }
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            this.a.delete((File) entry.a().get(i2));
            this.i -= entry.e()[i2];
            entry.e()[i2] = 0;
        }
        this.l++;
        f fVar2 = this.j;
        if (fVar2 != null) {
            fVar2.writeUtf8(F);
            fVar2.writeByte(32);
            fVar2.writeUtf8(entry.d());
            fVar2.writeByte(10);
        }
        this.k.remove(entry.d());
        if (C()) {
            TaskQueue.j(this.t, this.u, 0L, 2, null);
        }
        return true;
    }

    public final boolean P() {
        for (Entry toEvict : this.k.values()) {
            if (!toEvict.i()) {
                t.f(toEvict, "toEvict");
                O(toEvict);
                return true;
            }
        }
        return false;
    }

    public final void R() {
        while (this.i > this.e) {
            if (!P()) {
                return;
            }
        }
        this.q = false;
    }

    public final void T(String str) {
        if (C.h(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public synchronized void close() {
        Editor b;
        try {
            if (this.o && !this.p) {
                Collection values = this.k.values();
                t.f(values, "lruEntries.values");
                int i = 0;
                Object[] array = values.toArray(new Entry[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                Entry[] entryArr = (Entry[]) array;
                int length = entryArr.length;
                while (i < length) {
                    Entry entry = entryArr[i];
                    i++;
                    if (entry.b() != null && (b = entry.b()) != null) {
                        b.c();
                    }
                }
                R();
                f fVar = this.j;
                t.d(fVar);
                fVar.close();
                this.j = null;
                this.p = true;
                return;
            }
            this.p = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void flush() {
        if (this.o) {
            m();
            R();
            f fVar = this.j;
            t.d(fVar);
            fVar.flush();
        }
    }

    public final synchronized void m() {
        if (this.p) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void o(Editor editor, boolean z2) {
        t.g(editor, "editor");
        Entry d = editor.d();
        if (!t.c(d.b(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        int i = 0;
        if (z2 && !d.g()) {
            int i2 = this.d;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                boolean[] e = editor.e();
                t.d(e);
                if (!e[i3]) {
                    editor.a();
                    throw new IllegalStateException(t.o("Newly created entry didn't create value for index ", Integer.valueOf(i3)));
                }
                if (!this.a.exists((File) d.c().get(i3))) {
                    editor.a();
                    return;
                }
                i3 = i4;
            }
        }
        int i5 = this.d;
        while (i < i5) {
            int i6 = i + 1;
            File file = (File) d.c().get(i);
            if (!z2 || d.i()) {
                this.a.delete(file);
            } else if (this.a.exists(file)) {
                File file2 = (File) d.a().get(i);
                this.a.rename(file, file2);
                long j = d.e()[i];
                long size = this.a.size(file2);
                d.e()[i] = size;
                this.i = (this.i - j) + size;
            }
            i = i6;
        }
        d.l(null);
        if (d.i()) {
            O(d);
            return;
        }
        this.l++;
        f fVar = this.j;
        t.d(fVar);
        if (d.g() || z2) {
            d.o(true);
            fVar.writeUtf8(D).writeByte(32);
            fVar.writeUtf8(d.d());
            d.s(fVar);
            fVar.writeByte(10);
            if (z2) {
                long j2 = this.s;
                this.s = 1 + j2;
                d.p(j2);
            }
        } else {
            z().remove(d.d());
            fVar.writeUtf8(F).writeByte(32);
            fVar.writeUtf8(d.d());
            fVar.writeByte(10);
        }
        fVar.flush();
        if (this.i > this.e || C()) {
            TaskQueue.j(this.t, this.u, 0L, 2, null);
        }
    }

    public final void r() {
        close();
        this.a.deleteContents(this.b);
    }

    public final synchronized Editor s(String key, long j) {
        t.g(key, "key");
        B();
        m();
        T(key);
        Entry entry = (Entry) this.k.get(key);
        if (j != B && (entry == null || entry.h() != j)) {
            return null;
        }
        if ((entry == null ? null : entry.b()) != null) {
            return null;
        }
        if (entry != null && entry.f() != 0) {
            return null;
        }
        if (!this.q && !this.r) {
            f fVar = this.j;
            t.d(fVar);
            fVar.writeUtf8(E).writeByte(32).writeUtf8(key).writeByte(10);
            fVar.flush();
            if (this.m) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, key);
                this.k.put(key, entry);
            }
            Editor editor = new Editor(this, entry);
            entry.l(editor);
            return editor;
        }
        TaskQueue.j(this.t, this.u, 0L, 2, null);
        return null;
    }

    public final synchronized Snapshot u(String key) {
        t.g(key, "key");
        B();
        m();
        T(key);
        Entry entry = (Entry) this.k.get(key);
        if (entry == null) {
            return null;
        }
        Snapshot r = entry.r();
        if (r == null) {
            return null;
        }
        this.l++;
        f fVar = this.j;
        t.d(fVar);
        fVar.writeUtf8(G).writeByte(32).writeUtf8(key).writeByte(10);
        if (C()) {
            TaskQueue.j(this.t, this.u, 0L, 2, null);
        }
        return r;
    }

    public final boolean v() {
        return this.p;
    }

    public final File x() {
        return this.b;
    }

    public final FileSystem y() {
        return this.a;
    }

    public final LinkedHashMap z() {
        return this.k;
    }
}
