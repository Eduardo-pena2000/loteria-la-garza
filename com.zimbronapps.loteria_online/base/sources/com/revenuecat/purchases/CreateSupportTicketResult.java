package com.revenuecat.purchases;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CreateSupportTicketResult {
    private final boolean success;

    public CreateSupportTicketResult(boolean z) {
        this.success = z;
    }

    public static /* synthetic */ CreateSupportTicketResult copy$default(CreateSupportTicketResult createSupportTicketResult, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = createSupportTicketResult.success;
        }
        return createSupportTicketResult.copy(z);
    }

    public final boolean component1() {
        return this.success;
    }

    public final CreateSupportTicketResult copy(boolean z) {
        return new CreateSupportTicketResult(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateSupportTicketResult) && this.success == ((CreateSupportTicketResult) obj).success;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return Boolean.hashCode(this.success);
    }

    public String toString() {
        return "CreateSupportTicketResult(success=" + this.success + ')';
    }
}
