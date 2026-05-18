package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OperativeEventErrorDataKtKt {
    public static final OperativeEventRequestOuterClass.OperativeEventErrorData -initializeoperativeEventErrorData(l block) {
        t.g(block, "block");
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.Companion;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder newBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        t.f(newBuilder, "newBuilder()");
        OperativeEventErrorDataKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final OperativeEventRequestOuterClass.OperativeEventErrorData copy(OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData, l block) {
        t.g(operativeEventErrorData, "<this>");
        t.g(block, "block");
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = operativeEventErrorData.toBuilder();
        t.f(builder, "this.toBuilder()");
        OperativeEventErrorDataKt.Dsl _create = companion._create((OperativeEventRequestOuterClass.OperativeEventErrorData.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
