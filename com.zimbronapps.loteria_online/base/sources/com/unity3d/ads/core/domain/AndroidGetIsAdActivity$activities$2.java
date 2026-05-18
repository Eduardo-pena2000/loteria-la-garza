package com.unity3d.ads.core.domain;

import Da.w;
import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidGetIsAdActivity$activities$2 extends u implements Qa.a {
    final /* synthetic */ AndroidGetIsAdActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidGetIsAdActivity$activities$2(AndroidGetIsAdActivity androidGetIsAdActivity) {
        super(0);
        this.this$0 = androidGetIsAdActivity;
    }

    public final List invoke() {
        List observableAndroidActivitiesList = AndroidGetIsAdActivity.access$getSessionRepository$p(this.this$0).getNativeConfiguration().getObservableAndroidActivitiesList();
        t.f(observableAndroidActivitiesList, "sessionRepository.native…ableAndroidActivitiesList");
        ArrayList arrayList = new ArrayList(w.y(observableAndroidActivitiesList, 10));
        Iterator it = observableAndroidActivitiesList.iterator();
        while (it.hasNext()) {
            byte[] byteArray = ((ByteString) it.next()).toByteArray();
            arrayList.add(h.w(Arrays.copyOf(byteArray, byteArray.length)));
        }
        return arrayList;
    }
}
