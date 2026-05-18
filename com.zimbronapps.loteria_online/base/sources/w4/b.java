package W4;

import Ca.I;
import Qa.p;
import Za.B;
import Za.E;
import Za.o;
import cb.B0;
import cb.K;
import cb.O;
import cb.P;
import cb.Q;
import cb.W0;
import cb.i;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import xb.C;
import xb.J;
import xb.l;
import xb.m;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements Closeable, Flushable {
    public static final a s = new a(null);
    public static final o t = new o("[a-z0-9_-]{1,120}");
    public final C a;
    public final long b;
    public final int c;
    public final int d;
    public final C e;
    public final C f;
    public final C g;
    public final LinkedHashMap h;
    public final O i;
    public long j;
    public int k;
    public xb.f l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public final e r;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
        }
    }

    public final class b {
        public final c a;
        public boolean b;
        public final boolean[] c;

        public b(c cVar) {
            this.a = cVar;
            this.c = new boolean[b.g(b.this)];
        }

        public final void a() {
            d(false);
        }

        public final void b() {
            d(true);
        }

        public final d c() {
            d A;
            b bVar = b.this;
            synchronized (bVar) {
                b();
                A = bVar.A(this.a.d());
            }
            return A;
        }

        public final void d(boolean z) {
            b bVar = b.this;
            synchronized (bVar) {
                try {
                    if (this.b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (t.c(this.a.b(), this)) {
                        b.a(bVar, this, z);
                    }
                    this.b = true;
                    I i = I.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void e() {
            if (t.c(this.a.b(), this)) {
                this.a.m(true);
            }
        }

        public final C f(int i) {
            C c;
            b bVar = b.this;
            synchronized (bVar) {
                if (this.b) {
                    throw new IllegalStateException("editor is closed");
                }
                this.c[i] = true;
                Object obj = this.a.c().get(i);
                j5.e.a(b.d(bVar), (C) obj);
                c = (C) obj;
            }
            return c;
        }

        public final c g() {
            return this.a;
        }

        public final boolean[] h() {
            return this.c;
        }
    }

    public final class c {
        public final String a;
        public final long[] b;
        public final ArrayList c;
        public final ArrayList d;
        public boolean e;
        public boolean f;
        public b g;
        public int h;

        public c(String str) {
            this.a = str;
            this.b = new long[b.g(b.this)];
            this.c = new ArrayList(b.g(b.this));
            this.d = new ArrayList(b.g(b.this));
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int g = b.g(b.this);
            for (int i = 0; i < g; i++) {
                sb.append(i);
                this.c.add(b.c(b.this).k(sb.toString()));
                sb.append(".tmp");
                this.d.add(b.c(b.this).k(sb.toString()));
                sb.setLength(length);
            }
        }

        public final ArrayList a() {
            return this.c;
        }

        public final b b() {
            return this.g;
        }

        public final ArrayList c() {
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

        public final boolean h() {
            return this.f;
        }

        public final void i(b bVar) {
            this.g = bVar;
        }

        public final void j(List list) {
            if (list.size() != b.g(b.this)) {
                throw new IOException("unexpected journal line: " + list);
            }
            try {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    this.b[i] = Long.parseLong((String) list.get(i));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        public final void k(int i) {
            this.h = i;
        }

        public final void l(boolean z) {
            this.e = z;
        }

        public final void m(boolean z) {
            this.f = z;
        }

        public final d n() {
            if (!this.e || this.g != null || this.f) {
                return null;
            }
            ArrayList arrayList = this.c;
            b bVar = b.this;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (!b.d(bVar).j((C) arrayList.get(i))) {
                    try {
                        b.k(bVar, this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.h++;
            return b.this.new d(this);
        }

        public final void o(xb.f fVar) {
            for (long j : this.b) {
                fVar.writeByte(32).writeDecimalLong(j);
            }
        }
    }

    public final class d implements Closeable {
        public final c a;
        public boolean b;

        public d(c cVar) {
            this.a = cVar;
        }

        public final b a() {
            b z;
            b bVar = b.this;
            synchronized (bVar) {
                close();
                z = bVar.z(this.a.d());
            }
            return z;
        }

        public final C b(int i) {
            if (this.b) {
                throw new IllegalStateException("snapshot is closed");
            }
            return (C) this.a.a().get(i);
        }

        public void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            b bVar = b.this;
            synchronized (bVar) {
                try {
                    this.a.k(r1.f() - 1);
                    if (this.a.f() == 0 && this.a.h()) {
                        b.k(bVar, this.a);
                    }
                    I i = I.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class e extends m {
        public e(l lVar) {
            super(lVar);
        }

        public J p(C c, boolean z) {
            C h = c.h();
            if (h != null) {
                d(h);
            }
            return super.p(c, z);
        }
    }

    public static final class f extends Ia.l implements p {
        public int a;

        public f(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return b.this.new f(eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Ha.c.f();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            b bVar = b.this;
            synchronized (bVar) {
                if (!b.f(bVar) || b.b(bVar)) {
                    return I.a;
                }
                try {
                    b.t(bVar);
                } catch (IOException unused) {
                    b.s(bVar, true);
                }
                try {
                    if (b.h(bVar)) {
                        b.u(bVar);
                    }
                } catch (IOException unused2) {
                    b.r(bVar, true);
                    b.o(bVar, x.c(x.b()));
                }
                return I.a;
            }
        }
    }

    public static final class g extends u implements Qa.l {
        public g() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IOException) obj);
            return I.a;
        }

        public final void invoke(IOException iOException) {
            b.m(b.this, true);
        }
    }

    public b(l lVar, C c2, K k, long j, int i, int i2) {
        this.a = c2;
        this.b = j;
        this.c = i;
        this.d = i2;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.e = c2.k("journal");
        this.f = c2.k("journal.tmp");
        this.g = c2.k("journal.bkp");
        this.h = new LinkedHashMap(0, 0.75f, true);
        this.i = P.a(W0.b((B0) null, 1, (Object) null).plus(k.A(1)));
        this.r = new e(lVar);
    }

    public static final /* synthetic */ void a(b bVar, b bVar2, boolean z) {
        bVar.x(bVar2, z);
    }

    public static final /* synthetic */ boolean b(b bVar) {
        return bVar.o;
    }

    public static final /* synthetic */ C c(b bVar) {
        return bVar.a;
    }

    public static final /* synthetic */ e d(b bVar) {
        return bVar.r;
    }

    public static final /* synthetic */ boolean f(b bVar) {
        return bVar.n;
    }

    public static final /* synthetic */ int g(b bVar) {
        return bVar.d;
    }

    public static final /* synthetic */ boolean h(b bVar) {
        return bVar.C();
    }

    public static final /* synthetic */ boolean k(b bVar, c cVar) {
        return bVar.N(cVar);
    }

    public static final /* synthetic */ void m(b bVar, boolean z) {
        bVar.m = z;
    }

    public static final /* synthetic */ void o(b bVar, xb.f fVar) {
        bVar.l = fVar;
    }

    public static final /* synthetic */ void r(b bVar, boolean z) {
        bVar.q = z;
    }

    public static final /* synthetic */ void s(b bVar, boolean z) {
        bVar.p = z;
    }

    public static final /* synthetic */ void t(b bVar) {
        bVar.P();
    }

    public static final /* synthetic */ void u(b bVar) {
        bVar.T();
    }

    public final synchronized d A(String str) {
        d n;
        v();
        R(str);
        B();
        c cVar = (c) this.h.get(str);
        if (cVar != null && (n = cVar.n()) != null) {
            this.k++;
            xb.f fVar = this.l;
            t.d(fVar);
            fVar.writeUtf8("READ");
            fVar.writeByte(32);
            fVar.writeUtf8(str);
            fVar.writeByte(10);
            if (C()) {
                E();
            }
            return n;
        }
        return null;
    }

    public final synchronized void B() {
        try {
            if (this.n) {
                return;
            }
            this.r.h(this.f);
            if (this.r.j(this.g)) {
                if (this.r.j(this.e)) {
                    this.r.h(this.g);
                } else {
                    this.r.c(this.g, this.e);
                }
            }
            if (this.r.j(this.e)) {
                try {
                    L();
                    J();
                    this.n = true;
                    return;
                } catch (IOException unused) {
                    try {
                        y();
                        this.o = false;
                    } catch (Throwable th) {
                        this.o = false;
                        throw th;
                    }
                }
            }
            T();
            this.n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean C() {
        return this.k >= 2000;
    }

    public final void E() {
        i.d(this.i, (Ga.i) null, (Q) null, new f(null), 3, (Object) null);
    }

    public final xb.f G() {
        return x.c(new W4.c(this.r.a(this.e), new g()));
    }

    public final void J() {
        Iterator it = this.h.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int i = 0;
            if (cVar.b() == null) {
                int i2 = this.d;
                while (i < i2) {
                    j += cVar.e()[i];
                    i++;
                }
            } else {
                cVar.i(null);
                int i3 = this.d;
                while (i < i3) {
                    this.r.h((C) cVar.a().get(i));
                    this.r.h((C) cVar.c().get(i));
                    i++;
                }
                it.remove();
            }
        }
        this.j = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L() {
        /*
            r12 = this;
            java.lang.String r0 = ", "
            W4.b$e r1 = r12.r
            xb.C r2 = r12.e
            xb.L r1 = r1.q(r2)
            xb.g r1 = xb.x.d(r1)
            r2 = 0
            java.lang.String r3 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = "libcore.io.DiskLruCache"
            boolean r8 = kotlin.jvm.internal.t.c(r8, r3)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L81
            java.lang.String r8 = "1"
            boolean r8 = kotlin.jvm.internal.t.c(r8, r4)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L81
            int r8 = r12.c     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L5c
            boolean r8 = kotlin.jvm.internal.t.c(r8, r5)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L81
            int r8 = r12.d     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L5c
            boolean r8 = kotlin.jvm.internal.t.c(r8, r6)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L81
            int r8 = r7.length()     // Catch: java.lang.Throwable -> L5c
            if (r8 > 0) goto L81
            r0 = 0
        L52:
            java.lang.String r3 = r1.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5c java.io.EOFException -> L5e
            r12.M(r3)     // Catch: java.lang.Throwable -> L5c java.io.EOFException -> L5e
            int r0 = r0 + 1
            goto L52
        L5c:
            r0 = move-exception
            goto Lb5
        L5e:
            java.util.LinkedHashMap r3 = r12.h     // Catch: java.lang.Throwable -> L5c
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L5c
            int r0 = r0 - r3
            r12.k = r0     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r1.exhausted()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L71
            r12.T()     // Catch: java.lang.Throwable -> L5c
            goto L77
        L71:
            xb.f r0 = r12.G()     // Catch: java.lang.Throwable -> L5c
            r12.l = r0     // Catch: java.lang.Throwable -> L5c
        L77:
            Ca.I r0 = Ca.I.a     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto Lc2
            r1.close()     // Catch: java.lang.Throwable -> L7f
            goto Lc2
        L7f:
            r2 = move-exception
            goto Lc2
        L81:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r9.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r10 = "unexpected journal header: ["
            r9.append(r10)     // Catch: java.lang.Throwable -> L5c
            r9.append(r3)     // Catch: java.lang.Throwable -> L5c
            r9.append(r0)     // Catch: java.lang.Throwable -> L5c
            r9.append(r4)     // Catch: java.lang.Throwable -> L5c
            r9.append(r0)     // Catch: java.lang.Throwable -> L5c
            r9.append(r5)     // Catch: java.lang.Throwable -> L5c
            r9.append(r0)     // Catch: java.lang.Throwable -> L5c
            r9.append(r6)     // Catch: java.lang.Throwable -> L5c
            r9.append(r0)     // Catch: java.lang.Throwable -> L5c
            r9.append(r7)     // Catch: java.lang.Throwable -> L5c
            r0 = 93
            r9.append(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> L5c
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            throw r8     // Catch: java.lang.Throwable -> L5c
        Lb5:
            if (r1 == 0) goto Lbf
            r1.close()     // Catch: java.lang.Throwable -> Lbb
            goto Lbf
        Lbb:
            r1 = move-exception
            Ca.g.a(r0, r1)
        Lbf:
            r11 = r2
            r2 = r0
            r0 = r11
        Lc2:
            if (r2 != 0) goto Lc8
            kotlin.jvm.internal.t.d(r0)
            return
        Lc8:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: W4.b.L():void");
    }

    public final void M(String str) {
        String substring;
        int e0 = E.e0(str, ' ', 0, false, 6, (Object) null);
        if (e0 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = e0 + 1;
        int e02 = E.e0(str, ' ', i, false, 4, (Object) null);
        if (e02 == -1) {
            substring = str.substring(i);
            t.f(substring, "this as java.lang.String).substring(startIndex)");
            if (e0 == 6 && B.N(str, "REMOVE", false, 2, (Object) null)) {
                this.h.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, e02);
            t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        LinkedHashMap linkedHashMap = this.h;
        Object obj = linkedHashMap.get(substring);
        if (obj == null) {
            obj = new c(substring);
            linkedHashMap.put(substring, obj);
        }
        c cVar = (c) obj;
        if (e02 != -1 && e0 == 5 && B.N(str, "CLEAN", false, 2, (Object) null)) {
            String substring2 = str.substring(e02 + 1);
            t.f(substring2, "this as java.lang.String).substring(startIndex)");
            List L0 = E.L0(substring2, new char[]{' '}, false, 0, 6, (Object) null);
            cVar.l(true);
            cVar.i(null);
            cVar.j(L0);
            return;
        }
        if (e02 == -1 && e0 == 5 && B.N(str, "DIRTY", false, 2, (Object) null)) {
            cVar.i(new b(cVar));
            return;
        }
        if (e02 == -1 && e0 == 4 && B.N(str, "READ", false, 2, (Object) null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final boolean N(c cVar) {
        xb.f fVar;
        if (cVar.f() > 0 && (fVar = this.l) != null) {
            fVar.writeUtf8("DIRTY");
            fVar.writeByte(32);
            fVar.writeUtf8(cVar.d());
            fVar.writeByte(10);
            fVar.flush();
        }
        if (cVar.f() > 0 || cVar.b() != null) {
            cVar.m(true);
            return true;
        }
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            this.r.h((C) cVar.a().get(i2));
            this.j -= cVar.e()[i2];
            cVar.e()[i2] = 0;
        }
        this.k++;
        xb.f fVar2 = this.l;
        if (fVar2 != null) {
            fVar2.writeUtf8("REMOVE");
            fVar2.writeByte(32);
            fVar2.writeUtf8(cVar.d());
            fVar2.writeByte(10);
        }
        this.h.remove(cVar.d());
        if (C()) {
            E();
        }
        return true;
    }

    public final boolean O() {
        for (c cVar : this.h.values()) {
            if (!cVar.h()) {
                N(cVar);
                return true;
            }
        }
        return false;
    }

    public final void P() {
        while (this.j > this.b) {
            if (!O()) {
                return;
            }
        }
        this.p = false;
    }

    public final void R(String str) {
        if (t.h(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final synchronized void T() {
        I i;
        try {
            xb.f fVar = this.l;
            if (fVar != null) {
                fVar.close();
            }
            xb.f c2 = x.c(this.r.p(this.f, false));
            Throwable th = null;
            try {
                c2.writeUtf8("libcore.io.DiskLruCache").writeByte(10);
                c2.writeUtf8("1").writeByte(10);
                c2.writeDecimalLong(this.c).writeByte(10);
                c2.writeDecimalLong(this.d).writeByte(10);
                c2.writeByte(10);
                for (c cVar : this.h.values()) {
                    if (cVar.b() != null) {
                        c2.writeUtf8("DIRTY");
                        c2.writeByte(32);
                        c2.writeUtf8(cVar.d());
                        c2.writeByte(10);
                    } else {
                        c2.writeUtf8("CLEAN");
                        c2.writeByte(32);
                        c2.writeUtf8(cVar.d());
                        cVar.o(c2);
                        c2.writeByte(10);
                    }
                }
                i = I.a;
                if (c2 != null) {
                    try {
                        c2.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                if (c2 != null) {
                    try {
                        c2.close();
                    } catch (Throwable th4) {
                        Ca.g.a(th3, th4);
                    }
                }
                i = null;
                th = th3;
            }
            if (th != null) {
                throw th;
            }
            t.d(i);
            if (this.r.j(this.e)) {
                this.r.c(this.e, this.g);
                this.r.c(this.f, this.e);
                this.r.h(this.g);
            } else {
                this.r.c(this.f, this.e);
            }
            this.l = G();
            this.k = 0;
            this.m = false;
            this.q = false;
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public synchronized void close() {
        try {
            if (this.n && !this.o) {
                for (c cVar : (c[]) this.h.values().toArray(new c[0])) {
                    b b2 = cVar.b();
                    if (b2 != null) {
                        b2.e();
                    }
                }
                P();
                P.d(this.i, (CancellationException) null, 1, (Object) null);
                xb.f fVar = this.l;
                t.d(fVar);
                fVar.close();
                this.l = null;
                this.o = true;
                return;
            }
            this.o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void flush() {
        if (this.n) {
            v();
            P();
            xb.f fVar = this.l;
            t.d(fVar);
            fVar.flush();
        }
    }

    public final void v() {
        if (this.o) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void x(b bVar, boolean z) {
        c g2 = bVar.g();
        if (!t.c(g2.b(), bVar)) {
            throw new IllegalStateException("Check failed.");
        }
        int i = 0;
        if (!z || g2.h()) {
            int i2 = this.d;
            while (i < i2) {
                this.r.h((C) g2.c().get(i));
                i++;
            }
        } else {
            int i3 = this.d;
            for (int i4 = 0; i4 < i3; i4++) {
                if (bVar.h()[i4] && !this.r.j((C) g2.c().get(i4))) {
                    bVar.a();
                    return;
                }
            }
            int i5 = this.d;
            while (i < i5) {
                C c2 = (C) g2.c().get(i);
                C c3 = (C) g2.a().get(i);
                if (this.r.j(c2)) {
                    this.r.c(c2, c3);
                } else {
                    j5.e.a(this.r, (C) g2.a().get(i));
                }
                long j = g2.e()[i];
                Long d2 = this.r.l(c3).d();
                long longValue = d2 != null ? d2.longValue() : 0L;
                g2.e()[i] = longValue;
                this.j = (this.j - j) + longValue;
                i++;
            }
        }
        g2.i(null);
        if (g2.h()) {
            N(g2);
            return;
        }
        this.k++;
        xb.f fVar = this.l;
        t.d(fVar);
        if (z || g2.g()) {
            g2.l(true);
            fVar.writeUtf8("CLEAN");
            fVar.writeByte(32);
            fVar.writeUtf8(g2.d());
            g2.o(fVar);
            fVar.writeByte(10);
        } else {
            this.h.remove(g2.d());
            fVar.writeUtf8("REMOVE");
            fVar.writeByte(32);
            fVar.writeUtf8(g2.d());
            fVar.writeByte(10);
        }
        fVar.flush();
        if (this.j > this.b || C()) {
            E();
        }
    }

    public final void y() {
        close();
        j5.e.b(this.r, this.a);
    }

    public final synchronized b z(String str) {
        v();
        R(str);
        B();
        c cVar = (c) this.h.get(str);
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.p && !this.q) {
            xb.f fVar = this.l;
            t.d(fVar);
            fVar.writeUtf8("DIRTY");
            fVar.writeByte(32);
            fVar.writeUtf8(str);
            fVar.writeByte(10);
            fVar.flush();
            if (this.m) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(str);
                this.h.put(str, cVar);
            }
            b bVar = new b(cVar);
            cVar.i(bVar);
            return bVar;
        }
        E();
        return null;
    }
}
