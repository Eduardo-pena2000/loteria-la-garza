package com.unity3d.services.core.network.domain;

import Ca.q;
import Ca.x;
import Da.D;
import Da.v;
import Na.m;
import Ya.h;
import Ya.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CleanupDirectory {
    public final void invoke(File directory, int i, long j) {
        Iterable iterable;
        t.g(directory, "directory");
        if (!directory.exists() || !directory.isDirectory()) {
            throw new IllegalArgumentException(("Directory does not exist or is not a directory: " + directory).toString());
        }
        Object obj = null;
        h r = r.r(m.r(directory, null, 1, null), CleanupDirectory$invoke$cachedFiles$1.INSTANCE);
        Iterator it = r.iterator();
        long j2 = 0;
        long j3 = 0;
        while (it.hasNext()) {
            j3 += ((File) it.next()).length();
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : r) {
            if (((File) obj2).lastModified() + j < currentTimeMillis) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        q qVar = new q(arrayList, arrayList2);
        List list = (List) qVar.a();
        Iterable iterable2 = (List) qVar.b();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            j2 += ((File) it2.next()).length();
        }
        long j4 = j3 - j2;
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((File) it3.next()).delete();
        }
        long j5 = 1048576 * i;
        if (j4 > j5) {
            Iterator it4 = r.B(r.C(D.W(iterable2), new CleanupDirectory$invoke$$inlined$sortedBy$1()), x.a(Long.valueOf(j4), v.n()), CleanupDirectory$invoke$additionalFiles$2.INSTANCE).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next = it4.next();
                if (((Number) ((q) next).a()).longValue() <= j5) {
                    obj = next;
                    break;
                }
            }
            q qVar2 = (q) obj;
            if (qVar2 != null && (iterable = (List) qVar2.b()) != null) {
                iterable2 = iterable;
            }
            Iterator it5 = iterable2.iterator();
            while (it5.hasNext()) {
                ((File) it5.next()).delete();
            }
        }
    }
}
