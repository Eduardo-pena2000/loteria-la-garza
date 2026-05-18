package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a implements i {
    public Context a;
    public Context b;
    public e c;
    public LayoutInflater d;
    public LayoutInflater e;
    public i.a f;
    public int g;
    public int h;
    public j i;
    public int j;

    public a(Context context, int i, int i2) {
        this.a = context;
        this.d = LayoutInflater.from(context);
        this.g = i;
        this.h = i2;
    }

    public void a(View view, int i) {
        ViewGroup parent = view.getParent();
        if (parent != null) {
            parent.removeView(view);
        }
        this.i.addView(view, i);
    }

    public void b(e eVar, boolean z) {
        i.a aVar = this.f;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    public boolean c(e eVar, g gVar) {
        return false;
    }

    public void d(i.a aVar) {
        this.f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    public boolean e(l lVar) {
        i.a aVar = this.f;
        l lVar2 = lVar;
        if (aVar == null) {
            return false;
        }
        if (lVar == null) {
            lVar2 = this.c;
        }
        return aVar.c(lVar2);
    }

    public void f(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.c;
        int i = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList E = this.c.E();
            int size = E.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                g gVar = (g) E.get(i3);
                if (q(i2, gVar)) {
                    j.a childAt = viewGroup.getChildAt(i2);
                    g itemData = childAt instanceof j.a ? childAt.getItemData() : null;
                    j.a n = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        n.setPressed(false);
                        n.jumpDrawablesToCurrentState();
                    }
                    if (n != childAt) {
                        a(n, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!l(viewGroup, i)) {
                i++;
            }
        }
    }

    public boolean h(e eVar, g gVar) {
        return false;
    }

    public void i(Context context, e eVar) {
        this.b = context;
        this.e = LayoutInflater.from(context);
        this.c = eVar;
    }

    public abstract void j(g gVar, j.a aVar);

    public j.a k(ViewGroup viewGroup) {
        return this.d.inflate(this.h, viewGroup, false);
    }

    public boolean l(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public i.a m() {
        return this.f;
    }

    public View n(g gVar, View view, ViewGroup viewGroup) {
        j.a k = view instanceof j.a ? (j.a) view : k(viewGroup);
        j(gVar, k);
        return (View) k;
    }

    public j o(ViewGroup viewGroup) {
        if (this.i == null) {
            j inflate = this.d.inflate(this.g, viewGroup, false);
            this.i = inflate;
            inflate.a(this.c);
            f(true);
        }
        return this.i;
    }

    public void p(int i) {
        this.j = i;
    }

    public abstract boolean q(int i, g gVar);
}
