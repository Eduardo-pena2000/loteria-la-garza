package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class y {
    public final A a;

    public y(A a) {
        this.a = a;
    }

    public static y b(A a) {
        return new y((A) S1.g.i(a, "callbacks == null"));
    }

    public void a(p pVar) {
        J g = this.a.g();
        A a = this.a;
        g.o(a, a, pVar);
    }

    public void c() {
        this.a.g().C();
    }

    public boolean d(MenuItem menuItem) {
        return this.a.g().F(menuItem);
    }

    public void e() {
        this.a.g().G();
    }

    public void f() {
        this.a.g().I();
    }

    public void g() {
        this.a.g().R();
    }

    public void h() {
        this.a.g().V();
    }

    public void i() {
        this.a.g().W();
    }

    public void j() {
        this.a.g().Y();
    }

    public boolean k() {
        return this.a.g().f0(true);
    }

    public J l() {
        return this.a.g();
    }

    public void m() {
        this.a.g().e1();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.a.g().B0().onCreateView(view, str, context, attributeSet);
    }
}
