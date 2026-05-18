package com.unity3d.ads.core.domain;

import Ca.I;
import Ga.e;
import Ia.f;
import Ia.l;
import Qa.p;
import android.content.Context;
import cb.O;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.InitializationState;
import gatewayprotocol.v1.AdRequestOuterClass;

@f(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1", f = "LegacyLoadUseCase.kt", l = {127, 134, 135}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LegacyLoadUseCase$invoke$loadResult$1 extends l implements p {
    final /* synthetic */ Context $context;
    final /* synthetic */ AdRequestOuterClass.BannerSize $gatewayBannerSize;
    final /* synthetic */ UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ String $opportunityId;
    final /* synthetic */ String $placement;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LegacyLoadUseCase this$0;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitializationState.values().length];
            try {
                iArr[InitializationState.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationState.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationState.NOT_INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InitializationState.INITIALIZING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyLoadUseCase$invoke$loadResult$1(String str, String str2, LegacyLoadUseCase legacyLoadUseCase, Context context, AdRequestOuterClass.BannerSize bannerSize, UnityAdsLoadOptions unityAdsLoadOptions, e eVar) {
        super(2, eVar);
        this.$placement = str;
        this.$opportunityId = str2;
        this.this$0 = legacyLoadUseCase;
        this.$context = context;
        this.$gatewayBannerSize = bannerSize;
        this.$loadOptions = unityAdsLoadOptions;
    }

    public final e create(Object obj, e eVar) {
        return new LegacyLoadUseCase$invoke$loadResult$1(this.$placement, this.$opportunityId, this.this$0, this.$context, this.$gatewayBannerSize, this.$loadOptions, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((LegacyLoadUseCase$invoke$loadResult$1) create(o, eVar)).invokeSuspend(I.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
