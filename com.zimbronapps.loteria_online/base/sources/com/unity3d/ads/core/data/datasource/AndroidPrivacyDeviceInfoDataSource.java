package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.OpenAdvertisingId;
import fb.P;
import fb.z;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.PiiKt;
import gatewayprotocol.v1.PiiOuterClass;
import java.util.UUID;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidPrivacyDeviceInfoDataSource implements PrivacyDeviceInfoDataSource {
    private final AndroidAppSetIdDataSource appSetIdDataSource;
    private final Context context;
    private final FIdDataSource fIdDataSource;
    private final z idfaInitialized;

    public AndroidPrivacyDeviceInfoDataSource(Context context, FIdDataSource fIdDataSource, AndroidAppSetIdDataSource appSetIdDataSource) {
        t.g(context, "context");
        t.g(fIdDataSource, "fIdDataSource");
        t.g(appSetIdDataSource, "appSetIdDataSource");
        this.context = context;
        this.fIdDataSource = fIdDataSource;
        this.appSetIdDataSource = appSetIdDataSource;
        this.idfaInitialized = P.a(Boolean.FALSE);
    }

    private final String getAdvertisingTrackingId() {
        String advertisingTrackingId = AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? "" : advertisingTrackingId;
    }

    private final String getOpenAdvertisingTrackingId() {
        String openAdvertisingTrackingId = OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? "" : openAdvertisingTrackingId;
    }

    public PiiOuterClass.Pii fetch(AllowedPiiOuterClass.AllowedPii allowed) {
        String appSetId;
        String invoke;
        t.g(allowed, "allowed");
        if (!((Boolean) this.idfaInitialized.getValue()).booleanValue()) {
            this.idfaInitialized.setValue(Boolean.TRUE);
            AdvertisingId.init(this.context);
            OpenAdvertisingId.init(this.context);
        }
        PiiKt.Dsl.Companion companion = PiiKt.Dsl.Companion;
        PiiOuterClass.Pii.Builder newBuilder = PiiOuterClass.Pii.newBuilder();
        t.f(newBuilder, "newBuilder()");
        PiiKt.Dsl _create = companion._create(newBuilder);
        if (allowed.getIdfa()) {
            String advertisingTrackingId = getAdvertisingTrackingId();
            if (advertisingTrackingId.length() > 0) {
                UUID fromString = UUID.fromString(advertisingTrackingId);
                t.f(fromString, "fromString(adId)");
                _create.setAdvertisingId(ProtobufExtensionsKt.toByteString(fromString));
            }
            String openAdvertisingTrackingId = getOpenAdvertisingTrackingId();
            if (openAdvertisingTrackingId.length() > 0) {
                UUID fromString2 = UUID.fromString(openAdvertisingTrackingId);
                t.f(fromString2, "fromString(openAdId)");
                _create.setOpenAdvertisingTrackingId(ProtobufExtensionsKt.toByteString(fromString2));
            }
        }
        if (allowed.getFid() && (invoke = this.fIdDataSource.invoke()) != null) {
            if (invoke.length() <= 0) {
                invoke = null;
            }
            if (invoke != null) {
                new AndroidPrivacyDeviceInfoDataSource$fetch$1$3(_create).set(invoke);
            }
        }
        if (allowed.getAppsetId() && (appSetId = this.appSetIdDataSource.getAppSetId()) != null) {
            String str = appSetId.length() > 0 ? appSetId : null;
            if (str != null) {
                new AndroidPrivacyDeviceInfoDataSource$fetch$1$6(_create).set(str);
            }
        }
        return _create._build();
    }
}
