package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListView;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class q extends n3 {
    private com.applovin.impl.sdk.k a;
    private s2 b;
    private List c;
    private boolean d;
    private ListView e;

    public class a extends s2 {
        final /* synthetic */ List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.e = list;
        }

        public int b() {
            return 1;
        }

        public List c(int i) {
            return q.a(q.this);
        }

        public int d(int i) {
            return this.e.size();
        }

        public r2 e(int i) {
            return new v4("");
        }
    }

    public static /* synthetic */ List a(q qVar) {
        return qVar.c;
    }

    public static /* synthetic */ void b(n nVar, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        a(nVar, kVar, maxDebuggerAdUnitDetailActivity);
    }

    public static /* synthetic */ void c(q qVar, List list, com.applovin.impl.sdk.k kVar, j2 j2Var, r2 r2Var) {
        qVar.a(list, kVar, j2Var, r2Var);
    }

    public static /* synthetic */ void d(n nVar, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitWaterfallsListActivity maxDebuggerAdUnitWaterfallsListActivity) {
        a(nVar, kVar, maxDebuggerAdUnitWaterfallsListActivity);
    }

    public com.applovin.impl.sdk.k getSdk() {
        return this.a;
    }

    public void initialize(List list, boolean z, com.applovin.impl.sdk.k kVar) {
        this.d = z;
        this.a = kVar;
        this.c = a(list);
        a aVar = new a(this, list);
        this.b = aVar;
        aVar.a(new F4(this, list, kVar));
        this.b.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StringBuilder sb = new StringBuilder();
        sb.append(this.d ? "Selective Init " : "");
        sb.append("Ad Units");
        setTitle(sb.toString());
        setContentView(R.layout.mediation_debugger_list_view);
        ListView findViewById = findViewById(R.id.listView);
        this.e = findViewById;
        findViewById.setAdapter(this.b);
    }

    private /* synthetic */ void a(List list, com.applovin.impl.sdk.k kVar, j2 j2Var, r2 r2Var) {
        n nVar = (n) list.get(j2Var.a());
        if (nVar.g().size() == 1) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new D4(nVar, kVar));
        } else {
            d.a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, kVar.e(), new E4(nVar, kVar));
        }
    }

    private static /* synthetic */ void a(n nVar, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(nVar, null, null, kVar);
    }

    private static /* synthetic */ void a(n nVar, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitWaterfallsListActivity maxDebuggerAdUnitWaterfallsListActivity) {
        maxDebuggerAdUnitWaterfallsListActivity.initialize(nVar, kVar);
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(nVar.c(), -16777216));
            spannableStringBuilder.append(new SpannedString("\n"));
            spannableStringBuilder.append(StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(nVar.b(), -16777216));
            arrayList.add(r2.a(r2.c.e).b(StringUtils.createSpannedString(nVar.d(), -16777216, 18, 1)).a(new SpannedString(spannableStringBuilder)).a((Context) this).a(true).a());
        }
        return arrayList;
    }
}
