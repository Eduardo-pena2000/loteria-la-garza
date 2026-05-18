package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import gatewayprotocol.v1.TestDataKt;
import gatewayprotocol.v1.TestDataOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidTestDataInfo implements GetTestDataInfo {
    public static final Companion Companion = new Companion(null);
    public static final String EXCHANGE_TEST_MODE = "ExchangeTestMode";
    private final AndroidManifestIntPropertyReader androidManifestIntPropertyReader;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidTestDataInfo(AndroidManifestIntPropertyReader androidManifestIntPropertyReader) {
        t.g(androidManifestIntPropertyReader, "androidManifestIntPropertyReader");
        this.androidManifestIntPropertyReader = androidManifestIntPropertyReader;
    }

    public TestDataOuterClass.TestData invoke() {
        TestDataKt.Dsl.Companion companion = TestDataKt.Dsl.Companion;
        TestDataOuterClass.TestData.Builder newBuilder = TestDataOuterClass.TestData.newBuilder();
        t.f(newBuilder, "newBuilder()");
        TestDataKt.Dsl _create = companion._create(newBuilder);
        Integer propertyByName = this.androidManifestIntPropertyReader.getPropertyByName("ExchangeTestMode");
        if (propertyByName != null) {
            _create.setForceExchangeTestMode(propertyByName.intValue());
        }
        TestDataOuterClass.TestData _build = _create._build();
        if (_build.hasForceExchangeTestMode()) {
            return _build;
        }
        return null;
    }
}
