package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import com.applovin.impl.a7;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class w6 extends n3 {
    private com.applovin.impl.sdk.k a;
    private s2 b;

    public class a extends s2 {
        final /* synthetic */ ArrayList e;
        final /* synthetic */ ArrayList f;
        final /* synthetic */ boolean g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z) {
            super(context);
            this.e = arrayList;
            this.f = arrayList2;
            this.g = z;
        }

        public int b() {
            return b.values().length;
        }

        public List c(int i) {
            return i == b.TC_NETWORKS.ordinal() ? this.e : this.f;
        }

        public int d(int i) {
            return i == b.TC_NETWORKS.ordinal() ? this.e.size() : this.f.size();
        }

        public r2 e(int i) {
            if (i == b.TC_NETWORKS.ordinal()) {
                return new v4("TCF VENDORS (TC STRING)");
            }
            return new v4(this.g ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }
    }

    public enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    private r2 a(String str, String str2) {
        return r2.a().d(str).c(str2).a();
    }

    public com.applovin.impl.sdk.k getSdk() {
        return this.a;
    }

    public void initialize(List list, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String a2 = p0.b().a((Context) this);
        boolean b2 = kVar.r0().b();
        if (!b2) {
            arrayList2.add(a("Has User Consent", a2));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a7 a7Var = (a7) it.next();
            Boolean a3 = a7Var.a();
            if (a3 != null) {
                if (a7Var.f() == a7.a.TCF_VENDOR) {
                    arrayList.add(a(a7Var.b(), String.valueOf(a3)));
                } else if (a7Var.f() == a7.a.ATP_NETWORK) {
                    arrayList2.add(a(a7Var.b(), String.valueOf(a3)));
                }
            } else if (b2 && a7Var.f() == a7.a.ATP_NETWORK) {
                arrayList2.add(a(a7Var.b(), a2));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, b2);
        this.b = aVar;
        aVar.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        findViewById(R.id.listView).setAdapter(this.b);
    }
}
