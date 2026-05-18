package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.MutableDataKt;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MutableDataKtKt {
    public static final MutableDataOuterClass.MutableData -initializemutableData(l block) {
        t.g(block, "block");
        MutableDataKt.Dsl.Companion companion = MutableDataKt.Dsl.Companion;
        MutableDataOuterClass.MutableData.Builder newBuilder = MutableDataOuterClass.MutableData.newBuilder();
        t.f(newBuilder, "newBuilder()");
        MutableDataKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final MutableDataOuterClass.MutableData copy(MutableDataOuterClass.MutableData mutableData, l block) {
        t.g(mutableData, "<this>");
        t.g(block, "block");
        MutableDataKt.Dsl.Companion companion = MutableDataKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = mutableData.toBuilder();
        t.f(builder, "this.toBuilder()");
        MutableDataKt.Dsl _create = companion._create((MutableDataOuterClass.MutableData.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AllowedPiiOuterClass.AllowedPii getAllowedPiiOrNull(MutableDataOuterClass.MutableDataOrBuilder mutableDataOrBuilder) {
        t.g(mutableDataOrBuilder, "<this>");
        if (mutableDataOrBuilder.hasAllowedPii()) {
            return mutableDataOrBuilder.getAllowedPii();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(MutableDataOuterClass.MutableDataOrBuilder mutableDataOrBuilder) {
        t.g(mutableDataOrBuilder, "<this>");
        if (mutableDataOrBuilder.hasSessionCounters()) {
            return mutableDataOrBuilder.getSessionCounters();
        }
        return null;
    }
}
