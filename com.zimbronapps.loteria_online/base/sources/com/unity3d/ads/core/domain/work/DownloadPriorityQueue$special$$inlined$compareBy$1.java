package com.unity3d.ads.core.domain.work;

import Fa.b;
import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DownloadPriorityQueue$special$$inlined$compareBy$1 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return b.d(Integer.valueOf(((DownloadPriorityQueue.PriorityItem) obj).getPriority()), Integer.valueOf(((DownloadPriorityQueue.PriorityItem) obj2).getPriority()));
    }
}
