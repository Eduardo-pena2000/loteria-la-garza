package p;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import w.i0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {
    public final Context a;
    public i0 b;
    public i0 c;

    public b(Context context) {
        this.a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof M1.b)) {
            return menuItem;
        }
        M1.b bVar = (M1.b) menuItem;
        if (this.b == null) {
            this.b = new i0();
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.a, bVar);
        this.b.put(bVar, cVar);
        return cVar;
    }

    public final void e() {
        i0 i0Var = this.b;
        if (i0Var != null) {
            i0Var.clear();
        }
        i0 i0Var2 = this.c;
        if (i0Var2 != null) {
            i0Var2.clear();
        }
    }

    public final void f(int i) {
        if (this.b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.b.size()) {
            if (((M1.b) this.b.h(i2)).getGroupId() == i) {
                this.b.k(i2);
                i2--;
            }
            i2++;
        }
    }

    public final void g(int i) {
        if (this.b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (((M1.b) this.b.h(i2)).getItemId() == i) {
                this.b.k(i2);
                return;
            }
        }
    }

    public final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }
}
