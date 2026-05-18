package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Ca.q;
import Ca.x;
import Da.A;
import Da.D;
import Da.v;
import Da.w;
import Ya.h;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.k;
import m1.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class SizeParameterProvider implements a {
    private final List allSizeConstraints;
    private final h values;

    public SizeParameterProvider() {
        List<SizeConstraint> q = v.q(SizeConstraint.Fit.INSTANCE, SizeConstraint.Fill.INSTANCE, new SizeConstraint.Fixed(200, (k) null));
        this.allSizeConstraints = q;
        ArrayList<q> arrayList = new ArrayList();
        for (SizeConstraint sizeConstraint : q) {
            List list = this.allSizeConstraints;
            ArrayList arrayList2 = new ArrayList(w.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(x.a(sizeConstraint, (SizeConstraint) it.next()));
            }
            A.D(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(w.y(arrayList, 10));
        for (q qVar : arrayList) {
            arrayList3.add(new Size((SizeConstraint) qVar.a(), (SizeConstraint) qVar.b()));
        }
        this.values = D.W(arrayList3);
    }

    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public h getValues() {
        return this.values;
    }
}
