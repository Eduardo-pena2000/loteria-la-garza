package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.ClientInfoKt;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ClientInfoKtKt {
    public static final ClientInfoOuterClass.ClientInfo -initializeclientInfo(l block) {
        t.g(block, "block");
        ClientInfoKt.Dsl.Companion companion = ClientInfoKt.Dsl.Companion;
        ClientInfoOuterClass.ClientInfo.Builder newBuilder = ClientInfoOuterClass.ClientInfo.newBuilder();
        t.f(newBuilder, "newBuilder()");
        ClientInfoKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ClientInfoOuterClass.ClientInfo copy(ClientInfoOuterClass.ClientInfo clientInfo, l block) {
        t.g(clientInfo, "<this>");
        t.g(block, "block");
        ClientInfoKt.Dsl.Companion companion = ClientInfoKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = clientInfo.toBuilder();
        t.f(builder, "this.toBuilder()");
        ClientInfoKt.Dsl _create = companion._create((ClientInfoOuterClass.ClientInfo.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
