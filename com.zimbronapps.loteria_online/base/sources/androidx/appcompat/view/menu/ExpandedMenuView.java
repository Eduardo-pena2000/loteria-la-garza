package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import q.c0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class ExpandedMenuView extends ListView implements e.b, j, AdapterView.OnItemClickListener {
    public static final int[] c = {16842964, 16843049};
    public e a;
    public int b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public void a(e eVar) {
        this.a = eVar;
    }

    public boolean c(g gVar) {
        return this.a.L(gVar, 0);
    }

    public int getWindowAnimations() {
        return this.b;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        c((g) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        c0 u = c0.u(context, attributeSet, c, i, 0);
        if (u.r(0)) {
            setBackgroundDrawable(u.f(0));
        }
        if (u.r(1)) {
            setDivider(u.f(1));
        }
        u.v();
    }
}
