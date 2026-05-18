package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.DynamicDeviceInfoKt;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.NetworkCapabilityTransportsOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DynamicDeviceInfoKtKt {
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo -initializedynamicDeviceInfo(l block) {
        t.g(block, "block");
        DynamicDeviceInfoKt.Dsl.Companion companion = DynamicDeviceInfoKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder newBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder();
        t.f(newBuilder, "newBuilder()");
        DynamicDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo copy(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo, l block) {
        t.g(dynamicDeviceInfo, "<this>");
        t.g(block, "block");
        DynamicDeviceInfoKt.Dsl.Companion companion = DynamicDeviceInfoKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = dynamicDeviceInfo.toBuilder();
        t.f(builder, "this.toBuilder()");
        DynamicDeviceInfoKt.Dsl _create = companion._create((DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroidOrNull(DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder dynamicDeviceInfoOrBuilder) {
        t.g(dynamicDeviceInfoOrBuilder, "<this>");
        if (dynamicDeviceInfoOrBuilder.hasAndroid()) {
            return dynamicDeviceInfoOrBuilder.getAndroid();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIosOrNull(DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder dynamicDeviceInfoOrBuilder) {
        t.g(dynamicDeviceInfoOrBuilder, "<this>");
        if (dynamicDeviceInfoOrBuilder.hasIos()) {
            return dynamicDeviceInfoOrBuilder.getIos();
        }
        return null;
    }

    public static final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransportsOrNull(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder androidOrBuilder) {
        t.g(androidOrBuilder, "<this>");
        if (androidOrBuilder.hasNetworkCapabilityTransports()) {
            return androidOrBuilder.getNetworkCapabilityTransports();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android copy(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android, l block) {
        t.g(android, "<this>");
        t.g(block, "block");
        DynamicDeviceInfoKt.AndroidKt.Dsl.Companion companion = DynamicDeviceInfoKt.AndroidKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = android.toBuilder();
        t.f(builder, "this.toBuilder()");
        DynamicDeviceInfoKt.AndroidKt.Dsl _create = companion._create((DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios copy(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios, l block) {
        t.g(ios, "<this>");
        t.g(block, "block");
        DynamicDeviceInfoKt.IosKt.Dsl.Companion companion = DynamicDeviceInfoKt.IosKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = ios.toBuilder();
        t.f(builder, "this.toBuilder()");
        DynamicDeviceInfoKt.IosKt.Dsl _create = companion._create((DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
