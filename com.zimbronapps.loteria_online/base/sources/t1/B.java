package T1;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {
    public final Context a;
    public a b;
    public b c;

    public interface a {
    }

    public interface b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public b(Context context) {
        this.a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.c = null;
        this.b = null;
    }

    public void h(a aVar) {
        this.b = aVar;
    }

    public abstract void i(b bVar);
}
