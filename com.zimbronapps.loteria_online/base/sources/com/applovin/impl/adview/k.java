package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.c2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class k extends View {
    private final c2 a;
    private boolean b;

    public interface a {
        void a();

        void b();
    }

    public k(c2 c2Var, Context context) {
        super(context);
        this.a = c2Var;
        setClickable(false);
        setFocusable(false);
    }

    public boolean a() {
        return this.b;
    }

    public void b() {
        a(null);
    }

    public String getIdentifier() {
        return this.a.b();
    }

    public void a(a aVar) {
        if (this.b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable a2 = this.a.a();
        if (a2 == null) {
            if (aVar != null) {
                aVar.b();
            }
        } else {
            setBackground(a2);
            this.b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
