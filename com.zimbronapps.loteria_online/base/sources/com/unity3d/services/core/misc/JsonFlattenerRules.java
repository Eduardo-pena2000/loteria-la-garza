package com.unity3d.services.core.misc;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class JsonFlattenerRules {
    List _reduceKeys;
    List _skipKeys;
    List _topLevelToInclude;

    public JsonFlattenerRules(List list, List list2, List list3) {
        this._topLevelToInclude = list;
        this._reduceKeys = list2;
        this._skipKeys = list3;
    }

    public List getReduceKeys() {
        return this._reduceKeys;
    }

    public List getSkipKeys() {
        return this._skipKeys;
    }

    public List getTopLevelToInclude() {
        return this._topLevelToInclude;
    }
}
