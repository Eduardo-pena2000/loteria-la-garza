package com.unity3d.ads.core.data.datasource;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import android.provider.Settings;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import eb.n;
import eb.v;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.u;

@f(c = "com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1", f = "AndroidDynamicDeviceInfoDataSource.kt", l = {610}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 extends l implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 $contentObserver;
        final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1) {
            super(0);
            this.this$0 = androidDynamicDeviceInfoDataSource;
            this.$contentObserver = androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.this$0.getContext().getContentResolver().unregisterContentObserver(this.$contentObserver);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, e eVar) {
        super(2, eVar);
        this.this$0 = androidDynamicDeviceInfoDataSource;
    }

    public final e create(Object obj, e eVar) {
        AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1 = new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this.this$0, eVar);
        androidDynamicDeviceInfoDataSource$volumeSettingsChange$1.L$0 = obj;
        return androidDynamicDeviceInfoDataSource$volumeSettingsChange$1;
    }

    public final Object invoke(v vVar, e eVar) {
        return ((AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1) create(vVar, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            v vVar = (v) this.L$0;
            K k = new K();
            double access$getStreamVolume = AndroidDynamicDeviceInfoDataSource.access$getStreamVolume(this.this$0, 3);
            k.a = access$getStreamVolume;
            n.b(vVar, new VolumeSettingsChange.VolumeChange(access$getStreamVolume));
            M m = new M();
            int ringerMode = this.this$0.getRingerMode();
            m.a = ringerMode;
            n.b(vVar, new VolumeSettingsChange.MuteChange(ringerMode == 0));
            AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 = new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1(this.this$0, k, vVar, m);
            this.this$0.getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1);
            1 r1 = new 1(this.this$0, androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1);
            this.label = 1;
            if (eb.t.a(vVar, r1, this) == f) {
                return f;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        }
        return I.a;
    }
}
