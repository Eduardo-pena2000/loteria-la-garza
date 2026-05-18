package com.applovin.impl;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.applovin.impl.d;
import com.applovin.impl.o3;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;
import com.applovin.sdk.R;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class m3 extends n3 {
    private o3 a;
    private DataSetObserver b;
    private FrameLayout c;
    private ListView d;
    private com.applovin.impl.a e;

    public class a extends DataSetObserver {
        public a() {
        }

        public void onChanged() {
            m3.a(m3.this);
            m3 m3Var = m3.this;
            m3.a(m3Var, m3Var);
        }
    }

    public class b implements s2.a {
        final /* synthetic */ com.applovin.impl.c a;

        public class a implements d.b {
            public a() {
            }

            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(m3.b(m3.this).t());
            }
        }

        public class b implements d.b {
            public b() {
            }

            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(m3.b(m3.this).d(), m3.b(m3.this).t());
            }
        }

        public class c implements d.b {
            public c() {
            }

            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(m3.b(m3.this).d(), m3.b(m3.this).t());
            }
        }

        public class d implements d.b {
            public d() {
            }

            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(m3.b(m3.this).f(), false, m3.b(m3.this).t());
            }
        }

        public class e implements d.b {
            public e() {
            }

            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(m3.b(m3.this).k(), m3.b(m3.this).w(), m3.b(m3.this).t());
            }
        }

        public class f implements d.b {
            public f() {
            }

            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(m3.b(m3.this).v(), m3.b(m3.this).t());
            }
        }

        public class g implements d.b {
            public g() {
            }

            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(m3.b(m3.this).o(), true, m3.b(m3.this).t());
            }
        }

        public class h implements d.b {
            final /* synthetic */ r2 a;

            public h(r2 r2Var) {
                this.a = r2Var;
            }

            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((z3) this.a).r());
            }
        }

        public b(com.applovin.impl.c cVar) {
            this.a = cVar;
        }

        public void a(j2 j2Var, r2 r2Var) {
            int b2 = j2Var.b();
            if (b2 == o3.e.a.ordinal()) {
                n7.a(r2Var.c(), r2Var.b(), (Context) m3.this);
                return;
            }
            if (b2 == o3.e.b.ordinal()) {
                if (m3.b(m3.this).a(r2Var)) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerUnifiedFlowActivity.class, this.a, new a());
                    return;
                } else {
                    n7.a(r2Var.c(), r2Var.b(), (Context) m3.this);
                    return;
                }
            }
            if (b2 == o3.e.c.ordinal()) {
                if (j2Var.a() != o3.d.a.ordinal()) {
                    if (j2Var.a() == o3.d.b.ordinal()) {
                        com.applovin.impl.d.a(m3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.a, new c());
                        return;
                    }
                    return;
                } else if (StringUtils.isValidString(m3.b(m3.this).t().r0().j())) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerTcfInfoListActivity.class, this.a, new b());
                    return;
                } else {
                    n7.a(r2Var.c(), r2Var.b(), (Context) m3.this);
                    return;
                }
            }
            if (b2 != o3.e.d.ordinal()) {
                if ((b2 == o3.e.e.ordinal() || b2 == o3.e.f.ordinal()) && (r2Var instanceof z3)) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerDetailActivity.class, this.a, new h(r2Var));
                    return;
                }
                return;
            }
            if (j2Var.a() == o3.b.a.ordinal()) {
                if (m3.b(m3.this).f().size() > 0) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerAdUnitsListActivity.class, this.a, new d());
                    return;
                } else {
                    n7.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", (Context) m3.this);
                    return;
                }
            }
            if (j2Var.a() == o3.b.b.ordinal()) {
                if (m3.b(m3.this).k().size() <= 0 && m3.b(m3.this).w().size() <= 0) {
                    n7.a("Complete Integrations", "Please complete integrations in order to access this.", (Context) m3.this);
                    return;
                } else if (m3.b(m3.this).t().s0().c()) {
                    n7.a("Restart Required", r2Var.b(), (Context) m3.this);
                    return;
                } else {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerTestLiveNetworkActivity.class, this.a, new e());
                    return;
                }
            }
            if (j2Var.a() != o3.b.c.ordinal()) {
                if (j2Var.a() == o3.b.d.ordinal()) {
                    com.applovin.impl.d.a(m3.this, MaxDebuggerAdUnitsListActivity.class, this.a, new g());
                }
            } else if (!m3.b(m3.this).t().s0().c()) {
                m3.this.getSdk().s0().a();
                n7.a("Restart Required", r2Var.b(), (Context) m3.this);
            } else if (m3.b(m3.this).v().size() > 0) {
                com.applovin.impl.d.a(m3.this, MaxDebuggerTestModeNetworkActivity.class, this.a, new f());
            } else {
                n7.a("Complete Integrations", "Please complete integrations in order to access this.", (Context) m3.this);
            }
        }
    }

    public static /* synthetic */ void a(m3 m3Var) {
        m3Var.a();
    }

    public static /* synthetic */ void b(m3 m3Var, Context context) {
        m3Var.a(context);
    }

    private void c() {
        a();
        com.applovin.impl.a aVar = new com.applovin.impl.a(this, 50, 16842874);
        this.e = aVar;
        aVar.setColor(-3355444);
        this.c.addView(this.e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.c.bringChildToFront(this.e);
        this.e.a();
    }

    public com.applovin.impl.sdk.k getSdk() {
        o3 o3Var = this.a;
        if (o3Var != null) {
            return o3Var.t();
        }
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.c = findViewById(16908290);
        ListView findViewById = findViewById(R.id.listView);
        this.d = findViewById;
        findViewById.setAdapter(this.a);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        o3 o3Var = this.a;
        if (o3Var != null) {
            o3Var.unregisterDataSetObserver(this.b);
            this.a.a((s2.a) null);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    public void onStart() {
        super.onStart();
        o3 o3Var = this.a;
        if (o3Var == null || o3Var.y()) {
            return;
        }
        c();
    }

    public void setListAdapter(o3 o3Var, c cVar) {
        DataSetObserver dataSetObserver;
        o3 o3Var2 = this.a;
        if (o3Var2 != null && (dataSetObserver = this.b) != null) {
            o3Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.a = o3Var;
        this.b = new a();
        b((Context) this);
        this.a.registerDataSetObserver(this.b);
        this.a.a(new b(cVar));
    }

    public static /* synthetic */ void a(m3 m3Var, Context context) {
        m3Var.b(context);
    }

    public static /* synthetic */ o3 b(m3 m3Var) {
        return m3Var.a;
    }

    private void a() {
        com.applovin.impl.a aVar = this.e;
        if (aVar != null) {
            aVar.b();
            this.c.removeView(this.e);
            this.e = null;
        }
    }

    private void b() {
        o3 o3Var = this.a;
        if (o3Var == null) {
            return;
        }
        String p = o3Var.p();
        if (TextUtils.isEmpty(p)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", p);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, (CharSequence) null));
    }

    private /* synthetic */ void a(Context context) {
        n7.a(this.a.i(), this.a.h(), context);
    }

    private void b(Context context) {
        if (!StringUtils.isValidString(this.a.h()) || this.a.x()) {
            return;
        }
        this.a.b(true);
        runOnUiThread(new X2(this, context));
    }
}
