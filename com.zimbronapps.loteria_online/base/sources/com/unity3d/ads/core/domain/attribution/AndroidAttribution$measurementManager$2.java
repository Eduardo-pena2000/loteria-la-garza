package com.unity3d.ads.core.domain.attribution;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidAttribution$measurementManager$2 extends u implements Qa.a {
    final /* synthetic */ Context $context;
    final /* synthetic */ AndroidAttribution this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAttribution$measurementManager$2(AndroidAttribution androidAttribution, Context context) {
        super(0);
        this.this$0 = androidAttribution;
        this.$context = context;
    }

    public final MeasurementManager invoke() {
        return AndroidAttribution.access$getMeasurementManager(this.this$0, this.$context);
    }
}
