// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.
package com.microsoft.gctoolkit.parser.unified;


import java.util.regex.Matcher;

// Test reference: creates a weak tangle between packages unified and jvm
import com.microsoft.gctoolkit.parser.jvm.GarbageCollectorAlgorithm;

public class UnifiedGCLogTrace {

    private final Matcher matcher;

    public UnifiedGCLogTrace(Matcher matcher) {
        this.matcher = matcher;
    }

    public String get(int index) {
        return matcher.group(index);
    }

    public int getInteger(int index) {
        return 0;
    }

    public double getDouble(int index) {
        return 0.0d;
    }

    // Test method: references jvm package to create a weak tangle between unified and jvm
    public GarbageCollectorAlgorithm getAlgorithm() {
        return null;
    }
}
