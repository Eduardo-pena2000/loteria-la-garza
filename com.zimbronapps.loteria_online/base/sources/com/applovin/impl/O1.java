package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.applovin.sdk.R;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class o1 extends Activity {
    private q1 a;
    private com.applovin.impl.sdk.k b;
    private TextView c;
    private Button d;

    public static /* synthetic */ void a(o1 o1Var, View view) {
        o1Var.a(view);
    }

    private void b() {
        v2 v2Var = new v2();
        v2Var.a(this.b.y().a(this.a));
        String b = this.b.y().b(this.a);
        if (b != null) {
            v2Var.a("\nBid Response Preview:\n");
            v2Var.a(b);
        }
        TextView findViewById = findViewById(R.id.email_report_tv);
        this.c = findViewById;
        findViewById.setText(v2Var.toString());
        this.c.setTextColor(-16777216);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.a.d() + " - " + this.a.f());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        e8.a(findViewById(16908290), this.b);
        Button findViewById = findViewById(R.id.report_ad_button);
        this.d = findViewById;
        findViewById.setOnClickListener(new M3(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!a()) {
            finish();
            return false;
        }
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.b.y().a(this.a, (Context) this, false);
        return true;
    }

    public void a(q1 q1Var, com.applovin.impl.sdk.k kVar) {
        this.a = q1Var;
        this.b = kVar;
    }

    private /* synthetic */ void a(View view) {
        this.b.y().a(this.a, (Context) this, true);
    }

    private boolean a() {
        return (this.a == null || this.b == null) ? false : true;
    }
}
