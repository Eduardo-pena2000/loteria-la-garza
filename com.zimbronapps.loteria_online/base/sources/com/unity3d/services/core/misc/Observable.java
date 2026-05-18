package com.unity3d.services.core.misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class Observable {
    private final List _observers = new ArrayList();

    public synchronized void notifyObservers(Object obj) {
        Iterator it = this._observers.iterator();
        while (it.hasNext()) {
            ((IObserver) it.next()).updated(obj);
        }
    }

    public synchronized void registerObserver(IObserver iObserver) {
        if (this._observers.contains(iObserver)) {
            return;
        }
        this._observers.add(iObserver);
    }

    public synchronized void unregisterObserver(IObserver iObserver) {
        if (this._observers.contains(iObserver)) {
            this._observers.remove(iObserver);
        }
    }
}
