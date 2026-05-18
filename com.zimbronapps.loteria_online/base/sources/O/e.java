package o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import o.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class e extends b implements e.a {
    public Context c;
    public ActionBarContextView d;
    public b.a e;
    public WeakReference f;
    public boolean g;
    public boolean h;
    public androidx.appcompat.view.menu.e i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.c = context;
        this.d = actionBarContextView;
        this.e = aVar;
        androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.i = S;
        S.R(this);
        this.h = z;
    }

    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.e.c(this, menuItem);
    }

    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.d.l();
    }

    public void c() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.b(this);
    }

    public View d() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public Menu e() {
        return this.i;
    }

    public MenuInflater f() {
        return new g(this.d.getContext());
    }

    public CharSequence g() {
        return this.d.getSubtitle();
    }

    public CharSequence i() {
        return this.d.getTitle();
    }

    public void k() {
        this.e.d(this, this.i);
    }

    public boolean l() {
        return this.d.j();
    }

    public void m(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    public void n(int i) {
        o(this.c.getString(i));
    }

    public void o(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    public void q(int i) {
        r(this.c.getString(i));
    }

    public void r(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    public void s(boolean z) {
        super.s(z);
        this.d.setTitleOptional(z);
    }
}
