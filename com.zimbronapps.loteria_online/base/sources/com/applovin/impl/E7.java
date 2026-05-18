package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class e7 extends n3 {
    private com.applovin.impl.sdk.k a;
    private List b;
    private s2 c;
    private List d;
    private ListView e;

    public class a extends s2 {
        final /* synthetic */ List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.e = list;
        }

        public r2 a() {
            return new r2.b(r2.c.c).d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        public int b() {
            return 1;
        }

        public List c(int i) {
            return e7.a(e7.this);
        }

        public int d(int i) {
            return this.e.size();
        }

        public r2 e(int i) {
            return new v4("TEST MODE NETWORKS");
        }
    }

    public class b implements s2.a {
        final /* synthetic */ List a;
        final /* synthetic */ com.applovin.impl.sdk.k b;

        public b(List list, com.applovin.impl.sdk.k kVar) {
            this.a = list;
            this.b = kVar;
        }

        public void a(j2 j2Var, r2 r2Var) {
            List u = ((e3) this.a.get(j2Var.a())).u();
            if (u.equals(this.b.s0().b())) {
                this.b.s0().a((List) null);
            } else {
                this.b.s0().a(u);
            }
            e7.b(e7.this).notifyDataSetChanged();
        }
    }

    public class c extends z3 {
        final /* synthetic */ e3 p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e3 e3Var, Context context, e3 e3Var2) {
            super(e3Var, context);
            this.p = e3Var2;
        }

        public int d() {
            if (this.p.u().equals(e7.c(e7.this).s0().b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        public int e() {
            if (this.p.u().equals(e7.c(e7.this).s0().b())) {
                return -16776961;
            }
            return super.e();
        }

        public SpannedString k() {
            return StringUtils.createSpannedString(this.p.g(), o() ? -16777216 : -7829368, 18, 1);
        }
    }

    public e7() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public static /* synthetic */ List a(e7 e7Var) {
        return e7Var.d;
    }

    public static /* synthetic */ s2 b(e7 e7Var) {
        return e7Var.c;
    }

    public static /* synthetic */ com.applovin.impl.sdk.k c(e7 e7Var) {
        return e7Var.a;
    }

    public com.applovin.impl.sdk.k getSdk() {
        return this.a;
    }

    public void initialize(List list, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = list;
        this.d = a(list);
        a aVar = new a(this, list);
        this.c = aVar;
        aVar.a(new b(list, kVar));
        this.c.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView findViewById = findViewById(R.id.listView);
        this.e = findViewById;
        findViewById.setAdapter(this.c);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.d = a(this.b);
        this.c.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            arrayList.add(new c(e3Var, this, e3Var));
        }
        return arrayList;
    }
}
