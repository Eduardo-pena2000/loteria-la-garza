package androidx.recyclerview.widget;

import U1.v;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class i extends T1.a {
    public final RecyclerView d;
    public final T1.a e = new a(this);

    public static class a extends T1.a {
        public final i d;

        public a(i iVar) {
            this.d = iVar;
        }

        public void g(View view, v vVar) {
            super.g(view, vVar);
            if (this.d.o() || this.d.d.getLayoutManager() == null) {
                return;
            }
            this.d.d.getLayoutManager().M0(view, vVar);
        }

        public boolean j(View view, int i, Bundle bundle) {
            if (super.j(view, i, bundle)) {
                return true;
            }
            if (this.d.o() || this.d.d.getLayoutManager() == null) {
                return false;
            }
            return this.d.d.getLayoutManager().f1(view, i, bundle);
        }
    }

    public i(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().I0(accessibilityEvent);
        }
    }

    public void g(View view, v vVar) {
        super.g(view, vVar);
        vVar.g0(RecyclerView.class.getName());
        if (o() || this.d.getLayoutManager() == null) {
            return;
        }
        this.d.getLayoutManager().K0(vVar);
    }

    public boolean j(View view, int i, Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        if (o() || this.d.getLayoutManager() == null) {
            return false;
        }
        return this.d.getLayoutManager().d1(i, bundle);
    }

    public T1.a n() {
        return this.e;
    }

    public boolean o() {
        return this.d.k0();
    }
}
