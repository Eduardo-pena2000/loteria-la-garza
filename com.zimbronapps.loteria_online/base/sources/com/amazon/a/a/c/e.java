package com.amazon.a.a.c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class e implements Comparator {
    private static final com.amazon.a.a.o.c a = new com.amazon.a.a.o.c("EventListenerNotificationQueue");
    private List b = new ArrayList();

    public void a(c cVar) {
        if (com.amazon.a.a.o.c.a) {
            a.a("Adding listener: " + cVar);
        }
        this.b.add(cVar);
        Collections.sort(this.b, this);
    }

    public void a(a aVar) {
        for (c cVar : this.b) {
            if (com.amazon.a.a.o.c.a) {
                a.a("Notifying listener: " + cVar);
            }
            cVar.a(aVar);
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(c cVar, c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }
}
