package com.applovin.impl.mediation;

import com.applovin.mediation.MaxSegment;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MaxSegmentCollectionImpl extends MaxSegmentCollection {
    private final List a;
    private final Map b;

    public static class BuilderImpl implements MaxSegmentCollection.Builder {
        private final List a = new ArrayList();

        public static /* synthetic */ List a(BuilderImpl builderImpl) {
            return builderImpl.a;
        }

        public MaxSegmentCollection.Builder addSegment(MaxSegment maxSegment) {
            this.a.add(maxSegment);
            return this;
        }

        public MaxSegmentCollection build() {
            return new MaxSegmentCollectionImpl(this, null);
        }
    }

    public /* synthetic */ MaxSegmentCollectionImpl(BuilderImpl builderImpl, a aVar) {
        this(builderImpl);
    }

    public Map getJsonData() {
        return this.b;
    }

    public List getSegments() {
        return this.a;
    }

    public String toString() {
        return "MaxSegmentColletionImpl{segments=" + this.a + "}";
    }

    private MaxSegmentCollectionImpl(BuilderImpl builderImpl) {
        List<MaxSegment> a2 = BuilderImpl.a(builderImpl);
        this.a = a2;
        this.b = new HashMap();
        for (MaxSegment maxSegment : a2) {
            this.b.put("segment_" + maxSegment.getKey(), maxSegment.getValues());
        }
    }
}
