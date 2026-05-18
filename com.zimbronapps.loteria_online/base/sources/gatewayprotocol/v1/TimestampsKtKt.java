package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import gatewayprotocol.v1.TimestampsKt;
import gatewayprotocol.v1.TimestampsOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimestampsKtKt {
    public static final TimestampsOuterClass.Timestamps -initializetimestamps(l block) {
        t.g(block, "block");
        TimestampsKt.Dsl.Companion companion = TimestampsKt.Dsl.Companion;
        TimestampsOuterClass.Timestamps.Builder newBuilder = TimestampsOuterClass.Timestamps.newBuilder();
        t.f(newBuilder, "newBuilder()");
        TimestampsKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TimestampsOuterClass.Timestamps copy(TimestampsOuterClass.Timestamps timestamps, l block) {
        t.g(timestamps, "<this>");
        t.g(block, "block");
        TimestampsKt.Dsl.Companion companion = TimestampsKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = timestamps.toBuilder();
        t.f(builder, "this.toBuilder()");
        TimestampsKt.Dsl _create = companion._create((TimestampsOuterClass.Timestamps.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final Timestamp getTimestampOrNull(TimestampsOuterClass.TimestampsOrBuilder timestampsOrBuilder) {
        t.g(timestampsOrBuilder, "<this>");
        if (timestampsOrBuilder.hasTimestamp()) {
            return timestampsOrBuilder.getTimestamp();
        }
        return null;
    }
}
