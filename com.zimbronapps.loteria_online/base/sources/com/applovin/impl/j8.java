package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import com.applovin.impl.r2;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class j8 extends n3 {
    private String a;
    private com.applovin.impl.sdk.k b;
    private s2 c;

    public class a extends s2 {
        final /* synthetic */ List e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.e = list;
        }

        public r2 a() {
            return new r2.b(r2.c.c).d("A plus in front of each segment indicates inclusion and a minus indicates exclusion. The comma in comma-separated values functions as an ∨ (or) operator, and a new row functions as an ∧ (and) operator.").a();
        }

        public int b() {
            return 1;
        }

        public List c(int i) {
            return this.e;
        }

        public int d(int i) {
            return this.e.size();
        }

        public r2 e(int i) {
            return new v4("SEGMENT TARGETING");
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(r2.a(r2.c.e).d((String) it.next()).a());
        }
        return arrayList;
    }

    public com.applovin.impl.sdk.k getSdk() {
        return this.b;
    }

    public void initialize(String str, List list, com.applovin.impl.sdk.k kVar) {
        this.a = str;
        this.b = kVar;
        a aVar = new a(this, a(list));
        this.c = aVar;
        aVar.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.a);
        findViewById(R.id.listView).setAdapter(this.c);
    }
}
