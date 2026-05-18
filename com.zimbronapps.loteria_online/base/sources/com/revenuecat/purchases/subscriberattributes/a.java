package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import java.util.Observable;
import java.util.Observer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class a implements Observer {
    public final /* synthetic */ SubscriberAttributesManager.ObtainDeviceIdentifiersObservable a;

    public /* synthetic */ a(SubscriberAttributesManager.ObtainDeviceIdentifiersObservable obtainDeviceIdentifiersObservable) {
        this.a = obtainDeviceIdentifiersObservable;
    }

    public final void update(Observable observable, Object obj) {
        SubscriberAttributesManager.ObtainDeviceIdentifiersObservable.a(this.a, observable, obj);
    }
}
