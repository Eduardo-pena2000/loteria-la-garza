package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class p extends n3 {
    private n a;
    private com.applovin.impl.sdk.k b;
    private s2 c;

    public class a extends s2 {
        final /* synthetic */ n e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, n nVar) {
            super(context);
            this.e = nVar;
        }

        public int b() {
            return this.e.g().size();
        }

        public List c(int i) {
            ArrayList arrayList = new ArrayList();
            o oVar = (o) this.e.g().get(i);
            arrayList.add(p.a(p.this, oVar.c()));
            if (oVar.b() != null) {
                arrayList.add(p.a(p.this, "AB Test Experiment Name", oVar.b()));
            }
            k8 d = oVar.d();
            p pVar = p.this;
            arrayList.add(p.a(pVar, "Device ID Targeting", p.b(pVar, d.a())));
            p pVar2 = p.this;
            arrayList.add(p.a(pVar2, "Device Type Targeting", p.c(pVar2, d.b())));
            if (d.c() != null) {
                arrayList.add(p.a(p.this, d.c()));
            }
            return arrayList;
        }

        public int d(int i) {
            o oVar = (o) this.e.g().get(i);
            return (oVar.b() != null ? 1 : 0) + 3 + (oVar.d().c() != null ? 1 : 0);
        }

        public r2 e(int i) {
            return i == b.TARGETED_WATERFALL.ordinal() ? new v4("TARGETED WATERFALL FOR CURRENT DEVICE") : i == b.OTHER_WATERFALLS.ordinal() ? new v4("OTHER WATERFALLS") : new v4("");
        }
    }

    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    public static /* synthetic */ r2 a(p pVar, String str) {
        return pVar.c(str);
    }

    public static /* synthetic */ void b(n nVar, j2 j2Var, com.applovin.impl.sdk.k kVar, MaxDebuggerWaterfallSegmentsActivity maxDebuggerWaterfallSegmentsActivity) {
        a(nVar, j2Var, kVar, maxDebuggerWaterfallSegmentsActivity);
    }

    public static /* synthetic */ void c(n nVar, j2 j2Var, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        a(nVar, j2Var, kVar, maxDebuggerAdUnitDetailActivity);
    }

    public static /* synthetic */ void d(p pVar, com.applovin.impl.sdk.k kVar, n nVar, j2 j2Var, r2 r2Var) {
        pVar.a(kVar, nVar, j2Var, r2Var);
    }

    public com.applovin.impl.sdk.k getSdk() {
        return this.b;
    }

    public void initialize(n nVar, com.applovin.impl.sdk.k kVar) {
        this.a = nVar;
        this.b = kVar;
        a aVar = new a(this, nVar);
        this.c = aVar;
        aVar.a(new X3(this, kVar, nVar));
        this.c.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.a.d());
        ListView findViewById = findViewById(R.id.listView);
        findViewById.setAdapter(this.c);
        findViewById.setDividerHeight(0);
    }

    public void onDestroy() {
        super.onDestroy();
        s2 s2Var = this.c;
        if (s2Var != null) {
            s2Var.a((s2.a) null);
        }
    }

    public static /* synthetic */ r2 a(p pVar, String str, String str2) {
        return pVar.a(str, str2);
    }

    public static /* synthetic */ String b(p pVar, String str) {
        return pVar.a(str);
    }

    public static /* synthetic */ String c(p pVar, String str) {
        return pVar.b(str);
    }

    public static /* synthetic */ r2 a(p pVar, List list) {
        return pVar.a(list);
    }

    private String b(String str) {
        if (str.equals("phone")) {
            return "Phones";
        }
        if (str.equals("tablet")) {
            return "Tablets";
        }
        return "All";
    }

    private r2 c(String str) {
        return r2.a(r2.c.f).b(StringUtils.createSpannedString(str, -16777216, 18, 1)).a((Context) this).a(true).a();
    }

    private /* synthetic */ void a(com.applovin.impl.sdk.k kVar, n nVar, j2 j2Var, r2 r2Var) {
        if (j2Var.a() == 0) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new V3(nVar, j2Var, kVar));
        } else {
            d.a(this, MaxDebuggerWaterfallSegmentsActivity.class, kVar.e(), new W3(nVar, j2Var, kVar));
        }
    }

    private static /* synthetic */ void a(n nVar, j2 j2Var, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(nVar, (o) nVar.g().get(j2Var.b()), null, kVar);
    }

    private static /* synthetic */ void a(n nVar, j2 j2Var, com.applovin.impl.sdk.k kVar, MaxDebuggerWaterfallSegmentsActivity maxDebuggerWaterfallSegmentsActivity) {
        o oVar = (o) nVar.g().get(j2Var.b());
        maxDebuggerWaterfallSegmentsActivity.initialize(oVar.c(), oVar.d().c(), kVar);
    }

    private r2 a(String str, String str2) {
        return r2.a(r2.c.f).d(str).c(str2).a();
    }

    private r2 a(List list) {
        return r2.a(r2.c.e).d("Segment Targeting").a(StringUtils.createSpannedString(list.size() + " segment group(s)", -7829368, 14)).a((Context) this).a(true).a();
    }

    private String a(String str) {
        if (str.equals("idfa")) {
            return "IDFA Only";
        }
        if (str.equals("dnt")) {
            return "No IDFA Only";
        }
        return "All";
    }
}
