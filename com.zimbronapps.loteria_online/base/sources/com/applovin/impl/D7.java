package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class d7 extends n3 {
    private com.applovin.impl.sdk.k a;
    private List b;
    private List c;
    private s2 d;
    private List e;
    private List f;
    private ListView g;

    public class a extends s2 {
        public a(Context context) {
            super(context);
        }

        public r2 a() {
            return new r2.b(r2.c.c).d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        public int b() {
            return c.COUNT.ordinal();
        }

        public List c(int i) {
            return i == c.BIDDERS.ordinal() ? d7.a(d7.this) : d7.b(d7.this);
        }

        public int d(int i) {
            return i == c.BIDDERS.ordinal() ? d7.a(d7.this).size() : d7.b(d7.this).size();
        }

        public r2 e(int i) {
            return i == c.BIDDERS.ordinal() ? new v4("BIDDERS") : new v4("WATERFALL");
        }
    }

    public class b extends z3 {
        final /* synthetic */ u2 p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e3 e3Var, Context context, u2 u2Var) {
            super(e3Var, context);
            this.p = u2Var;
        }

        public int d() {
            if (d7.c(d7.this).s0().b() == null || !d7.c(d7.this).s0().b().equals(this.p.b())) {
                return 0;
            }
            return R.drawable.applovin_ic_check_mark_borderless;
        }

        public int e() {
            if (d7.c(d7.this).s0().b() == null || !d7.c(d7.this).s0().b().equals(this.p.b())) {
                return super.e();
            }
            return -16776961;
        }

        public SpannedString k() {
            return StringUtils.createSpannedString(this.p.a(), o() ? -16777216 : -7829368, 18, 1);
        }
    }

    public enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public d7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public static /* synthetic */ void a(d7 d7Var, com.applovin.impl.sdk.k kVar, j2 j2Var, r2 r2Var) {
        d7Var.a(kVar, j2Var, r2Var);
    }

    public static /* synthetic */ List b(d7 d7Var) {
        return d7Var.f;
    }

    public static /* synthetic */ com.applovin.impl.sdk.k c(d7 d7Var) {
        return d7Var.a;
    }

    public com.applovin.impl.sdk.k getSdk() {
        return this.a;
    }

    public void initialize(List list, List list2, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = list;
        this.c = list2;
        this.e = a(list);
        this.f = a(list2);
        a aVar = new a(this);
        this.d = aVar;
        aVar.a(new C0(this, kVar));
        this.d.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView findViewById = findViewById(R.id.listView);
        this.g = findViewById;
        findViewById.setAdapter(this.d);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.e = a(this.b);
        this.f = a(this.c);
        this.d.c();
    }

    public static /* synthetic */ List a(d7 d7Var) {
        return d7Var.e;
    }

    private /* synthetic */ void a(com.applovin.impl.sdk.k kVar, j2 j2Var, r2 r2Var) {
        List b2 = a(j2Var).b();
        if (b2.equals(kVar.s0().b())) {
            kVar.s0().a((List) null);
        } else {
            kVar.s0().a(b2);
        }
        this.d.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u2 u2Var = (u2) it.next();
            arrayList.add(new b(u2Var.d(), this, u2Var));
        }
        return arrayList;
    }

    private u2 a(j2 j2Var) {
        if (j2Var.b() == c.BIDDERS.ordinal()) {
            return (u2) this.b.get(j2Var.a());
        }
        return (u2) this.c.get(j2Var.a());
    }
}
