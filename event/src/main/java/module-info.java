// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.

/**
 * Contains the gctoolkit-event module.
 */
module com.microsoft.gctoolkit.event {
    requires com.microsoft.gctoolkit.api;
    requires java.logging;

    exports com.microsoft.gctoolkit.event.g1gc;
    exports com.microsoft.gctoolkit.event.generational;
    exports com.microsoft.gctoolkit.event.shenandoah;
    exports com.microsoft.gctoolkit.event.zgc;
}
