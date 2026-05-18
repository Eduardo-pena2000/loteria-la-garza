package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import Qa.a;
import Qa.r;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CreateSupportTicketData {
    public static final int $stable = 0;
    private final a onCancel;
    private final a onClose;
    private final r onSubmit;

    public CreateSupportTicketData(r onSubmit, a onCancel, a onClose) {
        t.g(onSubmit, "onSubmit");
        t.g(onCancel, "onCancel");
        t.g(onClose, "onClose");
        this.onSubmit = onSubmit;
        this.onCancel = onCancel;
        this.onClose = onClose;
    }

    public static /* synthetic */ CreateSupportTicketData copy$default(CreateSupportTicketData createSupportTicketData, r rVar, a aVar, a aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            rVar = createSupportTicketData.onSubmit;
        }
        if ((i & 2) != 0) {
            aVar = createSupportTicketData.onCancel;
        }
        if ((i & 4) != 0) {
            aVar2 = createSupportTicketData.onClose;
        }
        return createSupportTicketData.copy(rVar, aVar, aVar2);
    }

    public final r component1() {
        return this.onSubmit;
    }

    public final a component2() {
        return this.onCancel;
    }

    public final a component3() {
        return this.onClose;
    }

    public final CreateSupportTicketData copy(r onSubmit, a onCancel, a onClose) {
        t.g(onSubmit, "onSubmit");
        t.g(onCancel, "onCancel");
        t.g(onClose, "onClose");
        return new CreateSupportTicketData(onSubmit, onCancel, onClose);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateSupportTicketData)) {
            return false;
        }
        CreateSupportTicketData createSupportTicketData = (CreateSupportTicketData) obj;
        return t.c(this.onSubmit, createSupportTicketData.onSubmit) && t.c(this.onCancel, createSupportTicketData.onCancel) && t.c(this.onClose, createSupportTicketData.onClose);
    }

    public final /* synthetic */ a getOnCancel() {
        return this.onCancel;
    }

    public final /* synthetic */ a getOnClose() {
        return this.onClose;
    }

    public final /* synthetic */ r getOnSubmit() {
        return this.onSubmit;
    }

    public int hashCode() {
        return (((this.onSubmit.hashCode() * 31) + this.onCancel.hashCode()) * 31) + this.onClose.hashCode();
    }

    public String toString() {
        return "CreateSupportTicketData(onSubmit=" + this.onSubmit + ", onCancel=" + this.onCancel + ", onClose=" + this.onClose + ')';
    }
}
