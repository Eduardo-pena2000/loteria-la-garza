package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TransactionEventRequestKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TransactionEventRequestKtKt {
    public static final TransactionEventRequestOuterClass.TransactionEventRequest -initializetransactionEventRequest(l block) {
        t.g(block, "block");
        TransactionEventRequestKt.Dsl.Companion companion = TransactionEventRequestKt.Dsl.Companion;
        TransactionEventRequestOuterClass.TransactionEventRequest.Builder newBuilder = TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder();
        t.f(newBuilder, "newBuilder()");
        TransactionEventRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TransactionEventRequestOuterClass.TransactionEventRequest copy(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, l block) {
        t.g(transactionEventRequest, "<this>");
        t.g(block, "block");
        TransactionEventRequestKt.Dsl.Companion companion = TransactionEventRequestKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = transactionEventRequest.toBuilder();
        t.f(builder, "this.toBuilder()");
        TransactionEventRequestKt.Dsl _create = companion._create((TransactionEventRequestOuterClass.TransactionEventRequest.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder transactionEventRequestOrBuilder) {
        t.g(transactionEventRequestOrBuilder, "<this>");
        if (transactionEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return transactionEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder transactionEventRequestOrBuilder) {
        t.g(transactionEventRequestOrBuilder, "<this>");
        if (transactionEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return transactionEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
