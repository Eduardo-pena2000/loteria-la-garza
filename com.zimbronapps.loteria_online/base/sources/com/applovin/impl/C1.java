package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.d;
import com.applovin.impl.d1;
import com.applovin.impl.s2;
import com.applovin.sdk.R;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class c1 extends Activity {
    private d1 a;
    private FrameLayout b;
    private ListView c;

    public class a implements s2.a {
        final /* synthetic */ c a;

        public class a implements d.b {
            final /* synthetic */ j2 a;

            public a(j2 j2Var) {
                this.a = j2Var;
            }

            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((q1) c1.a(c1.this).d().get(this.a.a()), c1.a(c1.this).e());
            }
        }

        public a(c cVar) {
            this.a = cVar;
        }

        public void a(j2 j2Var, r2 r2Var) {
            if (j2Var.b() != d1.a.a.ordinal()) {
                return;
            }
            d.a(c1.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.a, new a(j2Var));
        }
    }

    public static /* synthetic */ d1 a(c1 c1Var) {
        return c1Var.a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.b = findViewById(16908290);
        this.c = findViewById(R.id.listView);
        e8.a((View) this.b, com.applovin.impl.sdk.k.C0);
    }

    public void onDestroy() {
        super.onDestroy();
        d1 d1Var = this.a;
        if (d1Var != null) {
            d1Var.a((s2.a) null);
            this.a.g();
        }
    }

    public void onStart() {
        super.onStart();
        d1 d1Var = this.a;
        if (d1Var == null) {
            finish();
            return;
        }
        this.c.setAdapter(d1Var);
        d1 d1Var2 = this.a;
        if (d1Var2 != null && !d1Var2.e().y().g()) {
            a(R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        d1 d1Var3 = this.a;
        if (d1Var3 == null || !d1Var3.f()) {
            return;
        }
        a(R.string.applovin_creative_debugger_no_ads_text);
    }

    public void a(d1 d1Var, c cVar) {
        this.a = d1Var;
        d1Var.a(new a(cVar));
    }

    private void a(int i) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i);
        this.b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.b.bringChildToFront(textView);
    }
}
