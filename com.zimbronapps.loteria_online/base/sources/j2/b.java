package J2;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {
    public int a;
    public a b;
    public Context c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = true;
    public boolean g = false;
    public boolean h = false;

    public interface a {
        void a(b bVar, Object obj);
    }

    public b(Context context) {
        this.c = context.getApplicationContext();
    }

    public void a() {
        this.e = true;
        k();
    }

    public boolean b() {
        return l();
    }

    public void c() {
        this.h = false;
    }

    public String d(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            Class cls = obj.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}");
        }
        return sb.toString();
    }

    public void f(Object obj) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a(this, obj);
        }
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println(this.b);
        if (this.d || this.g || this.h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.h);
        }
        if (this.e || this.f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.e);
            printWriter.print(" mReset=");
            printWriter.println(this.f);
        }
    }

    public void h() {
        n();
    }

    public boolean i() {
        return this.e;
    }

    public boolean j() {
        return this.d;
    }

    public abstract boolean l();

    public void m() {
        if (this.d) {
            h();
        } else {
            this.g = true;
        }
    }

    public abstract void p();

    public void r(int i, a aVar) {
        if (this.b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.b = aVar;
        this.a = i;
    }

    public void s() {
        o();
        this.f = true;
        this.d = false;
        this.e = false;
        this.g = false;
        this.h = false;
    }

    public void t() {
        if (this.h) {
            m();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final void u() {
        this.d = true;
        this.f = false;
        this.e = false;
        p();
    }

    public void v() {
        this.d = false;
        q();
    }

    public void w(a aVar) {
        a aVar2 = this.b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aVar2 != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.b = null;
    }

    public void e() {
    }

    public void k() {
    }

    public void n() {
    }

    public void o() {
    }

    public void q() {
    }
}
