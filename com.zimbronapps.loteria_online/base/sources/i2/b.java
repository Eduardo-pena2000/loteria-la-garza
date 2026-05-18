package I2;

import I2.a;
import J2.b;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.A;
import androidx.lifecycle.B;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import androidx.lifecycle.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import w.j0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class b extends I2.a {
    public static boolean c = false;
    public final r a;
    public final c b;

    public static class a extends A implements b.a {
        public final int l;
        public final Bundle m;
        public final J2.b n;
        public r o;
        public b p;
        public J2.b q;

        public a(int i, Bundle bundle, J2.b bVar, J2.b bVar2) {
            this.l = i;
            this.m = bundle;
            this.n = bVar;
            this.q = bVar2;
            bVar.r(i, this);
        }

        public void a(J2.b bVar, Object obj) {
            if (b.c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                n(obj);
                return;
            }
            if (b.c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            l(obj);
        }

        public void j() {
            if (b.c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.n.u();
        }

        public void k() {
            if (b.c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.n.v();
        }

        public void m(B b) {
            super.m(b);
            this.o = null;
            this.p = null;
        }

        public void n(Object obj) {
            super.n(obj);
            J2.b bVar = this.q;
            if (bVar != null) {
                bVar.s();
                this.q = null;
            }
        }

        public J2.b o(boolean z) {
            if (b.c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.n.b();
            this.n.a();
            b bVar = this.p;
            if (bVar != null) {
                m(bVar);
                if (z) {
                    bVar.d();
                }
            }
            this.n.w(this);
            if ((bVar == null || bVar.c()) && !z) {
                return this.n;
            }
            this.n.s();
            return this.q;
        }

        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.l);
            printWriter.print(" mArgs=");
            printWriter.println(this.m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.n);
            this.n.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.p);
                this.p.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(q().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        public J2.b q() {
            return this.n;
        }

        public void r() {
            r rVar = this.o;
            b bVar = this.p;
            if (rVar == null || bVar == null) {
                return;
            }
            super.m(bVar);
            h(rVar, bVar);
        }

        public J2.b s(r rVar, a.a aVar) {
            b bVar = new b(this.n, aVar);
            h(rVar, bVar);
            B b = this.p;
            if (b != null) {
                m(b);
            }
            this.o = rVar;
            this.p = bVar;
            return this.n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.l);
            sb.append(" : ");
            Class cls = this.n.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}}");
            return sb.toString();
        }
    }

    public static class b implements B {
        public final J2.b a;
        public final a.a b;
        public boolean c = false;

        public b(J2.b bVar, a.a aVar) {
            this.a = bVar;
            this.b = aVar;
        }

        public void a(Object obj) {
            if (b.c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.a + ": " + this.a.d(obj));
            }
            this.c = true;
            this.b.c(this.a, obj);
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.c);
        }

        public boolean c() {
            return this.c;
        }

        public void d() {
            if (this.c) {
                if (b.c) {
                    Log.v("LoaderManager", "  Resetting: " + this.a);
                }
                this.b.a(this.a);
            }
        }

        public String toString() {
            return this.b.toString();
        }
    }

    public static class c extends V {
        public static final X.c c = new a();
        public j0 a = new j0();
        public boolean b = false;

        public static class a implements X.c {
            public V create(Class cls) {
                return new c();
            }
        }

        public static c c(Y y) {
            return (c) new X(y, c).b(c.class);
        }

        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.a.i() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.a.i(); i++) {
                    a aVar = (a) this.a.j(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.a.g(i));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void b() {
            this.b = false;
        }

        public a d(int i) {
            return (a) this.a.e(i);
        }

        public boolean e() {
            return this.b;
        }

        public void f() {
            int i = this.a.i();
            for (int i2 = 0; i2 < i; i2++) {
                ((a) this.a.j(i2)).r();
            }
        }

        public void g(int i, a aVar) {
            this.a.h(i, aVar);
        }

        public void h() {
            this.b = true;
        }

        public void onCleared() {
            super.onCleared();
            int i = this.a.i();
            for (int i2 = 0; i2 < i; i2++) {
                ((a) this.a.j(i2)).o(true);
            }
            this.a.b();
        }
    }

    public b(r rVar, Y y) {
        this.a = rVar;
        this.b = c.c(y);
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.a(str, fileDescriptor, printWriter, strArr);
    }

    public J2.b c(int i, Bundle bundle, a.a aVar) {
        if (this.b.e()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a d = this.b.d(i);
        if (c) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (d == null) {
            return e(i, bundle, aVar, null);
        }
        if (c) {
            Log.v("LoaderManager", "  Re-using existing loader " + d);
        }
        return d.s(this.a, aVar);
    }

    public void d() {
        this.b.f();
    }

    public final J2.b e(int i, Bundle bundle, a.a aVar, J2.b bVar) {
        try {
            this.b.h();
            J2.b b2 = aVar.b(i, bundle);
            if (b2 == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (b2.getClass().isMemberClass() && !Modifier.isStatic(b2.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + b2);
            }
            a aVar2 = new a(i, bundle, b2, bVar);
            if (c) {
                Log.v("LoaderManager", "  Created new loader " + aVar2);
            }
            this.b.g(i, aVar2);
            this.b.b();
            return aVar2.s(this.a, aVar);
        } catch (Throwable th) {
            this.b.b();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Class cls = this.a.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
