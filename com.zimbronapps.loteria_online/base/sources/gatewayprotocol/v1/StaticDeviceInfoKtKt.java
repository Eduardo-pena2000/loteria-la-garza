package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.StaticDeviceInfoKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StaticDeviceInfoKtKt {
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo -initializestaticDeviceInfo(l block) {
        t.g(block, "block");
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder newBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder();
        t.f(newBuilder, "newBuilder()");
        StaticDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo copy(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo, l block) {
        t.g(staticDeviceInfo, "<this>");
        t.g(block, "block");
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = staticDeviceInfo.toBuilder();
        t.f(builder, "this.toBuilder()");
        StaticDeviceInfoKt.Dsl _create = companion._create((StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroidOrNull(StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder staticDeviceInfoOrBuilder) {
        t.g(staticDeviceInfoOrBuilder, "<this>");
        if (staticDeviceInfoOrBuilder.hasAndroid()) {
            return staticDeviceInfoOrBuilder.getAndroid();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIosOrNull(StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder staticDeviceInfoOrBuilder) {
        t.g(staticDeviceInfoOrBuilder, "<this>");
        if (staticDeviceInfoOrBuilder.hasIos()) {
            return staticDeviceInfoOrBuilder.getIos();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android copy(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android, l block) {
        t.g(android, "<this>");
        t.g(block, "block");
        StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = StaticDeviceInfoKt.AndroidKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = android.toBuilder();
        t.f(builder, "this.toBuilder()");
        StaticDeviceInfoKt.AndroidKt.Dsl _create = companion._create((StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios copy(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios, l block) {
        t.g(ios, "<this>");
        t.g(block, "block");
        StaticDeviceInfoKt.IosKt.Dsl.Companion companion = StaticDeviceInfoKt.IosKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = ios.toBuilder();
        t.f(builder, "this.toBuilder()");
        StaticDeviceInfoKt.IosKt.Dsl _create = companion._create((StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
