package com.applovin.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.applovin.sdk.R;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class b7 extends n3 {
    private com.applovin.impl.sdk.k a;
    private String b;
    private String c;

    private void a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.c);
        intent.putExtra("android.intent.extra.TITLE", this.b);
        intent.putExtra("android.intent.extra.SUBJECT", this.b);
        startActivity(Intent.createChooser(intent, (CharSequence) null));
    }

    public com.applovin.impl.sdk.k getSdk() {
        return this.a;
    }

    public void initialize(String str, String str2, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = str;
        this.c = str2;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_text_view_activity);
        setTitle(this.b);
        findViewById(R.id.textView).setText(this.c);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        a();
        return true;
    }
}
